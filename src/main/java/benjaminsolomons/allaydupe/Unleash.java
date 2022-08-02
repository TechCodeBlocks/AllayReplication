package benjaminsolomons.allaydupe;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Allay;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityUnleashEvent;

public class Unleash implements Listener {
    @EventHandler
    public void onUnleash(EntityUnleashEvent e){
        Entity entity = e.getEntity();

        if(!CooldownManager.checkCooldown(entity.getUniqueId())) {
            if (entity.getType() == EntityType.ALLAY) {
                BlockChecker blockChecker = new BlockChecker();
                Location allayLocation = entity.getLocation();
                if (blockChecker.checkBlocks(allayLocation)) {
                    Allay newAllay = (Allay) allayLocation.getWorld().spawnEntity(allayLocation, EntityType.ALLAY);
                    allayLocation.getWorld().spawnParticle(Particle.HEART, allayLocation,7);
                    CooldownManager.addToCooldown(entity.getUniqueId());
                    CooldownManager.addToCooldown(newAllay.getUniqueId());

                }

            }
        }

    }
}
