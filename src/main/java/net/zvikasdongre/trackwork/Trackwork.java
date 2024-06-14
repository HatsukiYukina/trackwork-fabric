package net.zvikasdongre.trackwork;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.Registrate;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Trackwork implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("trackwork");
    public static final String MOD_ID = "trackwork";

	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		TrackworkBlocks.initialize();
		TrackworkItems.initialize();
		TrackworkItemGroups.initialize();
		TrackworkBlockEntityTypes.initialize();
		REGISTRATE.register();
	}

	public static Identifier getResource(String path) {
		return new Identifier("trackwork", path);
	}
}