package isaacutah1379.mods.oncomingstorm.fabric.client;

import isaacutah1379.mods.oncomingstorm.OncomingStorm;
import isaacutah1379.mods.oncomingstorm.client.OncomingStormClient;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.fabricmc.api.ClientModInitializer;

public class FabricOncomingStormClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(OncomingStorm.MOD_ID, EmptyLoadContext.INSTANCE, OncomingStormClient::initialize);
    }
}
