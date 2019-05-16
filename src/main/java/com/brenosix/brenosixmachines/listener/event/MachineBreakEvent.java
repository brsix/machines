package com.brenosix.brenosixmachines.listener.event;

import com.brenosix.brenosixmachines.listener.BaseEvent;
import com.brenosix.brenosixmachines.model.Machine;
import org.bukkit.entity.Player;

public class MachineBreakEvent extends BaseEvent {

    public MachineBreakEvent(Player player, Machine machine) {
        super(player, machine);
    }
}
