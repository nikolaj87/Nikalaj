package practice.calculator;

public class Demo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        String operator = Request.requestOperator("введите операцию");
        double number1 = Request.requestDouble("введите 1 число");
        double number2 = Request.requestDouble("введите 2 число");

        switch (operator) {
            case "+":
                System.out.println(number1 + " " + operator + " " + number2 + " = " + calc.sum(number1, number2));
                break;
            case "-":
                System.out.println(number1 + " " + operator + " " + number2 + " = " + calc.min(number1, number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("на ноль дельть нельзя");
                } else
                    System.out.println(number1 + " " + operator + " " + number2 + " = " + calc.div(number1, number2));
                break;
            case "*":
                System.out.println(number1 + " " + operator + " " + number2 + " = " + calc.mult(number1, number2));
                break;
        }
    }
}

