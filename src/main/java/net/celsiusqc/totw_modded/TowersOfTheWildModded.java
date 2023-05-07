package net.celsiusqc.totw_modded;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(net.celsiusqc.totw_modded.TowersOfTheWildModded.MOD_ID)
public class TowersOfTheWildModded {
    public static final String MOD_ID = "totw_modded";


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
    }
}
