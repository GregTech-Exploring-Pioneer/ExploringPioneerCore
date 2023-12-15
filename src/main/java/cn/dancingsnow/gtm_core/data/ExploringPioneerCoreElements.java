package cn.dancingsnow.gtm_core.data;

import com.gregtechceu.gtceu.api.data.chemical.Element;
import com.gregtechceu.gtceu.common.data.GTElements;

@SuppressWarnings("unused")
public class ExploringPioneerCoreElements {
    public static final Element INFINITY_CATALYST = GTElements.createAndRegister(999, 9999, -1, null, "Infinity Catalyst", "If", false);
    public static final Element SPACE_NEUTRONIUM = GTElements.createAndRegister(9999, 99999, -1, null, "Space Neutronium", "SpNt", false);
    public static final Element INFINITY = GTElements.createAndRegister(99999, 999999, -1, null, "Infinity", "If*", false);

    // load the class
    public static void init() {

    }
}
