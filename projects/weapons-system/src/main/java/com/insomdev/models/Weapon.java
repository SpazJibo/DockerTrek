package com.insomdev.models;

import org.springframework.data.annotation.Id;

public class Weapon {
        @Id
        private String id;

        private String weaponName;
        private int ammo;

        public Weapon() {
        }

        public Weapon(String weaponName, int ammo){
                this.weaponName = weaponName;
                this.ammo = ammo;
        }

        @Override
        public String toString() {
          return String.format("Weapon[id=%s, weaponName='%s']", id, weaponName);
                }
}
