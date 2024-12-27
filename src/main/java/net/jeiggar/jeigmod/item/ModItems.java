package net.jeiggar.jeigmod.item;

import net.jeiggar.jeigmod.JeigMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, JeigMod.MODID);

    public static final RegistryObject<Item> SNOW_WOOL = ITEMS.register("snow_wool",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BiG_SNOW_WOOL = ITEMS.register("big_snow_wool",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
