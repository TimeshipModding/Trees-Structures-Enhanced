package com.timeshipmodding.trees_structures_enhanced.content.block.registry;

import com.timeshipmodding.trees_structures_enhanced.TreeStructuresEnhanced;
import com.timeshipmodding.trees_structures_enhanced.content.block.FlammableRotatedPillarBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TreeStructuresEnhanced.MODID);

    public static void init(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }

    // Blocks
    public static final RegistryObject<Block> NAILED_OAK_LOG
            = BLOCKS.register("nailed_oak_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_SPRUCE_LOG
            = BLOCKS.register("nailed_spruce_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_BIRCH_LOG
            = BLOCKS.register("nailed_birch_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_JUNGLE_LOG
            = BLOCKS.register("nailed_jungle_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_ACACIA_LOG
            = BLOCKS.register("nailed_acacia_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_DARK_OAK_LOG
            = BLOCKS.register("nailed_dark_oak_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_MANGROVE_LOG
            = BLOCKS.register("nailed_mangrove_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_CHERRY_LOG
            = BLOCKS.register("nailed_cherry_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_OAK_LOG
            = BLOCKS.register("nailed_stripped_oak_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_SPRUCE_LOG
            = BLOCKS.register("nailed_stripped_spruce_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_BIRCH_LOG
            = BLOCKS.register("nailed_stripped_birch_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_JUNGLE_LOG
            = BLOCKS.register("nailed_stripped_jungle_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_ACACIA_LOG
            = BLOCKS.register("nailed_stripped_acacia_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_DARK_OAK_LOG
            = BLOCKS.register("nailed_stripped_dark_oak_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_MANGROVE_LOG
            = BLOCKS.register("nailed_stripped_mangrove_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_CHERRY_LOG
            = BLOCKS.register("nailed_stripped_cherry_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(3f)));
    public static final RegistryObject<Block> NAILED_OAK_WOOD
            = BLOCKS.register("nailed_oak_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_SPRUCE_WOOD
            = BLOCKS.register("nailed_spruce_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_BIRCH_WOOD
            = BLOCKS.register("nailed_birch_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_JUNGLE_WOOD
            = BLOCKS.register("nailed_jungle_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_ACACIA_WOOD
            = BLOCKS.register("nailed_acacia_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_DARK_OAK_WOOD
            = BLOCKS.register("nailed_dark_oak_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_MANGROVE_WOOD
            = BLOCKS.register("nailed_mangrove_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_CHERRY_WOOD
            = BLOCKS.register("nailed_cherry_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_OAK_WOOD
            = BLOCKS.register("nailed_stripped_oak_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_SPRUCE_WOOD
            = BLOCKS.register("nailed_stripped_spruce_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_BIRCH_WOOD
            = BLOCKS.register("nailed_stripped_birch_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_JUNGLE_WOOD
            = BLOCKS.register("nailed_stripped_jungle_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_ACACIA_WOOD
            = BLOCKS.register("nailed_stripped_acacia_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_DARK_OAK_WOOD
            = BLOCKS.register("nailed_stripped_dark_oak_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_MANGROVE_WOOD
            = BLOCKS.register("nailed_stripped_mangrove_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_WOOD).strength(3f)));
    public static final RegistryObject<Block> NAILED_STRIPPED_CHERRY_WOOD
            = BLOCKS.register("nailed_stripped_cherry_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_WOOD).strength(3f)));
}
