// Define an enum for different days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Q12_enum {
    public static void main(String[] args) {
        // Using enum constants
        Day today = Day.WEDNESDAY;

        // Switch statement with enum
        switch (today) {
            case SUNDAY:
                System.out.println("It's a relaxing day!");
                break;
            case MONDAY:
                System.out.println("Back to work!");
                break;
            case WEDNESDAY:
                System.out.println("Midweek!");
                break;
            default:
                System.out.println("Just another day.");
        }

        // Iterating through enum values
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
