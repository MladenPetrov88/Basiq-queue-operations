import java.util.ArrayDeque;
import java.util.Scanner;

public class BasizQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(input[0]);
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {
            int numbers = scanner.nextInt();
            queue.offer(numbers);
        }

        for (int i = 0; i < Integer.parseInt(input[1]); i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println("0");
            return;
        }

        int min = Integer.MAX_VALUE;

        if (queue.contains(Integer.parseInt(input[2]))) {
            System.out.println("true");
        } else {
            for (Integer number : queue) {
                if (number < min) {
                    min = number;
                }
            }
            System.out.println(min);
        }
    }
}
