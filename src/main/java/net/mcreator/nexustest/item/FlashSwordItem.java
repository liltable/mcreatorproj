
package net.mcreator.nexustest.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.nexustest.procedures.FlashDriftOnKeyPressedProcedure;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class FlashSwordItem extends SwordItem {
	public FlashSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHER_STAR));
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		FlashDriftOnKeyPressedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("x", entity.getX())
				.put("y", entity.getY()).put("z", entity.getZ()).put("world", world).put("entity", entity).put("itemstack", ar.getObject()).build());
		return ar;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getRecipeRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	@Environment(EnvType.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
