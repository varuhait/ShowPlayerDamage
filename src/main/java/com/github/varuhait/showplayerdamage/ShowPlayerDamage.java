package com.github.varuhait.showplayerdamage;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class ShowPlayerDamage extends JavaPlugin implements CommandExecutor{

	@Override
	public void onEnable() {
		getCommand("spd").setExecutor(this);

		getServer().getPluginManager().registerEvents(new PlayerDamaged(), this);
		getLogger().info("ShowPlayerDamage Enabled");
	}

	@Override
	public void onDisable() {
		getLogger().info("ShowPlayerDamage Disabled");

	}
}
