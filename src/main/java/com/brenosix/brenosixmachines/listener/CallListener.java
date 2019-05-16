package com.brenosix.brenosixmachines.listener;

import com.brenosix.brenosixmachines.BrenosixMachines;
import com.brenosix.brenosixmachines.listener.event.MachineBreakEvent;
import com.brenosix.brenosixmachines.listener.event.MachinePlaceEvent;
import com.brenosix.brenosixmachines.model.Machine;
import com.brenosix.brenosixmachines.model.enums.MachineType;
import com.brenosix.brenosixmachines.model.manager.MachineManager;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CallListener implements Listener {

    private MachineManager manager = BrenosixMachines.getInstance().getManager();

    @EventHandler
    public void blockBreakEvent(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Location location = event.getBlock().getLocation();
        Machine machine = manager.findByLocation(location);

        if (machine != null) {
            Bukkit.getPluginManager().callEvent(new MachineBreakEvent(player, machine));
        }
    }

    @EventHandler
    public void blockPlaceEvent(BlockPlaceEvent event) {
        Block block = event.getBlock();
        Player player = event.getPlayer();
        Location location = block.getLocation();

        MachineType type = MachineType.findByBlock(block.getType());

        if (type != null) {
            ItemStack item = event.getItemInHand();
            ItemMeta meta = item.getItemMeta();

            if (meta.getDisplayName().equals(type.getName())) {
                Machine machine = new Machine(location, player.getUniqueId(), type);
                Bukkit.getPluginManager().callEvent(new MachinePlaceEvent(player, machine));
            }
        }
    }
}
