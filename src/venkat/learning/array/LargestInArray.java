package venkat.learning.array;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{22, 23, 3, 4, 3, 43, 4, 3, 34};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

            }
            System.out.println("the largest of given array is" + max);
        }
    }


