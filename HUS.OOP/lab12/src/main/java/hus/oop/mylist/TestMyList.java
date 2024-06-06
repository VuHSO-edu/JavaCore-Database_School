package hus.oop.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.append(1.0);
        myArrayList.append(2.0);
        myArrayList.append(3.0);
        myArrayList.append(4.0);
        myArrayList.append(5.0);
        myArrayList.append(6.0);

        BasicStatistic basicStatistic = new BasicStatistic(myArrayList);

        double max = basicStatistic.max();
        double min = basicStatistic.min();
        double mean = basicStatistic.mean();
        double variance = basicStatistic.variance();

        System.out.println("MyArrayList");
        System.out.println("Size: " + myArrayList.size());
        System.out.println("Data: " + myArrayList.toString());
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
        System.out.println();
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1.0);
        myLinkedList.append(2.0);
        myLinkedList.append(3.0);
        myLinkedList.append(4.0);
        myLinkedList.append(5.0);
        myLinkedList.append(6.0);

        BasicStatistic basicStatistic = new BasicStatistic(myLinkedList);

        double max = basicStatistic.max();
        double min = basicStatistic.min();
        double mean = basicStatistic.mean();
        double variance = basicStatistic.variance();


        System.out.println("MyLinkedList");
        System.out.println("Data: " + myLinkedList.toString());
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
    }
}
