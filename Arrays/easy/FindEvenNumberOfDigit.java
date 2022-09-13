package Arrays.easy;

public class FindEvenNumberOfDigit {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums) {
        int even_count = 0;
        for (int num : nums) {
            int num_digit = (int) Math.log10(num) + 1;
            if (num_digit % 2 == 0) {
                even_count++;
            }
        }
        return even_count;
    }
}
