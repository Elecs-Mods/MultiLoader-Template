package com.example.minecraft.test.fabric.impl;

import com.example.minecraft.test.common.abstraction.IModLoader;
import net.fabricmc.loader.api.FabricLoader;

/**
 * Created by Elec332 on 25-03-2024
 */
public class FabricModLoader implements IModLoader {

    @Override
    public String name() {
        return "Fabric";
    }

    @Override
    public boolean developmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

}
