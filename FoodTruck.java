import java.util.Scanner;

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
    public void menu(){
        System.out.println("There are some catergories in our restaurant!");
        System.out.println("Nigiri    Roll    Noodle     Tenpura     Rice ");
        System.out.println("What would you like to choose?");
        String y=scan.nextLine();
        if(y.toLowerCase().equals("nigiri")){
            mn.nigiri();
        }
    }

    public static void main(String[] args){}
}
