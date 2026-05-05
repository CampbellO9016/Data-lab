import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Sale> sales = new ArrayList<>();
    public void fromFile(File File) throws FileNotFoundException{
        Scanner scan = new Scanner(File);
        while(scan.hasNext()){

        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerd = new Scanner(System.in);
        System.out.println("Hello, please enter your name.");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
        System.out.println("\n----------------------------\nPlease select a option. \n1. Log a sale and add to list\n2. Make a new shoe\n3. Scan from a file\n4. Get a sale\n");
        String inp = scanner.nextLine();
        if(inp.equals("1")){
            System.out.println("Please enter details of shoe.");
            System.out.println("Enter the shoe brand.");
            String brand = scanner.nextLine();
            System.out.println("Please enter the shoe type.");
            String type = scanner.nextLine();
            System.out.println("Please enter the shoe color.");
            String color = scanner.nextLine();
            System.out.println("Please enter the shoe price.");
            Double price = scanner.nextDouble();
            //(String color, String shoeType, String brand, double price) {
            Shoe s = new Shoe(color, type, brand, price);
            //Shoe s, String saleID, String date, String country, String sales_channel, int units_sold, double revenue)
            System.out.println("What is the date of the sale?");
            String date = scanner.nextLine();
            System.out.println("What is the country the sale was made in?");
            String country = scanner.nextLine();
            System.out.println("What is the type of sales channel?");
            String salesChannel = scanner.nextLine();
            System.out.println("How many units were sold?");
            int units = scannerd.nextInt();
            //NEED TO FINISH Sale sal = new Sale(s,//add id and revenue)
        }
        else if(inp.equals("2")){
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
        else if(inp.equals("3")){

        }
        else if(inp.equals("4")){

        }
        else if(inp.equals("5")){

        }
        else if(inp.equals("6")){

        }

    }

}
