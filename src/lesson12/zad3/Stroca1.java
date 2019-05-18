package lesson12.zad3;

import javax.swing.*;
import java.util.Scanner;

public class Stroca1 {
    public static void main(String[] args) {
       /* String s1 = "string";
        String s2 = "code";
        String s3 = "Practice";*/

        /*StringBuilder s1 = new StringBuilder("string");
        StringBuilder s2 = new StringBuilder("code");
        StringBuilder s3 = new StringBuilder("Practice");*/
        JOptionPane.showMessageDialog(null,"Введите чётное слово");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.length()%2==0) {
            StringBuilder q = new StringBuilder(a);
            vozvrat(q);
            System.out.println(q);
        }
        else {
            System.out.println("Введенно не чётное слово");
        }
        /*vozvrat(s1);
        vozvrat(s2);
        vozvrat(s3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/

    }

    private static void vozvrat(StringBuilder s1) {
        if (s1.length() > 4) {
            s1.delete(0, s1.length() / 2 - 1).delete(s1.length() / 2, s1.length());
        } else {
            s1.delete(0, s1.length() / 2 - 1).delete(s1.length() / 2+1, s1.length());
        }
    }
}
