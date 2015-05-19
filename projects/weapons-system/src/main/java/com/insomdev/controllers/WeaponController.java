package com.insomdev.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.AutoWired;

import com.insomdev.repository.WeaponRepository;
import com.insomdev.models.Weapon;

@RestController
public class WeaponController {

	@AutoWired
	WeaponRepository weaponRepository;

	@RequestMapping("/weapon/fire")
	public boolean fire(String weaponName) {
		Weapon weapon = weaponRepository.findWeaponByName(weaponName);

		if(weapon.ammo > 0) {
			weapon.ammo -= 1;
			return true;
		} 
		return false;
	}

}