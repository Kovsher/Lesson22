public class LambdaExample {
    interface Printable {
        void print(String s);

    }

    interface Operationable {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        Operationable opAnonym = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }


        };

        int resultAnarum = opAnonym.calculate(10, 20);
        Operationable operation = ((x, y) -> x + y);
        int resuly = opAnonym.calculate(10, 20);
        System.out.println(resuly);
    }
}
