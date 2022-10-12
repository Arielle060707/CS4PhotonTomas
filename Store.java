/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05.photon.tomas;

/**
 *
 * @author acer
 */
import java.util.ArrayList;
public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();
    
    public Store(String name){
        name = "";
        earnings = 0; //Initialize name to parameter and earnings to 0
        itemList = new ArrayList(); //Initialize itemList as a new ArrayList 
        storeList.add(this); //add 'this' store to storeList
    }

    public String getName(){
        return name;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public void sellItem(int index){
        if (index <= itemList.size())
        {
            earnings = itemList.get(index).getCost();
            System.out.println("Great news! Our current sales amount to " + earnings + "."); 
        }
        else
        {
            System.out.println("There are only " + itemList.size() + " items in place.");
        }    
    }
    
    public void sellItem(String name){
    for (Item i: itemList)
    {
        if (name == i.getName())
        {
            earnings = i.getCost();
            System.out.println("Our current sales is now " + earnings + "."); 
        }
        else 
        {
            System.out.println("Oops! That item is not available in the store.");
        }    
    }
    //(if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    }
    
    public void sellItem(Item i){
       storeList.contains(i);
       if (storeList.contains(i) == false)
       {
           System.out.println("Oops! The store doesn't sell this.");
       }    
        earnings = i.getCost();
        System.out.println("Greetings, shopper! The sales is now " + earnings + ".");    
           
    //(if not, print statement that the store doesn't sell it) [check]
    // get Item i from itemList and add its cost to earnings [check?]
    // print statement indicating the sale [check]
    }
    
    public void addItem(Item i){
        itemList.add(i); 
    }
  
    public void filterType(String type){
        for (Item i: itemList)
        {
            if (i.getType() == "String" )
            {
                System.out.println(i);
            }
        }   
    }
    
    public void filterCheap(double maxCost){
       
        for (Item i: itemList)
        {
           if(i.getCost() < maxCost)
           {
               System.out.println(i);
           }
        }    
    }
    
    public void filterExpensive(double minCost){
        for (Item i: itemList)
        {
           if(i.getCost() > minCost)
           {
               System.out.println(i);
           }
        }    
        
                // loop over itemList and print all items with a cost higher than or equal to the specified value
    }
  
    public static void printStats(){
        for (Store i: storeList )
        {
            System.out.println(i.getName() + " earned " + i.getEarnings() + ". Congratulations!");
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

