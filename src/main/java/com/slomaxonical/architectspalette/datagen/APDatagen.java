package com.slomaxonical.architectspalette.datagen;

import com.slomaxonical.architectspalette.datagen.provider.APBlockLootTableProvider;
import com.slomaxonical.architectspalette.datagen.provider.APBlockTagProvider;
import com.slomaxonical.architectspalette.datagen.provider.APItemTagProvider;
import com.slomaxonical.architectspalette.datagen.provider.APRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class APDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        FabricDataGenerator.Pack pack = dataGenerator.createPack();

        pack.addProvider(APRecipeProvider::new);
        FabricTagProvider.BlockTagProvider blockTagProvider = pack.addProvider(APBlockTagProvider::new);
        pack.addProvider((fabricDataOutput, wrapperLookup) -> new APItemTagProvider(fabricDataOutput, wrapperLookup, blockTagProvider));
        pack.addProvider(APBlockLootTableProvider::new);
    }
}
