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
        else if(klockan==12)
        {
            System.out.println("Dags att äta");
        }
        else if(klockan>=23)
        {
            System.out.println("Dags att gå och lägga sig");
        }

        //e
        System.out.println("Hur gammal är du: ");
        int ålder = t.nextInt();
        System.out.println("Är du medlem 1=ja/2=nej: ");
        int medlem = t.nextInt();
        if(ålder>18 || medlem==1)
        {
            System.out.println("Du får komma in");
        }
        else
        {
            System.out.println("Du får inte komma in");
        }
        //f
        System.out.println("Ange ditt användarnamn: ");
        t.nextLine();
        String användarnamn = t.nextLine();
        System.out.println("Ange ditt lösenord: ");
        String lösenord = t.nextLine();
        if(användarnamn.equals("root") && lösenord.equals("passwd"))
        {
            System.out.println("Välkommen");
        }
        else
        {
            System.out.println("Stick härifrån");
        }
        //g
        System.out.println("Meny väderprogram");
        System.out.println("1. Skriv ut temperatur");
        System.out.println("2. Skriv ut vind");
        System.out.println("3. Skriv ut luftfuktigheten");
        System.out.println("Ange val");
        int val = t.nextInt();
        switch(val)
        {
            case 1:
        System.out.println("Det är 18 grader");
        break;

        case 2:
        System.out.println("Vinden 10 sekunder meter");
        break;

        case 3:
        System.out.println("Det är 100% luftighet");

        default:
        System.out.println("Del val");
        break;
        }
    }
}
