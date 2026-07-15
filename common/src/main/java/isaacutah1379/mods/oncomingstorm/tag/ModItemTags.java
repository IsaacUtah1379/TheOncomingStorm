package isaacutah1379.mods.oncomingstorm.tag;

import static isaacutah1379.mods.oncomingstorm.OncomingStorm.id;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> YOUR_TAG = TagKey.create(Registries.ITEM, id("baits"));
}
