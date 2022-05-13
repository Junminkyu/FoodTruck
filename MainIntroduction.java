import java.util.Scanner;

public class MainIntroduction {
    Scanner scan=new Scanner(System.in);
    Menu mn=new Menu();

    public void menu(){
        System.out.println("There are some catergories in our restaurant!");
        System.out.println("Nigiri    Roll    Noodle     Tenpura     Rice ");
        System.out.println("What would you like to choose?");
        String y=scan.nextLine();

        if(y.toLowerCase().equals("nigiri")){
            mn.nigiri();
        }
        else if(y.toLowerCase().equals("roll")){
            mn.roll();
        }
        else if(y.toLowerCase().equals("noodle")){
            mn.roll();
        }
        else if(y.toLowerCase().equals("tenpura")){
            mn.tenpura();
        }
        else if(y.toLowerCase().equals("rice")){
            mn.rice();
        }
        else{
            System.out.println("Sorry, but we can not recognize the menu. Could you try one more time?");
            System.out.println(" ");
            menu();
        }
    }
}
