import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины: ");
            String name = scanner.next();
            System.out.println("Название машины №" + (i + 1) + ": " + name);
            while (true) {
                System.out.println("Введите скорость машины от 0 до 250: ");
                int speed = scanner.nextInt();
                if (speed > 0 && speed <= 250) {
                    System.out.println("Скорость машины № " + (i + 1) + ": " + speed);
                    break;
                } else if (speed <= 0 || speed > 250) {
                    System.out.println("Некорректное значение скорости. Попробуйте снова");
                }
                Auto autosValue = new Auto(name, speed); //создаем объект автомобиля со значением параметров
                race.calculationOfTheWinner(autosValue); //вызываем метод в цикле, производим расчет нового объекта и сравниваем его с предыдущим объектом
            }
            race.winner = race.getWinner();
        }
        System.out.println("Победитель: " + race.winner);
    }
}
