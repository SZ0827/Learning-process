package Game;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int sum = test.add(5, 10);
        test.printNumbers(1, 2, 3, 4, 5);
        System.out.println("和：" + sum);
        String filePath="out.txt";
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  int add(int a, int b) {
        return a + b;
    }
    public void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
