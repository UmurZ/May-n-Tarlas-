
import java.util.Scanner;

public class Test {
    
    /*
    Bu Program da kendi Sınav Sorumu yapıyorum
    Sorumun konusu ise Mortal Kombat karakterleri ile özelliklerini tanımlayan bi program olacak
    zor değil kodlara bakarsanız anlarsınız. :)
    
    */
    public static void main(String[] args) {
   
        System.out.println("Programa Hoşgeldiniz...");
        System.out.println("çıkış için q ya basın");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Hangi Karakteri İstiyorsunuz: ");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("programdan çıkılıyor...");
                break;
            }
            else{
                Karakterler karakterler = new Karakterler();
                
                MortalKombat mortal_kombat = karakterler.karakter_sec(islem);
                
                if(mortal_kombat == null){
                    System.out.println("Lütfen geçerli bir karakter seçin");
                }
                else{
                    mortal_kombat.bilgileri_göster();
                    mortal_kombat.saldır();
                    mortal_kombat.kutsalVurusuCıkar();
                }
                
                
            }
            
        }
        
}
}
