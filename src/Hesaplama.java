import java.util.Scanner;
public class Hesaplama {
    // HesapMakinesi class'ını kullanarak hesaplama yapıcaz

    public static void main(String[] args){
        System.out.println("Yapmak istediginiz islmin adini yaziniz: \n"+
                "toplama\n" + "cikarma\n" + "carpma\n"+ "bolme");

        Scanner scanner = new Scanner(System.in);
        String islem ;
        int sayi1 , sayi2;
        islem = scanner.nextLine();

        System.out.print("Birinic sayi: ");
        sayi1 = scanner.nextInt();
        System.out.print("Ikinci sayi: ");
        sayi2 = scanner.nextInt();


        HesapMakinesi hesaplama = new HesapMakinesi();

        switch (islem){
            case "toplama":
                System.out.println(hesaplama.toplama(sayi1, sayi2));
                break;
            case "cikarma":
                System.out.println(hesaplama.cikarma(sayi1, sayi2));
                break;
            case "carpma":
                System.out.println(hesaplama.carpma(sayi1, sayi2));
                break;
            case "bolme":
                if (sayi2 == 0){
                    System.out.println("HATA: 0'a bolme yapilamaz");
                } else {
                    System.out.println(hesaplama.bolme(sayi1, sayi2));
                }
                break;
            default:
                System.out.println("Gecersiz islem girildi.");
                break;

        }


    }

}
