package com.example.minecraft.test.common;

import com.example.minecraft.test.common.abstraction.IModLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ServiceLoader;

/**
 * Created by Elec332 on 25-03-2024
 */
public class TestModCommon {

    public static final Logger LOGGER = LogManager.getLogger("COMMON LOGGER");

    public static void init() {
        LOGGER.info("Initializing TestMod!");
        IModLoader modLoader = ServiceLoader.load(IModLoader.class).findFirst().orElseThrow();
        LOGGER.info("Initializing for loader " + modLoader.name());
        if (modLoader.developmentEnvironment()) {
            LOGGER.info("Detected Development Environment!");
        }
    }

}
