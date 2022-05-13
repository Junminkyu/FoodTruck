import java.util.Scanner;

public class FoodTruck {
    Menu mn=new Menu();

    String name;
    public FoodTruck(String x){
        this.name=x ;
    }

    public void name(){
        System.out.println("Welcome to Japanese Restaurant! What would you like to order?");
    }
    public void menu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("What menu do you want to see? Options: Nigiri, ")
        mn.nigiri();
    }
}
