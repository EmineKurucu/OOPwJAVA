import javax.swing.plaf.synth.SynthTextAreaUI;

public class Methodlar{
    public static void main(String[] args){
        // void method bir şey return etmez bir iş yapar
        String mesaj = "Bugun hava cok guzel.";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);

        ekle();
        sil();
        guncelle();

        int toplam = tople(5,7);
        System.out.println(toplam);

        String sehir = sehirVer();
        System.out.println(sehir);

        // variable arguments
        // parametreleri sınırlamak zorunda değiliz
        System.out.println(istenenKadarTopla(1,2,3,4,5,6,7,8,9,10));

    }

    public static void ekle(){
        // örn: vei tabanına ekleme
        System.out.println("Eklendi.");
    }
    public static void sil(){
        // örn: veri tabanından silme
        System.out.println("Silindi.");
    }
    public static void guncelle(){
        // örn: veri güncelleme
        System.out.println("Guncellendi.");
    }
    public static int tople(int sayi1, int sayi2){
        return sayi1 + sayi2 ;

    }
    public static String sehirVer(){
        return "Ankara";
    }

    public static int istenenKadarTopla(int... sayilar){ // integer array göndermek gibi
        int toplam = 0;
        for (int num : sayilar){
            toplam += num;
        }
        return toplam;
    }

}