interface Camera{
   void takePhoto();
}
interface Phone{
    void call();
}
interface MusicPlayer{
     void playMusic();
}
class SmartPhone implements Camera, Phone, MusicPlayer{
    public  void takePhoto(){
        System.out.println("Photo Captured");
    }
    public void call(){
        System.out.println("Calling");
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
public class SmartPhoneDemo{
    public static void main(String[]args){
        Camera c = new SmartPhone();
        MusicPlayer m = new SmartPhone();
        Phone p = new SmartPhone();

        c.takePhoto();
        m.playMusic();
        p.call();
    }
  
}
