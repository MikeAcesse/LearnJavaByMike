package algorithmdiagram.chapter04.loop_sum;

public class LoopSum {
    private  static int sum(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4})); // 10
    }
}
