import java.util.*;
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
       Collections.sort(a);
        int x=a.get(0+m-1)-a.get(0);
        for(int i=1;i<=n-m;i++ ){
            int y=a.get(i+m-1)-a.get(i);
            if(y<x)
                x=y;
        }
        return x;
       
        // your code here
    }
}