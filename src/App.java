import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner t = new Scanner(System.in);

        //a
        int litetTal = 10;
        int storTal = 1000;
        if(litetTal<1000)
        {
            System.out.println(litetTal+" mindre än "+storTal);
        }
        else
        {
            System.out.println(litetTal+" mindre än "+storTal);
        }
        System.out.println("litetTal = "+litetTal+", storTal = "+storTal);

        //Koden fungerar inte eftersom variabeln "storTal inte är definerad i else och sout."
        //Koden fungerar genom att flytta "int storTal = 1000;" ut från if då det endast gällde för den.

        //b & c
        int tal1 = 10;
        int tal2 = 0;
        if(tal2>tal1)
        {
            System.out.println(tal2+" större än "+tal1);
        }
        else
        {
            System.out.println(tal2+" mindre än "+tal1);
        }

        //d
        System.out.println("Vad är klockan: ");
        int klockan = t.nextInt();
        if(klockan>=7 && klockan<8)
        {
            System.out.println("Vakna upp");
        }
        else if (klockan==12)
        {
            System.out.println("Dags att äta");
        }
        else if(klockan>=23)
        {
            System.out.println("Dags att gå och lägga sig");
        }

    }
}
