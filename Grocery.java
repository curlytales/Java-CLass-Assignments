import java.util.Scanner;
class Grocery
{ 
int weight;


void weightnow()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the weight in kg");
weight=s.nextInt();
}


void checkweight()
{
System.out.println(" kg" + weight );
}
}
class Weighing
{
  public static void main(String args[])
 {
        
       Grocery currentweight=new Grocery();
       currentweight.weightnow();
       currentweight.checkweight();
      }
        
    }
    
