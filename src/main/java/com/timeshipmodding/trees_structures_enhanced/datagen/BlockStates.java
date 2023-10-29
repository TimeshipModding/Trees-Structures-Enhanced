package com.timeshipmodding.trees_structures_enhanced.datagen;

import com.timeshipmodding.trees_structures_enhanced.TreeStructuresEnhanced;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {
    public BlockStates(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TreeStructuresEnhanced.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }
}
