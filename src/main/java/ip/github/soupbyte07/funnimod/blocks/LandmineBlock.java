package ip.github.soupbyte07.funnimod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class LandmineBlock extends TemplateBlock {
    public LandmineBlock(Identifier i) {
        super(i, Material.STONE);
    }
    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    public static final org.apache.logging.log4j.Logger LOGGER = NAMESPACE.getLogger();
    @Override
    public int getDroppedItemId(int blockMeta, Random random) {
        return Item.GUNPOWDER.id;
    }
    @Override
    public int getDroppedItemCount(Random random) {
        return 4;
    }

    @Override
    public void onSteppedOn(World world, int x, int y, int z, Entity entity) {
        List e = world.getEntityCollisions(entity, this.getBoundingBox(world, x,y + 1,z));
        LOGGER.info("Detonate");
        if (world.isRemote) return;
        if (entity.isSneaking()) return;
        world.createExplosion(
                null,
                x + 0.5D,
                y + 0.5D,
                z + 0.5D,
                3.0F
        );
    }

}
