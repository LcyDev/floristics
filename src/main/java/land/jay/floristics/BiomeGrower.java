/** Copyright (C) 2019 Jay Avery */
package land.jay.floristics;

import com.cryptomorin.xseries.XBiome;
import com.google.common.collect.Lists;
import land.jay.floristics.plants.*;
import land.jay.floristics.plants.PlantGrower.SurfaceType;
import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.World;

import java.util.List;

/** Handler for growth depending on biome. */
public enum BiomeGrower {

    PLAINS {{
        this.add(new BushGrower(Material.GRASS, false, 0.3, SurfaceType.DIRT, 1));
        this.add(new BushGrower(Material.TALL_GRASS, false, 0.1, SurfaceType.DIRT, 1));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.AZURE_BLUET, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.ORANGE_TULIP, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PINK_TULIP, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.RED_TULIP, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.WHITE_TULIP, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.OXEYE_DAISY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.CORNFLOWER, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new TreeGrower(TreeType.TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.05));
        this.add(new TreeGrower(TreeType.BIG_TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.02));
        this.add(new BeeGrower(0.05));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    SUNFLOWER_PLAINS {{
        this.add(new BushGrower(Material.GRASS, false, 0.3, SurfaceType.DIRT, 1));
        this.add(new BushGrower(Material.TALL_GRASS, false, 0.1, SurfaceType.DIRT, 1));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.AZURE_BLUET, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.ORANGE_TULIP, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PINK_TULIP, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.RED_TULIP, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.WHITE_TULIP, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.OXEYE_DAISY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.CORNFLOWER, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new TreeGrower(TreeType.TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.05));
        this.add(new TreeGrower(TreeType.BIG_TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.02));
        this.add(new BeeGrower(0.05));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
        this.add(new BushGrower(Material.SUNFLOWER, false, 0.1, SurfaceType.DIRT, 0.2));
    }},
    COOL_OCEAN {{
        this.add(new BushGrower(Material.SEAGRASS, true, 0.1, SurfaceType.SEAWEED, 0.1));
        this.add(new BushGrower(Material.TALL_SEAGRASS, true, 0.05, SurfaceType.SEAWEED, 0.1));
        this.add(new BushGrower(Material.KELP, true, 0.15, SurfaceType.SEAWEED, 0.1));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    WARM_OCEAN {{
        this.add(new BushGrower(Material.SEAGRASS, true, 0.1, SurfaceType.SEAWEED, 0.1));
        this.add(new BushGrower(Material.TALL_SEAGRASS, true, 0.05, SurfaceType.SEAWEED, 0.1));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    DESERT {{
        this.add(new BushGrower(Material.DEAD_BUSH, false, 0.02, SurfaceType.DEAD, 0.1));
        this.add(new CactusGrower(0.02, 0.1));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.25));
    }},
    MOUNTAINS {{
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.13));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new TreeGrower(TreeType.TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.05));
        this.add(new TreeGrower(TreeType.BIG_TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.05));
        this.add(new TreeGrower(TreeType.REDWOOD, Material.SPRUCE_LOG, 7, SurfaceType.DIRT, 0.05));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    WOODED_MOUNTAINS {{
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.13));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new TreeGrower(TreeType.TREE, Material.OAK_LOG, 5, SurfaceType.DIRT, 0.2));
        this.add(new TreeGrower(TreeType.BIG_TREE, Material.OAK_LOG, 5, SurfaceType.DIRT, 0.2));
        this.add(new TreeGrower(TreeType.REDWOOD, Material.SPRUCE_LOG, 5, SurfaceType.DIRT, 0.2));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    FOREST {{
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.2));
        this.add(new BushGrower(Material.LILAC, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.ROSE_BUSH, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PEONY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.LILY_OF_THE_VALLEY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new TreeGrower(TreeType.TREE, Material.OAK_LOG,  5, SurfaceType.DIRT, 0.95));
        this.add(new TreeGrower(TreeType.BIG_TREE, Material.OAK_LOG, 5, SurfaceType.DIRT, 0.1));
        this.add(new TreeGrower(TreeType.BIRCH, Material.BIRCH_LOG, 5, SurfaceType.DIRT, 0.95));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    TAIGA {{
        this.add(new TreeGrower(TreeType.REDWOOD, Material.SPRUCE_LOG, 5, SurfaceType.DIRT, 0.95));
        this.add(new BushGrower(Material.FERN, false, 0.15, SurfaceType.DIRT, 0.15));
        this.add(new BushGrower(Material.LARGE_FERN, false, 0.05, SurfaceType.DIRT, 0.15));
        this.add(new BushGrower(Material.GRASS, false, 0.05, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.SWEET_BERRY_BUSH, false, 0.02, SurfaceType.DIRT, 0.08));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));

    }},
    SNOWY_TAIGA {{
        this.add(new TreeGrower(TreeType.REDWOOD, Material.SPRUCE_LOG, 5, SurfaceType.DIRT, 0.95));
        this.add(new BushGrower(Material.FERN, false, 0.1, SurfaceType.DIRT, 0.05));
        this.add(new BushGrower(Material.LARGE_FERN, false, 0.02, SurfaceType.DIRT, 0.05));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.005));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.005));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.SWEET_BERRY_BUSH, false, 0.02, SurfaceType.DIRT, 0.03));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    MEGA_TAIGA {{
        this.add(new TreeGrower(TreeType.MEGA_REDWOOD, Material.SPRUCE_LOG, 7, SurfaceType.DIRT, 0.95));
        this.add(new TreeGrower(TreeType.REDWOOD, Material.SPRUCE_LOG, 5, SurfaceType.DIRT, 0.4));
        this.add(new BushGrower(Material.FERN, false, 0.15, SurfaceType.DIRT, 0.15));
        this.add(new BushGrower(Material.LARGE_FERN, false, 0.05, SurfaceType.DIRT, 0.15));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DEAD_BUSH, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.02, 0.01, false));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.02, 0.01, false));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    SWAMP {{
        this.add(new TreeGrower(TreeType.SWAMP, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.5));
        this.add(new BushGrower(Material.GRASS, false, 0.2, SurfaceType.DIRT, 0.5));
        this.add(new TreeGrower(TreeType.BROWN_MUSHROOM, Material.BROWN_MUSHROOM_BLOCK, 7, SurfaceType.FUNGI, 0.001));
        this.add(new TreeGrower(TreeType.RED_MUSHROOM, Material.RED_MUSHROOM_BLOCK, 7, SurfaceType.FUNGI, 0.001));
        this.add(new SugarcaneGrower(0.4, 0.05));
        this.add(new BushGrower(Material.SEAGRASS, true, 0.1, SurfaceType.SEAWEED, 0.1));
        this.add(new BushGrower(Material.TALL_SEAGRASS, true, 0.05, SurfaceType.SEAWEED, 0.1));
        this.add(new BushGrower(Material.BLUE_ORCHID, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.LILY_PAD, false, 0.02, SurfaceType.WATER, 0.01));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.02, 0.01, false));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.02, 0.01, false));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    RIVER {{
        this.add(new SugarcaneGrower(0.4, 0.005));
        this.add(new BushGrower(Material.SEAGRASS, true, 0.1, SurfaceType.SEAWEED, 0.1));
        this.add(new BushGrower(Material.TALL_SEAGRASS, true, 0.05, SurfaceType.SEAWEED, 0.1));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    END {{
        this.add(new TreeGrower(TreeType.CHORUS_PLANT, Material.CHORUS_PLANT, 7, SurfaceType.END, 0.5));
    }},
    TUNDRA {{
        this.add(new TreeGrower(TreeType.REDWOOD, Material.SPRUCE_LOG, 7, SurfaceType.DIRT, 0.05));
        this.add(new BushGrower(Material.GRASS, false, 0.05, SurfaceType.DIRT, 0.05));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    MUSHROOM {{
        this.add(new TreeGrower(TreeType.BROWN_MUSHROOM, Material.BROWN_MUSHROOM_BLOCK, 7, SurfaceType.FUNGI, 0.15));
        this.add(new TreeGrower(TreeType.RED_MUSHROOM, Material.RED_MUSHROOM_BLOCK, 7, SurfaceType.FUNGI, 0.15));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.02, 0.1, false));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.02, 0.1, false));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    JUNGLE {{
        this.add(new TreeGrower(TreeType.JUNGLE, Material.JUNGLE_LOG, 7, SurfaceType.DIRT, 1));
        this.add(new TreeGrower(TreeType.SMALL_JUNGLE, Material.JUNGLE_LOG, 7, SurfaceType.DIRT, 1));
        this.add(new TreeGrower(TreeType.JUNGLE_BUSH, Material.JUNGLE_LOG, 5, SurfaceType.DIRT, 1));
        this.add(new TreeGrower(TreeType.COCOA_TREE, Material.COCOA, 5, SurfaceType.DIRT, 0.005));
        this.add(new TreeGrower(TreeType.BIG_TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.2));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.MELON, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.BAMBOO, false, 0.001, SurfaceType.DIRT, 0.001));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    JUNGLE_EDGE {{
        this.add(new TreeGrower(TreeType.SMALL_JUNGLE, Material.JUNGLE_LOG, 7, SurfaceType.DIRT, 0.2));
        this.add(new TreeGrower(TreeType.COCOA_TREE, Material.COCOA, 5, SurfaceType.DIRT, 0.005));
        this.add(new TreeGrower(TreeType.BIG_TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.02));
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.2));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.MELON, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    BAMBOO_JUNGLE {{
        this.add(new TreeGrower(TreeType.JUNGLE, Material.JUNGLE_LOG, 7, SurfaceType.DIRT, 0.5));
        this.add(new TreeGrower(TreeType.BIG_TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.05));
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.2));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.MELON, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.BAMBOO, false, 0.2, SurfaceType.DIRT, 0.6));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    SAVANNA {{
        this.add(new BushGrower(Material.GRASS, false, 0.3, SurfaceType.DIRT, 1));
        this.add(new BushGrower(Material.TALL_GRASS, false, 0.1, SurfaceType.DIRT, 1));
        this.add(new BushGrower(Material.DANDELION, false, 0.05, SurfaceType.DIRT, 0.05));
        this.add(new BushGrower(Material.POPPY, false, 0.05, SurfaceType.DIRT, 0.05));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new TreeGrower(TreeType.TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.05));
        this.add(new TreeGrower(TreeType.ACACIA, Material.ACACIA_LOG, 7, SurfaceType.DIRT, 0.15));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    BADLANDS {{
        this.add(new BushGrower(Material.DEAD_BUSH, false, 0.02, SurfaceType.DEAD, 0.1));
        this.add(new CactusGrower(0.02, 0.1));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    WOODED_BADLANDS {{
        this.add(new BushGrower(Material.DEAD_BUSH, false, 0.02, SurfaceType.DEAD, 0.1));
        this.add(new CactusGrower(0.02, 0.1));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
        this.add(new TreeGrower(TreeType.TREE, Material.OAK_LOG, 5, SurfaceType.DIRT, 0.9));
    }},
    DARK_FOREST {{
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.2));
        this.add(new BushGrower(Material.LILAC, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.ROSE_BUSH, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PEONY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.LILY_OF_THE_VALLEY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new TreeGrower(TreeType.DARK_OAK, Material.DARK_OAK_LOG, 5, SurfaceType.DIRT, 1));
        this.add(new TreeGrower(TreeType.TREE, Material.OAK_LOG, 5, SurfaceType.DIRT, 0.5));
        this.add(new TreeGrower(TreeType.RED_MUSHROOM, Material.RED_MUSHROOM_BLOCK, 5, SurfaceType.FUNGI, 0.15));
        this.add(new TreeGrower(TreeType.BROWN_MUSHROOM, Material.BROWN_MUSHROOM_BLOCK, 5, SurfaceType.FUNGI, 0.5));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    FLOWER_FOREST {{
        this.add(new TreeGrower(TreeType.TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.95));
        this.add(new TreeGrower(TreeType.BIG_TREE, Material.OAK_LOG, 7, SurfaceType.DIRT, 0.3));
        this.add(new TreeGrower(TreeType.BIRCH, Material.BIRCH_LOG, 7, SurfaceType.DIRT, 0.95));
        this.add(new BeeGrower(0.05));
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.2));
        this.add(new BushGrower(Material.POPPY, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.DANDELION, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.ALLIUM, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.AZURE_BLUET, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.ORANGE_TULIP, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.PINK_TULIP, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.RED_TULIP, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.WHITE_TULIP, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.OXEYE_DAISY, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.CORNFLOWER, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.LILY_OF_THE_VALLEY, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.LILAC, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.ROSE_BUSH, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.PEONY, false, 0.15, SurfaceType.DIRT, 0.1));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    BIRCH_FOREST {{
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.2));
        this.add(new BushGrower(Material.LILAC, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.ROSE_BUSH, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PEONY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.LILY_OF_THE_VALLEY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new TreeGrower(TreeType.BIRCH, Material.BIRCH_LOG, 5, SurfaceType.DIRT, 0.95));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    TALL_BIRCH {{
        this.add(new BushGrower(Material.GRASS, false, 0.15, SurfaceType.DIRT, 0.2));
        this.add(new BushGrower(Material.LILAC, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.POPPY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.DANDELION, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.ROSE_BUSH, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PEONY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.LILY_OF_THE_VALLEY, false, 0.02, SurfaceType.DIRT, 0.01));
        this.add(new BushGrower(Material.PUMPKIN, false, 0.01, SurfaceType.DIRT, 0.01));
        this.add(new TreeGrower(TreeType.TALL_BIRCH, Material.BIRCH_LOG, 5, SurfaceType.DIRT, 0.95));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
        this.add(new SugarcaneGrower(0.4, 0.05));
    }},
    BEACH {{
        this.add(new SugarcaneGrower(0.4, 0.05));
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }},
    NETHER {{
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.02, 0.01, false));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.02, 0.01, false));
    }},
    BARREN {{
        this.add(new MushroomGrower(Material.BROWN_MUSHROOM, 0.01, 0.25, true));
        this.add(new MushroomGrower(Material.RED_MUSHROOM, 0.01, 0.12, true));
    }};

    /** List of possible plants to grow in this biome. */
    protected List<PlantGrower> plants = Lists.newArrayList();

    /** Attempts to add this plant grower if it is enabled by config. */
    protected void add(PlantGrower grower) {
        if (Floristics.isEnabled(grower.material)) {
            this.plants.add(grower);
        }
    }

    /** Attempts to grow a random plant for this biome. */
    public void growSomething(World world, int x, int z) {
        if (!this.plants.isEmpty()) {
            this.plants.get(Floristics.RAND.nextInt(this.plants.size())).grow(world, x, z);
        }
    }

    /** Handles growth at the given location. */
    public static void handleGrowth(World world, int x, int z) {
        get(XBiome.matchXBiome(world.getBiome(x, world.getHighestBlockYAt(x, z), z))).growSomething(world, x, z);
    }

    /** @return The appropriate BiomeGrower for the given Biome. */
    private static BiomeGrower get(XBiome biome) {
        switch (biome) {
            case PLAINS, MEADOW:
                return PLAINS;
            case SUNFLOWER_PLAINS:
                return SUNFLOWER_PLAINS;
            case RIVER:
                return RIVER;
            case BEACH:
                return BEACH;
            case OCEAN, DEEP_OCEAN, COLD_OCEAN, DEEP_COLD_OCEAN, LUKEWARM_OCEAN, DEEP_LUKEWARM_OCEAN:
                return COOL_OCEAN;
            case WARM_OCEAN, DEEP_WARM_OCEAN:
                return WARM_OCEAN;
            case DESERT, DESERT_HILLS, DESERT_LAKES:
                return DESERT;
            case WINDSWEPT_HILLS, MOUNTAIN_EDGE, MODIFIED_GRAVELLY_MOUNTAINS, STONY_PEAKS:
                return MOUNTAINS;
            case WOODED_MOUNTAINS:
                return WOODED_MOUNTAINS;
            case SWAMP, SWAMP_HILLS:
                return SWAMP;
            case TAIGA, TAIGA_HILLS, TAIGA_MOUNTAINS:
                return TAIGA;
            case OLD_GROWTH_PINE_TAIGA, OLD_GROWTH_SPRUCE_TAIGA, GIANT_TREE_TAIGA, GIANT_TREE_TAIGA_HILLS, GIANT_SPRUCE_TAIGA, GIANT_SPRUCE_TAIGA_HILLS:
                return MEGA_TAIGA;
            case SNOWY_TAIGA, SNOWY_TAIGA_HILLS, SNOWY_TAIGA_MOUNTAINS, GROVE:
                return SNOWY_TAIGA;
            case SNOWY_MOUNTAINS, SNOWY_PLAINS, SNOWY_SLOPES, JAGGED_PEAKS, FROZEN_PEAKS:
                return TUNDRA;
            case FOREST, WOODED_HILLS:
                return FOREST;
            case FLOWER_FOREST:
                return FLOWER_FOREST;
            case BIRCH_FOREST, BIRCH_FOREST_HILLS:
                return BIRCH_FOREST;
            case TALL_BIRCH_FOREST, TALL_BIRCH_HILLS, OLD_GROWTH_BIRCH_FOREST:
                return TALL_BIRCH;
            case JUNGLE, JUNGLE_HILLS, MODIFIED_JUNGLE:
                return JUNGLE;
            case SPARSE_JUNGLE, MODIFIED_JUNGLE_EDGE:
                return JUNGLE_EDGE;
            case BAMBOO_JUNGLE, BAMBOO_JUNGLE_HILLS:
                return BAMBOO_JUNGLE;
            case SAVANNA, SAVANNA_PLATEAU, WINDSWEPT_SAVANNA, SHATTERED_SAVANNA_PLATEAU:
                return SAVANNA;
            case DARK_FOREST, DARK_FOREST_HILLS:
                return DARK_FOREST;
            case MUSHROOM_FIELDS, MUSHROOM_FIELD_SHORE:
                return MUSHROOM;
            case BADLANDS, ERODED_BADLANDS, BADLANDS_PLATEAU, MODIFIED_BADLANDS_PLATEAU:
                return BADLANDS;
            case WOODED_BADLANDS, WOODED_BADLANDS_PLATEAU, MODIFIED_WOODED_BADLANDS_PLATEAU:
                return WOODED_BADLANDS;
            case END_HIGHLANDS:
                return END;
            case BASALT_DELTAS, NETHER_WASTES, WARPED_FOREST, CRIMSON_FOREST, SOUL_SAND_VALLEY:
                return NETHER;
            case FROZEN_OCEAN, DEEP_FROZEN_OCEAN, THE_END, FROZEN_RIVER, STONY_SHORE, SNOWY_BEACH, SMALL_END_ISLANDS, END_MIDLANDS, END_BARRENS, THE_VOID, ICE_SPIKES:
            default:
                return BARREN;
        }
    }




}