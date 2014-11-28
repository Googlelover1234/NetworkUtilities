package me.olivervscreeper.networkutilities.events.painting;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.painting.PaintingPlaceEvent;

/**
 * Created on 25/11/2014.
 *
 * @author OliverVsCreeper
 */
public class PaintingPlaceHandler implements Listener{

    /**
     * Event handling information
     */
    EventPriority eventPriority = EventPriority.NORMAL;

    /*
    Constructors for the event class
     */
    public PaintingPlaceHandler(EventPriority eventPriority){this.eventPriority = eventPriority;}

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPaintingPlaceLowest(PaintingPlaceEvent event){
        if(!eventPriority.equals(eventPriority.LOWEST)) return;
        event.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onPaintingPlaceLow(PaintingPlaceEvent event) {
        if (!eventPriority.equals(eventPriority.LOW)) return;
        event.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPaintingPlaceNormal(PaintingPlaceEvent event){
        if(!eventPriority.equals(eventPriority.NORMAL)) return;
        event.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPaintingPlaceHigh(PaintingPlaceEvent event){
        if(!eventPriority.equals(eventPriority.HIGH)) return;
        event.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPaintingPlaceHighest(PaintingPlaceEvent event){
        if(!eventPriority.equals(eventPriority.HIGHEST)) return;
        event.setCancelled(true);
    }

}