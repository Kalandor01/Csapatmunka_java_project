package matekfeladatok;

import java.util.Scanner;

public class Matekfeladatok
{
    
    Scanner sc =new Scanner(System.in);
    
    public static int type_choice()
    {
    
        
        
            
        

        
    }
    
    public static int excercises(int type)
    {
        
    }
    
    public static void stats(int results)
    {
        
    }
    // Metódus ami kiszámolja a számnak az átlagát
    public static float results(int... stats)  {
        int  sum = 0;
        for (int f :stats) {
            sum+= f;
        }
        return sum / stats.length;
    }   
    
    
    
    
    
    
    
    public static void main(String[] args)
    {
        int type = type_choice();
        int results = excercises(type);
        stats(results);
        System.out.println("Átlagod száma:"+results);
    }
    
}
