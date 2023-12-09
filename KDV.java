import java.util.Scanner;


public class KDV {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        float kdv = 0.18f;
        float KdvMax = 0.08f;

        int Fiyat;

        System.out.println("Ürünün fiyatını giriniz : ");
        Fiyat = scanner.nextInt();

        
        

        if(Fiyat <= 1000)
        {
            System.out.println("Ürünün KDV uygulanmış fiyatı : " +  (kdv * Fiyat + Fiyat));
        }else{

            System.out.println("Ürünün KDV uygulanmış fiyatı " +  (Fiyat + KdvMax * Fiyat));
        }



    }

}
