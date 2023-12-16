package cn.dancingsnow.gtm_core.mixin.gtceu;

import cn.dancingsnow.gtm_core.EPCoreConfig;
import com.google.gson.JsonElement;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.data.loader.OreDataLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.profiling.ProfilerFiller;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(OreDataLoader.class)
public class OreDataLoaderMixin {

    @Inject(
            method = "apply(Ljava/util/Map;Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/util/profiling/ProfilerFiller;)V",
            at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/common/data/GTOres;init()V", shift = At.Shift.AFTER),
            remap = false
    )
    public void gtm_core$apply(Map<ResourceLocation, JsonElement> resourceList, ResourceManager resourceManager, ProfilerFiller profiler, CallbackInfo ci) {
        EPCoreConfig.REMOVE_VEINS.forEach(id -> GTRegistries.ORE_VEINS.remove(GTCEu.id(id)));
    }

}
