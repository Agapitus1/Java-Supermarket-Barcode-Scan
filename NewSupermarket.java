public class NewSupermarket
{
    // Array of Products
    private Product products[];

    public NewSupermarket()
    {
        setupProducts();
        Product foundProduct = findProduct(123);
        if(foundProduct != null)
        {
            System.out.println("Product found: " + foundProduct.toString());
        }
        else
        {
            System.out.println("Product not found");
        }

        Product foundBrand = findBrand("");
        if(foundBrand != null)
        {
            System.out.println("Product found: " + foundProduct.toString());
        }
        else
        {
            System.out.println("Product not found");
        }
    }

    private void setupProducts()
    {
        products[0] = new Product(111,50.0, "Sony");
        products[1] = new Product(112,10.0,"Samsung");
        products[2] = new Product(122,12.0,"Apple");

    }

    private Product findProduct (int code)
    {
        for(int i=0;i<products.length && products[i]!=null; i++)    
        {
            if(products[i].getBarCode() == code)
            {
                return products[i];
            }
        }
        return null;
    }

    private Product findBrand (String theBrand)
    {
        for(int i=0;i<products.length && products[i]!=null; i++)    
        {
            if(products[i].getBrand().equals(theBrand))
            {
                return products[i];
            }
        }
        return null;
    }
}
