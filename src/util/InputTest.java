package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        var input2 = new Input();

        System.out.println(input2.getInt(80, 100));

        System.out.println(input2.getInt());
        System.out.println(input2.getDouble(5,88));


    }
}
