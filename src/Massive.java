public class Massive {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        int temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;
        System.out.println(a[0] + a[2]);
    }
}