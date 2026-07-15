package isaacutah1379.mods.oncomingstorm.tag;

import static isaacutah1379.mods.oncomingstorm.OncomingStorm.id;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> YOUR_TAG = TagKey.create(Registries.BLOCK, id("your_tag"));
}
