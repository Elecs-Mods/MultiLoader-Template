package com.example.minecraft.test.neo.impl;

import com.example.minecraft.test.common.abstraction.IModLoader;
import net.neoforged.fml.loading.FMLLoader;

/**
 * Created by Elec332 on 25-03-2024
 */
public class NeoModLoader implements IModLoader {

    @Override
    public String name() {
        return "Neo";
    }

    @Override
    public boolean developmentEnvironment() {
        return !FMLLoader.isProduction();
    }

}
