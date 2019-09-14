import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.LightningStrikeEvent;

public class Event implements Listener {
    @EventHandler
    public void OnSpawnEverything(LightningStrikeEvent event) {
        event.setCancelled(true);
        Location stuff = event.getLightning().getLocation(); // this way to get the location
      // // String stuff2 = stuff.toString();
       // Bukkit.broadcastMessage("it was called so yay!    " + stuff2);

    }

}
