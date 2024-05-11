public class Supermarket
{
    // Declare the 2 arrays for bar code and price
    private int barCodes[];
    private double price[];
    private static String name = "Coles";
    //private String location = “Sydney”

    public Supermarket()
    {
        barCodes = new int[5];
        price = new double[5];
        barCodes [0] = 111;
        barCodes [1] = 112;
        barCodes [2] = 122;
        barCodes [3] = 130;
        barCodes [4] = 140;

        barCodes [0] = 50;
        barCodes [1] = 10;
        barCodes [2] = 12;
        barCodes [3] = 40;
        barCodes [4] = 100;

    }

    public static void setName(String theName)
    {
        name = theName;
    }

    public void displayName()
    {
        System.out.println("Name = " + name);
    }

    private void findProductCost(int code)
    {
        boolean found = false;
        for(int k=0; k<barCodes.length && found==false; k++)
        {
            if(barCodes[k] == code)
            {
                System.out.println("Product “ + code + “ costs $” + price[k]");
                found = true;
            }
        }
        if(found == false)
        {
            System.out.println("Product not found");
        }

    }

}
