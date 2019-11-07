/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan53_rabbit;

/**
 *
 * @author 
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan53_Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit x = new Rabbit("Peter", true, "Grass", 4, "grey");
        x.isVegetarian();
        x.getEats();
        x.getNoOfLegs();
        
        System.out.println("Hello, his name is "+x.getName());
        System.out.println(x.getName()+" is vegetarian? "+x.isVegetarian());
        System.out.println(x.getName()+" eat "+x.getEats());
        System.out.println(x.getName()+" has "+x.noOfLegs+" legs");
        System.out.println(x.getName()+" color is "+x.getColor());
       
    }
    
}
