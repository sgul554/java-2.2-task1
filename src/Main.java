public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(10295);
        System.out.println(miles);

    }
}