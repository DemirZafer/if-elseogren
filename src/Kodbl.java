import java.util.Scanner;

public class Kodbl {
    public static void main(String[] args) {
        int a   , z  , c ;
        Scanner vr = new Scanner(System.in);
        System.out.println("A değişkenini rakam olarak girin: ");
        a = vr.nextInt();
        System.out.println("Z değişkenini rakam olarak girin: ");
        z = vr.nextInt();
        if(a>z){
            a += 5 ;
            z += 10 ;
            c = a + z;
            System.out.println(c);
        } else if(a==z){
            a = z;
            c = a + z;
            System.out.println(c);

        } else {
            c = z - a;
            System.out.println(c);

        }

        }

}
