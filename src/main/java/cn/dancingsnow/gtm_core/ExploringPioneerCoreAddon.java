package cn.dancingsnow.gtm_core;

import cn.dancingsnow.gtm_core.data.ExploringPioneerCoreMaterials;
import cn.dancingsnow.gtm_core.data.ExploringPioneerCoreElements;
import cn.dancingsnow.gtm_core.data.ExploringPioneerCoreRecipes;
import cn.dancingsnow.gtm_core.data.ExploringPioneerCoreTagprefixs;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@GTAddon
public class ExploringPioneerCoreAddon implements IGTAddon {
    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return ExploringPioneerCore.MODID;
    }

    @Override
    public void registerTagPrefixes() {
        IGTAddon.super.registerTagPrefixes();
        ExploringPioneerCoreTagprefixs.init();
    }

    @Override
    public void registerElements() {
        IGTAddon.super.registerElements();
        ExploringPioneerCoreElements.init();
    }

    @Override
    public void registerMaterials() {
        IGTAddon.super.registerMaterials();
        ExploringPioneerCoreMaterials.init();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        IGTAddon.super.addRecipes(provider);
        ExploringPioneerCoreRecipes.init(provider);
    }
}
