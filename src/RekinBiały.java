import DetaleMetod.WyskoczNisko;

public abstract class RekinBiały extends Rekin implements WyskoczNisko{

    public RekinBiały(){
        super();
    }

    @Override
    public void komentarz() {
        System.out.println("To jest rekin biay");
    }
}
