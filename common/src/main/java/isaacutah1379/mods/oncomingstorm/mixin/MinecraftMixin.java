package isaacutah1379.mods.oncomingstorm.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import isaacutah1379.mods.oncomingstorm.YourMod;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        OncomingStorm.logger.info("Hello from " + OncomingStorm.MOD_ID);
    }
}
