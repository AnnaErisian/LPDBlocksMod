package blue.thejester.lpd.block;

import blue.thejester.lpd.Lpd;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Lpd.MODID)
public class Blocks {

    public static Block gn_bloodstone;
    public static Block gn_glowash;
    public static Block gn_glowflesh;
    public static Block gn_glowsand;
    public static Block charred_gold_ore;
    public static Block charred_iron_ore;
    public static Block charred_coal_ore;
    public static Block charred_lapis_ore;
    public static Block charred_diamond_ore;
    public static Block charred_redstone_ore;
    public static Block charred_lead_ore;
    public static Block charred_silver_ore;
    public static Block charred_copper_ore;
    public static Block charred_tin_ore;
    public static Block charred_prosperity_ore;
    public static Block charred_inferium_ore;
    public static Block charred_thorium_ore;
    public static Block charred_uranium_ore;
    public static Block charred_boron_ore;
    public static Block charred_lithium_ore;
    public static Block charred_magnesium_ore;
    public static Block charred_aluminum_ore;
    public static Block charred_nickel_ore;
    public static Block charred_platinum_ore;
    public static Block charred_iridium_ore;
    public static Block charred_atercaeum_ore;
    public static Block charred_oscurum_ore;
    public static Block charred_inurose_ore;
    public static Block charred_cibarite_ore;
    public static Block charred_draconium_ore;

