package task;

public class task2 {

    //Нужно исправить пример, так чтобы метод не выбрасывал ошибку
    public static void main(String[] args) {
        assertConditionB();
    }
    public static void assertConditionB() {
        int x = -1;
        assert x <= 0 : "Число должно быть менее 0";
    }
}
