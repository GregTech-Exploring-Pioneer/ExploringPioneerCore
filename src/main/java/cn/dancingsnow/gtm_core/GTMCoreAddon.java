package cn.dancingsnow.gtm_core;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTElements;
import earth.terrarium.ad_astra.common.registry.ModBlocks;
import net.minecraft.tags.BlockTags;

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
        TagPrefix.oreTagPrefix("moon_stone")
                .langValue("Moon %s Ore")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(TagPrefix.Conditions.hasOreProperty)
                .registerOre(() -> ModBlocks.MOON_STONE.get().defaultBlockState());

        TagPrefix.oreTagPrefix("mars_stone")
                .langValue("Mars %s Ore")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(TagPrefix.Conditions.hasOreProperty)
                .registerOre(() -> ModBlocks.MARS_STONE.get().defaultBlockState());

        TagPrefix.oreTagPrefix("venus_stone")
                .langValue("Venus %s Ore")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(TagPrefix.Conditions.hasOreProperty)
                .registerOre(() -> ModBlocks.VENUS_STONE.get().defaultBlockState());

        TagPrefix.oreTagPrefix("mercury_stone")
                .langValue("Mercury %s Ore")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(TagPrefix.Conditions.hasOreProperty)
                .registerOre(() -> ModBlocks.MERCURY_STONE.get().defaultBlockState());

        TagPrefix.oreTagPrefix("glacio_stone")
                .langValue("Glacio %s Ore")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(TagPrefix.Conditions.hasOreProperty)
                .registerOre(() -> ModBlocks.GLACIO_STONE.get().defaultBlockState());
    }

    @Override
    public void registerElements() {
        IGTAddon.super.registerElements();
        GTElements.createAndRegister(999, 9999, -1, null, "Infinity Catalyst", "If", false);
        GTElements.createAndRegister(9999, 99999, -1, null, "Space Neutronium", "SpNt", false);
        GTElements.createAndRegister(99999, 999999, -1, null, "Infinity", "If*", false);
    }
}
