public class Instructor extends User{
    private int kursSayisi;
    private String uzmanlik;
    private int kacOgrenci;

    public int getKursSayisi() {
        return kursSayisi;
    }

    public void setKursSayisi(int kursSayisi) {
        this.kursSayisi = kursSayisi;
    }

    public String getUzmanlik() {
        return uzmanlik;
    }

    public void setUzmanlik(String uzmanlik) {
        this.uzmanlik = uzmanlik;
    }

    public int getKacOgrenci() {
        return kacOgrenci;
    }

    public void setKacOgrenci(int kacOgrenci) {
        this.kacOgrenci = kacOgrenci;
    }



}
