package github.com.agatagolonka.gg;

import java.util.Random;

public class RangeNumber {

    private final int start;
    private final int end;

    protected RangeNumber(int start, int end) {
        this.start = Math.min(start, end);
        this.end = Math.max(start, end);
    }

    protected GenerateNumber generate() {
        final int hideDigit = new Random().nextInt(end - start + 1) + start;
        return new GenerateNumber(hideDigit);
    }


}



