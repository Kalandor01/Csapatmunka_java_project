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
        System.out.printf("Kérlek válasz egy feladattípust");
        return 0;
    }
    
    public static int excercieses(int type)
    {
        int score = 0;
        //+ - * /
        int a = 1, b = 1, ans = 1;
        String operator= "*";
        for(int x=0;x<10;x++)
        {
            a = (int)(Math.random()*100);
            b = (int)(Math.random()*100);
            if(type==0)
            {
                ans = a+b;
                operator = "+";
                while( ans > 100 || ans < 1)
                {
                    //System.out.printf("%s %s %s = %s", a, operator, b, ans);
                    a = (int)(Math.random()*100);
                    b = (int)(Math.random()*100);
                    ans = a+b;
                }
            }
            else if(type==1)
            {
                ans = a-b;
                operator = "-";
                while( ans > 100 || ans < 1)
                {
                    //System.out.printf("%s %s %s = %s", a, operator, b, ans);
                    a = (int)(Math.random()*100);
                    b = (int)(Math.random()*100);
                    ans = a-b;
                }
            }
            else if(type==2)
            {
                ans = a*b;
                operator = "*";
                while( ans > 100 || ans < 1)
                {
                    //System.out.printf("%s %s %s = %s", a, operator, b, ans);
                    a = (int)(Math.random()*100);
                    b = (int)(Math.random()*100);
                    ans = a*b;
                }
            }
            else
            {
                ans = a/b;
                operator = "/";
                while( ans > 100 || ans < 1)
                {
                    //System.out.printf("%s %s %s = %s", a, operator, b, ans);
                    a = (int)(Math.random()*100);
                    b = (int)(Math.random()*100);
                    ans = a/b;
                }
            }
            System.out.printf("Mennyi %s %s %s = ", a, operator, b);
            int guess = sc.nextInt();
            if(guess == ans)
            {
                System.out.println("Helyes válasz!");
                score += 1;
            }
            else
            {
                System.out.println("Rossz válasz!");
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
