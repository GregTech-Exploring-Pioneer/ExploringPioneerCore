package cn.dancingsnow.gtm_core;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class EPCoreTags {
    public static class FluidTags {
        public static final TagKey<Fluid> TIER_1 = mod("tier_1");
        public static final TagKey<Fluid> TIER_2 = mod("tier_2");
        public static final TagKey<Fluid> TIER_3 = mod("tier_3");
        public static final TagKey<Fluid> TIER_4 = mod("tier_4");

        private static TagKey<Fluid> mod(String path) {
            return TagKey.create(Registries.FLUID, new ResourceLocation(EPCore.MOD_ID, path));
        }
    }
}
