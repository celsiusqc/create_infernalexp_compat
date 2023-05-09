package net.celsiusqc.create_blue_skies_compat.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab create_blue_skies_compat = new CreativeModeTab("create_blue_skies_compat_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CRUSHED_AQUITE_ORE.get());
        }
    };
}
