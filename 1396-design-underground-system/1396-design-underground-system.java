class UndergroundSystem {

    private Map<Integer, Pair<String, Integer>> checkIn;
    private Map<String, Pair<Integer, Integer>> checkOut;

    public UndergroundSystem() {
        checkIn = new HashMap<>();
        checkOut = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {

        checkIn.put(id, new Pair<>(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        // get customer's check-in information
        Pair<String, Integer> p = checkIn.get(id);

        String startStation = p.getKey();
        int startTime = p.getValue();

        // calculate travel time
        int travelTime = t - startTime;

        // create route key
        String key = startStation + "->" + stationName;

        // if route already exists
        if (checkOut.containsKey(key)) {

            Pair<Integer, Integer> old = checkOut.get(key);

            int totalTime = old.getKey() + travelTime;
            int count = old.getValue() + 1;

            checkOut.put(key, new Pair<>(totalTime, count));

        } else {

            checkOut.put(key, new Pair<>(travelTime, 1));
        }

     
      
    }

    public double getAverageTime(String startStation, String endStation) {

        String key = startStation + "->" + endStation;

        Pair<Integer, Integer> p = checkOut.get(key);

        return (double) p.getKey() / p.getValue();
    }
}