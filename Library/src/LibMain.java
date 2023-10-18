import java.util.ArrayList;
import java.util.Scanner;

public class LibMain {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //createArray(scan);

        ArrayList<String> strArr = new ArrayList<String>();
        int arrLen = 3;

        for (int i = 0; i < arrLen; i++) {
            strArr.add(scan.nextLine());
        }

        printArr(strArr);

        strArr.add(1, scan.nextLine());
        printArr(strArr);

        System.out.println("Hello world!");
    }

    private static void printArr(ArrayList<String> strArr) {
        for (int i = 0; i < strArr.size(); i++) {
            String str = strArr.get(i);
            System.out.println(str);
        }
    }


    private static void createArray(Scanner scan) {
        String[] strs = new String[5];

        for (int i = 0; i < 5; i++) {
            strs[i] = scan.nextLine();
        }

        for (String str : strs) {
            System.out.println(str);

        }

    }
}