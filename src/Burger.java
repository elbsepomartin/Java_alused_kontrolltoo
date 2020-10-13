public class Burger {
    public String nimetus;
    public String liha;
    public String sai;
    public double hind;

    public String getNimi() {
        return nimetus;
    }

    public String getSai() {
        return sai;
    }

    public String getLiha() {
        return liha;
    }

    public double getHind() {
        return hind;
    }

    public void rangeSai() {
        sai = "teraleib";
    }
}
