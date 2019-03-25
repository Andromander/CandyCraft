package com.crypticmushroom.candycraft.client;

import com.crypticmushroom.candycraft.CandyCraft;
import com.crypticmushroom.candycraft.CommonProxy;
import com.crypticmushroom.candycraft.blocks.CCBlocks;
import com.crypticmushroom.candycraft.blocks.tileentity.TileEntityAlchemy;
import com.crypticmushroom.candycraft.blocks.tileentity.TileEntityCandyChest;
import com.crypticmushroom.candycraft.blocks.tileentity.TileEntityEgg;
import com.crypticmushroom.candycraft.blocks.tileentity.TileEntityTeleporter;
import com.crypticmushroom.candycraft.client.entity.models.*;
import com.crypticmushroom.candycraft.client.entity.renders.*;
import com.crypticmushroom.candycraft.client.tileentity.RenderEgg;
import com.crypticmushroom.candycraft.client.tileentity.TileEntityAlchemyRenderer;
import com.crypticmushroom.candycraft.client.tileentity.TileEntityCandyChestRenderer;
import com.crypticmushroom.candycraft.client.tileentity.TileEntityRendererTeleporter;
import com.crypticmushroom.candycraft.entity.*;
import com.crypticmushroom.candycraft.entity.boss.*;
import com.crypticmushroom.candycraft.items.CCItems;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import org.lwjgl.input.Keyboard;

public class ClientProxy extends CommonProxy {
    public static IRenderHandler weatherRenderer = new RenderWeather();

    public static ModelBiped crown = new ModelBiped(0.1F);
    public static KeyBinding unleashMountPower = new KeyBinding("key.mountPower", Keyboard.KEY_P, "CandyCraft");

    public static ModelResourceLocation dynAn1 = new ModelResourceLocation("candycraftmod:dynamite_1", "inventory");
    public static ModelResourceLocation dynAn1_1 = new ModelResourceLocation("candycraftmod:glue_dynamite_1", "inventory");
    public static ModelResourceLocation dynAn2 = new ModelResourceLocation("candycraftmod:dynamite_2", "inventory");

