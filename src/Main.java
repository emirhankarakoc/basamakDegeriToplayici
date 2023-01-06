public class Main {
    public static int us(int taban,int us){


         taban = 2;us =8;

        int deger = 1;
        for(int i= 0;i<us;i++){

            deger*=taban;
        }
        return deger;





    }
    public static void main(String[] args) {
       int sayi = 751925;
        int basamakdegeri=0;
        int toplam = 0;
int sayi2 = sayi;
        while(sayi!=0)
        {sayi = sayi/10;
            basamakdegeri++;}

        for(int i = 1;i<=basamakdegeri;i++){
int sonuclar = sayi2%10;

sayi2 =  sayi2/10;

toplam += sonuclar;
        }
        System.out.println(toplam);





















    }
}