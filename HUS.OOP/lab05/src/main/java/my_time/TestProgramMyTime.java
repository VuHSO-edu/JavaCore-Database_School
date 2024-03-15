package my_time;

public class TestProgramMyTime {

    public static void main(String[] args) {
        MyTime myTime = new MyTime(2,59,59);
        myTime.nextSecond();
        System.out.println("myTime = " + myTime);
        myTime.nextMinute();
        System.out.println("myTime = " + myTime);
        myTime.nextHour();
        System.out.println("myTime = " + myTime);
        myTime.previousSecond();
        System.out.println("myTime = " + myTime);
        myTime.previousMinute();
        System.out.println("myTime = " + myTime);
        myTime.previousHour();
        System.out.println("myTime = " + myTime);
    }
}
