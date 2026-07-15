package isaacutah1379.mods.oncomingstorm.fabric;

import isaacutah1379.mods.oncomingstorm.YourMod;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;

public class FabricOncomingStorm implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(OncomingStorm.MOD_ID, EmptyLoadContext.INSTANCE, OncomingStorm::initialize);
    }
}
