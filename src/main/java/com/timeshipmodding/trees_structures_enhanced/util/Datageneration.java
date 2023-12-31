package com.timeshipmodding.trees_structures_enhanced.util;

import com.timeshipmodding.trees_structures_enhanced.datagen.*;
import com.timeshipmodding.trees_structures_enhanced.provider.BaseLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class Datageneration {
    public static void generate(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new BlockStates(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModels(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new LanguageProvider(packOutput, "en_us"));

        BlockTags blockTags = generator.addProvider(event.includeServer(),
                new BlockTags(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ItemTags(packOutput, lookupProvider, blockTags, existingFileHelper));
        generator.addProvider(event.includeServer(), new Recipes(packOutput));
        generator.addProvider(event.includeServer(), BaseLootTableProvider.create(packOutput));
    }
}
