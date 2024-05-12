package date.time;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.SUNDAY;

public class ExtendedWeekends {
//    If the first day of the month is a Friday, it is likely that the month will have an Extended Weekend. That is, it could have five Fridays, five Saturdays and five Sundays.
//
//  In this Kata, you will be given a start year and an end year. Your task will be to find months that have extended weekends and return:
//- The first and last month in the range that has an extended weekend
//- The number of months that have extended weekends in the range, inclusive of start year and end year.

//solve(2016,2020) = ["JANUARY","MAY","5"]. //The months are: Jan 2016, Jul 2016, Dec 2017, Mar 2019 and May 2020

    public static String[] solve(int a, int b) {
//        String first = null;
//        String last = null;
//        int count = 0;

        List<String> months = new ArrayList<>();

        for (int j = a; j <= b; j++) {
            for (int i = 1; i <= 12; i++) {
                LocalDate currentDay = LocalDate.of(j, i, 1);
                YearMonth yearMonth = YearMonth.of(j, i);
                if (currentDay.getDayOfWeek() == FRIDAY && yearMonth.atEndOfMonth().getDayOfWeek() == SUNDAY) {
                    months.add(currentDay.getMonth().toString());
//                    count++;

//
//                    if (first == null){
//                        first = currentDay.getMonth().toString();
//                    }
//                    last = currentDay.getMonth().toString();
                }
            }

        }
        String[] results = new String[3];
        results[0] = months.get(0);
        results[1] = months.get(months.size() - 1);
        results[2] = String.valueOf(months.size());
//        results[0] = first;
//        results[1] = last;
//        results[2] = Integer.toString(count);

        return results;
    }

    public static void main(String[] args) {
        int a = 2016;
        int b = 2020;

        System.out.println(Arrays.toString(solve(a, b)));
    }
}
