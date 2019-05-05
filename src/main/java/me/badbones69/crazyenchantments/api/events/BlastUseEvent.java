package me.badbones69.crazyenchantments.api.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public class BlastUseEvent extends Event implements Cancellable {
	
	private Player player;
	private Boolean cancelled;
	private List<Block> blockList;
	private static final HandlerList handlers = new HandlerList();
	
	public BlastUseEvent(Player player, List<Block> blockList) {
		this.player = player;
		this.cancelled = false;
		this.blockList = blockList;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public List<Block> getBlockList() {
		return blockList;
	}
	
	@Override
	public boolean isCancelled() {
		return cancelled;
	}
	
	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
}