package cn.dancingsnow.gtm_core.data;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.common.data.GTMaterials;

@SuppressWarnings("unused")
public class EPCoreMaterials {
    public static final Material SUPERCONDUCTOR_BASE_MV = new Material.Builder("superconductor_base_mv")
            .ingot().fluid()
            .color(0x4b4b4b)
            .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING, MaterialFlags.GENERATE_FINE_WIRE)
            .blastTemp(2500, BlastProperty.GasTier.LOW, GTValues.VA[GTValues.MV], 2400)
            .cableProperties(GTValues.V[GTValues.MV], 1, (int) Math.pow(2, GTValues.MV - 1))
            .components(GTMaterials.Cadmium, 5, GTMaterials.Magnesium, 1, GTMaterials.Oxygen, 6)
            .buildAndRegister()
            .setFormula("Cd5MgO6");

    public static final Material SUPERCONDUCTOR_BASE_HV = new Material.Builder("superconductor_base_hv")
            .ingot().fluid()
            .color(0x958a80)
            .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING, MaterialFlags.GENERATE_FINE_WIRE)
            .blastTemp(3300, BlastProperty.GasTier.LOW, GTValues.VA[GTValues.HV], 2500)
            .cableProperties(GTValues.V[GTValues.HV], 2, (int) Math.pow(2, GTValues.HV - 1))
            .components(GTMaterials.Titanium, 1, GTMaterials.Barium, 9, GTMaterials.Copper, 10, GTMaterials.Oxygen, 20)
            .buildAndRegister()
            .setFormula("TiBa9Cu10O2");

    public static final Material SUPERCONDUCTOR_BASE_EV = new Material.Builder("superconductor_base_ev")
            .ingot().fluid()
            .color(0x80bc80)
            .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING, MaterialFlags.GENERATE_FINE_WIRE)
            .blastTemp(4400, BlastProperty.GasTier.MID, GTValues.VA[GTValues.EV], 3000)
            .cableProperties(GTValues.V[GTValues.EV], 3, (int) Math.pow(2, GTValues.EV - 1))
            .components(GTMaterials.Uranium238, 1, GTMaterials.Platinum, 3)
            .buildAndRegister()
            .setFormula("UPt3");

    public static final Material SUPERCONDUCTOR_BASE_IV = new Material.Builder("superconductor_base_iv")
            .ingot().fluid()
            .color(0x1e001e)
            .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING, MaterialFlags.GENERATE_FINE_WIRE)
            .blastTemp(5200, BlastProperty.GasTier.MID, GTValues.VA[GTValues.IV], 3400)
            .cableProperties(GTValues.V[GTValues.IV], 4, (int) Math.pow(2, GTValues.IV - 1))
            .components(GTMaterials.Vanadium, 1, GTMaterials.Indium, 3)
            .buildAndRegister()
            .setFormula("VIn3");

    public static final Material SUPERCONDUCTOR_BASE_LuV = new Material.Builder("superconductor_base_luv")
            .ingot().fluid()
            .color(0x824000)
            .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING, MaterialFlags.GENERATE_FINE_WIRE)
            .blastTemp(6000, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.LuV], 6400)
            .cableProperties(GTValues.V[GTValues.LuV], 6, (int) Math.pow(2, GTValues.LuV - 1))
            .components(GTMaterials.Indium, 4, GTMaterials.Tin, 2, GTMaterials.Barium, 2, GTMaterials.Titanium, 1, GTMaterials.Copper, 7, GTMaterials.Oxygen, 14)
            .buildAndRegister()
            .setFormula("In4Sn2Ba2TiCu7O14");

    public static final Material SUPERCONDUCTOR_BASE_ZPM = new Material.Builder("superconductor_base_zpm")
            .ingot().fluid()
            .color(0x080808)
            .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING, MaterialFlags.GENERATE_FINE_WIRE)
            .blastTemp(9000, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM], 7200)
            .cableProperties(GTValues.V[GTValues.ZPM], 8, (int) Math.pow(2, GTValues.ZPM - 1))
            .components(GTMaterials.Naquadah, 4, GTMaterials.Indium, 4, GTMaterials.Palladium, 6, GTMaterials.Osmium, 1)
            .buildAndRegister()
            .setFormula("Nq4In2Pd6Os");

    public static final Material SUPERCONDUCTOR_BASE_UV = new Material.Builder("superconductor_base_uv")
            .ingot().fluid()
            .color(0xbeb206)
            .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING, MaterialFlags.GENERATE_FINE_WIRE)
            .blastTemp(9900, BlastProperty.GasTier.HIGHER, GTValues.VA[GTValues.UV], 13000)
            .cableProperties(GTValues.V[GTValues.UV], 12, (int) Math.pow(2, GTValues.UV - 1))
            .components(GTMaterials.Naquadria, 4, GTMaterials.Osmiridium, 3, GTMaterials.Europium, 1, GTMaterials.Samarium, 1)
            .buildAndRegister()
            .setFormula("*Nq*4(Ir3Os)3EuSm");

    public static final Material SUPERCONDUCTOR_MV = new Material.Builder("superconductor_mv")
            .color(0x4b4b4b)
            .cableProperties(GTValues.V[GTValues.MV], 4, 0, true)
            .flags(MaterialFlags.NO_WORKING)
            .buildAndRegister()
            .setFormula("Cd5MgO6");

    public static final Material SUPERCONDUCTOR_HV = new Material.Builder("superconductor_hv")
            .color(0x958a80)
            .cableProperties(GTValues.V[GTValues.HV], 6, 0, true)
            .flags(MaterialFlags.NO_WORKING)
            .buildAndRegister()
            .setFormula("TiBa9Cu10O2");

    public static final Material SUPERCONDUCTOR_EV = new Material.Builder("superconductor_ev")
            .color(0x80bc80)
            .cableProperties(GTValues.V[GTValues.EV], 8, 0, true)
            .flags(MaterialFlags.NO_WORKING)
            .buildAndRegister()
            .setFormula("UPt3");

    public static final Material SUPERCONDUCTOR_IV = new Material.Builder("superconductor_iv")
            .color(0x1e001e)
            .cableProperties(GTValues.V[GTValues.IV], 12, 0, true)
            .flags(MaterialFlags.NO_WORKING)
            .buildAndRegister()
            .setFormula("VIn3");

    public static final Material SUPERCONDUCTOR_LuV = new Material.Builder("superconductor_luv")
            .color(0x824000)
            .cableProperties(GTValues.V[GTValues.LuV], 16, 0, true)
            .flags(MaterialFlags.NO_WORKING)
            .buildAndRegister()
            .setFormula("In4Sn2Ba2TiCu7O14");

    public static final Material SUPERCONDUCTOR_ZPM = new Material.Builder("superconductor_zpm")
            .color(0x080808)
            .cableProperties(GTValues.V[GTValues.ZPM], 24, 0, true)
            .flags(MaterialFlags.NO_WORKING)
            .buildAndRegister()
            .setFormula("Nq4In2Pd6Os");

    public static final Material SUPERCONDUCTOR_UV = new Material.Builder("superconductor_uv")
            .color(0xbeb206)
            .cableProperties(GTValues.V[GTValues.UV], 32, 0, true)
            .flags(MaterialFlags.NO_WORKING)
            .buildAndRegister()
            .setFormula("*Nq*4(Ir3Os)3EuSm");


    // load the class
    public static void init() {

    }
}
