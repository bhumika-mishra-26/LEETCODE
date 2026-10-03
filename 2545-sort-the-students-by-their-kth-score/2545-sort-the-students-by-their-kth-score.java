class Solution {
    class MyComparator implements Comparator<int[]> {
    int k;

    MyComparator(int k) {
        this.k = k;
    }

    public int compare(int[] a, int[] b) {
        return b[k] - a[k];
    }
}
    public int[][] sortTheStudents(int[][] score, int k) {
        // Arrays.sort(score,(a,b)->b[k]-a[k]);
        // return score;
           Arrays.sort(score, new MyComparator(k));

        return score;

        
    }
}