import java.util.Scanner;

public class FoodTruck {
    Menu mn=new Menu();

    String name;
    public FoodTruck(String x){
        this.name=x ;
    }
    public void welcome(){
    }
    public void name(){
        System.out.println("Welcome to "+name+"!");
        System.out.println("What would you like to order?");
    }
    public void menu(){
     mn.nigiri();
    }
}
