package com.github.varuhait.showplayerdamage;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public final class PlayerDamaged implements Listener{

	@EventHandler
	public void onPlayerDameged(EntityDamageByEntityEvent p) {
		//攻撃者・被攻撃者が共にプレイヤーかどうかの判定
		if(p.getDamager() instanceof Player && p.getEntity() instanceof Player) {

			Player damager = (Player) p.getDamager();		//攻撃者をプレイヤー型へキャスト
			Player defender = (Player) p.getEntity();		//被攻撃者をプレイヤー型へキャスト
			//攻撃者に被攻撃者とダメージ量の表示
			damager.sendMessage(ChatColor.GREEN + defender.getName() + "に" +
								String.valueOf(p.getFinalDamage()) + "のダメージを与えた!");

			//被攻撃者に攻撃者とダメージ量の表示
			defender.sendMessage(ChatColor.RED + damager.getName() + "から" +
								String.valueOf(p.getFinalDamage()) + "のダメージを受けた！");

		}
	}

}
