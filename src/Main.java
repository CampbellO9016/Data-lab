import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
//Sale_ID,Date,Brand,Shoe_Type,Color,Country,Sales_Channel,Price_USD,Units_Sold,Revenue_USD
public class Main {
    private static ArrayList<Sale> sales = new ArrayList<>();
    public static void fromFile(File File) throws FileNotFoundException{
        Scanner scan = new Scanner(File);
        while(scan.hasNext()){
            String line = scan.nextLine();
            String[] arr = line.split(",");
            Shoe s = new Shoe(arr[4], arr[3], arr[2], Double.parseDouble(arr[7]));
            Sale sale = new Sale(s, arr[0], arr[1], arr[5], arr[6], Integer.parseInt(arr[8]), Double.parseDouble(arr[9]));
            sales.add(sale);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerd = new Scanner(System.in);
        System.out.println("Hello, please enter your name.");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
        System.out.println("Please enter the file name of sales.");
        String filen = scanner.nextLine();
        File fil = new File(filen + ".csv");
        Main.fromFile(fil);
        String inp = "";
        while(!(inp.equals("7"))){
            System.out.println("\n----------------------------\nPlease select a option. \n1. Log a sale and add to list\n2. Make a new shoe\n3. Get a sale by ID number\n4. Calculate total revenue\n5. Calculate total revenue on a date\n6. Average shoe price\n7. Exit");
            inp = scanner.nextLine();
            if (inp.equals("1")) {//Log a sale and add to list
                int id = 1001;
                System.out.println("Please enter details of shoe.");
                System.out.println("Enter the shoe brand.");
                String brand = scanner.nextLine();
                System.out.println("Please enter the shoe type.");
                String type = scanner.nextLine();
                System.out.println("Please enter the shoe color.");
                String color = scanner.nextLine();
                System.out.println("Please enter the shoe price.");
                Double price = scannerd.nextDouble();
                //(String color, String shoeType, String brand, double price) {
                Shoe s = new Shoe(color, type, brand, price);
                //Shoe s, String saleID, String date, String country, String sales_channel, int units_sold, double revenue)
                System.out.println("What is the date of the sale? (year-month-day)");
                String date = scanner.nextLine();
                System.out.println("What is the country the sale was made in?");
                String country = scanner.nextLine();
                System.out.println("What is the type of sales channel?");
                String salesChannel = scanner.nextLine();
                System.out.println("How many units were sold?");
                int units = scannerd.nextInt();
                Sale sal = new Sale(s, "S" + id, date, country, salesChannel, units, Sale.calculateRevenue(s, units));
                sales.add(sal);

            }
            else if (inp.equals("2")) {// Make a new shoe
                System.out.println("Please enter the shoe brand.");
                String brand = scanner.nextLine();
                System.out.println("Please enter the shoe type.");
                String type = scanner.nextLine();
                System.out.println("Please enter the shoe color.");
                String color = scanner.nextLine();
                System.out.println("Please enter the shoe price.");
                Double price = scannerd.nextDouble();
                //(String color, String shoeType, String brand, double price) {
                Shoe s = new Shoe(color, type, brand, price);
            }
            else if (inp.equals("3")) {//Get a sale by ID number
                System.out.println("Please enter ID number (S##):");
                String id = scanner.nextLine();
                boolean yes = false;
                for(Sale sal: sales){
                    if(sal.getSaleID().equals(id)){
                        System.out.println(sal);
                        yes = true;
                    }
                }
                if(!yes){
                    System.out.println("Sale ID not found.");
                }

            }
            else if (inp.equals("4")) {//Calculate total revenue
                System.out.println("\nTotal revenue: $" + Sale.calculateTotalRevenue(sales));
            }
            else if (inp.equals("5")) {//Calculate total revenue on a date
                System.out.println("Enter the date. (year-month-day)");
                String da = scanner.nextLine();
                double sumd = Sale.calculateTotalRevenueDate(sales, da);
                if(sumd == 0){
                    System.out.println("No date found.");
                }
                else{
                    System.out.println("Total revenue on " + da + ": " + sumd );
                }

            }
            else if (inp.equals("6")){
                System.out.println("Average price of shoe: "+Sale.calculateAveragePrice(sales));
            }
        }

    }

}
