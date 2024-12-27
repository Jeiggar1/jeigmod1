package net.jeiggar.jeigmod.item;

import net.jeiggar.jeigmod.JeigMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JeigMod.MODID);

    public static final RegistryObject<CreativeModeTab> WOOL_TAB = CREATIVE_MODE_TABS.register("wool_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BiG_SNOW_WOOL.get()))
                    .title(Component.translatable("creativetab.wool_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SNOW_WOOL.get());
                        output.accept(ModItems.BiG_SNOW_WOOL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
