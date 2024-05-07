package simple.exercises;

public class Arithmophobia {
//    I've got a crazy mental illness. I dislike numbers a lot. But it's a little complicated: The number I'm afraid of depends on which day of the week it is... This is a concrete
//    description of my mental illness:
//
//    Monday --> 12
//    Tuesday --> numbers greater than 95
//    Wednesday --> 34
//    Thursday --> 0
//    Friday --> numbers divisible by 2
//    Saturday --> 56
//    Sunday --> 666 or -666
//    Write a function which takes a string (day of the week) and an integer (number to be tested) so it tells the doctor if I'm afraid or not. (return a boolean)
    static public boolean AmIAfraid(final String day, final int num) {
        if (day.equals("Monday")) {
            return num == 12;
        }
        if (day.equals("Tuesday")) {
            return num > 95;
        }
        if (day.equals("Wednesday")) {
            return num == 34;
        }
        if (day.equals("Thursday")) {
            return num == 0;
        }
        if (day.equals("Friday")) {
            return num % 2 == 0;
        }
        if (day.equals("Saturday")) {
            return num == 56;
        }
        if (day.equals("Sunday")) {
            return num == 666 || num == -666;
        }
        return false;

    }

    public static void main(String[] args) {
        String day = "Sunday";
        int num = -666;

        System.out.println(AmIAfraid(day, num));
    }
}
