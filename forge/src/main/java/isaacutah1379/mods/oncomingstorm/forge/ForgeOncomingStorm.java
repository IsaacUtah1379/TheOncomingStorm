package isaacutah1379.mods.oncomingstorm.forge;

import isaacutah1379.mods.oncomingstorm.YourMod;
import isaacutah1379.mods.oncomingstorm.client.YourModClient;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(YourMod.MOD_ID)
public class ForgeOncomingStorm {

    public ForgeOncomingStorm(FMLJavaModLoadingContext context) {
        Balm.initializeMod(YourMod.MOD_ID, EmptyLoadContext.INSTANCE, YourMod::initialize);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> BalmClient.initializeMod(YourMod.MOD_ID, EmptyLoadContext.INSTANCE, YourModClient::initialize));
    }

}
