package my_date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {
            "Jan","Fed","Mar","Apr","May","Jun",
            "Jul","Aug","Sep","Oct","Nov","Dec"};

    public static final String[] DAYS = {
            "Sunday","Monday","Tueday","Wednesday",
            "Thursday","Friday","Staturday"};

    public static final int[] DAYS_IN_MONTHS ={31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalStateException("Invalid year, month, or day!");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        } else {
            return true;
        }
    }

    public static int getDayOfWeek(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalStateException("Invalid year!");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalStateException("Invalid month!");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (!isValidDate(this.year, this.month, day)) {
            throw new IllegalStateException("Invalid day!");
        }
        this.day = day;
    }

    public MyDate nextDay() {
        if (isValidDate(this.year, this.month, this.day + 1) ) {
            this.day += 1;
            return this;
        } else if (isValidDate(year, month + 1, 1)) {
            this.day = 1;
            this.month += 1;
            return this;
        } else {
            this.day = 1;
            this.month = 1;
            this.year += 1;
            return this;
        }
    }

    public MyDate nextMonth() {
        if (isValidDate(year, month + 1, day)) {
            this.month += 1;
            return this;
        } else {
            this.year += 1;
            return this;
        }
    }

    public MyDate nextYear() {
        if (isLeapYear(year + 1) && month == 2 && day == 29) {
            this.month += 1;
            return this;
        } else if (month == 2 && day == 29) {
            this.day = 28;
            this.year += 1;
            return this;
        } else {
            this.year += 1;
            return this;
        }
    }

    public MyDate previousDay() {
        if (this.day > 1 && isValidDate(this.year, this.month, this.day - 1)) {
            this.day -= 1;
            return this;
        } else if (month == 3 && this.day == 1) {
            this.month = 2;
            if (isLeapYear(this.year)) {
                this.day = 29;
                return this;
            } else {
                this.day = 28;
                return this;
            }
        } else if (month != 3 && this.day == 1) {
            if (month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11 ||month == 1) {
                this.month = 31;
                return this;
            } else {
                this.month = 30;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        if (this.month > 1 && isValidDate(this.year, this.month - 1,this.day)) {
            this.month -= 1;
            return this;
        } else if (this.month == 1){
            this.month = 12;
        }
        return this;
    }

    public MyDate previousYear() {
        if (this.year > 1 && isValidDate(this.year - 1, this.month,this.day)){
            this.year -= 1;
        }
        return this;
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day) - 1] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }


}
