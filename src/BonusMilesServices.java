public class BonusMilesServices {
    public int calculate(int price) {

        int moneyForMile = 20;
        int bonusMiles = price / moneyForMile;

        return bonusMiles;
    }
}
