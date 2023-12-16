package cn.dancingsnow.gtm_core;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EPCore.MOD_ID)
public class EPCore {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "ep_core";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public EPCore() {
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EPCoreConfig.SPEC);
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
