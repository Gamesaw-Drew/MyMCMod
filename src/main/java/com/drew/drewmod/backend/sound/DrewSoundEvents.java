package com.drew.drewmod.backend.sound;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.drew.drewmod.DrewMod;

public class DrewSoundEvents {
	

	public static SoundEvent machines;


	public static void registerSounds() {
		machines = registerSound("machines");
	}


	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(DrewMod.MODID, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}




