package isaacutah1379.mods.oncomingstorm.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import isaacutah1379.mods.oncomingstorm.block.ModBlocks;
import isaacutah1379.mods.oncomingstorm.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createGenericCube(ModBlocks.yourBlock);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ModItems.yourItem, ModelTemplates.FLAT_ITEM);
    }

}
