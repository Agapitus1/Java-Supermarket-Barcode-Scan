public class Product
{

    private int barCode;
    private double price;
    private String brand;

    public Product(int theBarCode, double thePrice, String theBrand)
    {
        barCode = theBarCode;
        price = thePrice;
        brand = theBrand;
    }

    public void setPrice(double thePrice)
    {
        price = thePrice;
    }

    // Accessors and toString()
    public int getBarCode()
    {
        return barCode;
    }

    public String toString()
    {
        return barCode + ": $" + price;
    }	 

    public String getBrand()
    {
        return brand;
    }
    
}
