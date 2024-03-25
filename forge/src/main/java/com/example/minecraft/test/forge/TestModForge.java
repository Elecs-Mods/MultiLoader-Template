package com.example.minecraft.test.forge;

import com.example.minecraft.test.common.TestModCommon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Created by Elec332 on 25-03-2024
 */
@Mod(TestModForge.MOD_ID)
public class TestModForge {

    public TestModForge() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    public static final String MOD_ID = "testmod";

    private void setup(FMLCommonSetupEvent event) {
        TestModCommon.init();
    }

}
