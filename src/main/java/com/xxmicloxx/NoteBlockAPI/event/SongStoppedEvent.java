package com.xxmicloxx.NoteBlockAPI.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.xxmicloxx.NoteBlockAPI.songplayer.SongPlayer;


/**
 * Called whenever a SongPlayer is stopped
 *
 */
public class SongStoppedEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	private SongPlayer songPlayer;

	public SongStoppedEvent(SongPlayer songPlayer) {
		this.songPlayer = songPlayer;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public SongPlayer getSongPlayer() {
		return songPlayer;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

}

