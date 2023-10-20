package com.slomaxonical.architectspalette.features;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class TwistedTree extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return null;
    }

    /*
    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(net.minecraft.util.math.random.Random random, boolean bees) {
        return BuiltinRegistries.CONFIGURED_FEATURE.getEntry(BuiltinRegistries.CONFIGURED_FEATURE.getKey(APFeatures.TWISTED_TREE).orElseThrow()).orElseThrow();
    }
    public static TreeFeatureConfig.Builder TWISTED_TREE_CONFIG() {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(APBlocks.TWISTED_LOG),
                new ForkingTrunkPlacer(5, 2, 2),
                BlockStateProvider.of(APBlocks.TWISTED_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines();
    }
     */
}
