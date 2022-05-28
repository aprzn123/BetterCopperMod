package io.github.aprzn123;

import com.mojang.serialization.Lifecycle;
import io.github.aprzn123.block.ConductiveCopper;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.OptionalInt;

public class BetterCopper implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("copper");

	public static final Block COPPER = new ConductiveCopper(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Not working for some reason; figure out later
		//Registry.BLOCK.replace(OptionalInt.of(Registry.BLOCK.getRawId(Blocks.COPPER_BLOCK)), Registry.BLOCK.getKey(Blocks.COPPER_BLOCK).orElseThrow(), new Block(AbstractBlock.Settings.of(Material.WOOL, MapColor.WHITE).strength(0.8F).sounds(BlockSoundGroup.WOOL)), Lifecycle.stable());
		Registry.register(Registry.BLOCK, new Identifier("copper", "copper"), COPPER);
		Registry.register(Registry.ITEM, new Identifier("copper", "copper"), new BlockItem(COPPER, new FabricItemSettings().group(ItemGroup.MISC)));

		LOGGER.info("Hello Fabric world!");
	}
}
