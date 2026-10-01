class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int salary=0;
       int kharcha=0;
       for(int i:gas)
       {
        salary+=i;

       }
         for(int i:cost)
       {
        kharcha+=i;
        
       }
    if(kharcha>salary)
    {
        return -1;

    }
    int total=0;
    int idx=0;


    for(int i=0;i<gas.length;i++)
    {
       total+=gas[i]-cost[i];
      if (total<0)
      {
      total=0;
      idx=i+1;


      } 

    }
    return idx;
    
        
    }
}