package task;

public class task3 {
    public static void main(String[] args) {
        //System.out.println(sum(2_147_483_647, 2));
    }

    //Нужно исправить метод сложения двух чисел так, чтобы при переполнении переменной (Запустить пример  System.out.println(sum(2_147_483_647, 2)) ) выбрасывалось предупреждение
    public static int sum(int a, int b) {
        String ErrMsg = "Error. Extremely big number";
        //assert a + b == Integer.MAX_VALUE : ErrMsg;
        return a + b;
    }
}
