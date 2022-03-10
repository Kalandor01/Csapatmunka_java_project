package matekfeladatok;

import java.util.Scanner;

public class Matekfeladatok
{
    Scanner sc =new Scanner(System.in);
    
    public static int type_choice()
    {
        System.out.println("Szia");
        System.out.println("Ez a program azért készült, hogy segítsen a "
                + "4 alapművelet gyakorlásában");
        System.out.printf("Kérlek válasz egy feladattípust");
    }
    
    public static int excercieses(int type)
    {
        
    }
    
    public static void stats(int results)
    {
        
    }
    
    public static void main(String[] args)
    {
        int type = type_choice();
        int results = excercieses(type);
        stats(results);
        
    }
    
}
