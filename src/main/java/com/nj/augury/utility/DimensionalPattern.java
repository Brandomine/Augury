package com.nj.augury.utility;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class DimensionalPattern {
	private static HashMap<String, DimensionalPattern> dimensionalMap = new HashMap<String, DimensionalPattern>();

    private HashMap<Character, BlockState> comparisonMap = new HashMap<Character, BlockState>();
    private ArrayList<Layer> layers = new ArrayList<Layer>();

    private DimensionalPattern(IPatternComponent... components) {
        for (IPatternComponent component : components) {
            if (component instanceof Layer)
                layers.add((Layer) component);
            if (component instanceof BlockState) {
                BlockState blockState = (BlockState) component;
                comparisonMap.put(blockState.getType(), blockState);
            }
        }
    }

    public static DimensionalPattern createPattern(String id, IPatternComponent... components) {
        if (dimensionalMap.containsKey(id))
            return dimensionalMap.get(id);

        if (components.length == 0)
            return null;

        DimensionalPattern pattern = new DimensionalPattern(components);

        dimensionalMap.put(id, pattern);

        return pattern;
    }

    public static DimensionalPattern updatePattern(String id, IPatternComponent... components) {
        if (components.length == 0)
            return null;

        DimensionalPattern pattern = new DimensionalPattern(components);

        dimensionalMap.put(id, pattern);

        return pattern;
    }

    public boolean hasFormed(IBlockAccess world, int x, int y, int z) {
        if (world == null)
            return false;

        int layerPos = 0;
        for (Layer layer : layers) {

            int rowPos = 0;
            for (Row row : layer.rows) {

                for (int depth = 0; depth < row.sections.length(); depth++) {
                    char type = row.sections.charAt(depth);
                    if (type == '*')
                        continue;
                    if (type == ' ') {
                        if (!world.isAirBlock(x + rowPos, y + layerPos, z + depth))
                            return false;
                        continue;
                    }
                    BlockState blockState = comparisonMap.get(Character.valueOf(type));
                    if (blockState == null || !blockState.isMatched(world, x + rowPos, y + layerPos, z + depth))
                        return false;
                }
                rowPos++;
            }
            layerPos++;
        }

        return true;
    }

    public boolean convert(World world, int x, int y, int z, Flag flag) {
        if (world == null)
            return false;

        int layerPos = 0;
        for (Layer layer : layers) {

            int rowPos = 0;
            for (Row row : layer.rows) {

                for (int depth = 0; depth < row.sections.length(); depth++) {
                    char type = row.sections.charAt(depth);
                    if (type == '*')
                        continue;
                    if (type == ' ') {
                        if (flag.isIgnoring())
                            world.setBlockToAir(x + rowPos, y + layerPos, z + depth);
                        continue;
                    }
                    BlockState blockState = comparisonMap.get(Character.valueOf(type));

                    if (blockState == null)
                        return false;

                    switch (flag) {
                        case AIR:
                            if (world.isAirBlock(x + rowPos, y + layerPos, z + depth))
                                world.setBlock(x + rowPos, y + layerPos, z + depth, blockState.block, blockState.meta, 3);
                            break;
                        case IGNORE:
                            world.setBlock(x + rowPos, y + layerPos, z + depth, blockState.block, blockState.meta, 3);
                            break;
                        default:
                            break;
                    }
                }
                rowPos++;
            }
            layerPos++;
        }
        return true;
    }
    
    public static Layer createLayer(Row... rows) {
        return new Layer(rows);
    }

    public static Row createRow(String section) {
        return new Row(section);
    }

    public static BlockState createBlockState(char type, Block block) {
        return new BlockState(type, block, 0);
    }

    public static BlockState createBlockState(char type, Block block, int meta) {
        return new BlockState(type, block, meta);
    }

    public static class Layer implements IPatternComponent {

        private Row[] rows;

        private Layer(Row... rows) {
            this.rows = rows;
        }

        public Row[] getRows() {
            return rows;
        }

        public int[] getLengthOfRows() {
            int[] size = new int[rows.length];
            int index = 0;
            for (Row row : rows)
                size[index++] = row.sections.length();
            return size;
        }
    }

    public static class Row implements IPatternComponent {

        String sections;

        private Row(String sections) {
            this.sections = sections;
        }

        public String getSections() {
            return sections;
        }
    }

    public static class BlockState implements IPatternComponent {

        char type;
        Block block;
        int meta;

        private BlockState(char type, Block block, int meta) {
            this.type = type;
            this.block = block;
            this.meta = meta;
        }

        public char getType() {
            return type;
        }

        public boolean isMatched(IBlockAccess world, int x, int y, int z) {
            return world.getBlock(x, y, z).equals(block) && world.getBlockMetadata(x, y, z) == meta;
        }
    }

    public static enum Flag {
        AIR,
        IGNORE;

        public boolean isAir() {
            return this == AIR;
        }

        public boolean isIgnoring() {
            return this == IGNORE;
        }
    }

    public static interface IPatternComponent {
    }
}
