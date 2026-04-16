package Enumuration.Example1;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class EnumUnderstand {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch(today){
            case SUNDAY -> System.out.println("sunday is holiday");
            case MONDAY -> System.out.println("Monday is workingDay");
            case TUESDAY -> System.out.println("Tuesday is chicken-day");
            case WEDNESDAY -> System.out.println("KFC offer day");
            case THURSDAY -> System.out.println("Saibaba temple festival");
            case FRIDAY -> System.out.println("Special Day");
            case SATURDAY -> System.out.println("weekend");
        }







    }
}
