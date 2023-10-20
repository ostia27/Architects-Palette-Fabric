package com.slomaxonical.architectspalette.features;

import com.slomaxonical.architectspalette.ArchitectsPalette;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.Feature;

public class APFeatures {
    //public static final ConfiguredFeature<TreeFeatureConfig, ?> TWISTED_TREE = new ConfiguredFeature<>(Feature.TREE,TwistedTree.TWISTED_TREE_CONFIG().build());
    public static final Feature<CrystalClusterConfig> CRYSTAL_CLUSTER = new CrystalClusterFeature(CrystalClusterConfig.CODEC);

    public static void register(){
       Registry.register(Registries.FEATURE, new Identifier(ArchitectsPalette.MOD_ID,"crystal_cluster"), CRYSTAL_CLUSTER);
       //Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ArchitectsPalette.MOD_ID, "twisted"), TWISTED_TREE);

    }
}
