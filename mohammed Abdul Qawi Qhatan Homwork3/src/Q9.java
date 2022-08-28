import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte month,day;
        String Season = "";
        System.out.println("Enter the Month Number=\n");
        month=in.nextByte();
        System.out.println("Enter The Number Of The Day");
        day=in.nextByte();
        if (month>0&&month<13&&day>0&&day<=31) {
            if(month==1||month==2||month==3)
                Season="Winter";
            else if(month==4||month==5||month==6)
                Season="Spring";
            else if(month==7||month==8||month==9)
                Season="Summer";
            else if (month==10||month==11||month==12)
                Season="Full";
        }
        else {
            System.out.println("The month or day is false");
        }

        if  (month>0&&month<13&&day>=21){
            if(month==3&&day>=21)
                Season="Spring";
            else if(month==6&&day>=21)
                Season="Summer";
            else if(month==9&&day>=21)
                Season="Full";
            else if (month==12&&day>=21)
                Season="Winter";
        }

        System.out.println("month="+month +"  "+"day="+day+" "+" Season:"+ Season);


    }
}
