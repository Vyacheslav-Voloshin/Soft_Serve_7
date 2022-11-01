import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//  �������� ������ ������� ����������� �� ��������� ������ ������
public class Simple_Calculator {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double result;
            Menu();
                System.out.print("������ �����: ");
                double a1 = Double.parseDouble(reader.readLine());
                System.out.print("������� ��������: ");
                String op = reader.readLine();
                switch (op) {
                    case "+":
                        System.out.print("������ �����: ");
                        double a2 = Double.parseDouble(reader.readLine());
                        MyFunctionalInterface lambda = (x, y) -> x + y;
                        result = lambda.mySuperMethod(a1, a2);
                        System.out.println("���������: " + result);
                        break;
                    case "-":
                        System.out.print("������ �����: ");
                        a2 = Double.parseDouble(reader.readLine());
                        MyFunctionalInterface lambda1 = (x, y) -> x - y;
                        result = lambda1.mySuperMethod(a1, a2);
                        System.out.println("���������: " + result);
                        break;
                    case "*":
                        System.out.print("������ �����: ");
                        a2 = Double.parseDouble(reader.readLine());
                        MyFunctionalInterface lambda2 = (x, y) -> x * y;
                        result = lambda2.mySuperMethod(a1, a2);
                        System.out.println("���������: " + result);
                        break;
                    case "/":
                        System.out.print("������ �����: ");
                        a2 = Double.parseDouble(reader.readLine());
                        if (a2==0) System.out.println("ĳ���� �� ���� �� �����");
                        else {
                            MyFunctionalInterface lambda3 = (x, y) -> x / y;
                            result = lambda3.mySuperMethod(a1, a2);
                            System.out.println("���������: " + result);
                        }
                        break;
                    default:
                        System.out.println("���� �������� �� ����");
                }
            }

    public static void Menu(){
        System.out.println("��������� ������ ������� �����������");
        System.out.println("������� ��������: + - * /");
        //System.out.println("y/n");
    }
    private  interface MyFunctionalInterface {
        double mySuperMethod(double number1, double number2);
    }

}
