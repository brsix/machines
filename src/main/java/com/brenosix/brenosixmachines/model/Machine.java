package com.brenosix.brenosixmachines.model;

import com.brenosix.brenosixmachines.model.enums.MachineType;
import com.brenosix.brenosixmachines.model.holograms.MachineHologram;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.UUID;

public class Machine {

    /**
     * @author Brenosix
     */

    private UUID id;
    private UUID owner;
    private MachineType type;
    private int fuel;
    private int level;
    private Location location;
    private MachineHologram hologram;

    public Machine(Location location, UUID owner, MachineType type) {
        this.id = UUID.randomUUID();
        this.location = location;
        this.owner = owner;
        this.type = type;
        this.level = 1;
        this.fuel = 0;
        this.hologram =
                new MachineHologram(
                        location.add(0, 2, 0))
                        .add("§6§l " + type.getName())
                        .add("§6Dono: " + Bukkit.getPlayer(owner).getName())
                        .add("§6Level: " + level)
                        .add("§6Combustível: " + fuel);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getOwner() {
        return owner;
    }

    public void setOwner(UUID owner) {
        this.owner = owner;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public MachineType getType() {
        return type;
    }

    public void setType(MachineType type) {
        this.type = type;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public MachineHologram getHologram() {
        return hologram;
    }

    public void setHologram(MachineHologram hologram) {
        this.hologram = hologram;
    }

}
