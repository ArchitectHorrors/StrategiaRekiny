package DetaleMetod;

public interface WyskoczNisko extends WyskoczPonadTafle {
    @Override
    default void plyn() {
        System.out.println("Ten rekin może wyskoczyć nisko ponad taflę wody");
    }
}