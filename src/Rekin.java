import DetaleMetod.JedzMieso;
import DetaleMetod.WyskoczPonadTafle;

public abstract class Rekin {
    public Rekin(){
    }

    public abstract void komentarz();

    public void plyn() {
        System.out.println("Pływanie");
    }

    public void atakuj() {
        System.out.println("Atakowanie");
    }

    public void jedz() {
        System.out.println("Jedzenie");
    }


}

