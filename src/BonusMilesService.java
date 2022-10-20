public class BonusMilesService {
    public int calculate(int cost) {

        int oneMileForRubles = 20;
        int miles = cost / oneMileForRubles;

        return miles;
    }
}
