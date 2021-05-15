package algorithmdiagram.chapter01;

public class BinarySearch {
    // has to return boxed integer in order to comfort to interface defined in the book
    private static Integer binarySearch(int[] list,int item){
        int low = 0;
        int hight = list.length-1;
        while(low <= hight){
            int mid = (low +hight)/2;
            int guess = list[mid];
            if(guess == item){
                return mid;
            }
            if(guess > item){
                hight = mid -1;
            }else{
                low = mid +1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1,3,5,7,9};
        System.out.println(binarySearch(myList,3));
        System.out.println(binarySearch(myList,5));
    }

}
