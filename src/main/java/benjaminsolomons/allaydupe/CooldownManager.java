package benjaminsolomons.allaydupe;

import java.util.HashMap;
import java.util.UUID;

public class CooldownManager {
    private static HashMap<UUID, Long> cooldownAllays= new HashMap<>();
    private static int cooldown = 150000;

    public  CooldownManager(){

    }

    public static void addToCooldown(UUID id){
        cooldownAllays.put(id, System.currentTimeMillis());
    }

    public static boolean checkCooldown(UUID id){
        if(cooldownAllays.containsKey(id)){
            long timeLeft = (cooldownAllays.get(id) + cooldown) - (System.currentTimeMillis());
            if(timeLeft <= 0){
                cooldownAllays.remove(id);
                return false;
            }else{
                return true;
            }
        }
        return false;
    }


}