    public static void init() {
        gn_bloodstone = new ModBlock("gn_blood_stone", Material.ROCK, 0.4f, 0.2f, 0, "pickaxe", SoundType.STONE).setLightLevel(7);
        gn_glowash = new ModBlock("gn_blood_ash", Material.SAND, 0.5f, 0.2f, 0, "shovel", SoundType.SAND).setLightLevel(7);
        gn_glowflesh = new ModBlock("gn_blood_flesh", Material.SPONGE, 0.4f, 0.2f, 0, "axe", SoundType.SLIME).setLightLevel(7);
        gn_glowsand = new ModBlock("gn_glow_sand", Material.SAND, 0.4f, 0.2f, 0, "shovel", SoundType.SAND).setLightLevel(7);
        charred_gold_ore = new ModBlock("charred_gold_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_iron_ore = new ModBlock("charred_iron_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_coal_ore = new ModBlock("charred_coal_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_lapis_ore = new ModBlock("charred_lapis_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_diamond_ore = new ModBlock("charred_diamond_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_redstone_ore = new ModBlock("charred_redstone_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_lead_ore = new ModBlock("charred_lead_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_silver_ore = new ModBlock("charred_silver_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_copper_ore = new ModBlock("charred_copper_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_tin_ore = new ModBlock("charred_tin_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_prosperity_ore = new ModBlock("charred_prosperity_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_inferium_ore = new ModBlock("charred_inferium_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_thorium_ore = new ModBlock("charred_thorium_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_uranium_ore = new ModBlock("charred_uranium_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_boron_ore = new ModBlock("charred_boron_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_lithium_ore = new ModBlock("charred_lithium_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_magnesium_ore = new ModBlock("charred_magnesium_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_aluminum_ore = new ModBlock("charred_aluminum_ore", Material.ROCK, 4.5f, 4.5f, 1, "pickaxe", SoundType.STONE);
        charred_nickel_ore = new ModBlock("charred_nickel_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_platinum_ore = new ModBlock("charred_platinum_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_iridium_ore = new ModBlock("charred_iridium_ore", Material.ROCK, 4.5f, 4.5f, 2, "pickaxe", SoundType.STONE);
        charred_atercaeum_ore = new ModBlock("charred_atercaeum_ore", Material.ROCK, 4.5f, 4500f, 9, "pickaxe", SoundType.STONE);
        charred_oscurum_ore = new ModBlock("charred_oscurum_ore", Material.ROCK, 4.5f, 4500f, 10, "pickaxe", SoundType.STONE);
        charred_inurose_ore = new ModBlock("charred_inurose_ore", Material.ROCK, 4.5f, 4500f, 10, "pickaxe", SoundType.STONE);
        charred_cibarite_ore = new ModBlock("charred_cibarite_ore", Material.ROCK, 4.5f, 4500f, 10, "pickaxe", SoundType.STONE);
        charred_draconium_ore = new ModBlock("charred_draconium_ore", Material.ROCK, 4.5f, 4.5f, 3, "pickaxe", SoundType.STONE);
    }

    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(gn_bloodstone);
        e.getRegistry().registerAll(gn_glowash);
        e.getRegistry().registerAll(gn_glowflesh);
        e.getRegistry().registerAll(gn_glowsand);
        e.getRegistry().registerAll(charred_gold_ore);
        e.getRegistry().registerAll(charred_iron_ore);
        e.getRegistry().registerAll(charred_coal_ore);
        e.getRegistry().registerAll(charred_lapis_ore);
        e.getRegistry().registerAll(charred_diamond_ore);
        e.getRegistry().registerAll(charred_redstone_ore);
        e.getRegistry().registerAll(charred_lead_ore);
        e.getRegistry().registerAll(charred_silver_ore);
        e.getRegistry().registerAll(charred_copper_ore);
        e.getRegistry().registerAll(charred_tin_ore);
        e.getRegistry().registerAll(charred_prosperity_ore);
        e.getRegistry().registerAll(charred_inferium_ore);
        e.getRegistry().registerAll(charred_thorium_ore);
        e.getRegistry().registerAll(charred_uranium_ore);
        e.getRegistry().registerAll(charred_boron_ore);
        e.getRegistry().registerAll(charred_lithium_ore);
        e.getRegistry().registerAll(charred_magnesium_ore);
        e.getRegistry().registerAll(charred_aluminum_ore);
        e.getRegistry().registerAll(charred_nickel_ore);
        e.getRegistry().registerAll(charred_platinum_ore);
        e.getRegistry().registerAll(charred_iridium_ore);
        e.getRegistry().registerAll(charred_atercaeum_ore);
        e.getRegistry().registerAll(charred_oscurum_ore);
        e.getRegistry().registerAll(charred_inurose_ore);
        e.getRegistry().registerAll(charred_cibarite_ore);
        e.getRegistry().registerAll(charred_draconium_ore);

    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> e) {
        registerItemBlock(e, gn_bloodstone);
        registerItemBlock(e, gn_glowash);
        registerItemBlock(e, gn_glowflesh);
        registerItemBlock(e, gn_glowsand);
        registerItemBlock(e, charred_gold_ore);
        registerItemBlock(e, charred_iron_ore);
        registerItemBlock(e, charred_coal_ore);
        registerItemBlock(e, charred_lapis_ore);
        registerItemBlock(e, charred_diamond_ore);
        registerItemBlock(e, charred_redstone_ore);
        registerItemBlock(e, charred_lead_ore);
        registerItemBlock(e, charred_silver_ore);
        registerItemBlock(e, charred_copper_ore);
        registerItemBlock(e, charred_tin_ore);
        registerItemBlock(e, charred_prosperity_ore);
        registerItemBlock(e, charred_inferium_ore);
        registerItemBlock(e, charred_thorium_ore);
        registerItemBlock(e, charred_uranium_ore);
        registerItemBlock(e, charred_boron_ore);
        registerItemBlock(e, charred_lithium_ore);
        registerItemBlock(e, charred_magnesium_ore);
        registerItemBlock(e, charred_aluminum_ore);
        registerItemBlock(e, charred_nickel_ore);
        registerItemBlock(e, charred_platinum_ore);
        registerItemBlock(e, charred_iridium_ore);
        registerItemBlock(e, charred_atercaeum_ore);
        registerItemBlock(e, charred_oscurum_ore);
        registerItemBlock(e, charred_inurose_ore);
        registerItemBlock(e, charred_cibarite_ore);
        registerItemBlock(e, charred_draconium_ore);
    }

    private static void registerItemBlock(RegistryEvent.Register<Item> e, Block block) {
        e.getRegistry().registerAll(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(gn_bloodstone));
        registerRender(Item.getItemFromBlock(gn_glowash));
        registerRender(Item.getItemFromBlock(gn_glowflesh));
        registerRender(Item.getItemFromBlock(gn_glowsand));
        registerRender(Item.getItemFromBlock(charred_gold_ore));
        registerRender(Item.getItemFromBlock(charred_iron_ore));
        registerRender(Item.getItemFromBlock(charred_coal_ore));
        registerRender(Item.getItemFromBlock(charred_lapis_ore));
        registerRender(Item.getItemFromBlock(charred_diamond_ore));
        registerRender(Item.getItemFromBlock(charred_redstone_ore));
        registerRender(Item.getItemFromBlock(charred_lead_ore));
        registerRender(Item.getItemFromBlock(charred_silver_ore));
        registerRender(Item.getItemFromBlock(charred_copper_ore));
        registerRender(Item.getItemFromBlock(charred_tin_ore));
        registerRender(Item.getItemFromBlock(charred_prosperity_ore));
        registerRender(Item.getItemFromBlock(charred_inferium_ore));
        registerRender(Item.getItemFromBlock(charred_thorium_ore));
        registerRender(Item.getItemFromBlock(charred_uranium_ore));
        registerRender(Item.getItemFromBlock(charred_boron_ore));
        registerRender(Item.getItemFromBlock(charred_lithium_ore));
        registerRender(Item.getItemFromBlock(charred_magnesium_ore));
        registerRender(Item.getItemFromBlock(charred_aluminum_ore));
        registerRender(Item.getItemFromBlock(charred_nickel_ore));
        registerRender(Item.getItemFromBlock(charred_platinum_ore));
        registerRender(Item.getItemFromBlock(charred_iridium_ore));
        registerRender(Item.getItemFromBlock(charred_atercaeum_ore));
        registerRender(Item.getItemFromBlock(charred_oscurum_ore));
        registerRender(Item.getItemFromBlock(charred_inurose_ore));
        registerRender(Item.getItemFromBlock(charred_cibarite_ore));
        registerRender(Item.getItemFromBlock(charred_draconium_ore));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
