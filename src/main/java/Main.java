import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины: ");
            String name = scanner.next();
            System.out.println("Название машины №" + (i + 1) + ": " + name);
            System.out.println("Введите скорость машины от 0 до 250: ");
                while (true) {
                    String input = scanner.nextLine().trim();
                    if(input.isEmpty()){
                        continue;
                    }
                    try {
                        int speed = Integer.parseInt(input);
                        if (speed > 0 && speed <= 250) {
                            System.out.println("Скорость машины № " + (i + 1) + ": " + speed);
                            Auto autosValue = new Auto(name, speed);
                            race.calculationOfTheWinner(autosValue);
                            break;
                        } else if (speed <= 0 || speed > 250) {
                            System.out.println("Недопустимое значение скорости. Скорость машины должна быть от 0 до 250");
                        }

                    } catch (NumberFormatException error){
                        System.out.println("Некорректное значение. Попробуйте снова");
                    }
                }
            race.winner = race.getWinner();
        }
        System.out.println("Победитель: " + race.winner);
        scanner.close();
    }
}
