package my_time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        if (this.hour > 23 || this.hour < 0) {
            throw new IllegalStateException("hour betweenn 0 to 23");
        } else if (minute > 59 || minute < 0) {
            throw new IllegalStateException("minute betweenn 0 to 59");
        } else if (this.second > 59 || this.second < 0) {
            throw new IllegalStateException("second betweenn 0 to 59");
        }
    }

    public MyTime(int hour, int minute, int second) {
        if (this.hour > 23 || this.hour < 0) {
        throw new IllegalStateException("hour betweenn 0 to 23");
    } else if (minute > 59 || minute < 0) {
        throw new IllegalStateException("minute betweenn 0 to 59");
    } else if (this.second > 59 || this.second < 0) {
        throw new IllegalStateException("second betweenn 0 to 59");
    }
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public MyTime nextSecond() {
        if (this.second == 59) {
            this.second = 0;
        } else {
            this.second += 1;
        }

        if (minute == 59) {
            this.minute = 0;
            this.hour += 1;
        } else {
            this.minute += 1;
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute == 59) {
            this.minute = 0;
            this.hour += 1;
        } else {
            this.minute += 1;
        }
        return this;
    }

    public MyTime nextHour() {
        this.hour += 1;
        return this;
    }

    public MyTime previousSecond() {
        if (this.second == 0) {
            this.second = 59;
        } else {
            this.second -= 1;
        }

        if (minute == 0) {
            this.minute = 59;
            this.hour -= 1;
        } else {
            this.minute -= 1;
        }

        return this;
    }

    public MyTime previousMinute() {
        if (minute == 0) {
            this.minute = 59;
            this.hour -= 1;
        } else {
            this.minute -= 1;
        }
        return this;
    }

    public MyTime previousHour() {
        this.hour -= 1;
        return this;
    }
}
