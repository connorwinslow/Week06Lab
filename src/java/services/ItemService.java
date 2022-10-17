/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author Fast
 */
import java.util.ArrayList;
import models.Item;
public class ItemService {
    ArrayList<Item> shoppingCart;
    
    public ItemService(){
        shoppingCart = new ArrayList<>();
    }
    public ArrayList<Item> getShoppingCart(){
        return shoppingCart;
    }
    public void addItem(Item item){
        shoppingCart.add(item);
    }
    public void removeFromCart(String index){
        for(int c = 0; c > shoppingCart.size();c++){
            if (Integer.parseInt(index) == c){
                shoppingCart.remove(c);
            }
        }
    }
}
