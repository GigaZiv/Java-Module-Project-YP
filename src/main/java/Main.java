import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//  Автор: Жуков Игорь, Версия: 1.01
public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            logger.info("Задача Практикума Ссылка на урок: [Спринт 2/25 → Тема 5/6: Проектная работа №1 → Урок 2/2: Проектная работа №1]( https://practicum.yandex.ru/learn/android-developer/courses/35a0ae52-6375-4db7-8178-e8c29df0aa61/sprints/468045/topics/adfb4524-1c0a-441f-863f-874f10b49eb3/lessons/aa9dbdab-ae94-4eca-8c57-34d7572bbf77/#5636d21a-e2b3-47ff-baf4-f50539454e07 )");

            int[] _c = {1, 2, 3};
            System.out.println(Race.getWinnerCar(
                    new ArrayList<>(
                            Arrays.stream(_c).mapToObj(v -> {
                                Scanner scanner = new Scanner(System.in);
                                Boolean flag=false;
                                String _n = "";
                                int _s = 0;
                                while (!flag) {
                                    System.out.printf("Введите название машины №%s ?.%n", v);
                                    _n = scanner.next();
                                    flag=Race.getCheckNameCar(_n);
                                }
                                flag=false;
                                while (!flag) {
                                    System.out.printf("Введите скорость машины: %s ?.%n", _n);
                                    scanner.nextLine();
                                    while (!scanner.hasNextInt()) {
                                        System.out.printf("Cкорость машины %s должна быть числом!%n", _n);
                                        scanner.nextLine();
                                    }
                                    _s = scanner.nextInt();
                                    flag=Race.getCheckSpeedCar(_s);
                                }
                                return new Car(_n, _s);
                            }).toList())
            ));
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE, "Произошла ошибка при работе!", e);
        }
    }
}