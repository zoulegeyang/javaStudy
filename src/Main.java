import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int[] aa = new int[10];
    private static int[] bb = new int[10];
    public static void main(String[] args) {
        test(aa, bb);
        test2(aa);
        System.out.println(Arrays.toString(aa));
    }
    public static void test(int[] a, int[] b) {
        a[0] = 1;
        b[0] = 2;
    }
    public static void test2(int[] a) {
        a = new int[10];
    }
}

