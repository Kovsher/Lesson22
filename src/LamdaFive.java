public class LamdaFive {
    interface Operation {
        int execut(int x, int y);
    }

    public static void main(String[] args) {
        Operation Func = action(1);
        int a = Func.execut(6, 9);
        System.out.println(a);

        int b = action(2).execut(8, 2);
        System.out.println(b);
    }

    private static Operation action(int number) {
        switch (number) {
            case 1:
                return ((x, y) -> x + y);
            case 2:
                return ((x, y) -> x + y);
            case 3:
                return ((x, y) -> x + y);
            default:
                return ((x, y) -> 0);
        }
    }
}
