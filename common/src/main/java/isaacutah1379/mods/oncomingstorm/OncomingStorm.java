package isaacutah1379.mods.oncomingstorm;

import net.blay09.mods.balm.api.Balm;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import isaacutah1379.mods.oncomingstorm.OncomingStorm;
import isaacutah1379.mods.oncomingstorm.OncomingStormConfig;
import isaacutah1379.mods.oncomingstorm.block.ModBlocks;
import isaacutah1379.mods.oncomingstorm.item.ModItems;
import isaacutah1379.mods.oncomingstorm.network.ModNetworking;

public class OncomingStorm {

    public static final Logger logger = LoggerFactory.getLogger(OncomingStorm.class);

    public static final String MOD_ID = "yourmod";

    public static void initialize() {
        OncomingStormConfig.initialize();
        ModNetworking.initialize(Balm.getNetworking());
        ModBlocks.initialize(Balm.getBlocks());
        ModItems.initialize(Balm.getItems());
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
