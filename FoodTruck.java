import java.util.*;

public class FoodTruck {
    public static void main(String[] args){}
    
    Scanner scan=new Scanner(System.in);
    
    String name;
    public FoodTruck(String x){
        this.name=x ;
    }
    
    public void welcome(){
    }
    public void info(){
        System.out.println("Welcome to "+name+"!");
        System.out.println("How many people? :");
        String y=scan.nextLine();
        System.out.println("What would you like to order?");
    } 
    public void verify(){
        Menu menu=new Menu();
        ArrayList<String> order=menu.Return();
        for(String x:order){
            System.out.println(x);
        }
    }  
}