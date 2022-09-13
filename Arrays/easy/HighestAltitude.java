package Arrays.easy;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i=0; i < gain.length; i++){
            sum = sum + gain[i];
            if(sum>max) {
                max=sum;
            }
        }
        return max;
    }
}
