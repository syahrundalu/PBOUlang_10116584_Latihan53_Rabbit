/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan53_rabbit;

/**
 *
 * @author syhar
 */
public class Animal {
    
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(){
        
    }
    
    public boolean isVegetarian(){
        if(vegetarian) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getEats(){
        return eats;
    }
    
    public int getNoOfLegs(){
        return noOfLegs;
    }
}
