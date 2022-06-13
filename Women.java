public class Women extends Clothing
  {
    public Women()
    {
      System.out.println("A");
    }

    public Women(String s, int i)
    {
      System.out.println("A");
      super.setName(s);
      super.setPrice(i);
    }
  }