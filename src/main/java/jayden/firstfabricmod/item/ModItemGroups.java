package jayden.firstfabricmod.item;

import jayden.firstfabricmod.FirstFabricMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup KFC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FirstFabricMod.MOD_ID, "kfc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.kfc"))
                    .icon(() -> new ItemStack(ModItems.KFC)).entries((displayContext, entries) -> {
                        entries.add(ModItems.KFC);
                    }).build());

    public static void registerItemGroups() {
        FirstFabricMod.LOGGER.info("Registering Item Groups");
    }
}
