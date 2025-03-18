package net.saintdane.mod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.saintdane.mod.SaintsMod;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SaintsMod.MODID);

    public static final DeferredItem<Item> LAZERTESTER = ITEMS.register("lazertester" ,
            () -> new Item(new Item.Properties()));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
