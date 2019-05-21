package mc.hypexmc.net;

import mc.hypexmc.net.Events.MissionGUIEvent;
import mc.hypexmc.net.Events.GameModeChangeEvent;
import mc.hypexmc.net.Menus.MissionGUI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class UltimateMission extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Ultimate Mission has been successfully enabled!");
        this.getCommand("um").setExecutor(new MissionGUI());
        Bukkit.getPluginManager().registerEvents(new MissionGUIEvent(),this);
        Bukkit.getPluginManager().registerEvents(new GameModeChangeEvent(),this);
        this.saveConfig();
        this.getConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("Ultimate Mission has been disabled");
    }







}
