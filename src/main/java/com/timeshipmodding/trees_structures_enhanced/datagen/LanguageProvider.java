package com.timeshipmodding.trees_structures_enhanced.datagen;

import com.timeshipmodding.trees_structures_enhanced.TreeStructuresEnhanced;
import net.minecraft.data.PackOutput;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(PackOutput output, String locale) {
        super(output, TreeStructuresEnhanced.MODID, locale);
    }

    @Override
    protected void addTranslations() {
    }
}
