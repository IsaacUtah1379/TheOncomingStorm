package isaacutah1379.mods.oncomingstorm;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.config.BalmConfigData;
import net.blay09.mods.balm.api.config.Comment;
import net.blay09.mods.balm.api.config.Config;
import net.blay09.mods.balm.api.config.ExpectedType;

import java.util.List;

import isaacutah1379.mods.oncomingstorm.OncomingStorm;
import isaacutah1379.mods.oncomingstorm.OncomingStormConfig;
import isaacutah1379.mods.oncomingstorm.network.protocol.ClientboundConfigMessage;

@Config(OncomingStorm.MOD_ID)
public class OncomingStormConfig implements BalmConfigData {

    @Comment("This is an example int property")
    public int exampleInt = 1234;

    @ExpectedType(String.class)
    @Comment("This is an example string list property")
    public List<String> exampleStringList = List.of("Hello", "World");

    public static void initialize() {
        Balm.getConfig().registerConfig(OncomingStormConfig.class, ClientboundConfigMessage::new);
    }

    public static OncomingStormConfig getActive() {
        return Balm.getConfig().getActive(OncomingStormConfig.class);
    }
}
