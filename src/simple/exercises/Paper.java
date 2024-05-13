package simple.exercises;

public class Paper {
    public static int paperWork(int n, int m) {
        if (n < 0 || m < 0) {
            return 0;
        }

        return n * m;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = -5;

        System.out.println(paperWork(n, m));
    }
}
