import java.util.Scanner;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Rentalhistory {
    String rentaldate;
    String returndate;
    long duration;

    public Rentalhistory(String rentaldate, String returndate, long duration){
        this.rentaldate=rentaldate;
        this.returndate=returndate;
        this.duration=duration;
    }

    public static Rentalhistory createrentahis(){
        //SimpleDateFormat abc = new SimpleDateFormat("dd/MM/yyyy");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rentaldate: ");
        String rentald = s.nextLine();
        System.out.println("Enter returndate: ");
        String returndate = s.nextLine();

        // Date d1=abc.parse(rentald);
        // Date d2=abc.parse(returndate);
        // long diffTime= d2.getTime() - d1.getTime();
        // long diffinDays = (diffTime / (1000 * 60 * 60 * 24))% 365;
        System.out.println("Enter Duration: ");
        long diffinDays = s.nextInt();

        Rentalhistory re = new Rentalhistory(rentald, returndate, diffinDays);
        return re;
    }
    public static void main(String[] args) {
        System.out.println();
    }

    @Override
    public String toString()
    {
        return ("rental date: " + rentaldate + " " + "return date: "+ returndate + "duration: "+duration);
    }
}
