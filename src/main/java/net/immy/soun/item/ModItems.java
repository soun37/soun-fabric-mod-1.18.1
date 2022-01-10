package net.immy.soun.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.immy.soun.sounMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item NOB = registerItem("token", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(sounMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        sounMod.LOGGER.info("Registering Mod Items for " + sounMod.MOD_ID);
    }

}
