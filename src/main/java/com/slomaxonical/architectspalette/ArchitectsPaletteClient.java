package com.slomaxonical.architectspalette;

import com.slomaxonical.architectspalette.registry.APBlocks;
import com.slomaxonical.architectspalette.registry.APParticles;
import com.slomaxonical.architectspalette.registry.util.RegistryUtil;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ArchitectsPaletteClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                APBlocks.ENTWINE_BARS,
                APBlocks.SUNMETAL_BARS,

                APBlocks.REDSTONE_CAGE_LANTERN,
                APBlocks.GLOWSTONE_CAGE_LANTERN,
                APBlocks.ALGAL_CAGE_LANTERN,

                APBlocks.TWISTED_DOOR,
                APBlocks.TWISTED_TRAPDOOR,
                APBlocks.TWISTED_SAPLING,
                APBlocks.POTTED_TWISTED_SAPLING,

                APBlocks.ACACIA_TOTEM_WING,

                APBlocks.NETHER_BRASS_FIRE,
                APBlocks.NETHER_BRASS_TORCH,
                APBlocks.NETHER_BRASS_WALL_TORCH,
                APBlocks.NETHER_BRASS_CHAIN,
                APBlocks.NETHER_BRASS_LANTERN
        );
        RegistryUtil.nubs.keySet().forEach(nub-> BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),nub));

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                APBlocks.HELIODOR_ROD,
                APBlocks.EKANITE_ROD,
                APBlocks.MONAZITE_ROD
        );

        APParticles.clientReg();
    }
}
