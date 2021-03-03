package github.com.agatagolonka.GGTest2;

public class Main {

    //TODO:
    public static void main(String[] args) {
        int start=1;
        int end=10;
        GenNum hide=new RangeNum(start,end).generate();
        Hints hint;
        GetNum num;
        System.out.println("Wylosowałem liczbę od"+start+" do "+end);
        do {
            System.out.println("Zgadnij co wylosowałem");
            num = new GetNum();
            switch (hide.compareTo(num.userNum())) {
                case -1 -> hint = new ToLow();
                case 0 -> hint = new YouGuess();
                case 1 -> hint = new ToHigh();
                default -> throw new IllegalStateException("Unexpected value: " + hide.compareTo(num.userNum()));
            }
        }while(hint.KeepPlay);
    }
}
