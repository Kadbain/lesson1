/**
 * Created by User on 11.10.2016.
 */
public class lesson3 {
    public static void main(String[] args) {
        // В переменной n хранится вещественное трёхзначное число с 2-мя знаками после запятой. Создайте программу, вычисляющую и выводящую на экран сумму всех цифр числа n.
        //Например есть число 69. Цифры его составляющие - 6 и 9. А их сумма будет 6+9 = 15.
        double n = 345.12;
        int i1 = (int) n / 100;
        int i2 = (int) n / 10 - 30;
        // int i3 = (int) n
        System.out.println(i1 + i2);
    }
}
