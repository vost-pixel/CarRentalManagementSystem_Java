import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String name;
    private int phnnumber;
    private ArrayList<Rentalhistory> rarr;
    public String getcustomername(){
        return name;
    }
    public int getcusphnnumber(){
        return phnnumber;
    }
    public Customer(String name, int phnnumber){
        this.name=name;
        this.phnnumber=phnnumber;
        this.rarr=new ArrayList<>(); //rentalhostory
    }
    public ArrayList<Rentalhistory> getrarr(){
        return rarr;
    }

    public static Customer createcustomer(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name: ");
        String cname=s.nextLine();
        System.out.println("Enter phnnumber: ");
        int phn=s.nextInt();
        
        Customer cus=new Customer(cname, phn);
        return cus;
    }
    
    @Override
    public String toString()
    {
        return (name + " " + phnnumber);
    }
}
