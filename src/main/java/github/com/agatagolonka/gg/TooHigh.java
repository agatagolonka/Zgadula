package github.com.agatagolonka.gg;

public class TooHigh extends Hints {
    @Override
    protected String giveAnswer() {
        return "Za duża liczba, podaj mniejszą";
    }

    @Override
    boolean isKeepPlaying() {
        return true;
    }
}
