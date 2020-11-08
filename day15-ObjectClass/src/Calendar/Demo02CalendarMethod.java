package Calendar;

import java.util.Calendar;

public class Demo02CalendarMethod {
    public static void main(String[] args) {
        demo01();
    }
/*
public int get (int field);返回指定日历字段值
参数YEAR  MONTH
 */
    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
