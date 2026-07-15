package isaacutah1379.mods.oncomingstorm.network.protocol;

import isaacutah1379.mods.oncomingstorm.YourModConfig;
import net.blay09.mods.balm.api.network.SyncConfigMessage;

public class ClientboundConfigMessage extends SyncConfigMessage<OncomingStormConfig> {
    public ClientboundConfigMessage(OncomingStormConfig yourModConfig) {
        super(yourModConfig);
    }
}
