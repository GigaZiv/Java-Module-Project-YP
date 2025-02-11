// Автор:Жуков Игорь, Версия: 1.00
public class Car {
    private final String car_name;
    private final int car_speed;
    public Car(String carName, int carSpeed){
        this.car_name = carName;
        this.car_speed = carSpeed;
    }
    public int getCarSpeed() {
        return car_speed;
    }
    public String getCarName() {
        return car_name;
    }
}