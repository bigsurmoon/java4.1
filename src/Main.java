public class Main {
    public static void main(String[] args) {

        BonusMilesServices service = new BonusMilesServices();
        int miles = service.calculate(32_000);
        System.out.println(miles);
    }
}
