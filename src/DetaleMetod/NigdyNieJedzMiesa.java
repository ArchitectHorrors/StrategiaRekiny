package DetaleMetod;

abstract class NigdyNieJedzMiesa implements JedzMieso {
    @Override
    public void jedz() {
        System.out.println("Ten rekin nigdy nie je mięsa");
    }
}
