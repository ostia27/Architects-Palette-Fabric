package com.slomaxonical.architectspalette.datagen.provider;

import com.slomaxonical.architectspalette.registry.APBlocks;
import com.slomaxonical.architectspalette.registry.APItems;
import com.slomaxonical.architectspalette.registry.APTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class APItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public APItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
//        for (StoneBlockSet set : RegistryUtil.BlockSets.values()){
//            this.getOrCreateTagBuilder(APTags.SET_TAB).add(set.getBase().asItem());
//            if (set.getPart(SLAB) !=null) this.getOrCreateTagBuilder(APTags.SET_TAB).add(set.getPart(SLAB).asItem());
//            if (set.getPart(VERTICAL_SLAB) !=null) this.getOrCreateTagBuilder(APTags.SET_TAB).add(set.getPart(VERTICAL_SLAB).asItem());//config check here?
//            if (set.getPart(STAIRS) !=null) this.getOrCreateTagBuilder(APTags.SET_TAB).add(set.getPart(STAIRS).asItem());
//            if (set.getPart(WALL) !=null) this.getOrCreateTagBuilder(APTags.SET_TAB).add(set.getPart(WALL).asItem());
//            if (set.getPart(FENCE) !=null) this.getOrCreateTagBuilder(APTags.SET_TAB).add(set.getPart(FENCE).asItem());
//        }
//        this.copy(APTags.NUBS,APTags.NUB_TAB);
        this.copy(APTags.TWISTED_LOGS, APTags.ITEM_TWISTED_LOGS);
        this.getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).addTag(APTags.ITEM_TWISTED_LOGS);
        this.copy(BlockTags.LEAVES, ItemTags.LEAVES);
        this.copy(BlockTags.PLANKS, ItemTags.PLANKS);
        this.copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        this.copy(BlockTags.SLABS,ItemTags.SLABS);
        this.copy(BlockTags.STAIRS,ItemTags.STAIRS);
        this.copy(BlockTags.WALLS,ItemTags.WALLS);
        this.copy(BlockTags.WOODEN_BUTTONS,ItemTags.WOODEN_BUTTONS);
        this.copy(BlockTags.WOODEN_DOORS,ItemTags.WOODEN_DOORS);
        this.copy(BlockTags.WOODEN_FENCES,ItemTags.WOODEN_FENCES);
        this.copy(BlockTags.WOODEN_PRESSURE_PLATES,ItemTags.WOODEN_PRESSURE_PLATES);
        this.copy(BlockTags.WOODEN_SLABS,ItemTags.WOODEN_SLABS);
        this.copy(BlockTags.WOODEN_STAIRS,ItemTags.WOODEN_STAIRS);
        this.copy(BlockTags.WOODEN_TRAPDOORS,ItemTags.WOODEN_TRAPDOORS);

        this.getOrCreateTagBuilder(APTags.MUSHROOMS)
                .add(Items.RED_MUSHROOM)
                .add(Items.BROWN_MUSHROOM);

        this.getOrCreateTagBuilder(APTags.OLIVESTONE)
                .add(APBlocks.OLIVESTONE_BRICKS.asItem())
                .add(APBlocks.OLIVESTONE_TILES.asItem());

        this.getOrCreateTagBuilder(APTags.OLIVESTONE_SLABS)
                .add(Registries.BLOCK.get(new Identifier("architects_palette:olivestone_brick_slab")).asItem())
                .add(Registries.BLOCK.get(new Identifier("architects_palette:olivestone_tile_slab")).asItem());

        this.getOrCreateTagBuilder(APTags.WITHERED_BONES).add(APItems.WITHERED_BONE);
    }
}
