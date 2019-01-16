public class SecondLambdaApp {
    static int x = 10;
    static int y = 20;

    interface Operation {
        int calculate();
    }

    interface Operationable {
        int culculate(int x,int y);
    }

    public static void main(String[] args) {
        Operation op = () -> {
            x = 30;
            return x + y;
        };
        System.out.println(op.calculate());
        System.out.println(x);
        m2();
    }

    private static void m2() {
        int n = 70;
        int m = 30;

        Operation op = () -> {
            return m + n;
        };
        System.out.println(op.calculate());


    }

    public static void m3() {
        Operationable op = (x, y) -> {
            if (y == 0) {
                return 0;
            } else {
                return x / y;
            } };
        System.out.println(op.culculate(10, 30));
    }
    interface OperetibleGeneric<T>{
        T calculate(T x,T y);
    }

    private static void m4() {
        OperetibleGeneric<Integer > o1 = (x, y) -> x + y;
        OperetibleGeneric<Integer > o2 = (x, y) -> x + y;





    }
}

