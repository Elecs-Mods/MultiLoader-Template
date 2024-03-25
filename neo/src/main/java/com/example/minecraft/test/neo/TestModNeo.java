package com.example.minecraft.test.neo;

import com.example.minecraft.test.common.TestModCommon;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

/**
 * Created by Elec332 on 25-03-2024
 */
@Mod(TestModNeo.MOD_ID)
public class TestModNeo {

    public TestModNeo(IEventBus eventBus) {
        eventBus.addListener(this::setup);
    }

    public static final String MOD_ID = "testmod";

    private void setup(FMLCommonSetupEvent event) {
        TestModCommon.init();
    }

}
