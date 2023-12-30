import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        while (true) {
        System.out.println("WELCOME");
        Scanner s = new Scanner(System.in);
        System.out.println("Press 1 to add new customer");
        System.out.println("Press 2 to add new car");
        System.out.println("Press 3 to display customer");
        System.out.println("Press 4 to display car");
        System.out.println("Press 5 to delete customer");
        System.out.println("Press 6 to delete car");
        System.out.println("Press 7 to rent car");
        System.out.println("Press 8 to return car");
        System.out.println("Press 9 to display available cars list");
        System.out.println("Press 10 to display rental history by cars");
        System.out.println("Press 11 to display rental history by customers");
        System.out.println("Press 12 to exit");
        System.out.println("*************************************ha*********************");
        int option=s.nextInt();

        switch (option) {
            case 1:
                Main.addcus();
                break;

            case 2:
                Main.addcar();
                break;

            case 3:
                System.out.println("\nAll custo21mers: " + Main.displaycus());
                // Customer a1 = Customer.createcustomer();
                // Main.updatecus(a1);
                break;

            case 4:
                System.out.println("\nAll cars: " + Main.displaycar());
                // Car a2 = Car.createcar();
                // Main.updatecar(a2);
                break;

            case 5:
                Customer a= Customer.createcustomer();
                Main.deletecus(a);
                break;

            case 6:
                Car a3 = Car.createcar();
                Main.deletecar(a3);
                break;

            case 7:
                Scanner s1= new Scanner(System.in);
                System.out.println("Enter registration number");
                String rnumber = s1.nextLine();
                System.out.println("Enter name");
                String name = s1.nextLine();
                System.out.println("Enter phone number");
                int phnnum = s1.nextInt();
                Main.rentCar(rnumber, name, phnnum);
                break;

            case 8:
                Scanner s11= new Scanner(System.in);
                System.out.println("Enter registration number");
                String rnumber1 = s11.nextLine();
                System.out.println("Enter name");
                String name1 = s11.nextLine();
                System.out.println("Enter phone number");
                int phnnum1 = s11.nextInt();
                Main.returnCar(rnumber1, name1, phnnum1);
                break;

            case 9:
                Main.displayAvailableCars();
                break;

            case 10:
                Scanner s111= new Scanner(System.in);
                System.out.println("Enter registration number");
                String rnumber11 = s111.nextLine();
                Main.rentalhistorybycar(rnumber11);
                break;

            case 11:
                Scanner s1111= new Scanner(System.in);
                System.out.println("Enter name");
                String name111 = s1111.nextLine();
                System.out.println("Enter phone num");
                int phnnum111 = s1111.nextInt();
                Main.rentalhistorybycus(name111, phnnum111);
                break;


            case 12:
                    System.out.println("Exiting lIBRARY! Goodbye");
                    System.exit(0);
                    s.close();
        
            default:
                break;
        }
    }
    }
}
