
package findword;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Findword {

    public static void main(String[] args) {
        FileOutputStream ab=null;
        
        try {
            
            ab = new FileOutputStream("d://programmes//myname.txt"); 
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(ab));
            
            try {
                String s="apple,banana,cat,dog,egg,fish,gun";
                bw.write(s, 0,s.length()); 
                bw.flush();
                BufferedReader br=new  BufferedReader(new FileReader("d://programmes//myname.txt"));
                
                s = br.readLine();
                String []words;
               
                while((s=br.readLine())!=null) {
               words=s.split("");
                
                for(String k:words)
                {
                    
                
                if(words.equals(s))
               
                {
                    System.out.println("this word is there");
                }
                else
                {
                    System.out.println("not found"); 
                }
                System.out.println(s);
                }
                }
            } catch (IOException ex) {
                Logger.getLogger(Findword.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Findword.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (IOException ex) {
                Logger.getLogger(Findword.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ab.close();
            } catch (IOException ex) {
                Logger.getLogger(Findword.class.getName()).log(Level.SEVERE, null, ex);
            }
        
   

   

}}

