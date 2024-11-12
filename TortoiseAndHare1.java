import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int tortPosition = 1;
        int harePosition = 1;
        int finishLine = 70;

        System.out.println("The race has just begun!");

        while (tortPosition < finishLine && harePosition < finishLine) {
            // Move the tortoise
            int tortoiseMove = random.nextInt(100) + 1;
            if (tortoiseMove <= 50) {
                tortPosition += 3; // Fast plod
            } else if (tortoiseMove <= 70) {
                tortPosition -= 6; // Slip
            } else {
                tortPosition += 1; // Slow plod
            }

            // Move the hare
            int hareMove = random.nextInt(100) + 1;
            if (hareMove <= 20) {
                // Sleep, no movement
            } else if (hareMove <= 40) {
                harePosition += 9; // Big hop
            } else if (hareMove <= 50) {
                harePosition -= 12; // Big slip
            } else if (hareMove <= 80) {
                harePosition += 1; // Small hop
            } else {
                harePosition -= 2; // Small slip
            }

            // Adjust positions to ensure they are within the valid range
            tortPosition = Math.max(1, tortPosition);
            harePosition = Math.max(1, harePosition);

            // Display the positions
            System.out.println("Tortoise position: " + tortPosition + ", Hare position: " + harePosition);

            // Check if either animal has reached or passed the finish line
            if (tortPosition >= finishLine || harePosition >= finishLine) {
                if (tortPosition >= finishLine && harePosition < finishLine) {
                    int difference = tortPosition - harePosition;
                    System.out.printf("The race is over and the tortoise won by %d squares ahead of the hare.\n", difference);
                    System.out.println("The tortoise won carrots and lettuce!");
                } else if (harePosition >= finishLine && tortPosition < finishLine) {
                    int difference = harePosition - tortPosition;
                    System.out.printf("The race is over and the hare won by %d squares ahead of the tortoise.\n", difference);
                    System.out.println("The hare won the carrots and lettuce!");
                } else {
                    System.out.println("!The race is over and both animals reached the finish line at the same time");
                    System.out.println("Both the tortoise and the hare won a bucket of fresh carrots and lettuce!");
                }
                break;
            }

            // Wait for 1 second (1000 milliseconds) between each tick
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
