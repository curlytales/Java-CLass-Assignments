import java.util.Scanner;
class EmployeeBoook
{
int option;
Scanner s=new Scanner(System.in);

void showMenu()
{

System.out.println("Menu");
System.out.println(" 1. Enter Data");
System.out.println(" 2. Dislay Data");
System.out.println(" 3. Exit");
System.out.println("Choose the option");

}
{
while (option < 1 || option > 3) 
    {
        System.out.print("\nError! Incorrect option.\n");
        
        
        
    }


 switch(option)
{
 case 1: enterData();
        break;
case 2: displayData();
        break;
case 3: Exit();
        break;
default: System.out.println("Incorrect option");

break;

}
}
void enterData()
{
System.out.println("the enterData method is invoked");
}
void displayData()
{
System.out.println("the displayData method is invoked");
}
void Exit()
{
System.out.println("the exit method is invoked");
}

}
class Mainprog
{
public static void main(String args[])
{
EmployeeBoook note=new EmployeeBoook();
note.showMenu();

}
}



