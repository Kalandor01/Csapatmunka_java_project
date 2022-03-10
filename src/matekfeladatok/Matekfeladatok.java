package matekfeladatok;

import java.util.Scanner;

public class Matekfeladatok
{
    public static Scanner sc =new Scanner(System.in);
    
    public static int type_choice()
    {
        System.out.println("Szia");
        System.out.println("Ez a program azért készült, hogy segítsen a "
                + "4 alapművelet gyakorlásában");
        System.out.printf("Kérlek válasz egy feladattípust \n\"összeadás(0),"
                + "\"kivonás(1),"
                + "\"szorzás(2),"
                + "\"osztás(3): "
                );
        int szam = sc.nextInt();
        if(szam == 0){
            System.out.println("ÖSSZEADÁS");
            
        }
        else if(szam == 1){
            System.out.println("KIVONÁS");
        }
        else if(szam == 2){
            System.out.println("SZORZÁS");        
        }
        else if(szam == 3){
            System.out.println("OSZTÁS");
        }
        else{
            System.out.println("Kérlek írj be egy másik számot");    
        }
        return szam;
    }
    public static int exercises(int type)
    {
        return 0;
    }
    
    public static void stats(int results)
    {
        
    }
    
    public static void main(String[] args)
    {
        int type = type_choice();
        int results = exercises(type);
        stats(results);
        
    }
    
}
