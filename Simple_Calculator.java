import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//  Програма реалізує простий калькулятор за допомогою лямбда виразів
public class Simple_Calculator {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double result;
            Menu();
                System.out.print("Введіть число: ");
                double a1 = Double.parseDouble(reader.readLine());
                System.out.print("Виберіть операцію: ");
                String op = reader.readLine();
                switch (op) {
                    case "+":
                        System.out.print("Введіть число: ");
                        double a2 = Double.parseDouble(reader.readLine());
                        MyFunctionalInterface lambda = (x, y) -> x + y;
                        result = lambda.mySuperMethod(a1, a2);
                        System.out.println("Результат: " + result);
                        break;
                    case "-":
                        System.out.print("Введіть число: ");
                        a2 = Double.parseDouble(reader.readLine());
                        MyFunctionalInterface lambda1 = (x, y) -> x - y;
                        result = lambda1.mySuperMethod(a1, a2);
                        System.out.println("Результат: " + result);
                        break;
                    case "*":
                        System.out.print("Введіть число: ");
                        a2 = Double.parseDouble(reader.readLine());
                        MyFunctionalInterface lambda2 = (x, y) -> x * y;
                        result = lambda2.mySuperMethod(a1, a2);
                        System.out.println("Результат: " + result);
                        break;
                    case "/":
                        System.out.print("Введіть число: ");
                        a2 = Double.parseDouble(reader.readLine());
                        if (a2==0) System.out.println("Ділити на ноль не можна");
                        else {
                            MyFunctionalInterface lambda3 = (x, y) -> x / y;
                            result = lambda3.mySuperMethod(a1, a2);
                            System.out.println("Результат: " + result);
                        }
                        break;
                    default:
                        System.out.println("Такої операції не існує");
                }
            }

    public static void Menu(){
        System.out.println("Программа реалізує простий калькулятор");
        System.out.println("Доступні операції: + - * /");
        //System.out.println("y/n");
    }
    private  interface MyFunctionalInterface {
        double mySuperMethod(double number1, double number2);
    }

}
