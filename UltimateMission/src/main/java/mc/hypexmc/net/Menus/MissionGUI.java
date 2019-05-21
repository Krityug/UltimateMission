package mc.hypexmc.net.Menus;

import mc.hypexmc.net.UltimateMission;
import mc.hypexmc.net.Utils.Color;
import mc.hypexmc.net.Utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MissionGUI implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command,String cmd,String[] args) {
        if(cmd.equalsIgnoreCase("um")) {

            if(!(sender instanceof Player)) {
                String prefix = UltimateMission.getPlugin(UltimateMission.class).getConfig().getString(Color.add("prefix"));
                sender.sendMessage(Color.add(prefix + " " + "&C&LThis command is not available in console!"));
                return true;
            }


            if(args.length == 0) {
                sender.sendMessage(Color.add("&9Please use /mission help"));
                return true;
            } else {

                if(args[0].equalsIgnoreCase("view")) {


                    Player player = (Player) sender;

                    Inventory MissionGUI = Bukkit.createInventory(null,54,Color.add("&B&LUltimate &F&LMissions"));

                    player.openInventory(MissionGUI);


                    if(player.hasPermission("um.view")) {

                        ItemStack active = Item.create(Material.BEACON,1,"&B&LBreak &F&LChallenge",
                                "&7Break &B5000 &7blocks of stone to complete this challenge");

                        MissionGUI.setItem(13,active);

                    } else {


                        ItemStack noperm = Item.create(Material.REDSTONE_BLOCK,1,"&C&LACCESS DENIED",
                                "&7You do not have the &cpermission &7to access this panel!");

                        MissionGUI.setItem(13,noperm);





                    }






                }






            }








        }
        return true;
    }
}
