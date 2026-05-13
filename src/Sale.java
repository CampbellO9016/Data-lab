import java.util.ArrayList;

public class Sale {
    private String saleID;
    private String date;
    private String country;
    private String sales_channel;
    private int units_sold;
    private double revenue;
    private Shoe shoe;

    public Sale(Shoe s, String saleID, String date, String country, String sales_channel, int units_sold, double revenue) {
        this.shoe = s;
        this.saleID = saleID;
        this.date = date;
        this.country = country;
        this.sales_channel = sales_channel;
        this.units_sold = units_sold;
        this.revenue = revenue;
    }

    public static double calculateRevenue(Shoe sh, int unit){
        return sh.getPrice() * unit;
    }
    public static double calculateTotalRevenue(ArrayList<Sale> sal){
        double sum = 0.0;
        for(Sale s:sal){
            sum += s.getRevenue();
        }
        return sum;
    }
    public static double calculateAveragePrice(ArrayList<Sale> sal){
        return calculateTotalRevenue(sal) / sal.size();
    }
    public static double calculateTotalRevenueDate(ArrayList<Sale> sal, String dat){
        double sumd = 0;
        for(Sale s:sal){
            if(s.getDate().equals(dat)){
                sumd += s.getRevenue();
            }
        }
        return sumd;
    }
    public String getSaleID() {
        return saleID;
    }

    public void setSaleID(String saleID) {
        this.saleID = saleID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSales_channel() {
        return sales_channel;
    }

    public void setSales_channel(String sales_channel) {
        this.sales_channel = sales_channel;
    }

    public int getUnits_sold() {
        return units_sold;
    }

    public void setUnits_sold(int units_sold) {
        this.units_sold = units_sold;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    @Override
    public String toString() {//Shoe s, String saleID, String date, String country,
        // String sales_channel, int units_sold, double revenue)
        return "Sale ID: " +saleID + "\n" + shoe + " \nUnits sold: " + units_sold + "\nDate: " + date +"\nSale: "+ sales_channel +"\nCountry: "+ country + "\nTotal revenue: " +revenue;
    }
}
