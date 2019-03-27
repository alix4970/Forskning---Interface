import java.util.*;
import java.io.*;

public class TestingThis{
    public static void main(String[] args) {
        startProgram();
    }
    public static void startProgram(){
        Program thisProgram = new Program();
    }
}

class Program{
    private Scanner thisScanner = new Scanner(System.in);
    private LinkedList<Apple> listOfApples = new LinkedList<Apple>();
    
    public Program(){
        System.out.println("Compareable Apple test.");
        System.out.print("How many apples would you like:");
        int times = thisScanner.nextInt();
        System.out.println("");
        
        while(listOfApples.size() != times) {
            listOfApples.add(new Apple(thisScanner));
        }
        for(Apple l : listOfApples){
         System.out.println(l);
        }
        
        /*
        Comparator<Apple> com = new Comparator<Apple>(){
         public int compare(Apple a1, Apple a2){
            if(a1.price > a2.price){
               return 1;
            }
            else{
               return -1;
            }
         }
        */
        
        Collections.sort(listOfApples);
        System.out.println("");
        
        for(Apple l : listOfApples){
         System.out.println(l);
        }
           
    }

}
class Apple implements Comparable<Apple>{
    private String variety;
    private int weight;
    private int price;
    
    public Apple(Scanner thisScanner){
      System.out.print("(String) Variety:");
      this.variety = thisScanner.next();
      
      System.out.print("(Int) Weight:");  
      this.weight = thisScanner.nextInt();
      
      System.out.print("(Int) Price:");
      this.price = thisScanner.nextInt();
      System.out.println("");
    }
     
    public int compareTo(Apple thisApple){
      if(this.price > thisApple.price){
         return 1;
      }
      else{
         return -1;
      }
    }
    public String toString(){
      return("Variety:" + this.variety + " Weight: " + this.weight + " Price: " + this.price);
    }
}
