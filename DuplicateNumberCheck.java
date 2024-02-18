import java.util.*;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class DuplicateNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        try {
            if (hasDuplicates(numbers)) {
                throw new DuplicateNumberException("Duplicate numbers found in the list!");
            } else {
                System.out.println("No duplicates found in the list.");
            }
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean hasDuplicates(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
