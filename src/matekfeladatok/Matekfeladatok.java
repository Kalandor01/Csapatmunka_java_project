package matekfeladatok;

import java.util.Scanner;

public class Matekfeladatok
{
    public static Scanner sc =new Scanner(System.in);
    
    public static int type_choice()
    {
        return 0;
    }
    
    public static int excercieses(int type)
    {
        int score = 0;
        //+ - * /
        int a, b;
        for(int x=0;x<10;x++)
        {
            if(type==0)
            {
                a = (int)(Math.random()*100);
                b = (int)(Math.random()*100);
                while( (a+b) > 100 || (a+b) < 1)
                {
                    //System.out.println(a + " + " + b + " = " + (a+b));
                    a = (int)(Math.random()*100);
                    b = (int)(Math.random()*100);
                }
                System.out.printf("Mennyi %s + %s = ", a, b);
                int ans = sc.nextInt();
            }
            else if(type==1)
            {
                
            }
            else if(type==2)
            {
                
            }
            else if(type==3)
            {
                
            }
        }
        return score/10;
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
