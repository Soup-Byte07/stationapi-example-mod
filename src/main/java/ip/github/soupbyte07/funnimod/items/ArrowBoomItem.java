package ip.github.soupbyte07.funnimod.items;

import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class ArrowBoomItem extends TemplateItem implements CustomTooltipProvider {
    public ArrowBoomItem(@NotNull Identifier identifier) {

        super(identifier);
    }

    @Override
    public String[] getTooltip(ItemStack itemInstance, String originalTooltip) {
        return new String[]{originalTooltip, "this goes boom"};
    }
}
