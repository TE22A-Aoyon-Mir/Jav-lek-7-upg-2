public class App {
    public static void main(String[] args) throws Exception {
        
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

        
    }
}
