import java.util.Scanner;
public class Swapnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value for a : ");
        int a=sc.nextInt();
        System.out.println("enter another value for b : ");
        int b=sc.nextInt();
        System.out.println("the values before swapping");
        System.out.println("a: "+(a));
        System.out.println("b: "+(b));
        int c=a;
        a=b;
        b=c;System.out.println("the values after swapping");
        System.out.println("a:"+(a));
        System.out.println("b:"+(b));

    }
}
