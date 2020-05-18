
public class Raiden extends MortalKombat{
    
    private String özel_vurus;

    public Raiden(String isim, int vurus_hızı, int saldırı_gucu,String özel_vurus) {
        super(isim, vurus_hızı, saldırı_gucu);
        this.özel_vurus = özel_vurus;
    }

    @Override
    public void bilgileri_göster() {
        super.bilgileri_göster();
        System.out.println("Özel Vuruş İsmi: "+ özel_vurus);
    }

    @Override
    public void kutsalVurusuCıkar() {
        System.out.println(getIsim() + " " + özel_vurus + "u yapıyor.");
    }
    
}
