public class LambdaThree {
    interface Expression {
        boolean isEqual(int n);
    }

    private static void m1() {
        Expression Func = (n) -> n % 2 == 0;
        Expression Func2 = (n) -> n / 3 == 10;
        int[]nums={1, 2, 3, 5, 10, 15, 17, 30, 90};
        System.out.println(sum(nums, Func));
        System.out.println(sum(nums,Func2));



    }

    private static int sum(int[] numbers, Expression Func) {
        int result=0;
        for (int i : numbers) {
            if (Func.isEqual(i)) {
                result+=i;
            }
        }return result;

    }
}
