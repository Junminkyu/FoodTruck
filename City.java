public class City{
    public static void main(String[] args){
        FoodTruck japan= new FoodTruck("Japanese Restaurant");
        MainIntroduction intro=new MainIntroduction();
        japan.info();
        intro.menu();
    }
}