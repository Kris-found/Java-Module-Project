public class Race {
    // начальное значение
    String winner = "";
    int spaceValue = 0;

    public void calculationOfTheWinner(Auto autos) { // метод для расчета и сравнения
        int space = autos.speed * 24;
        if (spaceValue < space) {
            winner = autos.name;
            spaceValue = space;
        }
    }
    public String getWinner(){ //

        return winner;
    }
}