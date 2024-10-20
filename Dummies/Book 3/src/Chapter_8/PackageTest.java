package Chapter_8;

import java.util.Scanner;

public class PackageTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            System.out.println("Keep going? (y/n)");
            response = scanner.nextLine();
        } while (response.equalsIgnoreCase("y"));


    }
}