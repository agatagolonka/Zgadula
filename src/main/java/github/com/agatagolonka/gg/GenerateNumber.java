package github.com.agatagolonka.gg;

public class GenerateNumber implements Comparable<Integer> {
    private final int hiddenNumber;

    protected GenerateNumber(int hiddenNumber) {
        this.hiddenNumber = hiddenNumber;
    }

    @Override
    public int compareTo(Integer o) {
        return Integer.compare(o, hiddenNumber);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
