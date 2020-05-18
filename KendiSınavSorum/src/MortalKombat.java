
public class MortalKombat {
    
    private String isim;
    private int vurus_hızı;
    private int saldırı_gucu;

    public MortalKombat(String isim, int vurus_hızı, int saldırı_gucu) {
        this.isim = isim;
        this.vurus_hızı = vurus_hızı;
        this.saldırı_gucu = saldırı_gucu;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getVurus_hızı() {
        return vurus_hızı;
    }

    public void setVurus_hızı(int vurus_hızı) {
        this.vurus_hızı = vurus_hızı;
    }

    public int getSaldırı_gucu() {
        return saldırı_gucu;
    }

    public void setSaldırı_gucu(int saldırı_gucu) {
        this.saldırı_gucu = saldırı_gucu;
    }
    
    public void saldır(){
        System.out.println(isim + " " + vurus_hızı + " ve " + saldırı_gucu + "ile saldırıyor");
    }
    
    public void kutsalVurusuCıkar(){
        System.out.println("Bu karakter de kutsal vuruş yok");
    }
    
    public void bilgileri_göster(){
        System.out.println("isim: " + isim);
        System.out.println("Vuruş Hızı: "+ vurus_hızı);
        System.out.println("Saldırı Gücü: " + saldırı_gucu);
    }
    
}
