package cn.dancingsnow.gtm_core.data;

import cn.dancingsnow.gtm_core.ExploringPioneerCore;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MIXER_RECIPES;

public class ExploringPioneerCoreRecipes {

    public static void addMixerRecipes(Consumer<FinishedRecipe> provider) {
        MIXER_RECIPES.recipeBuilder(ExploringPioneerCore.id("superconductor_base_mv"))
                .inputItems(TagPrefix.dust, GTMaterials.Cadmium, 5)
                .inputItems(TagPrefix.dust, GTMaterials.Magnesium, 1)
                .inputFluids(GTMaterials.Oxygen.getFluid(6000))
                .outputItems(TagPrefix.dust, ExploringPioneerCoreMaterials.SUPERCONDUCTOR_BASE_MV, 12)
                .EUt(GTValues.VA[GTValues.MV]).duration(200)
                .save(provider);

        MIXER_RECIPES.recipeBuilder(ExploringPioneerCore.id("superconductor_base_hv"))
                .inputItems(TagPrefix.dust, GTMaterials.Titanium)
                .inputItems(TagPrefix.dust, GTMaterials.Barium, 9)
                .inputItems(TagPrefix.dust, GTMaterials.Copper, 10)
                .inputFluids(GTMaterials.Oxygen.getFluid(20000))
                .outputItems(TagPrefix.dust, ExploringPioneerCoreMaterials.SUPERCONDUCTOR_BASE_HV, 40)
                .EUt(GTValues.VA[GTValues.HV]).duration(200)
                .save(provider);

        MIXER_RECIPES.recipeBuilder(ExploringPioneerCore.id("superconductor_base_ev"))
                .inputItems(TagPrefix.dust, GTMaterials.Uranium238)
                .inputItems(TagPrefix.dust, GTMaterials.Platinum, 3)
                .outputItems(TagPrefix.dust, ExploringPioneerCoreMaterials.SUPERCONDUCTOR_BASE_EV,4)
                .EUt(GTValues.VA[GTValues.EV]).duration(200)
                .save(provider);

        MIXER_RECIPES.recipeBuilder(ExploringPioneerCore.id("superconductor_base_iv"))
                .inputItems(TagPrefix.dust, GTMaterials.Vanadium)
                .inputItems(TagPrefix.dust, GTMaterials.Indium, 3)
                .outputItems(TagPrefix.dust, ExploringPioneerCoreMaterials.SUPERCONDUCTOR_BASE_IV, 4)
                .EUt(GTValues.VA[GTValues.IV]).duration(200)
                .save(provider);

        MIXER_RECIPES.recipeBuilder(ExploringPioneerCore.id("superconductor_base_luv"))
                .inputItems(TagPrefix.dust, GTMaterials.Indium, 4)
                .inputItems(TagPrefix.dust, GTMaterials.Tin, 2)
                .inputItems(TagPrefix.dust, GTMaterials.Barium, 2)
                .inputItems(TagPrefix.dust, GTMaterials.Titanium)
                .inputItems(TagPrefix.dust, GTMaterials.Copper, 7)
                .inputFluids(GTMaterials.Oxygen.getFluid(14000))
                .outputItems(TagPrefix.dust, ExploringPioneerCoreMaterials.SUPERCONDUCTOR_BASE_LuV, 30)
                .EUt(GTValues.VA[GTValues.LuV]).duration(200)
                .save(provider);

        MIXER_RECIPES.recipeBuilder(ExploringPioneerCore.id("superconductor_base_zpm"))
                .inputItems(TagPrefix.dust, GTMaterials.Naquadah, 4)
                .inputItems(TagPrefix.dust,GTMaterials.Indium, 4)
                .inputItems(TagPrefix.dust, GTMaterials.Palladium, 6)
                .inputItems(TagPrefix.dust, GTMaterials.Osmium)
                .outputItems(TagPrefix.dust, ExploringPioneerCoreMaterials.SUPERCONDUCTOR_BASE_ZPM, 15)
                .EUt(GTValues.VA[GTValues.ZPM]).duration(200)
                .save(provider);

        MIXER_RECIPES.recipeBuilder(ExploringPioneerCore.id("superconductor_base_uv"))
                .inputItems(TagPrefix.dust, GTMaterials.Naquadria, 4)
                .inputItems(TagPrefix.dust, GTMaterials.Osmiridium, 3)
                .inputItems(TagPrefix.dust, GTMaterials.Europium)
                .inputItems(TagPrefix.dust, GTMaterials.Samarium)
                .outputItems(TagPrefix.dust, ExploringPioneerCoreMaterials.SUPERCONDUCTOR_BASE_UV)
                .EUt(GTValues.VA[GTValues.UV]).duration(200)
                .save(provider);
    }

    public static void init(Consumer<FinishedRecipe> provider) {
        addMixerRecipes(provider);
    }
}
