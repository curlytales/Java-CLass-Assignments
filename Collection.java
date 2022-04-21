

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Fruits
{
    int id;
    String name;
    int price;

    public Fruits(int id, String name,int price) {
        this.id = id;
        this.name = name;
        this.price=price;
    }
    
    
}
 class FruitList {
    public static void main(String[] args) {
        List<Fruits> flist=new ArrayList();
        
        
        flist.add(new Fruits(1,"apple",50));
        flist.add(new Fruits(2,"mango",60));
        flist.add(new Fruits(3,"papaya",70));
        flist.add(new Fruits(4,"watermelon",80));
        
      
        
        Iterator<Fruits> fruititerator =flist.listIterator();
        while(fruititerator.hasNext())
        {
            Fruits s=fruititerator.next();        
            System.out.println("The name is "+s.name+" and the id is"+s.id+"the price is"+s.price);
        }
    }
}
