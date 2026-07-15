package isaacutah1379.mods.oncomingstorm.client;

import static isaacutah1379.mods.oncomingstorm.OncomingStorm.id;

import com.mojang.blaze3d.platform.InputConstants;

import isaacutah1379.mods.oncomingstorm.OncomingStorm;
import net.blay09.mods.kuma.api.InputBinding;
import net.blay09.mods.kuma.api.Kuma;
import net.blay09.mods.kuma.api.ManagedKeyMapping;

public class ModKeyMappings {

    public static ManagedKeyMapping yourKey;

    public static void initialize() {
        yourKey = Kuma.createKeyMapping(id("your_key"))
                .withDefault(InputBinding.key(InputConstants.KEY_B))
                .handleScreenInput(event -> {
                    OncomingStorm.logger.info("B was pressed - " + OncomingStorm.MOD_ID);
                    return true;
                })
                .build();
    }
}
