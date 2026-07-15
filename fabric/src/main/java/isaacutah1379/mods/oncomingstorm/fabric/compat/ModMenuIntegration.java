package isaacutah1379.mods.oncomingstorm.fabric.compat;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import isaacutah1379.mods.oncomingstorm.OncomingStormConfig;
import net.blay09.mods.balm.fabric.compat.ModMenuUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return ModMenuUtils.getConfigScreen(OncomingStormConfig.class);
    }
}
