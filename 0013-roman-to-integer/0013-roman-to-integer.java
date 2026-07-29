class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        HashMap<Character, Integer> mp = new HashMap<>();

        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int number = mp.get(s.charAt(n - 1));
        int after= number;

        for (int i = n - 2; i >= 0; i--) {
            int val = mp.get(s.charAt(i));
            
                if(val<after)
                {
                    number-=val;

                }
                else{
                    number+=val;
                }
after=val;


            
        }
        return number ;


    }
}