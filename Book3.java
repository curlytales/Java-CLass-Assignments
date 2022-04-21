package book;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Book3{
public static void main(String[] args)  {
        
    try {
        String option;
        
        
        Scanner s =new Scanner(System.in);
       
        int n = s.nextInt();
        
        switch(n)
            
        {
            case 1:
                FileWriter fs=null;
                fs = new FileWriter("d://programmes//myfile2.txt");
                String name="fAULT IN STARS";
                fs.write(name);
                String author="ananya garg";
                fs.write(author);
                String price="300";
                fs.write(price);
                String description="two disabledpeople who were optmistic to live life happily ";
                fs.write(description);
                break;
            case 2:
                
                FileReader ab=new FileReader("d://programmes//myfile2.txt");
                char[]c=new char[200];
                ab.read(c);
                System.out.println(c);
                break;
        }
    } catch (IOException ex) {
        Logger.getLogger(Book3.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}


        