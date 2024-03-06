package oop.exam.decision_and_loop;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0 ;
        double average ;
         final int LOWERBOUND = 1 ;
        final int UPPERBOUND = 100;

        for (int i = LOWERBOUND; i <= UPPERBOUND ; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        average = (double) sum / UPPERBOUND;

        System.out.println("average1 = " + average);


        average = 0;
        sum = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND ) {
            sum += number;
            ++number;
        }
        System.out.println("sum = " + sum);
        average = (double) sum / (number-1);
        System.out.println("average2 = " + average);


        average = 0;
        sum = 0;
        number = LOWERBOUND;
        do {
            sum += number;
            ++number;
        } while (number <= UPPERBOUND);

        average = (double) sum / (number - 1);
        System.out.println("average = " + average);

        // 3.1 Suwj khác nhau giữa 'for' và 'while'
        // for : lặp lại với số lần đã biết
        // while: lặp lại số lần không biết trc và có điều kiên
        // 3.2 Sự khác nhau giữa 'while' và 'do-while'
        // while : thực hiện kiểm tra điều kiện trc khi thực hiện
        // do-while: thưcj hiện khối mã 1 lần ròi kiê tra ddieuf kiện nếu đúng thì tiếp tục

        final int LOWERBOUND1 = 111 ;
        final int UPPERBOUND1 = 8899;
        int count = 0;
        sum = 0;
        average = 0;
        for (int i = LOWERBOUND1; i <= UPPERBOUND1 ; i++) {
            count++;
            sum += i;
        }

        average = (double) sum / count;
        System.out.println("average = " + average);

        // 5
        long sumOfTheSquares = 0;

        for (int i = 1; i <= 100 ; i++) {
            sumOfTheSquares += Math.pow(i,2);
        }
        System.out.println("sumOfTheSquares = " + sumOfTheSquares);

        // 6

        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;

        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("sumEven = " + sumEven);
        System.out.println("sumOdd = " + sumOdd);
        absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;
        System.out.println("absDiff = " + absDiff);
    }
}
