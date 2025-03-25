public class Radio implements IPrehravac{

    public void prehaj(boolean hraj) {
        if (hraj){
            System.out.println("Radio spusteno");
        }
        else {
            System.out.println("Radio ukonceno");
        }

    }

    public String toString(){
        System.out.println("idk (Raido)");
        return "raido";
    }
}
