package me.olivervscreeper.networkutilities.game.events;

import me.olivervscreeper.networkutilities.game.NetworkGame;
import me.olivervscreeper.networkutilities.game.states.GameState;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created on 30/11/2014.
 *
 * @author OliverVsCreeper
 */
public class PlayerJoinGameEvent extends Event implements Cancellable{

    static HandlerList handlers = new HandlerList();
    Boolean cancelled = false;

    private NetworkGame game;
    private Player player;
    private GameState gameState;

    public PlayerJoinGameEvent(NetworkGame game, Player player, GameState gameState){
        this.game = game;
        this.player = player;
        this.gameState = gameState;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean newStatus) {
        cancelled = newStatus;
    }

    public NetworkGame getGame() {
        return game;
    }

    public Player getPlayer() {
        return player;
    }

    public GameState getGameState() {
        return gameState;
    }
}