package github.com.agatagolonka.GGTest2;

public enum Messg {
   START ("Wylosowałem liczbę") ,
    ASK ("Spróbuj zgadnąć jaką");

    String ask;

    Messg(String s) {
        ask=s;
    }
    String giveMsg(){
        return ask;
    }
}
