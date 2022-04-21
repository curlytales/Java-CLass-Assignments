

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


class Countries implements Comparable<Countries>{
    int id;
    String name;
   
    public Countries(int id, String name) {
        this.id = id;
        this.name = name;
        
    }
    
    void dispcountry()
    {
        System.out.println("The id is"+id);
        System.out.println("The name is"+name);
        
    }


    
        @Override
    public int compareTo(Countries c) {
      if(this.name.compareTo(c.name)>0)
          return -1;
      else
          return 1;
    }
            
}

 class Countrycollection {
    public static void main(String args[]){
        Set<Countries> s=new TreeSet();
        s.add(new Countries(1,"India"));
        s.add(new Countries(2, "America"));
        s.add(new Countries(3, "NewZealand"));
         s.add(new Countries(4,"Auatralia"));
        
        
        Iterator<Countries> countrylist=s.iterator();
        while(countrylist.hasNext())
        {
                countrylist.next().dispcountry();
                
        }        
    }    
}
