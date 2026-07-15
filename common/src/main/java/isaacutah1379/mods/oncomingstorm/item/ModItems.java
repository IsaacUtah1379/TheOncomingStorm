package isaacutah1379.mods.oncomingstorm.item;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.item.BalmItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static isaacutah1379.mods.oncomingstorm.OncomingStorm.id;
import static net.blay09.mods.balm.api.item.BalmItems.itemProperties;

import isaacutah1379.mods.oncomingstorm.OncomingStorm;

public class ModItems {
    public static DeferredObject<CreativeModeTab> creativeModeTab;

    public static Item yourItem;

    public static void initialize(BalmItems items) {
        items.registerItem((identifier) -> yourItem = new Item(itemProperties(identifier)), id("your_item"));

        creativeModeTab = items.registerCreativeModeTab(() -> new ItemStack(yourItem), id(OncomingStorm.MOD_ID));
    }

}
