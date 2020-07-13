package blue.thejester.lpd;

import blue.thejester.lpd.block.Blocks;
import blue.thejester.lpd.core.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Lpd.MODID, name = Lpd.NAME, version = Lpd.VERSION)
public class Lpd
{
    public static final String MODID = "lpd";
    public static final String NAME = "LPD Blocks Mod";
    public static final String VERSION = "1.0";

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="blue.thejester.lpd.core.ClientOnlyProxy", serverSide="blue.thejester.lpd.core.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }

    @EventHandler
    public void registerModels(ModelRegistryEvent event)
    {
        proxy.registerModels(event);
    }
}
