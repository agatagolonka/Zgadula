package github.com.agatagolonka.GGTest2;

import java.util.Random;

public class RangeNum {
    private final int end;
    private final int start;

    public RangeNum(int start, int end) {
        this.start=Math.min(start,end);
        this.end=Math.max(start,end);

    }
    GenNum generate(){
        int hide = new Random().nextInt(end-start+1)+start;
        return new GenNum(hide);
    }
}
