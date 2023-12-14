package cn.dancingsnow.gtm_core.mixin.ad_astra;

import cn.dancingsnow.gtm_core.GTMCoreTags;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import earth.terrarium.ad_astra.common.entity.vehicle.Vehicle;
import earth.terrarium.ad_astra.common.registry.ModTags;
import earth.terrarium.ad_astra.common.util.CustomInventory;
import earth.terrarium.ad_astra.common.util.FluidUtils;
import earth.terrarium.botarium.common.fluid.impl.SimpleFluidContainer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Vehicle.class)
public abstract class VehicleMixin {

    @Shadow(remap = false)
    public abstract int getInventorySize();

    @Shadow(remap = false)
    public abstract CustomInventory getInventory();


    @Shadow(remap = false)
    public abstract SimpleFluidContainer getTank();

    @Inject(method = "tryInsertingIntoTank()V", at = @At("HEAD"), cancellable = true, remap = false)
    @SuppressWarnings("deprecation")
    public void gtm_core$tryInsertingIntoTank(CallbackInfo ci) {
        if (getInventorySize() > 1 && !getInventory().getItem(0).isEmpty()) {
            if (!((Vehicle) (Object) this).level().isClientSide) {
                FluidUtils.insertItemFluidToTank(getTank(), getInventory(), 0, 1, 0, f -> f.is(gtm_core$fuel()));
                FluidUtils.extractTankFluidToItem(getTank(), getInventory(), 0, 1, 0, f -> true);
            }
        }
        ci.cancel();
    }

    @Unique
    public TagKey<Fluid> gtm_core$fuel() {
        if (getInventorySize() == 10) {
            if ((Object) this instanceof Rocket rocket) {
                int tier = rocket.getTier();
                return switch (tier) {
                    case 1 -> GTMCoreTags.FluidTags.TIER_1;
                    case 2 -> GTMCoreTags.FluidTags.TIER_2;
                    case 3 -> GTMCoreTags.FluidTags.TIER_3;
                    case 4 -> GTMCoreTags.FluidTags.TIER_4;
                    default -> ModTags.FUELS;
                };
            }
        }
        return ModTags.FUELS;
    }

}
