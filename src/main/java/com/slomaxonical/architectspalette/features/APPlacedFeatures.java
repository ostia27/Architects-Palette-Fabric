package com.slomaxonical.architectspalette.features;

import com.slomaxonical.architectspalette.ArchitectsPalette;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

import static com.slomaxonical.architectspalette.ArchitectsPalette.CONFIGS;

public class APPlacedFeatures {
    private static final RegistryKey<PlacedFeature> HELIODOR_CLUSTER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ArchitectsPalette.MOD_ID, "heliodor_cluster"));
    private static final RegistryKey<PlacedFeature> EKANITE_CLUSTER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ArchitectsPalette.MOD_ID, "ekanite_cluster"));
    private static final RegistryKey<PlacedFeature> HANGING_MONAZITE_CLUSTER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ArchitectsPalette.MOD_ID, "hanging_monazite_cluster"));
    private static final RegistryKey<PlacedFeature> GROUNDED_MONAZITE_CLUSTER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ArchitectsPalette.MOD_ID, "grounded_monazite_cluster"));

    public static void populate(FabricDynamicRegistryProvider.Entries entries) {
        entries.add(HELIODOR_CLUSTER, new PlacedFeature(
                entries.ref(APConfiguredFeatures.HELIODOR_CLUSTER),
                List.of(
                        CountPlacementModifier.of(7),
                        SquarePlacementModifier.of(),
                        PlacedFeatures.BOTTOM_TO_TOP_RANGE,
                        BiomePlacementModifier.of()
                )
        ));
        entries.add(EKANITE_CLUSTER, new PlacedFeature(
                entries.ref(APConfiguredFeatures.EKANITE_CLUSTER),
                List.of(
                        CountPlacementModifier.of(8),
                        SquarePlacementModifier.of(),
                        PlacedFeatures.BOTTOM_TO_TOP_RANGE,
                        BiomePlacementModifier.of()
                )
        ));
        entries.add(HANGING_MONAZITE_CLUSTER, new PlacedFeature(
                entries.ref(APConfiguredFeatures.HANGING_MONAZITE_CLUSTER),
                List.of(
                        CountPlacementModifier.of(4),
                        SquarePlacementModifier.of(),
                        PlacedFeatures.BOTTOM_TO_TOP_RANGE,
                        BiomePlacementModifier.of()
                )
        ));
        entries.add(GROUNDED_MONAZITE_CLUSTER, new PlacedFeature(
                entries.ref(APConfiguredFeatures.GROUNDED_MONAZITE_CLUSTER),
                List.of(
                        CountPlacementModifier.of(4),
                        SquarePlacementModifier.of(),
                        PlacedFeatures.BOTTOM_TO_TOP_RANGE,
                        BiomePlacementModifier.of()
                )
        ));
    }

    public static void registerBiomeModifications() {
        if (CONFIGS.globalWorldGenToggle()){
            if (CONFIGS.netherCrystalGeneration()) {
                BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_DECORATION, HELIODOR_CLUSTER);
                BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_DECORATION, EKANITE_CLUSTER);
                BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES), GenerationStep.Feature.UNDERGROUND_DECORATION, HANGING_MONAZITE_CLUSTER);
                BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_DECORATION, GROUNDED_MONAZITE_CLUSTER);
            }
        }
    }

    public static void register() {
        registerBiomeModifications();
    }
}
