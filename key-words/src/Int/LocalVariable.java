package Int;

public class LocalVariable {
    public int sum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        LocalVariable localVariable = new LocalVariable();
        int sum = localVariable.sum(10);
        System.out.println("Sum of first 10 numbers -> " + sum);
    }
}
