package mc.hypexmc.net.Events;

import mc.hypexmc.net.Utils.Color;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MissionSettingsGUIEvent implements Listener {


    @EventHandler
    public void InvClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) return;
        String title = event.getClickedInventory().getTitle();
        if (title.equals(Color.add(""))) {
            event.setCancelled(true);

            switch (event.getCurrentItem().getType()) {










            }
        }
    }
}