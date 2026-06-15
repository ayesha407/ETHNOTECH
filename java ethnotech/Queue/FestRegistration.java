import java.util.Queue;
import java.util.LinkedList;

public class FestRegistration {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        int[] registrations = {101, 102, 103, 101, 104, 102};

        int registeredCount = 0;
        int rejectedCount = 0;

        // First registrations
        for (int id : registrations) {
            if (!queue.contains(id)) {
                queue.add(id);
                registeredCount++;
                System.out.println("ID " + id + " Registered");
            } else {
                rejectedCount++;
                System.out.println("Duplicate ID " + id + " Rejected");
            }
        }

        // 5 students who are not registered
        int[] notRegistered = {201, 202, 203, 204, 205};

        System.out.println("\nStudents Removed (Not Registered):");
        for (int id : notRegistered) {
            rejectedCount++;
            System.out.println("ID " + id + " Removed");
        }

        System.out.println("\nFinal Registration Queue:");
        System.out.println(queue);

        System.out.println("\nTotal Registered Students: " + registeredCount);
        System.out.println("Total Not Registered/Rejected Students: " + rejectedCount);
    }
}