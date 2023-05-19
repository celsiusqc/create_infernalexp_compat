package net.celsiusqc.create_infernalexp_compat.item;

import net.celsiusqc.create_infernalexp_compat.CreateInfernalExpCompat;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateInfernalExpCompat.MOD_ID);


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
