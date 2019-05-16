package com.brenosix.brenosixmachines.model.enums;

import org.bukkit.Material;

public enum MachineType {

    IRON("Máquina de Ferro", Material.IRON_BLOCK, Material.IRON_INGOT),
    GOLD("Máquina de Ouro", Material.GOLD_BLOCK, Material.GOLD_INGOT),
    DIAMOND("Máquina de diamante", Material.DIAMOND_BLOCK, Material.DIAMOND);

    private String name;
    private Material block;
    private Material drop;

    MachineType(String name, Material block, Material drop) {
        this.block = block;
        this.drop = drop;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getBlock() {
        return block;
    }

    public void setBlock(Material block) {
        this.block = block;
    }

    public Material getDrop() {
        return drop;
    }

    public void setDrop(Material drop) {
        this.drop = drop;
    }

    public static MachineType findByBlock(Material block) {

        for (MachineType type : values()) {
            if (type.getBlock().equals(block)) {
                return type;
            }
        }

        return null;
    }

}
