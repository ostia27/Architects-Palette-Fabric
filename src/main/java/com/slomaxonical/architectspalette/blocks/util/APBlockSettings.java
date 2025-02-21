package com.slomaxonical.architectspalette.blocks.util;

import com.slomaxonical.architectspalette.blocks.CageLanternBlock;
import com.slomaxonical.architectspalette.blocks.SunstoneBlock;
import com.slomaxonical.architectspalette.blocks.abyssaline.AbyssalineBlock;
import com.slomaxonical.architectspalette.blocks.abyssaline.AbyssalineHelper;
import com.slomaxonical.architectspalette.blocks.abyssaline.AbyssalineLampBlock;
import com.slomaxonical.architectspalette.blocks.abyssaline.ChiseledAbyssalineBlock;
import com.slomaxonical.architectspalette.registry.APSounds;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.BooleanProperty;

public class APBlockSettings {

	public static final BooleanProperty CHARGED = BooleanProperty.of("charged");

	public static final FabricBlockSettings ABYSSALINE = FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
			.strength(25.0F, 600.0F)
			.emissiveLighting(AbyssalineHelper::needsPostProcessing)
			.postProcess(AbyssalineHelper::needsPostProcessing)
			.allowsSpawning(AbyssalineHelper::allowsMobSpawning)
			.luminance(AbyssalineBlock.getLuminance());
	public static final FabricBlockSettings CHISELED_ABYSSALINE = FabricBlockSettings.copyOf(ABYSSALINE).luminance(ChiseledAbyssalineBlock.getLuminance());
	public static final FabricBlockSettings ABYSSALINE_LAMP = FabricBlockSettings.copyOf(ABYSSALINE).sounds(BlockSoundGroup.GLASS).luminance(AbyssalineLampBlock.getLuminance());

	public static FabricBlockSettings Meat(MapColor color) {
		return FabricBlockSettings.create().mapColor(color).strength(1.0F).sounds(BlockSoundGroup.CORAL);
	}

	public static final FabricBlockSettings FLINT = FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(3.0F, 16.0F).requiresTool();
	public static final FabricBlockSettings MYONITE = FabricBlockSettings.copyOf(Blocks.STONE);
	public static final FabricBlockSettings SUNMETAL = FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 8.0F).sounds(BlockSoundGroup.NETHERITE).requiresTool();
	 // Should be less slippery?
	public static final FabricBlockSettings BUILDING_ICE = FabricBlockSettings.copyOf(Blocks.PACKED_ICE).slipperiness(0.8F);
	 // As Prismarine
	public static final FabricBlockSettings OLIVESTONE = FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_GREEN).strength(1.5F, 6.0F).requiresTool();
	 // As Nether Bricks
	public static final FabricBlockSettings ALGAL_BRICK = FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_CYAN).strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool();

	public static final FabricBlockSettings ENTWINE = FabricBlockSettings.create().mapColor(MapColor.CYAN).strength(3.0F, 6.0F).sounds(APSounds.APSoundTypes.ENTWINE).requiresTool();
	public static final FabricBlockSettings ENDER_PEARL = FabricBlockSettings.create().mapColor(MapColor.CYAN).strength(1.5F).sounds(APSounds.APSoundTypes.ENDER_PEARL);
	public static final FabricBlockSettings PLATING = FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).strength(4.0F, 10.0F).sounds(BlockSoundGroup.NETHERITE).requiresTool();
	public static AbstractBlock.Settings ANCIENT_PLATING = FabricBlockSettings.create().mapColor(MapColor.DIRT_BROWN)
			.requiresTool()
			.strength(4.0f,12.0f)
			.sounds(BlockSoundGroup.NETHERITE);

	public static final FabricBlockSettings MOLTEN_BRICK = FabricBlockSettings.create().mapColor(MapColor.DARK_RED)
			.requiresTool()
			.strength(2.0F, 6.0F)
			.luminance((state) -> 3)
			.postProcess((a, b, c) -> true)
			.emissiveLighting((a, b, c) -> true);

	public static final FabricBlockSettings CAGE_LANTERN = FabricBlockSettings.create()
			.requiresTool()
			.emissiveLighting((state, reader, pos) -> state.get(CageLanternBlock.LIT))
			.postProcess((state, reader, pos) -> state.get(CageLanternBlock.LIT))
			.strength(3.5f)
			.sounds(BlockSoundGroup.LANTERN)
			.nonOpaque();

	public static final FabricBlockSettings ACACIA_TOTEM = FabricBlockSettings.create().mapColor(MapColor.ORANGE)
			.strength(2.0F)
			.sounds(BlockSoundGroup.WOOD);
	public static final FabricBlockSettings NETHER_CRYSTAL = FabricBlockSettings.copyOf(Blocks.GLASS).luminance(l -> 12).requiresTool().strength(1.2f);

	public static final FabricBlockSettings NETHER_BRASS = FabricBlockSettings.create().mapColor(MapColor.YELLOW)
			.strength(4.0F, 10.0F)
			.sounds(BlockSoundGroup.COPPER)
			.requiresTool();


	public static final AbstractBlock.Settings GREEN_FIRE = FabricBlockSettings.create().mapColor(MapColor.LIME)
			.noCollision()
			.breakInstantly()
			.luminance((lumen) -> 13)
			.sounds(BlockSoundGroup.WOOL)
			.dropsNothing();

	public static final FabricBlockSettings BRASS_TORCH = FabricBlockSettings.create()
			.noCollision()
			.breakInstantly()
			.luminance((lumen) -> 13)
			.sounds(BlockSoundGroup.WOOD);
	public static final FabricBlockSettings WARDSTONE = FabricBlockSettings.create().mapColor(MapColor.BLUE)
			.requiresTool()
			.strength(2F, 6)
			.sounds(BlockSoundGroup.NETHER_BRICKS);
	public static final FabricBlockSettings ESOTERRACK = FabricBlockSettings.create().mapColor(MapColor.RAW_IRON_PINK)
			.requiresTool()
			.strength(0.4f)
			.sounds(BlockSoundGroup.NETHERRACK);
	public static final FabricBlockSettings ONYX = FabricBlockSettings.create().mapColor(MapColor.BLACK)
			.requiresTool()
			.strength(1.5f,6)
			.sounds(BlockSoundGroup.BASALT);


	// This makes a new property each time so that setting the door to not solid doesn't interfere.
	public static FabricBlockSettings TwistedWood() {
		return FabricBlockSettings.create().mapColor(MapColor.PURPLE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD);
	}
	public static FabricBlockSettings TwistedWood(boolean redstoneComponent) {
		FabricBlockSettings p = TwistedWood();
		if (redstoneComponent) {
			return p.noCollision().strength(0.5f);
		}
		return p;
	}
	public static final FabricBlockSettings SUNSTONE = FabricBlockSettings.copyOf(Blocks.BASALT)
//			.solidBlock(SunstoneBlock::isSolid).dynamicBounds()
			.luminance(SunstoneBlock::lightValue);

}