import java.util.*;

public class Menu {
    public static void main(String[] args){}

        ArrayList<String> full=new ArrayList<String>();
        

    public ArrayList<String> nigiri(){
        String[] nigiri={"Tamago","Maguro","Ika","Ebi","Tako","Sake","Smoked Sake","Hotate","Saba","Amaebi","Toro","Hamachi","Unagi","Uni"};
        Scanner scan=new Scanner(System.in);
        
        System.out.println("         -Nigiri (2pc)-   ");
        System.out.println(" Tamago(egg)        Maguro(tuna)");
        System.out.println(" Ika(squid)         Ebi(cooked shrimp)");
        System.out.println(" Tako(octopus)      Sake(salmon)");
        System.out.println(" Smoked Sake(smoked salmon)   Hotate(scallop)");
        System.out.println(" Saba(mackerel)     Amaebi(sweet shrimp)");
        System.out.println(" Toro(tuna belly)   Hamachi(yellow tail)");
        System.out.println(" Unagi(eel)         Uni(sea urchin)");
        System.out.println(" ");
        System.out.println(" Type the nigiri you want to try!");
        String y=scan.nextLine();
        for(int i=0;i<nigiri.length;i++){
            if(y.toLowerCase().equals(nigiri[i].toLowerCase())){
                System.out.println(nigiri[i]+" was chosen!");
                System.out.println("How many do you want to try?");
                int z=scan.nextInt();
                int time=0;
                while(time<z){
                    full.add(nigiri[i]);
                    time++;
                }
                
                System.out.println("Do you want to choose another nigiri?");
                scan.nextLine();
                String o=scan.nextLine();
                
                if(o.toLowerCase().equals("yes")){
                    nigiri();
                }
                else{
                    System.out.println("");
                }
            }
        }
        return full;
    }

    public ArrayList<String> roll(){
        String[] roll={"Snow Mt Roll","Sexy Girl Roll","Rainbow Roll","Spicy Tuna Roll","Boston Roll","Salmon Roll","B.C. Roll","California Roll","Dynamite Roll","Escolar Roll"};
        Scanner scan=new Scanner(System.in);
        System.out.println("          -Roll (6pc)-  ");
        System.out.println(" Snow Mt Roll      Sexy Girl Roll");
        System.out.println(" Rainbow Roll      Spicy Tuna Roll");
        System.out.println(" Boston Roll       Salmon Roll");
        System.out.println(" B.C. Roll         California Roll");
        System.out.println(" Dynamite Roll     Escolar Roll");
        System.out.println(" ");
        System.out.println(" Type the roll you want to try!");
        String y=scan.nextLine();
        for(int i=0;i<roll.length;i++){
            if(y.toLowerCase().equals(roll[i].toLowerCase())){
                System.out.println(roll[i]+" was chosen!");
                System.out.println("How many do you want to try?");
                int z=scan.nextInt();
                int time=0;
                while(time<z){
                    full.add(roll[i]);
                    time++;
                }
                
                System.out.println("Do you want to choose another roll?");
                scan.nextLine();
                String o=scan.nextLine();
                
                if(o.toLowerCase().equals("yes")){
                    roll();
                }
                else{
                    System.out.println("");
                }
            }
        }
        return full;
    }

    public ArrayList<String> noodle(){
        String[] noodle={"Hinoki Udon","Tenpura Udon","Seafood Udon","Beef Udon","Hot Soba","Cool Soba"};
        Scanner scan=new Scanner(System.in);
        System.out.println("  Hinoki Udon");
        System.out.println("  Tenpura Udon");
        System.out.println("  Seafood Udon");
        System.out.println("  Beef Udon");
        System.out.println("  Hot Soba");
        System.out.println("  Cool Soba");
        System.out.println(" ");
        System.out.println(" Type the roll you want to try!");
        String y=scan.nextLine();
        for(int i=0;i<noodle.length;i++){
            if(y.toLowerCase().equals(noodle[i].toLowerCase())){
                System.out.println(noodle[i]+" was chosen!");
                System.out.println("How many do you want to try?");
                int z=scan.nextInt();
                int time=0;
                while(time<z){
                    full.add(noodle[i]);
                    time++;
                }
                
                System.out.println("Do you want to choose another noodle?");
                scan.nextLine();
                String o=scan.nextLine();
                
                if(o.toLowerCase().equals("yes")){
                    noodle();
                }
                else{
                    System.out.println("");
                }
            }
        }
        return full;
    }

