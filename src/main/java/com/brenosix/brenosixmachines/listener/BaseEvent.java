package com.brenosix.brenosixmachines.listener;

import com.brenosix.brenosixmachines.model.Machine;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class BaseEvent extends Event {

    private static final HandlerList handlerList = new HandlerList();

    private Player player;
    private Machine machine;

    public BaseEvent(Player player, Machine machine) {
        this.player = player;
        this.machine = machine;
    }

    public Player getPlayer() {
        return player;
    }

    public Machine getMachine() {
        return machine;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public HandlerList getHandlerList() {
        return handlerList;
    }

}