    @Override
    public void doPreLoadRegistration() {

        RenderingRegistry.registerEntityRenderingHandler(EntityCandyPig.class, RenderCandyPig::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCandyCreeper.class, RenderCandyCreeper::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySuguard.class, RenderSuguard::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityMageSuguard.class, RenderMageSuguard::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCandyWolf.class, m -> new RenderCandyWolf(m, new ModelWolf(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJellyQueen.class, m -> new RenderJellyQueen(m, new ModelSlime(16)));
        RenderingRegistry.registerEntityRenderingHandler(EntityBunny.class, m -> new RenderBunny(m, new ModelBunny(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBee.class, m -> new RenderBee(m, new ModelBee(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGingerBreadMan.class, m -> new RenderGingerBreadMan(m, new ModelBiped(0.0F), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCandyArrow.class, RenderCandyArrow::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityGummyBall.class, m -> new RenderGummyBall<>(m, CCItems.gummy_ball, Minecraft.getMinecraft().getRenderItem()));
        RenderingRegistry.registerEntityRenderingHandler(EntityBossSuguard.class, RenderSuguardeBoss::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCottonCandySpider.class, RenderCottonSpider::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityFish.class, m -> new RenderEntityFish(m, new ModelFish(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityNessie.class, RenderNessie::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityWaffleSheep.class, m -> new RenderWaffleSheep(m, new ModelWaffleSheep2(), 0.7F));
        RenderingRegistry.registerEntityRenderingHandler(EntityYellowJelly.class, m -> new RenderSprinter(m, new ModelSlime(16)));
        RenderingRegistry.registerEntityRenderingHandler(EntityRedJelly.class, m -> new RenderKamikazeJelly(m, new ModelSlime(16)));
        RenderingRegistry.registerEntityRenderingHandler(EntityTornadoJelly.class, m -> new RenderTornadoJelly(m, new ModelSlime(16)));
        RenderingRegistry.registerEntityRenderingHandler(EntityPEZJelly.class, m -> new RenderPEZJelly(m, new ModelSlime(16)));
        RenderingRegistry.registerEntityRenderingHandler(EntityKingSlime.class, m -> new RenderKingJelly(m, new ModelSlime(16)));
        RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, m -> new RenderDynamite<>(m, false, Minecraft.getMinecraft().getRenderItem()));
        RenderingRegistry.registerEntityRenderingHandler(EntityGlueDynamite.class, m -> new RenderDynamite<>(m, true, Minecraft.getMinecraft().getRenderItem()));
        RenderingRegistry.registerEntityRenderingHandler(EntityNougatGolem.class, RenderNougatGolem::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBeetle.class, m -> new RenderBeetle(m, new ModelBeetle(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBossBeetle.class, m -> new RenderBossBeetle(m, new ModelBeetle(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPingouin.class, m -> new RenderPingouin(m, new ModelPingouin(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDragon.class, m -> new RenderDragon(m, new ModelDragon(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKingBeetle.class, m -> new RenderKingBeetle(m, new ModelBeetle(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMermaid.class, RenderMermaid::new);

        TileEntityCandyChestRenderer render = new TileEntityCandyChestRenderer();
        TileEntityRendererDispatcher.instance.renderers.put(TileEntityCandyChest.class, render);
        render.setRendererDispatcher(TileEntityRendererDispatcher.instance);
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlchemy.class, new TileEntityAlchemyRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTeleporter.class, new TileEntityRendererTeleporter());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEgg.class, new RenderEgg());
        ClientRegistry.registerKeyBinding(ClientProxy.unleashMountPower);

        crown.bipedHead = new ModelRenderer(crown, 0, 0);
        crown.bipedHead.addBox(-4.0F, -9.5F, -4.0F, 8, 8, 8, 0.1F);
        crown.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);

        ri.getItemModelMesher().register(CCItems.dynamite, 0, new ModelResourceLocation("candycraftmod:dynamite", "inventory"));
        ri.getItemModelMesher().register(CCItems.dynamite, 1, new ModelResourceLocation("candycraftmod:dynamite_1", "inventory"));
        ri.getItemModelMesher().register(CCItems.dynamite, 2, new ModelResourceLocation("candycraftmod:dynamite_2", "inventory"));
        ModelBakery.registerItemVariants(CCItems.dynamite, new ResourceLocation("candycraftmod:dynamite"), new ResourceLocation("candycraftmod:dynamite_1"), new ResourceLocation("candycraftmod:dynamite_2"));

        ri.getItemModelMesher().register(CCItems.glueDynamite, 0, new ModelResourceLocation("candycraftmod:glue_dynamite", "inventory"));
        ri.getItemModelMesher().register(CCItems.glueDynamite, 1, new ModelResourceLocation("candycraftmod:glue_dynamite_1", "inventory"));
        ri.getItemModelMesher().register(CCItems.glueDynamite, 2, new ModelResourceLocation("candycraftmod:dynamite_2", "inventory"));
        ModelBakery.registerItemVariants(CCItems.glueDynamite, new ResourceLocation("candycraftmod:glue_dynamite"), new ResourceLocation("candycraftmod:glue_dynamite_1"), new ResourceLocation("candycraftmod:dynamite_2"));

        ri.getItemModelMesher().register(CCItems.gummy_ball, 0, new ModelResourceLocation("candycraftmod:gummy_ball", "inventory"));
        ri.getItemModelMesher().register(CCItems.gummy_ball, 1, new ModelResourceLocation("candycraftmod:gummy_ball_1", "inventory"));
        ri.getItemModelMesher().register(CCItems.gummy_ball, 2, new ModelResourceLocation("candycraftmod:gummy_ball_2", "inventory"));
        ModelBakery.registerItemVariants(CCItems.gummy_ball, new ResourceLocation("candycraftmod:gummy_ball"), new ResourceLocation("candycraftmod:gummy_ball_1"), new ResourceLocation("candycraftmod:gummy_ball_2"));

        ri.getItemModelMesher().register(Item.getItemFromBlock(CCBlocks.marshmallowChest), 0, new ModelResourceLocation("candycraftmod:marshmallow_chest", "inventory"));

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlchemy.class, new TileEntityAlchemyRenderer());
        ri.getItemModelMesher().register(Item.getItemFromBlock(CCBlocks.alchemyTable), 0, new ModelResourceLocation("candycraftmod:alchemy_table", "inventory"));

        ri.getItemModelMesher().getModelManager().getBlockModelShapes().registerBlockWithStateMapper(CCBlocks.cottonCandyBedBlock, (new StateMap.Builder()).ignore(new IProperty[]{BlockBed.OCCUPIED}).build());
        ri.getItemModelMesher().getModelManager().getBlockModelShapes().registerBlockWithStateMapper(CCBlocks.grenadine, (new StateMap.Builder()).ignore(new IProperty[]{BlockFluidBase.LEVEL}).build());
        ri.getItemModelMesher().getModelManager().getBlockModelShapes().registerBlockWithStateMapper(CCBlocks.marshmallowDoor, (new StateMap.Builder()).ignore(new IProperty[]{BlockDoor.POWERED}).build());

        ModelBakery.registerItemVariants(Item.getItemFromBlock(CCBlocks.grenadine));
        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(CCBlocks.grenadine), stack -> new ModelResourceLocation("candycraftmod:grenadine"));

        ModelLoader.setCustomStateMapper(CCBlocks.grenadine, new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return new ModelResourceLocation("candycraftmod:grenadine");
            }
        });

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CCItems.sugarPill, stack -> new ModelResourceLocation("candycraftmod:" + CCItems.sugarPill.getTranslationKey().substring(5), "inventory"));
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(CandyCraft.MODID + ":" + id, "inventory"));
    }
}
