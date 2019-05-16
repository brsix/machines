package com.brenosix.brenosixmachines.model.holograms;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import java.util.Arrays;
import java.util.List;

public class MachineHologram {

    /**
     * @author Brenosix
     */

    private Location location;
    private List<ArmorStand> lines;

    public MachineHologram(Location location) {
        this.location = location;
    }

    public MachineHologram add(String line) {
        build(line);
        return this;
    }

    public void remove() {
        lines.forEach(Entity::remove);
    }

    public MachineHologram update(int index, String element) {
        lines.get(index).setCustomName(element);
        return this;
    }

    public void build(String line) {

        ArmorStand armorStand =
                (ArmorStand) location.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);

        armorStand.setVisible(false);
        armorStand.setBasePlate(false);
        armorStand.setCustomName(line);
        armorStand.setCustomNameVisible(true);
        armorStand.setGravity(true);
        armorStand.setCanPickupItems(false);

        /**
         * we will subtract 0.2 from the location
         */

        location.subtract(0, 0.2, 0);

        lines.add(armorStand);
    }

}
