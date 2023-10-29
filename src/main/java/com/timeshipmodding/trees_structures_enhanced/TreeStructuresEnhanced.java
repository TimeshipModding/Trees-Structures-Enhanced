package com.timeshipmodding.trees_structures_enhanced;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TreeStructuresEnhanced.MODID)
public class TreeStructuresEnhanced {
    public static final String MODID = "trees_structures_enhanced";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TreeStructuresEnhanced() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Forge Event Bus
        MinecraftForge.EVENT_BUS.register(this);

    }

}