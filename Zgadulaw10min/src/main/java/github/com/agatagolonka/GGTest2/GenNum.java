package github.com.agatagolonka.GGTest2;

public class GenNum implements Comparable<Integer>{
    private int hide;

    public GenNum(int hide) {
        this.hide=hide;
    }

    @Override
    public int compareTo(Integer o) {
        return Integer.compare(o.intValue(), hide);
    }
}
