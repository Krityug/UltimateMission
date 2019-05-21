package mc.hypexmc.net.Events;

import mc.hypexmc.net.Menus.MissionGUI;
import mc.hypexmc.net.UltimateMission;
import mc.hypexmc.net.Utils.Color;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;


public class GameModeChangeEvent implements Listener {


    @EventHandler
    public void onBedBreak(PlayerGameModeChangeEvent event) {

        String prefix = UltimateMission.getPlugin(UltimateMission.class).getConfig().getString(Color.add("prefix"));
        event.getPlayer().sendMessage(Color.add(prefix + " " + "&A&LYOUR GAME MODE HAVE BEEN CHANGED!"));







    }



}
