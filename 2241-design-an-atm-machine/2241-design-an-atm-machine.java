class ATM {
    int [] notes;
    int [] counts;


    public ATM() {
        notes= new int []{20,50,100,200,500};
        counts=new int [5];

        
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<5;i++)
        {
            counts[i]+=banknotesCount[i];

        }
        
    }
    
    public int[] withdraw(int amount) {
        int curr=amount;
        int [] ans=new int [5];


        for(int i=4;i>=0;i--)
        {
            int take=curr/notes[i];
            // jitne notes h usse zyada nhi le skte 
            take=Math.min(counts[i],take);
            ans[i]=take;
            curr=curr-(notes[i]*take);




        }
          if(curr != 0) {
        return new int[]{-1};
    }

           // actual ATM counts update karo
    for(int i = 0; i < 5; i++) {
        counts[i] -= ans[i];
    }

    return ans;
        
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */