package venkat.learning.array;

public class OddAndEvenNumbersOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println("odd numbers ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print( " " +a[i]);
            }
        }
        System.out.println();
        System.out.println("even numbers");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(" " + a[i]);
            }
        }
    }
}
