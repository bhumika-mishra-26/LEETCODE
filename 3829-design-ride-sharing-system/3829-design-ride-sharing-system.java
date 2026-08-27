import java.util.*;

class RideSharingSystem {

    Deque<Integer> rider;
    Deque<Integer> driver;
    HashSet<Integer> st;   // cancelled riders

    public RideSharingSystem() {
        rider = new ArrayDeque<>();
        driver = new ArrayDeque<>();
        st = new HashSet<>();
    }

    public void addRider(int riderId) {
        rider.addLast(riderId);
    }

    public void addDriver(int driverId) {
        driver.addLast(driverId);
    }

    public int[] matchDriverWithRider() {

        // cancelled riders ko front se remove karo
        while(!rider.isEmpty() && st.contains(rider.peekFirst())) {
            rider.pollFirst();
        }

        // koi driver ya rider available nahi
        if(driver.isEmpty() || rider.isEmpty()) {
            return new int[]{-1, -1};
        }

        int d_id = driver.pollFirst();
        int r_id = rider.pollFirst();

        return new int[]{d_id, r_id};
    }

    public void cancelRider(int riderId) {

        // check karo rider queue mein exist karta hai ya nahi
        for(int x : rider) {
            if(x == riderId) {
                st.add(riderId);
                return;
            }
        }
    }
}