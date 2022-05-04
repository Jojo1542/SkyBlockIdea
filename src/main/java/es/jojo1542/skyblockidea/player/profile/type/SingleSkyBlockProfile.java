package es.jojo1542.skyblockidea.player.profile.type;

import es.jojo1542.skyblockidea.player.profile.SkyBlockProfile;
import es.jojo1542.skyblockidea.player.profile.inventory.SkyBlockProfileInventory;

import java.util.List;

public class SingleSkyBlockProfile implements SkyBlockProfile {

    private String id;

    private String ownerId;

    private String profileName;

    private int defense;

    private int maxMana;

    private int maxHealth;

    private int minecraftXp;

    private int minecraftLevel;

    private SkyBlockProfileInventory inventory;

}
