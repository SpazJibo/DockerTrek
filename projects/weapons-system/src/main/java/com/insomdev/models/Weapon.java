package com.insomdev.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Weapon {
    @Id
    private String id;

    @Indexed(unique=true, dropDups=true)
    private String weaponName;
    private int ammo;
    private int energyConsumption;

    public Weapon() {
    }

    public Weapon(String weaponName, int ammo, int energyConsumption){
        this.weaponName = weaponName;
        this.ammo = ammo;
        this.energyConsumption = energyConsumption;
    }

    public String getWeaponName () {
        return this.weaponName;
    }

    public int getAmmo() {
        return this.ammo;
    }

    public int getEnergyConsumption() {
        return this.energyConsumption;
    }
}
