
package threaddemo;


 class ThreadA extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("thread a in for loop i="+i);
        }
    }}



class ThreadB extends Thread
{ @Override
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("thread b in for Loop i="+i);
           
            try {
            Thread.sleep(5);
        } catch(InterruptedException e){
            System.out.println("I am tired ,taking rest for 5 SEc");
        }
        }
        try {
            
            Thread.sleep(5);
        } catch(InterruptedException e){
            System.out.println("I am tired ,taking rest for 5 SEc");
        }
        }
    }

 
 


    class ThreadMain
    {
  
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        a.start();
        
        try
        {
        a.join();
        System.out.println("Thread a exit");
        System.out.println("Thread a slept for 5 sec");
        
        
        b.start();
        
        b.join();
        System.out.println("Thread b exit");
        System.out.println("Thread b slept for 5 Sec");
        System.out.println("Exit from Main Method");
        }
        catch(InterruptedException e){
            System.out.println("Oops");
        }
    }
    }
    
    
        
       
        
        
    
    

