package github.com.agatagolonka.gg;

public class Main {
    private static final int START = 1;
    private static final int END = 10;

    private Main() {

    }

    public static void main(String[] args) {

        GenerateNumber hide = new RangeNumber(START, END).generate();
        Hints hint;
        GetNumber num;

        do {
            num = new GetNumber();
            switch (hide.compareTo(num.userNumber())) {
                case -1 -> hint = new TooLow();
                case 0 -> hint = new YourGuess();
                case 1 -> hint = new TooHigh();
                default -> throw new IllegalStateException("Unexpected value: " + hide.compareTo(num.userNumber()));
            }
            System.out.println(hint.giveAnswer());
        } while (hint.isKeepPlaying());
    }
}
