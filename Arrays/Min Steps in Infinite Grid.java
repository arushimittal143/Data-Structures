public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int x=A[0];
        int y=B[0];
        int c=0;
        for(int i=1;i<A.length;i++)
        {
                int x1=A[i];
                int y1=B[i];
                c += Math.max(Math.abs(y1-y),Math.abs(x1-x));
                x=x1;
                y=y1;
        }
        return c;
    }
}
