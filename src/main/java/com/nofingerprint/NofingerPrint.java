package com.nofingerprint;

import net.fabricmc.api.ModInitializer;

import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NofingerPrint implements ModInitializer {
	public static final String MOD_ID = "nofingerprint";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static MinecraftClient mc;

	@Override
	public void onInitialize() {

		LOGGER.info("FingerPrints are now disabled!");
	}
}