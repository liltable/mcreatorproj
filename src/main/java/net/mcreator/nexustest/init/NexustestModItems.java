
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexustest.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.nexustest.item.FlashSwordItem;
import net.mcreator.nexustest.item.FlashArmorArmorItem;
import net.mcreator.nexustest.NexustestMod;

public class NexustestModItems {
	public static Item FLASH_SWORD;
	public static Item FLASH_ARMOR_ARMOR_HELMET;
	public static Item FLASH_ARMOR_ARMOR_CHESTPLATE;
	public static Item FLASH_ARMOR_ARMOR_LEGGINGS;
	public static Item FLASH_ARMOR_ARMOR_BOOTS;

	public static void load() {
		FLASH_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(NexustestMod.MODID, "flash_sword"), new FlashSwordItem());
		FLASH_ARMOR_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(NexustestMod.MODID, "flash_armor_armor_helmet"),
				new FlashArmorArmorItem.Helmet());
		FLASH_ARMOR_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(NexustestMod.MODID, "flash_armor_armor_chestplate"),
				new FlashArmorArmorItem.Chestplate());
		FLASH_ARMOR_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(NexustestMod.MODID, "flash_armor_armor_leggings"),
				new FlashArmorArmorItem.Leggings());
		FLASH_ARMOR_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(NexustestMod.MODID, "flash_armor_armor_boots"),
				new FlashArmorArmorItem.Boots());
	}
}
