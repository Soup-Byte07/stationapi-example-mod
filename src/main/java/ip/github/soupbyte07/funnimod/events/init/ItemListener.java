package ip.github.soupbyte07.funnimod.events.init;

import ip.github.soupbyte07.funnimod.items.ArrowBoomItem;
import ip.github.soupbyte07.funnimod.items.FunniItem;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;


public class ItemListener {

    @Entrypoint.Namespace
    public static Namespace NAMESPACE;
    public static Item[] items;
    public static Item FUNNI_ITEM;
    public static Item ARROW_BOOM_ITEM;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        FUNNI_ITEM = new FunniItem(NAMESPACE.id("funni_item")).setTranslationKey(NAMESPACE, "funni_item");
        ARROW_BOOM_ITEM = new ArrowBoomItem(NAMESPACE.id("arrow")).setTexturePosition(5, 2).setTranslationKey(NAMESPACE, "arrow");
        items = new Item[]{
                FUNNI_ITEM,
                ARROW_BOOM_ITEM
        };
    }
}
