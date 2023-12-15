package cn.dancingsnow.gtm_core.data;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import earth.terrarium.ad_astra.common.registry.ModBlocks;
import net.minecraft.tags.BlockTags;

@SuppressWarnings("unused")
public class ExploringPioneerCoreTagprefixs {
    public static final TagPrefix MOON_STONE = TagPrefix.oreTagPrefix("moon_stone")
            .langValue("Moon %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(TagPrefix.Conditions.hasOreProperty)
            .registerOre(() -> ModBlocks.MOON_STONE.get().defaultBlockState());

    public static final TagPrefix MARS_STONE = TagPrefix.oreTagPrefix("mars_stone")
            .langValue("Mars %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(TagPrefix.Conditions.hasOreProperty)
            .registerOre(() -> ModBlocks.MARS_STONE.get().defaultBlockState());

    public static final TagPrefix VENUS_STONE = TagPrefix.oreTagPrefix("venus_stone")
            .langValue("Venus %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(TagPrefix.Conditions.hasOreProperty)
            .registerOre(() -> ModBlocks.VENUS_STONE.get().defaultBlockState());

    public static final TagPrefix MERCURY_STONE = TagPrefix.oreTagPrefix("mercury_stone")
            .langValue("Mercury %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(TagPrefix.Conditions.hasOreProperty)
            .registerOre(() -> ModBlocks.MERCURY_STONE.get().defaultBlockState());

    public static final TagPrefix GLACIO_STONE = TagPrefix.oreTagPrefix("glacio_stone")
            .langValue("Glacio %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(TagPrefix.Conditions.hasOreProperty)
            .registerOre(() -> ModBlocks.GLACIO_STONE.get().defaultBlockState());


    // load the class
    public static void init() {

    }
}
