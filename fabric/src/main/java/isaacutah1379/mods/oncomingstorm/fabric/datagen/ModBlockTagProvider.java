package isaacutah1379.mods.oncomingstorm.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

import isaacutah1379.mods.oncomingstorm.block.ModBlocks;
import isaacutah1379.mods.oncomingstorm.tag.ModBlockTags;

public class ModBlockTagProvider extends FabricTagProvider<Block> {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.BLOCK, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {

        getOrCreateTagBuilder(ModBlockTags.YOUR_TAG).add(ModBlocks.yourBlock);
    }
}
