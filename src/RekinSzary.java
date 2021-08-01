import DetaleMetod.JedzMieso;
import DetaleMetod.WysokoWyskocz;

public abstract class RekinSzary extends Rekin{
    public RekinSzary(){
        super();
    }
    @Override
    public void atakuj() {
        System.out.println("Ten rekin nie atakuje");
    }

    @Override
    public void komentarz() {
        System.out.println("To jest rekin szary");
    }
}
