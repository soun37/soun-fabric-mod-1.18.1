package net.immy.soun.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.immy.soun.item.custom.heartitem;
import net.immy.soun.sounMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item NOB = registerItem("token", new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1024)));

    public static final Item SAD_FRAGMENT = registerItem("sadfrag", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item HAPPY_FRAGMENT = registerItem("happyfrag", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ANGRY_FRAGMENT = registerItem("angyfrag", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item FEAR_FRAGMENT = registerItem("pussio", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SURPRISED_FRAGMENT = registerItem("omigaa", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item EW_FRAGMENT = registerItem("ewfrag", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item EMPTY_FRAGMENT = registerItem("nulledfrag", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ENLIGHTENED_FRAGMENT = registerItem("wheelfrag", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item HEART = registerItem("heart", new heartitem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.HEART)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(sounMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        sounMod.LOGGER.info("Registering Mod Items for " + sounMod.MOD_ID);
    }

}
