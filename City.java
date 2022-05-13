import java.util.*;

public class City{
    public static void main(String[] args){
        FoodTruck japan= new FoodTruck("Japanese Restaurant");
        Menu menu=new Menu();
        japan.info();
        menu.menu();
        japan.verify();
        
    }
}