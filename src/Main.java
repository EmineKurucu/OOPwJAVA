import java.util.SortedMap;

public class Main {
    public static void main(String[] args){
        // class yapıları referance tiptir.

        CustomerManager customer1 = new CustomerManager();
        customer1.Add();
        customer1.Delete();
        customer1.Update();

        /* bellekte iki tane alan var : stack ve heap
        bellekte değişken tanımlanınca " CustomerManager customer1 " stackta oluşturulur
        " new CustomerManager(); " bu kısımda heap'te bir customerManager nesnesi oluşur
        new kullanaran customer1 ve customer2 nesneleri oluşturulursa ve
        customer1 = customer2 yazılırsa bellekte konumları aynı olduğu için
        customer1'in new'li oluşumu yok olur ve customer1 ile customer2 değğişkenlerinin bellekteki değeri
        aynı olur
        aşağıdaki durum ile ayı
         */

        // değer tip
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi1); // 30
        System.out.println(sayi2);// 10

        // referance tipler
        int[] sayilar1 = new int[] {1,2,3,4};
        int[] sayilar2 = new int[] {5,6,7,8};
        sayilar1 = sayilar2;
        sayilar2[0] = 9;
        System.out.println(sayilar1[0]); // 9



    }
}
