import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        CarServiceStation hatchback = new Hatchback();
        CarServiceStation sedan = new Sedan();
        CarServiceStation suv = new SUV();



        System.out.println("******************************************************************************");
        System.out.println("*                          CAR SERVICE STATION                               *");
        System.out.println("******************************************************************************");

        System.out.println();
        System.out.println();

        while(true){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("            SELECT YOUR CAR TYPE           ");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

            System.out.println("1. Hatchback");
            System.out.println("2. Sedan ");
            System.out.println("3. SUV ");
            System.out.println("4. EXIT");


            System.out.println("\nEnter your choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    performServiceMenu(hatchback, "Hatchback");
                    break;
                case 2:
                    performServiceMenu(sedan, "Sedan");
                    break;
                case 3:
                    performServiceMenu(suv, "SUV");
                    break;
                case 4:
                    System.out.println("Thank you for using the car service station. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }


    }

    private static void performServiceMenu(CarServiceStation carServiceStation, String carType) {

        HashMap<String, Integer> selectedServices = new HashMap<>();
        System.out.println("\nCAR TYPE: " + carType);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("          PLEASE SELECT SERVICE TYPE       ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Basic Service");
        System.out.println("2. Engine Fixing");
        System.out.println("3. Clutch Fixing");
        System.out.println("4. Brake Fixing");
        System.out.println("5. Gear Fixing");
        System.out.println("6. Back to Car Type Selection");

        System.out.print("How many type of Services do you want  : ");
        int count = sc.nextInt();
        System.out.println();
        int totalBill = 0;
        while (count-- > 0) {
            int amount = 0;
            System.out.println("Select your service type : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    amount = carServiceStation.basicService();
                    totalBill += amount;
                    selectedServices.put("BS01", amount);
                    break;
                case 2:
                    amount = carServiceStation.engineFixing();
                    totalBill += amount;
                    selectedServices.put("EF01", amount);
                    break;
                case 3:
                    amount = carServiceStation.clutchFixing();
                    totalBill += amount;
                    selectedServices.put("CF01", amount);
                    break;
                case 4:
                    amount = carServiceStation.brakeFixing();
                    totalBill += amount;
                    selectedServices.put("BF01", amount);
                    break;
                case 5:
                    amount = carServiceStation.gearFixing();
                    totalBill += amount;
                    selectedServices.put("GF01", amount);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        generateBill(carType, totalBill, selectedServices);

    }

    private static void generateBill(String carType, int totalBill, HashMap<String, Integer> selectedServices) {

        System.out.println();
        System.out.println("Bill Generated....");
        System.out.println("                       Type of Car: " + carType+"                   ");
        // Print table header
        System.out.println("-------------------------------------------------------------------");
        System.out.println("|                        CAR SERVICE BILL                          |");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("| %-4s | %-15s  | %-25s | %-10s |\n", "No.","Service Code" ,"Service", "Charges");
        System.out.println("------------------------------------------------------------------");

        // Print service details
        int i = 1;
        for (String key : selectedServices.keySet()) {
            String serviceName = "";
            String charges = "₹" + selectedServices.get(key);

            switch (key) {
                case "BS01":
                    serviceName = "Basic Servicing";
                    break;
                case "EF01":
                    serviceName = "Engine Fixing";
                    break;
                case "GF01":
                    serviceName = "Gear Fixing";
                    break;
                case "CF01":
                    serviceName = "Clutch Fixing";
                    break;
                default:
                    serviceName = "Brake Fixing";
            }

            System.out.printf("| %-4s | %-15s  | %-25s | %-10s |\n", i++,key, serviceName, charges);
        }

        if(totalBill > 10000){
            System.out.printf("| %-4s | %-15s  | %-25s | %-10s |\n",i++ ,"FREE","Car Cleaning", 0);
        }
        // Print table footer
        System.out.println("------------------------------------------------------------------");
        System.out.printf("| %-4s | %-15s  | %-25s | %-10s |\n","" ,"","Total Bill", totalBill);
        System.out.println("------------------------------------------------------------------");

        System.out.println();
        System.out.println();
    }

}
