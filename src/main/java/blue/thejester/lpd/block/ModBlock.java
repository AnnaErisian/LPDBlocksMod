package blue.thejester.lpd.block;

import blue.thejester.lpd.Lpd;
import blue.thejester.lpd.core.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class ModBlock extends Block {
    public ModBlock(String name, Material mat, float hardness, float resistance, int miningLevel, String toolClass, SoundType sounds) {
        super(mat);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(toolClass, miningLevel);
        this.setSoundType(sounds);
        setTranslationKey(name);
        setRegistryName(new ResourceLocation(Lpd.MODID, name));
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
