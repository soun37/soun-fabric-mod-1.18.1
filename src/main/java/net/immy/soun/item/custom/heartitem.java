package net.immy.soun.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class heartitem extends Item {
    public heartitem(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity player) {
        float hp = (float) player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue();
        player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(hp + 2);
        player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.5F, 1.75F);
        if (this.isFood()) {
            return player.eatFood(world, stack);
        }
        return stack;
    }

}
