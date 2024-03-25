package com.example.minecraft.test.forge.impl;

import com.example.minecraft.test.common.abstraction.IModLoader;
import net.minecraftforge.fml.loading.FMLLoader;

/**
 * Created by Elec332 on 25-03-2024
 */
public class ForgeModLoader implements IModLoader {

    @Override
    public String name() {
        return "Forge";
    }

    @Override
    public boolean developmentEnvironment() {
        return !FMLLoader.isProduction();
    }

}
