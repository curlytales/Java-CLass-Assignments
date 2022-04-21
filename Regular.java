import java.util.Scanner;
class Regular 
{
public static void main(String[] args)
{
    

        String id,password;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the id");
        id=s.nextLine();
        
        
        
        if(id.matches("[a-zA-Z-0-9]{8,22}"))
            
       
{
    System.out.println("Successfully Created id");
}
        else
        {
       System.out.println("Not Accepted id ,try again later");
       
    }
        System.out.println("Enter the password");
        password=s.nextLine();
    
if(password.matches("[a-zA-Z-0-9]{8,16}"))
{
    System.out.println("Succesfully created pass");
}
else
{
    System.out.println("Not Accepted pass ,try again later");
}
}
    
}