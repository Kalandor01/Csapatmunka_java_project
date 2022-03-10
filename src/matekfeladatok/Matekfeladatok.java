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
        System.out.printf("Kérlek válasz egy feladattípust \n\"összeadás(1),"
                + "\"kivonás(2),"
                + "\"szorzás(3),"
                + "\"osztás(4): "
                );
        int szam = sc.nextInt();
        while(szam>4 || szam<1)
        {
            System.out.print("Kérlek írj be egy másik számot: ");
            szam = sc.nextInt();
        }
        if(szam == 1){
            System.out.println("ÖSSZEADÁS");
        }
        else if(szam == 2){
            System.out.println("KIVONÁS");
        }
        else if(szam == 3){
            System.out.println("SZORZÁS");        
        }
        else{
            System.out.println("OSZTÁS");
        }
        return szam-1;
    }
    
    public static int exercises(int type)
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
                Double ans_d = (a*1.0)/b;
                operator = "/";
                while( ans_d > 100.0 || ans_d < 1.0 || ans_d % 1!=0)
                {
                    //System.out.printf("%s %s %s = %s", a, operator, b, ans);
                    a = (int)(Math.random()*100);
                    b = (int)(Math.random()*100);
                    ans_d = (a*1.0)/b;
                }
                ans = (int)Math.round(ans_d);
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
        int results = exercises(type);
        stats(results);
        System.out.println("Átlagod száma:"+results);
    }
    
}
