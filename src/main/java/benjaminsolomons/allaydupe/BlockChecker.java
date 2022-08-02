package benjaminsolomons.allaydupe;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Jukebox;

import java.util.HashSet;

public class BlockChecker {


    public  BlockChecker(){

    }

    public boolean checkBlocks(Location startPoint){
        boolean amethystPresent =false;
        boolean jukeboxPlaying = false;

        int radius = 7;
        for(int x = - radius; x <= radius; x++){
            for(int y = - radius; y <= radius; y++){
                for(int z = - radius; z <= radius; z++){
                    Block  block = startPoint.getBlock().getRelative(x,y,z);
                    if(block.getType() == Material.AMETHYST_BLOCK){
                        amethystPresent = true;
                    }else if(block.getType() == Material.JUKEBOX){
                        Jukebox jukebox =  (Jukebox) block.getState();
                        jukeboxPlaying = jukebox.isPlaying();
                    }

                }
            }
        }

    return amethystPresent && jukeboxPlaying;


    }
}
