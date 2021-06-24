package venkat.learning.array;

public class SmallestOfArrays {
    public static void main(String[] args) {

        int[] arr = new int[]{55, 66, 77, 5, 6, 9};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];


        }
        System.out.println("smallest of array is "  + min);
    }
}
