import java.util.*;
class Main {
  public static void main(String[] args) {
    Women w = new Women ();
    Women w2 = new Women ("Jeans", 25);
    ArrayList<Product> it = new ArrayList<Product>();
    it.add(w);
    it.add(w2);
    Product p = new Product();
    Clothing c = new Clothing();
    it.add(p);
    it.add(c);
    System.out.println(it);

    System.out.println(p.dumb(w));
    System.out.println(w.dumb(c));

    Product shirt = new Clothing();
    int shirtPrice = shirt.getPrice();
    System.out.println(shirtPrice);
  } 
  
}