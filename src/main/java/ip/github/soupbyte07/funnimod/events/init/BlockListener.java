package ip.github.soupbyte07.funnimod.events.init;

import net.minecraft.block.Block;
import ip.github.soupbyte07.funnimod.blocks.LandmineBlock;
import net.mine_diver.unsafeevents.listener.EventListener;

import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;


public class BlockListener {

    @Entrypoint.Namespace
    public static Namespace NAMESPACE;
    public static Block[] blocks;
    public static Block LANDMINE_BLOCK;

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        LANDMINE_BLOCK = new LandmineBlock(NAMESPACE.id("landmine_block")).setTranslationKey(NAMESPACE, "landmine_block");
        blocks = new Block[]{
                LANDMINE_BLOCK
        };
    }
}
