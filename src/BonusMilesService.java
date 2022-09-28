public class BonusMilesService {
    public int calculate (int cost) {
        int bonus;

        if (cost > 1000) {
            bonus = cost / 100;
        } else {
            bonus = 0;
        }
        return bonus;
    }
}
