package github.com.agatagolonka.GGTest2;

import java.util.Scanner;

public class GetNum {

    private final int userNum;

    public GetNum() {
        this.userNum=new Scanner(System.in).nextInt();
    }
    int userNum(){
        return this.userNum;
    }
}
