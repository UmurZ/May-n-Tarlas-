
public class Karakterler {
   public MortalKombat karakter_sec(String sec){
     
       if(sec.equals("Scorpion")){
           return new Scorpion("Hanzo Hasash", 120, 500,"Fatality");
       }
       else if(sec.equals("Raiden")){
           return new Raiden("Raiden Ed Boon", 220, 700, "Yıldırım");
       }
       else{
           return null;
       }
    }
    
}
