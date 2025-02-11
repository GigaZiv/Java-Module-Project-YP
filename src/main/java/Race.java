//  Автор: Жуков Игорь, Версия: 1.01
import java.util.ArrayList;
import java.util.Comparator;
public class Race {
    public static Boolean getCheckNameCar(String carName){
        if (carName.isEmpty()) {System.out.printf("Наименование  машины не может быть пустое!%n");}
        return !carName.isEmpty();
    }
    public static Boolean getCheckSpeedCar(int carSpeed){
        if (carSpeed < 0 || carSpeed > 250){
            System.out.printf("Неверно указана скорость автомобиля %s! Допустимые значения от 0 и не более 250 км/ч!%n", carSpeed);
        }
        return (carSpeed >= 0 && carSpeed <= 250);
    }

    public static String getWinnerCar(ArrayList<Car> cars) {
        cars.stream()
                .map((a) -> String.format("Машина: %s за 24 часа прошла расстояние в %d км, со скоростью %dкм/час.",
                        a.getCarName(), a.getCarSpeed() * 24, a.getCarSpeed()))
                .forEach(System.out::println);
        return String.format("Самая быстрая машина: %s!!!", (cars.stream()
                .sorted(Comparator.comparing(Car::getCarSpeed).reversed())
                .toList()).getFirst().getCarName());
    }
}