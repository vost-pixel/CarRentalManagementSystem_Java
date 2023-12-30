import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    static Map<String, Boolean> carAvailabilityMap=new HashMap<>();
    static List<Customer> customer = new ArrayList<Customer>();
    static List<Car> allcar = new ArrayList<Car>();

    //Customer
    public static void addcus(){
        Customer a= Customer.createcustomer();
        customer.add(a);
        System.out.println("customer added");
    }

    public static List<Customer> displaycus(){
        return customer;
    }

    public static List<Car> displaycar(){
        return allcar;
    }

    public static void updatecus(Customer a){
        Customer x= Customer.createcustomer();
        customer.remove(a);
        customer.add(x);
        System.out.println("Customer details updated");
    }

    public static void deletecus(Customer a){
        customer.remove(a);
        System.err.println(" Removed customer");
    }

    //Car
    public static void addcar(){
        Car a=Car.createcar();
        carAvailabilityMap.put(a.getcarrnum(), true);
        allcar.add(a);
        System.out.println("car added");
    }

    public static void updatecar(Car a){
        Car x= Car.createcar();
        allcar.remove(a);
        allcar.add(x);
        System.out.println("car details updated");
    }

    public static void deletecar(Car a){
        allcar.remove(a);
        System.err.println(" Removed car");
    }

    public static Customer getcus(String name, int phone){
        for(Customer x: customer){
            if(x.getcustomername().matches(name) && x.getcusphnnumber() == phone){
                System.out.println("found");
               return x; 
            }
        }
        System.out.println("not found; add customer");
        Customer cnew= Customer.createcustomer();
        return cnew;
    }

    public static Car getcar(String registrationnum){
        for(Car x: allcar){
            if(x.getcarrnum().matches(registrationnum)){
                System.out.println("found");
               return x; 
            }
        }
        System.out.println("not found; add car");
        Car carnew= Car.createcar();
        return carnew;
    }

    //rent car
    public static void rentCar(String rnumber, String name, int phonenumber){
        Customer c= getcus(name, phonenumber);
        Car a=getcar(rnumber);
        if (carAvailabilityMap.containsKey(a.getcarrnum()) && carAvailabilityMap.get(a.getcarrnum())) {
            carAvailabilityMap.put(a.getcarrnum(), false);
            Rentalhistory r= Rentalhistory.createrentahis();
            c.getrarr().add(r);
            a.getcarr().add(r);
            System.out.println("Car rented successfully: " + a.getcarrnum());
        } else {
            System.out.println("Car not available for rent: " + a.getcarrnum());
        }
    }

    //return car
    public static void returnCar(String rnumber, String name, int phonenumber){
        //Customer cus= getcus(name, phonenumber);
        Car a=getcar(rnumber);
        SimpleDateFormat abc = new SimpleDateFormat("dd/MM/yyyy");
        Date date=new Date();
        String currentdate = abc.format(date);
        if (carAvailabilityMap.containsKey(a.getcarrnum()) && !carAvailabilityMap.get(a.getcarrnum())) {
            carAvailabilityMap.put(a.getcarrnum(), true);
            Rentalhistory w=a.getcarr().getLast();
            w.returndate=currentdate;
            System.out.println("Car returned successfully: " + a.getcarrnum());
        } else {
            System.out.println("Invalid return operation. Car not rented or does not exist: " + a.getcarrnum());
        }
    }

    public static void displayAvailableCars(){
        for(Car x:allcar){
            if(carAvailabilityMap.containsKey(x.getcarrnum()) && carAvailabilityMap.get(x.getcarrnum())){
                System.out.println(x.toString());
            }
        }
    }

    public static void rentalhistorybycar(String rnumber){
        Car a=getcar(rnumber);
        ArrayList<Rentalhistory> r = a.getcarr();
        for(Rentalhistory x:r){
            System.out.println(x.toString());
        }
    }

    public static void rentalhistorybycus(String name, int phnnum){
        Customer cus= getcus(name, phnnum);
        ArrayList<Rentalhistory> r = cus.getrarr();
        for(Rentalhistory x:r){
            System.out.println(x.toString());
        }
    }

    //public static
    public static void main(String[] args) {
        System.out.println();
    }
}
