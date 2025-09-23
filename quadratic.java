import java.lang.Math;
import java.util.Scanner;
class quadratic{
    public static void main(String args[]){
        int a,b,c;
        float d;
        double r1,r2;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=in.nextInt();
        System.out.println("Enter the value of b:");
        b=in.nextInt();
        System.out.println("Enter the value of c:");
        c=in.nextInt();
        if(a==0){
            System.out.println("Not a quadratic equation!");
        }
        else{
            d=(b*b-4*a*c);
            if(d==0){
                System.out.println("Roots are real and equal");
                r1=((-b)/(2*a));
                r2=r1;
                System.out.println("The roots are,"+r1);

            }else if(d>0){
                System.out.println("The roots are unequal");
                r1=((-b)+(Math.sqrt(d)))/((2*a));
                r2=((-b)-(Math.sqrt(d)))/((2*a));
                System.out.println("The Roots are:"+r1);
                System.out.println("and"+r2);



            }else{
                System.out.println("Roots are imaginary");

            }

        }

        in.close();

    }
}
