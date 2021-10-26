package algorithmdiagram.chapter03;

public class Countdown {
    private static void countdown(int i){
        System.out.println(i);
        if(i <= 0){  //基线条件就是自己不调用自己条件
            return;
        }else{ // 递归条件就是自己调用自己的条件
            countdown(i - 1);
        }
    }
    public static void main(String[] args) {
        countdown(5);
    }
}
