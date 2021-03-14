package github.com.agatagolonka.gg;

enum Messages {
    ASK("Spróbuj zgadnąć jaką liczbę wylosowałem?");

    private String ask;

    Messages(String s) {
        ask = s;
    }

    String giveMessage() {
        return ask;
    }
}
