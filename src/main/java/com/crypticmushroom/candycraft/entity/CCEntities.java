package com.crypticmushroom.candycraft.entity;

import com.crypticmushroom.candycraft.CandyCraft;
import com.crypticmushroom.candycraft.entity.boss.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.util.LinkedHashMap;
import java.util.Map;

public class CCEntities {
    public static final Map<String, EntityList.EntityEggInfo> CANDYCRAFT_EGGS = new LinkedHashMap<String, EntityList.EntityEggInfo>();

    public static void init() {
        registerEntity(EntityCandyPig.class, "candy_pig", 1, 80, 3, true, 0xF1C3C3, 0xFB5757);
        registerEntity(EntityCandyCreeper.class, "candy_creeper", 2, 80, 3, true, 0xF1C3C3, 0x777777);
        registerEntity(EntitySuguard.class, "suguard", 3, 80, 3, true, 0xF1C3C3, 0x8E0082);
        registerEntity(EntityMageSuguard.class, "suguard_mage", 4, 80, 3, true, 0xF1C3C3, 0xEB3D00);
        registerEntity(EntityCandyWolf.class, "candy_wolf", 5, 80, 3, true, 0xF1C3C3, 0xDDDDDD);
        registerEntity(EntityBunny.class, "gummy_bunny", 7, 80, 3, true, 0xF1C3C3, 0xEEFF33);
        registerEntity(EntityBee.class, "caramel_bee", 8, 80, 3, true, 0xF1C3C3, 0xFE7F01);
        registerEntity(EntityGingerBreadMan.class, "gingerbread_man", 9, 80, 3, true, 0xF1C3C3, 0x61380B);
        registerEntity(EntityCandyArrow.class, "candy_arrow", 10, 64, 60, true);
        registerEntity(EntityGummyBall.class, "gummy_ball", 11, 64, 10, true);
        registerEntity(EntityCottonCandySpider.class, "cotton_candy_spider", 13, 80, 3, true, 0xF1C3C3, 0xA00000);
        registerEntity(EntityFish.class, "candy_fish", 14, 80, 3, true, 0xF1C3C3, 0x3A01DF);
        registerEntity(EntityWaffleSheep.class, "waffle_sheep", 16, 80, 3, true, 0xF1C3C3, 0xFFC000);
        registerEntity(EntityPingouin.class, "ice_cream_penguin", 27, 80, 3, true, 0xF1C3C3, 0xFFFFFF);
        registerEntity(EntityBeetle.class, "chewing_gum_beetle", 25, 80, 3, true, 0xF1C3C3, 0x250066);
        registerEntity(EntityNessie.class, "nessie", 15, 80, 3, true, 0xF1C3C3, 0xA9E2F3);
        registerEntity(EntityDragon.class, "blueberry_dragon", 28, 80, 3, true, 0x8DC444, 0xA4EDFF);
        registerEntity(EntityKingBeetle.class, "beetle_king", 29, 80, 3, true, 0x8DC444, 0xA500B3);
        registerEntity(EntityJellyQueen.class, "jelly_queen", 6, 80, 3, true, 0xFF7373, 0xCF00EF);
        registerEntity(EntityBossSuguard.class, "suguard_statue", 12, 80, 3, true, 0xFF7373, 0xDFDFDF);
        registerEntity(EntityBossBeetle.class, "licorice_beetle", 26, 80, 3, true, 0xFF7373, 0x1C1C1C);
        registerEntity(EntityYellowJelly.class, "lemon_jelly", 17, 80, 3, true, 0x555555, 0xFFFF00);
        registerEntity(EntityRedJelly.class, "strawberry_jelly", 18, 80, 3, true, 0x555555, 0xFF0000);
        registerEntity(EntityTornadoJelly.class, "mint_jelly", 19, 80, 3, true, 0x555555, 0x00FFFF);
        registerEntity(EntityPEZJelly.class, "pez_jelly", 20, 80, 3, true, 0x9166FF, 0xFFFFFF);
        registerEntity(EntityKingSlime.class, "jelly_king", 21, 80, 3, true, 0xB23838, 0xE37D11);
        registerEntity(EntityMermaid.class, "suguard_mermaid", 30, 80, 3, true, 0x555555, 0x7D82B0);
        registerEntity(EntityDynamite.class, "candy_dynamite", 22, 64, 10, true);
        registerEntity(EntityGlueDynamite.class, "candy_glue_dynamite", 23, 64, 10, true);
        registerEntity(EntityNougatGolem.class, "nougat_golem", 24, 80, 3, true);

        EntitySpawnPlacementRegistry.setPlacementType(EntityFish.class, EntityLiving.SpawnPlacementType.IN_WATER);
        EntitySpawnPlacementRegistry.setPlacementType(EntityNessie.class, EntityLiving.SpawnPlacementType.IN_WATER);
    }

    public static void registerEntity(Class<? extends Entity> entity, String entityName, int id, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
        EntityRegistry.registerModEntity(entity, entityName, id, CandyCraft.getInstance(), trackingRange, updateFrequency, sendsVelocityUpdates);
    }

    public static void registerEntity(Class<? extends Entity> entity, String entityName, int id, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int primary, int secondary) {
        EntityRegistry.registerModEntity(entity, entityName, id, CandyCraft.getInstance(), trackingRange, updateFrequency, sendsVelocityUpdates);
        CANDYCRAFT_EGGS.put("candycraftmod." + entityName, new EntityList.EntityEggInfo("candycraftmod." + entityName, primary, secondary));
    }
}
