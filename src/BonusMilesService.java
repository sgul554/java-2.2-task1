public class BonusMilesService {
    public int calculate(int price) {
        int amount = 20;
        int miles = price / amount;

        return miles;
    }

}
