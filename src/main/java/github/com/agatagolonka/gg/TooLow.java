package github.com.agatagolonka.gg;

public class TooLow extends Hints {
    @Override
    protected String giveAnswer() {
        return "Za mała liczba, podaj większą";
    }

    @Override
    boolean isKeepPlaying() {
        return true;
    }
}
