package com.slomaxonical.architectspalette.features;

import com.slomaxonical.architectspalette.ArchitectsPalette;
import com.slomaxonical.architectspalette.registry.APBlocks;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class APConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> HELIODOR_CLUSTER = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ArchitectsPalette.MOD_ID, "heliodor_cluster"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> EKANITE_CLUSTER = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ArchitectsPalette.MOD_ID, "ekanite_cluster"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> HANGING_MONAZITE_CLUSTER = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ArchitectsPalette.MOD_ID, "hanging_monazite_cluster"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> GROUNDED_MONAZITE_CLUSTER = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ArchitectsPalette.MOD_ID, "grounded_monazite_cluster"));
    private static final CrystalClusterConfig HELIODOR_CLUSTER_CONFIG = new CrystalClusterConfig(1, 7, APBlocks.HELIODOR_ROD.getDefaultState(), true, Blocks.BASALT.getDefaultState());
    private static final CrystalClusterConfig EKANITE_CLUSTER_CONFIG = new CrystalClusterConfig(1, 6, APBlocks.EKANITE_ROD.getDefaultState(),false, Blocks.BASALT.getDefaultState());
    private static final CrystalClusterConfig HANGING_MONAZITE_CLUSTER_CONFIG = new CrystalClusterConfig(0, 7, APBlocks.MONAZITE_ROD.getDefaultState(),true, Blocks.BASALT.getDefaultState());
    private static final CrystalClusterConfig GROUNDED_MONAZITE_CLUSTER_CONFIG = new CrystalClusterConfig(0, 6, APBlocks.MONAZITE_ROD.getDefaultState(),false, Blocks.BASALT.getDefaultState());

    public static void populate(FabricDynamicRegistryProvider.Entries entries) {
        entries.add(HELIODOR_CLUSTER, new ConfiguredFeature<>(
                APFeatures.CRYSTAL_CLUSTER,
                HELIODOR_CLUSTER_CONFIG
        ));
        entries.add(EKANITE_CLUSTER, new ConfiguredFeature<>(
                APFeatures.CRYSTAL_CLUSTER,
                EKANITE_CLUSTER_CONFIG
        ));
        entries.add(HANGING_MONAZITE_CLUSTER, new ConfiguredFeature<>(
                APFeatures.CRYSTAL_CLUSTER,
                HANGING_MONAZITE_CLUSTER_CONFIG
        ));
        entries.add(GROUNDED_MONAZITE_CLUSTER, new ConfiguredFeature<>(
                APFeatures.CRYSTAL_CLUSTER,
                GROUNDED_MONAZITE_CLUSTER_CONFIG
        ));
    }

    public static void register() {}
}

