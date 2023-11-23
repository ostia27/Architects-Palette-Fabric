package com.slomaxonical.architectspalette.datagen.provider;

import com.slomaxonical.architectspalette.features.APConfiguredFeatures;
import com.slomaxonical.architectspalette.features.APPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class APDynamicRegistryProvider extends FabricDynamicRegistryProvider {
    public APDynamicRegistryProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        APConfiguredFeatures.populate(entries);
        APPlacedFeatures.populate(entries);
    }

    @Override
    public String getName() {
        return "Dynamic Registries";
    }
}
