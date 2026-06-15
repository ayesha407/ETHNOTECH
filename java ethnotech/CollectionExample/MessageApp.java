package CollectionExample;

class MessageSender extends Thread {

    public MessageSender(String name) {
        super(name); // Call Thread constructor
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(getName() + " Sending Message");
                Thread.sleep(1000); // Pause for 1 second
            }
            System.out.println(getName() + " Message sent successfully");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread Interrupted: " + e);
        }
    }
}

public class MessageApp {

    public static void main(String[] args) {

        MessageSender sender1 = new MessageSender("Sender 1");
        MessageSender sender2 = new MessageSender("Sender 2");

        sender1.start();
        sender2.start();
    }
}