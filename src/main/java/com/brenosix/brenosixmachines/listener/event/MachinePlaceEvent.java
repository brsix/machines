package com.brenosix.brenosixmachines.listener.event;

import com.brenosix.brenosixmachines.listener.BaseEvent;
import com.brenosix.brenosixmachines.model.Machine;
import org.bukkit.entity.Player;

public class MachinePlaceEvent extends BaseEvent {

    public MachinePlaceEvent(Player player, Machine machine) {
        super(player, machine);
    }

}
