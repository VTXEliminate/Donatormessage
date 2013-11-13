package io.github.VTXEliminate.Donatormessage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Donatormessage extends JavaPlugin {
	
	String website = "tinycash.buycraft.net";
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	if(cmd.getName().equalsIgnoreCase("donate")){ // If the player typed /donate then do the following...
    		sender.sendMessage("You can donate at: " + website);
    		return true;
    	} else if(cmd.getName().equalsIgnoreCase("donor")){ // If the player typed /donor then do the following...
    		sender.sendMessage("You can donate at: " + website);
    		return true; //If this has happened the function will return true. 
    	}
    	
    	return false;  // If this hasn't happened the a value of false will be returned.
    
    }
}
