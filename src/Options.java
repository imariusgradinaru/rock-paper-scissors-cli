import model.exception.RockPaperScissorsException;

public enum Options {

    ROCK,
    PAPER,
    SCISSORS;

    public static Options getOptionByIndex (int index) {
        switch (index) {
            case 1: return ROCK;
            case 2: return PAPER;
            case 3: return SCISSORS;
        }

        throw new RockPaperScissorsException("Invalid index: " + index);
    }
}
