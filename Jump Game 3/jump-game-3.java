class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean vis[]=new boolean[arr.length];
       return check(arr,start,vis);
    }
    static boolean check(int arr[],int s, boolean vis[]){
        if(s<0 || s>=arr.length) return false;
        if(arr[s]==0) return true;
        if(vis[s]) return false;
        vis[s]=true;
       
         boolean l=check(arr,s+arr[s],vis);
       
      boolean r=check(arr,s-arr[s],vis); 
           return l || r;
    }
}
