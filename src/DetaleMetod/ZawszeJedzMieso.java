package DetaleMetod;

abstract class ZawszeJedzMieso implements JedzMieso {
    @Override
    public void jedz() {
        System.out.println("Ten rekin zawsze je mięso");
    }
}
