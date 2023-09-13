package HomeWorks.task1.Calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculation(222,123,'+'));
        System.out.println(calculateDiscount(250,25));
    }
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
            if(num < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    public static double calculateDiscount(double purAmo, double discount){
        if(purAmo <= 0) {
            throw new ArithmeticException("Error. The purchase amount can't be less than zero");
        }
        if(discount <= 0 || discount > 100){
            throw new ArithmeticException("Error. The discount value cannot be less than zero and more than 100%");
        }
        return purAmo*(1-discount/100);
    }
}