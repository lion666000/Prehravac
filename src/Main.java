import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        IPrehravac[] prehravac;

        System.out.println("Kolik zařízení?");
        int pocet = sc.nextInt();
        prehravac = new IPrehravac[pocet];
        for (int i = 0; i < pocet; i++) {
            System.out.println("Jaké zařízení zadáváš?");
            System.out.println("1 MP3");
            System.out.println("2 smaphone");
            System.out.println("3 radio");
            int x = sc.nextInt();
            sc.nextLine();
            if (x>3||x<1) {
                System.err.println("Špatně 😡");
                i--;
            }
            switch (x) {
                case 1:
                    System.out.println("Jaká je značka MP3 ?");
                    String znacka = sc.nextLine();
                    MP3 mp3 = new MP3(znacka);
                    prehravac[i] = mp3;
                    break;
                case 2:
                    System.out.println("Jaký model má smartphone ?");
                    String model = sc.nextLine();
                    Smartphone smartphone = new Smartphone(model);
                    prehravac[i] = smartphone;
                    break;
                case 3:
                    System.out.println("Tady nic nastavit nemůžes idk");
                    Radio radio = new Radio();
                    prehravac[i] = radio;
                    break;
            }


        }

        boolean stop = false;
        if (stop){
            System.out.println("Konex");
        }
        else{
            for (int i = 0; i < 1; i--) {

                System.out.println("1 Vypsat všechna zařízení");
                System.out.println("2 Přehrát");
                System.out.println("3 Zastavit přehrávání");
                System.out.println("4 přehrát specifickou písničku");
                int y = sc.nextInt();
                sc.nextLine();
                if (y>4||y<1) {
                    System.err.println("Špatně 😡");
                }
                switch (y){
                    case 1:
                        for (int k = 0; k < prehravac.length; k++) {
                            prehravac[k].toString();
                        }
                        break;
                    case 2:
                        System.out.println("Kolikáté zařířízení má začít přehrávat?");
                        int f = sc.nextInt();
                        sc.nextLine();
                        if (f> prehravac.length||f<0) {
                            System.err.println("Špatně 😡");
                        }
                        else{
                            System.out.println("Zařízení "+prehravac[f-1].toString()+" začalo přehrávat");
                        }

                        break;
                    case 3:
                        System.out.println("Kolikáté zařířízení má přestat přehrávat?");
                        int e = sc.nextInt();
                        sc.nextLine();
                        if (e> prehravac.length||e<0) {
                            System.err.println("Špatně 😡");
                        }
                        else{
                            System.out.println("Zařízení "+prehravac[e-1].toString()+" přestalo přehrávat");
                        }

                        break;
                    case 4:
                        System.out.println("Jakou chcete přehrát písničku?");
                        String pisnicka = sc.nextLine();
                        System.out.println("Na jakém zařízení?");
                        int l = sc.nextInt();
                        sc.nextLine();
                        if (l> prehravac.length||l<0) {
                            System.err.println("Špatně 😡");
                        }
                        else{
                            System.out.println("Písnička "+pisnicka+" nyní přehrává na zařízení "+prehravac[l-1].toString());
                        }

                        break;
                }
            }
        }
    }

}