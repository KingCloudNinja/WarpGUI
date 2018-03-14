package tld.example.myplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable() {
    	Bukkit.getPluginManager().registerEvents ((Listener) this, this);
	}	
    
    	private void openGUI (Player player) {
    		Inventory i = Bukkit.createInventory(null, 27, "Warps");
    		
    		
    		ItemStack spawn = new ItemStack(Material.GRASS);
    		ItemMeta spawnMeta = spawn.getItemMeta();
    		spawnMeta.setDisplayName(ChatColor.GREEN + "Spawn");
    		spawn.setItemMeta(spawnMeta);
    		
    		ItemStack fps = new ItemStack(Material.DIAMOND_SWORD);
    		ItemMeta fpsMeta = fps.getItemMeta();
    		fpsMeta.setDisplayName(ChatColor.GREEN + "PVP");
    		fps.setItemMeta(fpsMeta);
    		
    		ItemStack crates = new ItemStack(Material.CHEST);
    		ItemMeta cratesMeta = crates.getItemMeta();
    		cratesMeta.setDisplayName(ChatColor.GREEN + "Crates");
    		crates.setItemMeta(cratesMeta);
    		
    		ItemStack store = new ItemStack(Material.EMERALD_BLOCK);
    		ItemMeta storeMeta = store.getItemMeta();
    		storeMeta.setDisplayName(ChatColor.GREEN + "Shop");
    		store.setItemMeta(storeMeta);
    		
    		ItemStack bulk = new ItemStack(Material.MILK_BUCKET);
    		ItemMeta bulkMeta = bulk.getItemMeta();
    		bulkMeta.setDisplayName(ChatColor.GREEN + "Bulk");
    		bulk.setItemMeta(bulkMeta);
    		
    		i.setItem(4, spawn);
    		i.setItem(12, fps);
    		i.setItem(14, store);	
    		i.setItem(20, crates);
    		i.setItem(24, bulk);
    		
    		
    		player.openInventory(i);
    	}
    	@EventHandler
    	public void onInventoryClicked(InventoryClickEvent event){
	 		Player player = (Player) event.getWhoClicked(); // The player that clicked the item
    	 	ItemStack clicked = event.getCurrentItem(); // The item that was clicked
    	 	Inventory inventory = event.getInventory();
    	 	if (inventory.getName().equals("Warps")) {
        	 	if (clicked.getType() == Material.GRASS) {
        	 	event.setCancelled(true);
        	 	player.closeInventory();
        	 	player.performCommand("ewarp spawn");
        	 	}
        	 	if (inventory.getName().equals("Warps")) {
            	 	if (clicked.getType() == Material.DIAMOND_SWORD) {
            	 	event.setCancelled(true);
            	 	player.closeInventory();
            	 	player.performCommand("ewarp pvp");
            	 	}
            	 	if (inventory.getName().equals("Warps")) {
                	 	if (clicked.getType() == Material.CHEST) {
                	 	event.setCancelled(true);
                	 	player.closeInventory();
                	 	player.performCommand("ewarp crates");
                	 	}
                	 	if (inventory.getName().equals("Warps")) {
                    	 	if (clicked.getType() == Material.EMERALD_BLOCK) {
                    	 	event.setCancelled(true);
                    	 	player.closeInventory();
                    	 	player.performCommand("ewarp shop");
                    	 	}
                    	 	if (inventory.getName().equals("Warps")) {
                        	 	if (clicked.getType() == Material.MILK_BUCKET) {
                        	 	event.setCancelled(true);
                        	 	player.closeInventory();
                        	 	player.performCommand("ewarp bulk");
                    	 	}
        	 		if (inventory.getName().equals("Warps")) {
        	 			if (clicked.getType() == Material.AIR){
            	 		event.setCancelled(true);
                	 	player.closeInventory();
            	 		return;
        	 	}
        	 		
            	 	}
        	 	}
            	 	}
        	 	}
    	 	}
    	 	}
    	}

    	
    	 	


@EventHandler
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	
	Player player = (Player) sender;
			
	if(commandLabel.equalsIgnoreCase("warp") || commandLabel.equalsIgnoreCase("warps")){
		openGUI(player);
	}

return false;
}
}

