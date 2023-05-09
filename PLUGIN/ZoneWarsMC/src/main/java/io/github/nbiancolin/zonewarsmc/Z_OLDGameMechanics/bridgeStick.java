package io.github.nbiancolin.zonewarsmc.Z_OLDGameMechanics;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static org.bukkit.Material.STICK;
import static org.bukkit.enchantments.Enchantment.LURE;

public class bridgeStick implements Listener {

    @EventHandler
    public void onUseBridgeStick(PlayerSwapHandItemsEvent e){
        Player p = e.getPlayer();
        ItemStack bridgeStick = new ItemStack(STICK);
        bridgeStick.addEnchantment(LURE,1);
        ItemMeta bsMeta = bridgeStick.getItemMeta();
        bsMeta.setDisplayName("Bridge Stick");


        ItemStack item = e.getOffHandItem();
        if(item == bridgeStick){
            useBridgeStick(p);
        }

    }


    public void useBridgeStick(Player p){
        //do Bridge Stick Thing
        for(int i = 0; i < 10; i++){
            System.out.println("Bridge Stick Activated!");
        }
    }
}
