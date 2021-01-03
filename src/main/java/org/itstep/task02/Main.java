package org.itstep.task02;

import org.itstep.Input;
import org.itstep.Output;

/**
 * Задание 2
 * <p>
 * Создайте класс «Город» (City).
 * <p>
 * Необходимо хранить в полях класса:
 * - название города (name),
 * - название региона (region),
 * - название страны (country),
 * - количество жителей в городе (inhabitants),
 * - почтовый индекс города (index),
 * - телефонный код города (code).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода данных,
 * реализуйте конструктор с параметром и по умолчанию, геттеры и сеттеры для полей.
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */

public class Main {
    public static void main(String[] args) {
        // FIXME: здесь пример использования класса

        Input input=new Input();
        Output output=new Output();
        City Dnipro=input.input_City();
        output.output_city(Dnipro);

    }
}
