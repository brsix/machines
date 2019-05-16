package com.brenosix.brenosixmachines;

import com.brenosix.brenosixmachines.listener.event.MachineBreakEvent;
import com.brenosix.brenosixmachines.listener.event.MachinePlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;
import com.brenosix.brenosixmachines.model.manager.MachineManager;

public class BrenosixMachines extends JavaPlugin {

    private static BrenosixMachines instance;
    private MachineManager manager;

    @Override
    public void onEnable() {
        synchronized (this) {
            instance = this;
        }

    }

    @Override
    public void onDisable() {

    }

    public static BrenosixMachines getInstance() {
        return instance;
    }

    public MachineManager getManager() {
        return manager;
    }
}
