import java.util.ArrayList;
import java.util.Scanner;

public class Car {
    private String registrationNumber;
    private String make;
    private String model;
    private int year;
    private String color;
    private int price;
    private ArrayList<Rentalhistory> carr;
    public Car(String registrationNumber, String make, String model, int year, String color, int price){
        this.registrationNumber=registrationNumber;
        this.color=color;
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
        this.carr=new ArrayList<>();
    }

    public String getcarrnum(){
        return registrationNumber;
    }
    public String getcarmake(){
        return make;
    }
    public String getcarmodel(){
        return model;
    }
    public int getcaryear(){
        return year;
    }
    public String getcarcolor(){
        return color;
    }
    public int getcarprice(){
        return price;
    }
    public ArrayList<Rentalhistory> getcarr(){
        return carr;
    }
    public static Car createcar(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter registrationNumber: ");
        String registrationNumber=s.nextLine();
        System.out.println("Enter make: ");
        String make=s.nextLine();
        System.out.println("Enter model: ");
        String model=s.nextLine();
        System.out.println("Enter color: ");
        String color=s.nextLine();
        System.out.println("Enter year: ");
        int year=s.nextInt();
        System.out.println("Enter price: ");
        int price=s.nextInt();

        Car car=new Car(registrationNumber, make, model, year, color, price);
        return car;
    }

    @Override
    public String toString()
    {
        return (registrationNumber + " " + make + " " + model + " " + year + ""+ price);
    }
}
