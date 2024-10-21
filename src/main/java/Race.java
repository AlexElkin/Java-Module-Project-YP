import java.util.ArrayList;

public class Race {

    static String leader;

    public static String whoIsFaster(ArrayList<Car> carData) {
        int max = Math.max(carData.get(0).speedCar * 24, carData.get(1).speedCar * 24);
        int max_two = Math.max(max, carData.get(2).speedCar * 24);
        for (int i = 0; i < carData.size(); i++) {
            if (carData.get(i).speedCar * 24 == max_two) {
                leader = carData.get(i).nameCar;
                break;
            }
        }
        return leader;
    }
}