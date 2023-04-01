package dz3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Задайте размер списка (n): ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int r = rnd.nextInt(10, 100);
            Node node = new Node(r);
            if (i == 0) {
                list.head = node;
            } else {
                list.head.append(node);
            }
            list.tail = node;
        }

        System.out.println("Список до разворота:");
        System.out.println(list);

        System.out.println("\nСписок после разворота:");
        System.out.println(list.reverseList());

    }

}