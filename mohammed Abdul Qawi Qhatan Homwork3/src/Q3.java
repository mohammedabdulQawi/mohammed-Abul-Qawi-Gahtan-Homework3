import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter Number Integer");
        Scanner in=new Scanner(System.in);
        int x;
        x=in.nextInt();
        if(x>0)
        {
            System.out.println("The Number Positive= "+x);
        }
         if(x<0)
        {
            System.out.println("The Number Negative= "+x);
        }
        if(x==0)
        {
            System.out.println("The Number Equals zero= "+x);
        }

    }
}
