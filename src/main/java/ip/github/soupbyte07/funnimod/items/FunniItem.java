package ip.github.soupbyte07.funnimod.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class FunniItem extends TemplateItem implements CustomTooltipProvider {
    public FunniItem(@NotNull Identifier identifier) {
        super(identifier);
    }

    @Override
    public String[] getTooltip(ItemStack itemInstance, String originalTooltip) {
        return new String[]{originalTooltip, "this makes u wanna laugh", "hahahahahahha"};
    }

    @Override
    public int getAttackDamage(Entity attackedEntity) {
        return 9001;
    }
}
