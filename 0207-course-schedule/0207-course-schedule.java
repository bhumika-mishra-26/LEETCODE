class Solution {
    public boolean checkCycleTopoSort(ArrayList<ArrayList<Integer>> adj, int numCourses, int[] indegree) {
        int count = 0;

        Queue<Integer> pq = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                pq.offer(i);
                count++;

            }
        }
        while (!pq.isEmpty()) {
            int p = pq.poll();
            for (int i : adj.get(p)) {
                indegree[i]--;
                if(indegree[i]==0){
                pq.offer(i);
                count++;
                }


            }
        }
            return count==numCourses ?true:false;

        }


    

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());

        }
         int []indegree =new int [numCourses];
        for(int []p:prerequisites)
        {
            int u=p[0];
            int v=p[1];
            adj.get(v).add(u);
            indegree[u]++;


        }
      
     boolean ans=   checkCycleTopoSort(adj,numCourses,indegree);
     return ans;
        
    }
}