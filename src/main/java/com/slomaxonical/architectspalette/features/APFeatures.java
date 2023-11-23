package com.slomaxonical.architectspalette.features;

import com.slomaxonical.architectspalette.ArchitectsPalette;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class APFeatures {
    public static final Feature<CrystalClusterConfig> CRYSTAL_CLUSTER = new CrystalClusterFeature(CrystalClusterConfig.CODEC);
    public static final TreeFeature TWISTED_TREE = new TreeFeature(TreeFeatureConfig.CODEC);

    public static void register(){
       Registry.register(Registries.FEATURE, new Identifier(ArchitectsPalette.MOD_ID, "crystal_cluster"), CRYSTAL_CLUSTER);
       Registry.register(Registries.FEATURE, new Identifier(ArchitectsPalette.MOD_ID, "twisted_tree"), TWISTED_TREE);
    }
}
