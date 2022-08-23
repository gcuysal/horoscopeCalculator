import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String month;
        int day;

        System.out.println("Doğduğunuz ay: ");
        month = inp.nextLine();

        System.out.println("Doğduğunuz gün: ");
        day = inp.nextInt();

        if (month.equals("Ocak")&& day < 22){
            System.out.println("Burcunuz: Oğlak");
        }else if (month.equals("Ocak")&& day>=22 || ((month.equals("Şubat")&& day<20))){
            System.out.println("Burcunuz: Kova");
        }else if (month.equals("Şubat")&& day>=20 || ((month.equals("Mart")&& day<21))){
            System.out.println("Burcunuz: Balık");
        }else if (month.equals("Mart")&& day>=21 || ((month.equals("Nisan")&& day<21))){
            System.out.println("Burcunuz: Koç");
        }else if (month.equals("Nisan")&& day>=21 || ((month.equals("Mayıs")&& day<22))){
            System.out.println("Burcunuz: Boğa");
        }else if (month.equals("Mayıs")&& day>=22 || ((month.equals("Haziran")&& day<=22))){
            System.out.println("Burcunuz: İkizler");
        }else if (month.equals("Haziran")&& day>=23 || ((month.equals("Temmuz")&& day<23))){
            System.out.println("Burcunuz: Balık");
        }else if (month.equals("Temmuz")&& day>=23 || ((month.equals("Ağustos")&& day<23))){
            System.out.println("Burcunuz: Aslan");
        }else if (month.equals("Ağustos")&& day>=23 || ((month.equals("Eylül")&& day<23))){
            System.out.println("Burcunuz: Başak");
        }else if (month.equals("Eylül")&& day>=23 || ((month.equals("Ekim")&& day<23))){
            System.out.println("Burcunuz: Terazi");
        }else if (month.equals("Ekim")&& day>=23 || ((month.equals("Kasım")&& day<22))){
            System.out.println("Burcunuz: Akrep");
        }else if (month.equals("Kasım")&& day>=22 || ((month.equals("Aralık")&& day<22))){
            System.out.println("Burcunuz: Yay");
        }else if (month.equals("Aralık")&& day>=22 ){
            System.out.println("Burcunuz: Oğlak");
        }else {
            System.out.println("Girilen değerler yanlış!");
        }

    }
}
