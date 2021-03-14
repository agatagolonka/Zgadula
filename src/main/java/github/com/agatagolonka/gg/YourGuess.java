package github.com.agatagolonka.gg;

public class YourGuess extends Hints {

    @Override
    protected String giveAnswer() {
        return "Zgadłeś! Brawo!";
    }

    @Override
    boolean isKeepPlaying() {
        return false;
    }
}
