package simple.exercises;

public class MathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2)
    {
        if (op.equals("+")) {
            return v1 + v2;
        }
        if (op.equals("-")) {
            return v1 - v2;
        }
        if (op.equals("*")) {
            return v1 * v2;
        }
        if (op.equals("/")) {
            return v1 / v2;
        }
        return null;

        // or just
//        return (op=="+") ? (v1+v2) : (op=="-") ? (v1-v2) : (op=="*") ? (v1*v2) : (v2==0) ? null : (v1/v2);
    }

    public static void main(String[] args) {
        String op = "+";
        int v1 = 4;
        int v2 = 7;

        System.out.println(basicMath(op, v1, v2));
    }
}
