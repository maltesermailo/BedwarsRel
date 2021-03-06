package io.github.bedwarsrel.BedwarsRel.Shop.Specials;

import org.bukkit.Material;

import io.github.bedwarsrel.BedwarsRel.Main;
import io.github.bedwarsrel.BedwarsRel.Utils;

public class MagnetShoe extends SpecialItem {

  @SuppressWarnings("deprecation")
  @Override
  public Material getItemMaterial() {
    String item = Main.getInstance().getStringConfig("specials.magnetshoe.boots", "IRON_BOOTS");
    Material material = null;
    if (Utils.isNumber(item)) {
      material = Material.getMaterial(Integer.valueOf(item));
    } else {
      material = Material.getMaterial(item);
    }

    if (material == null) {
      return Material.IRON_BOOTS;
    }

    return material;
  }

  @Override
  public Material getActivatedMaterial() {
    return null;
  }

}
