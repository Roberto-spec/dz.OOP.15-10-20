package org.itstep.task04;

/**
 * Задание 4
 * Создайте класс Дробь (Fraction).
 * <p>
 * Необходимо хранить в полях класса: числитель и знаменатель.
 * <p>
 * Реализуйте геттеры/сеттеры для полей класса.
 * <p>
 * Также создайте методы класса для выполнения арифметических операций:
 * - сложение (addition).
 * - вычитание (subtraction),
 * - умножение (multiplication),
 * - деление (division).
 * <p>
 * Методы должны принимать в качестве аргумента вторую дробь (Fraction) и
 * возвращать результат в виде дроби (Fraction).
 * <p>
 * Создайте два конструктора: по умолчанию, и с параметрами
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Main {
    public static void main(String[] args) {
        // FIXME: здесь пример использования класса
        Fraction  a= new Fraction(3,5);
        Fraction b= new Fraction(2,5);
      //  Fraction c=a.multiplication(b);
       // c.show();
       // c=a.addition(b);
       // c.show();
        //c=a.subtraction(b);
       // c.show();
        a.division(b);
        a.show();

    }
}
