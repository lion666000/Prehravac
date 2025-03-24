public interface IPrehravac {
    void prehaj(boolean hraj);

    default void prehaj(String nazevPisnicky) {}
}
