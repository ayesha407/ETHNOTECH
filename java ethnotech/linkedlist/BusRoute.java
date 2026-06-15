public class BusRoute {

    static class BusStop {
        String stopName;
        BusStop next;

        BusStop(String stopName) {
            this.stopName = stopName;
            this.next = null;
        }
    }

    BusStop head;

    public void addStop(String stopName) {
        BusStop newStop = new BusStop(stopName);

        if (head == null) {
            head = newStop;
            return;
        }

        BusStop temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newStop;
    }

    public void displayStops() {
        BusStop temp = head;

        System.out.println("Bus Route:");

        while (temp != null) {
            System.out.println(temp.stopName);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        BusRoute route = new BusRoute();

        route.addStop("Railway Station");
        route.addStop("V College");
        route.addStop("Bus Stand");
        route.addStop("Market");
        route.addStop("Hospital");

        route.displayStops();
    }
}