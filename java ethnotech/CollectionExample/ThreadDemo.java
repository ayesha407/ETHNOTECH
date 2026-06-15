package CollectionExample;
import java.land.Thread.State;

    class messageSender extends Thread{
        public MessageSender(String name){

            super(name);//Setter
        }

        @Override
        public void run(){
            try{
                for(int i=0;i<=3;i++)
                {
                    System.out.println(getName()+"Sending  Message")
                    Thread.sleep(1000);
                } 
                
                }
                catch(InterruptedException e)
                {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread Interrrupted" +e);
                }
                    System.out.println("Thread Interrupted" +e);

                }
                System.out.println("Message sent Succesfully")
            }

        }
        public class MessageApp{
    
    public static void main(String[] args)
    {
          messageSender sender=new messageSender(name:"Sender")
          messageSender sender2=new messageSender(name:"" )

          sender.start();
          sender2.start();
          System.out.println
    }

}