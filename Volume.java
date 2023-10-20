import java.util.Scanner;

/**
   This program computes the volume (in liters) of a six-pack of soda
   cans and the total volume of a six-pack and a two-liter bottle.
*/
public class Volume
{
   public static void main(String[] args)
   {
     int cansPerPack = 6;
       System.out.println("He said hello \"Hello!\"");
       System.out.println("He said hello \\Hello!"); //File ismi yazmak
     final double CAN_VOLUME = 0.355; // Liters in a 12-ounce can
     double totalVolume = cansPerPack * CAN_VOLUME;


     System.out.print("A six-pack of 12-ounce cans contains ");
     System.out.print(totalVolume);
     System.out.println(" liters.");

     final double BOTTLE_VOLUME = 2; // Two-liter bottle

     totalVolume = totalVolume + BOTTLE_VOLUME;

     System.out.print("A six-pack and a two-liter bottle contain ");
     System.out.print(totalVolume);
     System.out.println(" liters.");

     // Stringteki char bulma
     String greeting = "Harry";
     char start = greeting.charAt(0);
     char last = greeting.charAt(4) ;
     System.out.println(start +" " + last);

     //Stringin bir kısmını alma
     String sub = greeting.substring(0, 2);
     String sub2 = greeting.substring(3, 5);
     System.out.println(sub+" "+sub2);

     String str = "ja";
     str = str + "va";
     System.out.println(str);
     Scanner in = new Scanner(System.in);
     System.out.println("Please enter your name");
     String name = in.next();
     System.out.println("Please enter your lastname");
     String lastname = in.next();

     System.out.println(name + " " + lastname);
   }
}
