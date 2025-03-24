public class Smartphone implements IPrehravac {
    private String model;


    public Smartphone(String model){
        this.model = model;
    }


    public void prehaj(boolean hraj) {
        if (hraj){
            System.out.println("Prehravani na mobilu "+model+" spusteno");
        }
        else {
            System.out.println("Prehravani na mobilu "+model+" ukonceno");
        }

    }

    public String toString(){
        System.out.println("Smartphone: "+model);
        return model;
    }
}
