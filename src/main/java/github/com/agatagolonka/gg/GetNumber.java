package github.com.agatagolonka.gg;

import java.util.Scanner;

public class GetNumber {
    private final int userNumber;


    GetNumber() {
        System.out.println(Messages.ASK.giveMessage());
        Scanner scanner = new Scanner(System.in);
        int tmp = 0;
            try {
                tmp = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Podaj liczbę");
            }

        
        this.userNumber = tmp;
        }


    protected Integer userNumber() {
        return this.userNumber;
    }
}

