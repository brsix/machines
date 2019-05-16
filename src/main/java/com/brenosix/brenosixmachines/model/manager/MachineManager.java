package com.brenosix.brenosixmachines.model.manager;

import com.brenosix.brenosixmachines.model.Machine;
import org.bukkit.Location;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MachineManager {

    private List<Machine> elements;

    public MachineManager() {
        this.elements = new LinkedList<>();
    }

    public Machine findByLocation(Location location) {
        return elements.stream()
                .filter(machine -> machine.getLocation().equals(location))
                .findFirst()
                .orElse(null);
    }

    public List<Machine> findByOwner(UUID owner) {
        return elements.stream()
                .filter(machine -> machine.getOwner().equals(owner))
                .collect(Collectors.toList());
    }

    public void addMachine(Machine machine) {
        elements.add(machine);
    }

    public void removeMachine(Machine machine) {
        elements.remove(machine);
    }

}