    public ArrayList<String> tenpura(){
        String[] tenpura={"Sweet Potato","Chicken","Onion","Shrimp","Squid","Veggies"};
        Scanner scan=new Scanner(System.in);
        System.out.println(" Sweet Potato    Chicken");
        System.out.println(" Onion           Shrimp");
        System.out.println(" Squid           Veggies");
        System.out.println(" ");
        System.out.println(" Type the tenpura you want to try!");
        String y=scan.nextLine();
        for(int i=0;i<tenpura.length;i++){
            if(y.toLowerCase().equals(tenpura[i].toLowerCase())){
                System.out.println(tenpura[i]+" was chosen!");
                System.out.println("How many do you want to try?");
                int z=scan.nextInt();
                int time=0;
                while(time<z){
                    full.add(tenpura[i]);
                    time++;
                }
                
                System.out.println("Do you want to choose another tenpura?");
                scan.nextLine();
                String o=scan.nextLine();
                
                if(o.toLowerCase().equals("yes")){
                    tenpura();
                }
                else{
                    System.out.println("Do you want to look at other menus?");
                    scan.nextLine();
                    String u=scan.nextLine();
                    if(u.toLowerCase().equals("yes")){
                        intro.menu();
                    }
                }
            }
        }
        return full;
    }

    public ArrayList<String> rice(){
        String[] rice={"Kyu-don","Katsu-don","Sake-don","Fried Rice"};
        Scanner scan=new Scanner(System.in);
        System.out.println(" Kyu-don         Katsu-don");
        System.out.println(" Sake-don        Fried Rice");
        System.out.println(" ");
        System.out.println(" Type the roll you want to try!");
        String y=scan.nextLine();
        for(int i=0;i<rice.length;i++){
            if(y.toLowerCase().equals(rice[i].toLowerCase())){
                System.out.println(rice[i]+" was chosen!");
                System.out.println("How many do you want to try?");
                int z=scan.nextInt();
                int time=0;
                while(time<z){
                    full.add(rice[i]);
                    time++;
                }
                
                System.out.println("Do you want to choose another rice?");
                scan.nextLine();
                String o=scan.nextLine();
                
                if(o.toLowerCase().equals("yes")){
                    roll();
                }
                else{
                    System.out.println("");
                }
            }
        }
        return full;
    }

    public ArrayList<String> desert(){
        String[] desert={"Ice Cream","Pudding","Drinks"};
        Scanner scan=new Scanner(System.in);
        System.out.println(" Ice Cream    Pudding    Drinks");
        System.out.println(" ");
        System.out.println(" Type the desert you want to try!");
        String y=scan.nextLine();
        for(int i=0;i<desert.length;i++){
            if(y.toLowerCase().equals(desert[i].toLowerCase())){
                System.out.println(desert[i]+" was chosen!");
                System.out.println("How many do you want to try?");
                int z=scan.nextInt();
                int time=0;
                while(time<z){
                    full.add(desert[i]);
                    time++;
                }
                
                System.out.println("Do you want to choose another desert?");
                scan.nextLine();
                String o=scan.nextLine();
                
                if(o.toLowerCase().equals("yes")){
                    roll();
                }
                else{
                    System.out.println("");
                }
            }
        }
        return full;
    }

    public ArrayList<String> Return(){
        return full;
    }
    
}
