package cn.dancingsnow.gtm_core;

import cn.dancingsnow.gtm_core.data.EPCoreMaterials;
import cn.dancingsnow.gtm_core.data.EPCoreElements;
import cn.dancingsnow.gtm_core.data.EPCoreRecipes;
import cn.dancingsnow.gtm_core.data.EPCoreTagprefixs;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@GTAddon
public class EPCoreAddon implements IGTAddon {
    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return EPCore.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        IGTAddon.super.registerTagPrefixes();
        EPCoreTagprefixs.init();
    }

    @Override
    public void registerElements() {
        IGTAddon.super.registerElements();
        EPCoreElements.init();
    }

    @Override
    public void registerMaterials() {
        IGTAddon.super.registerMaterials();
        EPCoreMaterials.init();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        IGTAddon.super.addRecipes(provider);
        EPCoreRecipes.init(provider);
    }
}
