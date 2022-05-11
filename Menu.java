import java.util.*;

public class Menu {
    public static void main(String[] args){}

        ArrayList<String> full=new ArrayList<String>();
        

    public void nigiri(){
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
                String x=scan.nextLine();
                
                if(x.toLowerCase().equals("yes")){
                    nigiri();
                }
                else{
                    System.out.println("");
                }
            }
            if(y.toLowerCase()!=nigiri[i].toLowerCase()&&i==nigiri.length){
                System.out.println("The dish you typed is not in our menu");
                nigiri();
            }
        }
    }

    public void roll(){
        System.out.println("          -Roll (6pc)-  ");
        System.out.println(" Snow Mt Roll      Sexy Girl Roll");
        System.out.println(" Rainbow Roll      Spicy Tuna Roll");
        System.out.println(" Boston Roll       Salmon Roll");
        System.out.println(" B.C. Roll         California Roll");
        System.out.println(" Dynamite Roll     Escolar Roll");
    }

    public void noodle(){
        System.out.println("  Hinoki Udon");
        System.out.println("  Tenpura Udon");
        System.out.println("  Seafood Udon");
        System.out.println("  Beef Udon");
        System.out.println("  Hot Soba");
        System.out.println("  Cool Soba");
    }

    public void tenpura(){
        System.out.println(" Sweet Potato    Chicken");
        System.out.println(" Onion           Shrimp");
        System.out.println(" Squid           Veggies");
    }

    public void rice(){
        System.out.println(" Kyu-don         Katsu-don");
        System.out.println(" Sake-don        Fried Rice");
    }

    public void desert(){
        System.out.println(" Ice Cream    Pudding    Drinks");
    }

    
    
}
