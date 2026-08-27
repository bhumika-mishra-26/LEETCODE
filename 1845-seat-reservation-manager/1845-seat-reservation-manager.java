class SeatManager {

    private PriorityQueue<Integer> pq;

    public SeatManager(int n) {
        pq = new PriorityQueue<>();

        // saari seats initially available
        for(int i = 1; i <= n; i++) {
            pq.offer(i);
        }
    }

    public int reserve() {
        return pq.poll();
    }

    public void unreserve(int seatNumber) {
        pq.offer(seatNumber);
    }
}