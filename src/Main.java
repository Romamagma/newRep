import java.util.Scanner;

public class Main {
    public static double calc_c_f(double c)
    {
        return c+273.15;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение температуры в градусах Цельсия: ");
        double c=sc.nextDouble();
        System.out.println(c+" градусов Цельсия = "+calc_c_f(c)+" по Кельвину");
        }
}
