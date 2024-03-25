package com.example.minecraft.test.quilt;

import com.example.minecraft.test.common.TestModCommon;
import net.fabricmc.api.ModInitializer;

/**
 * Created by Elec332 on 25-03-2024
 */
public class TestModQuilt {

    public static class Initializer implements ModInitializer {

        @Override
        public void onInitialize() {
            TestModCommon.init();
        }

    }

}
