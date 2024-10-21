import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> carData = new ArrayList<>();
        String confirmation = "Да";
        String nameCar = "";
        do {
            if (nameCar.isEmpty()){
                System.out.printf("Введите название %d машины!\n",carData.size()+1);
                nameCar = sc.next();
            }
            System.out.printf("Введите скорость %d машины!Скорость должна быть целым числом больше нуля и не больше 250!\n",carData.size()+1);

            if (sc.hasNextInt()) {
                int speedCar = sc.nextInt();
                if (speedCar > 0 && speedCar <= 250) {
                    System.out.printf("Машина %s, скорость %d правильно?\nВведи [%s/Любой текст]\n", nameCar, speedCar, confirmation);
                    if (sc.next().equalsIgnoreCase(confirmation)) {
                        carData.add(new Car(nameCar, speedCar));
                    }
                    nameCar = "";
                }
            } else sc.next();

        } while (carData.size() != 3);
        System.out.println("Самая быстрая машина: "+ Race.whoIsFaster(carData));
    }
}