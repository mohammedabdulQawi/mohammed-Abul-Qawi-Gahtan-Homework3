import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte month,day;
        System.out.println("Enter the month number=\n");
        month=in.nextByte();
        if(month>0&&month<13)
        {
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
                System.out.println("The days of month are 31");
            else if (month==4||month==6||month==4||month==11)
                System.out.println("The days of month are 30");
            else
                System.out.println(" The day of month: | 28 or 29 |");
        }
    }
}
