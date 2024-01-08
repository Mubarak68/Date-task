import java.util.Calendar;
import java.util.Date;

// الامبورت مخصص حق الوقت والتاريخ الحالي لدرجه ان يحب لك بالميلي ثانيه
// ةايضا اهو حاسم لان اذا بتحط لحظات مهمه يقدر يساعدك
// such as timestamps, birthdays, or deadlines.

public class Date1 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Current time and date:" + now);
        // راح يطبع لنا التاريخ والساعه بالضبط مع الثواني
        // ----------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------------------");
        // بجافا في اشياء واجد تخص التواريخ يعني اوله حيل
        // وفوق هذا كله نقدر نستعمل رزنامه بجافا
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, 13); // Adding 5 days
        // بالمثال مالهم حاطين ايام ف انا بزيده الى 13
        // Sun Jan 21 13:41:26 AST 2024 هذا جواب الي بعد (13)يوم

        Date futureDate = calendar.getTime();
        System.out.println("Date after 13 days: " + futureDate);
        // يعني من اول مانكتب رزنامه يطلع لنا فوق بالامبورت
        // ----------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------------------");

        // In this task they put a spicific date with a year,month and day
        // They are comparing two dates

        Date date1 = new Date(2024, 1, 15); // 15th Feb 2024
        Date date2 = new Date(2024, 1, 20); // 20th Feb 2024

        // boolean isBefore = date1.before(date2);
        // Here from the example I Just want to try mine and adding on the previous
        // dates

        Date date3 = new Date(2024, 12, 20);
        boolean isBefore = date3.before(date2);
        System.out.println("Is date3 before date2? " + isBefore);
    }
}