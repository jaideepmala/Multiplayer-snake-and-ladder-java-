import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private static final int origin = 1;
    private static final int bound = 7;

    public int rollDice() {

        return ThreadLocalRandom.current().nextInt(origin, bound);
    }
}
