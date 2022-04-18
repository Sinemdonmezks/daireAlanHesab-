import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
 int r;
 int a;
 double pi=3.14 ;
 Scanner inp= new Scanner(System.in);

        System.out.print("Yarıçap değerini giriniz: ");
        a=inp.nextInt();

        System.out.print("Merkez açı ölçüsünü giriniz: ");
        r=inp.nextInt();

        double alan=(pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı= "+alan);
    }

}
