package cn.dancingsnow.gtm_core;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

import java.util.List;

@Mod.EventBusSubscriber(modid = GTMCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GTMCoreConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.ConfigValue<List<String>> remove_veins = BUILDER
            .comment("GTOreVein id list to remove")
            .define("remove_veins", List.of());


    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static List<String> REMOVE_VEINS;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        REMOVE_VEINS = remove_veins.get();
    }
}
