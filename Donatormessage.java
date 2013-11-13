package io.github.VTXEliminate.Donatormessage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Donatormessage extends JavaPlugin {
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	if(cmd.getName().equalsIgnoreCase("donate")){ // /donate activates a line of text.
    		sender.sendMessage("You can donate at: tinycash.buycraft.net");
    		return true;
    	} //If this has happened the function will return true. 
            // If this hasn't happened the a value of false will be returned.
    	return false; 
    }
    
}
