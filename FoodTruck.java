import java.util.*;

public class FoodTruck {
    Scanner scan=new Scanner(System.in);
    Menu mn=new Menu();
    
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
    public static void main(String[] args){}
}
