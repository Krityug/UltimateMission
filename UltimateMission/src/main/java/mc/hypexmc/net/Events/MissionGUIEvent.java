package mc.hypexmc.net.Events;

import mc.hypexmc.net.UltimateMission;
import mc.hypexmc.net.Utils.Color;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MissionGUIEvent implements Listener {

    @EventHandler
    public void InvClick(InventoryClickEvent event)
    {
        if (event.getClickedInventory() == null) return;
        String title = event.getClickedInventory().getTitle();
        if (title.equals(Color.add("&B&LUltimate &F&LMissions"))) {
            event.setCancelled(true);

            switch (event.getCurrentItem().getType())
            {

                case BEACON:
                    String prefix = UltimateMission.getPlugin(UltimateMission.class).getConfig().getString(Color.add("prefix"));
                    Bukkit.broadcastMessage(Color.add(prefix + " " + "&7An error &Coccured &7please contact the Management Squad ASAp via our discord"));
                    Bukkit.setDefaultGameMode(GameMode.ADVENTURE);



                case REDSTONE_BLOCK:



            }

        }
    }
}
