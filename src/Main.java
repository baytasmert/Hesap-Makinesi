import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1,n2;
        int choice;
        System.out.println("Hesap makinesine Hos Geldiniz.");
        Scanner oku =new Scanner(System.in);

        System.out.print("ilk sayiyi giriniz: ");
        n1=oku.nextDouble();

        System.out.print("\nikinci sayiyi giriniz: ");
        n2=oku.nextDouble();

        System.out.print("\nYapmak istediginiz islemi giriniz:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n?");
        choice=oku.nextInt();

        switch (choice){
            case 1:
                System.out.println(n1 +" + "+n2+" = "+(n1+n2));
                break;
            case 2:
                System.out.println(n1 +" - "+n2+" = "+(n1-n2));
                break;

            case 3:
                System.out.println(n1 +" * "+n2+" = "+(n1*n2));
                break;

            case 4:
                if(n2==0){
                    System.out.println("Payda sifir olamaz!");
                }
                else{
                System.out.println(n1 +" / "+n2+" = "+(n1/n2));}
                break;
            default:
                System.out.println("Gecersiz islem girdiniz, lütfen tekrar deneyiniz");

        }


    }
}