package cn.dancingsnow.gtm_core;

import cn.dancingsnow.gtm_core.data.GTMCoreMaterials;
import cn.dancingsnow.gtm_core.data.GTMCoreElements;
import cn.dancingsnow.gtm_core.data.GTMCoreRecipes;
import cn.dancingsnow.gtm_core.data.GTMCoreTagprefixs;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@GTAddon
public class GTMCoreAddon implements IGTAddon {
    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return GTMCore.MODID;
    }

    @Override
    public void registerTagPrefixes() {
        IGTAddon.super.registerTagPrefixes();
        GTMCoreTagprefixs.init();
    }

    @Override
    public void registerElements() {
        IGTAddon.super.registerElements();
        GTMCoreElements.init();
    }

    @Override
    public void registerMaterials() {
        IGTAddon.super.registerMaterials();
        GTMCoreMaterials.init();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        IGTAddon.super.addRecipes(provider);
        GTMCoreRecipes.init(provider);
    }
}
