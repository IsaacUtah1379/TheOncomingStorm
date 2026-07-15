package isaacutah1379.mods.oncomingstorm.network;

import static isaacutah1379.mods.oncomingstorm.OncomingStorm.id;

import isaacutah1379.mods.oncomingstorm.OncomingStormConfig;
import isaacutah1379.mods.oncomingstorm.network.protocol.ClientboundConfigMessage;
import net.blay09.mods.balm.api.network.BalmNetworking;
import net.blay09.mods.balm.api.network.SyncConfigMessage;

public class ModNetworking {

    public static void initialize(BalmNetworking networking) {
        SyncConfigMessage.register(id("config"),
                ClientboundConfigMessage.class,
                ClientboundConfigMessage::new,
                OncomingStormConfig.class,
                OncomingStormConfig::new);
    }
}
