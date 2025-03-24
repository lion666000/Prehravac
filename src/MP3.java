public class MP3 implements IPrehravac{
    private String znacka;


    public MP3(String znacka){
        this.znacka = znacka;
    }



    public void prehaj(boolean hraj) {
        if (hraj){
            System.out.println("Prehravani MP3 zarizeni znacky "+znacka+" spusteno");
        }
        else {
            System.out.println("Prehravani MP3 zarizeni znacky "+znacka+" ukonceno");
        }


    }

    public String toString(){
        System.out.println("MP3: "+znacka);
        return znacka;
    }
}
