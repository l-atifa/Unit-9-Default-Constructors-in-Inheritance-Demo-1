public class Product
  {
    private String name;
    private int price;

    public Product()
    {
      name="";
      price=0;
      System.out.println("Product");
    }

    public void setName(String n)
    {
      name=n;
    }
    public void setPrice(int p)
    {
      price=p;
    }
    public String dumb(Product p)
    {
      return "dumb method = " + p;
    }

    public int getPrice()
    {
      return price;
    }
  }