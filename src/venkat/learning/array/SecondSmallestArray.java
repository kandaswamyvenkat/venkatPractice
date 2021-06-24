package venkat.learning.array;


public class SecondSmallestArray {
    public static int getSecondSmallest(int a[], int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        return a[1];
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 4, 8,9};
        int b[] = {55, 66, 77, 88, 99,77,88};

        System.out.println("second smallest number" +getSecondSmallest(a,6));
        System.out.println("second smallest number"+getSecondSmallest(b,7));
    }
}
