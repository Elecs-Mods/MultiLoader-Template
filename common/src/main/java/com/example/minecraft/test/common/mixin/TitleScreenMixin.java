package com.example.minecraft.test.common.mixin;

import com.example.minecraft.test.common.TestModCommon;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Created by Elec332 on 19-02-2024
 */
@Mixin(TitleScreen.class)
public class TitleScreenMixin {

    @Inject(method = "init", at = @At("TAIL"))
    public void jo(CallbackInfo ci) {
        TestModCommon.LOGGER.info("TitleScreen Title: " + ((TitleScreen) (Object) this).getTitle().getString());
    }

}
