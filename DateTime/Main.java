import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("---------------------");
        calendarExample();
        System.out.println("---------------------");
        simpleDateFormatExample();
        System.out.println("---------------------");
        dateExample();
        System.out.println("---------------------");
        timeZoneExample();
        System.out.println("---------------------");
        zoneIdExample();
        System.out.println("---------------------");
        convertDateCalendarExample();
        System.out.println("---------------------");
    }

    private static void convertDateCalendarExample() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "31-08-1997 10:20:56";
        Date date = simpleDateFormat.parse(dateInString);
        System.out.println("Date: " + date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        date = calendar.getTime();
        System.out.println("Date converted from Calendar: " + date);
    }

    private static void zoneIdExample() {
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
    }

    private static void timeZoneExample() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        Date date = new Date(671317595000L);
        System.out.println(simpleDateFormat.format(date));

        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ZoneId.of("+3")));
        System.out.println(simpleDateFormat.format(date));
    }

    private static void dateExample() throws ParseException {
        Date date = new Date(1991, 3, 1);
        Date date2 = new Date();
        Date date3 = new Date(671317044000L);
        System.out.println(date3);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date dateParsed = simpleDateFormat.parse("1991/04/10 00:00:00");
        System.out.println(dateParsed);
    }

    private static void simpleDateFormatExample() {
        Calendar calendar = new GregorianCalendar(1991, 3, 10, 13, 24, 56);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        simpleDateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss", Locale.JAPAN);
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        simpleDateFormat = new SimpleDateFormat("yy M dd HH:mm:ss", Locale.US);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }

    private static void calendarExample() {
        Calendar calendar = new GregorianCalendar(1991, 3, 10, 13, 24, 56);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // January is 0, February is 1, ... December is 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR); // 12-hour clock
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour clock
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Day of Week: " + dayOfWeek);
        System.out.println("Week of Year: " + weekOfYear);
        System.out.println("Week of Month: " + weekOfMonth);

        System.out.println("Hour (12-hour clock): " + hour);
        System.out.println("Hour of Day (24-hour clock): " + hourOfDay);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Millisecond: " + millisecond);
    }
}
