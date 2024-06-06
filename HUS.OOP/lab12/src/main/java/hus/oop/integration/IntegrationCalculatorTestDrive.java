package hus.oop.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        System.out.println("ArrayPolynomial Test");
        ArrayPolynomial arrayPoly = new ArrayPolynomial();
        arrayPoly.append(1.0).append(2.0).append(3.0);
        System.out.println("ArrayPolynomial: " + arrayPoly.toString());
        System.out.println("Evaluate at x=2: " + arrayPoly.evaluate(2));

        ArrayPolynomial arrayPoly2 = new ArrayPolynomial();
        arrayPoly2.append(4.0).append(5.0).append(6.0);
        System.out.println("ArrayPolynomial2: " + arrayPoly2.toString());

        ArrayPolynomial sum = arrayPoly.plus(arrayPoly2);
        System.out.println("Sum: " + sum.toString());

        ArrayPolynomial diff = arrayPoly.minus(arrayPoly2);
        System.out.println("Difference: " + diff.toString());

        ArrayPolynomial product = arrayPoly.multiply(arrayPoly2);
        System.out.println("Product: " + product.toString());

        System.out.println();
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        System.out.println("ListPolynomial Test");
        ListPolynomial listPoly = new ListPolynomial();
        listPoly.append(1.0).append(2.0).append(3.0);
        System.out.println("ListPolynomial: " + listPoly.toString());
        System.out.println("Evaluate at x=2: " + listPoly.evaluate(2));

        ListPolynomial listPoly2 = new ListPolynomial();
        listPoly2.append(4.0).append(5.0).append(6.0);
        System.out.println("ListPolynomial2: " + listPoly2.toString());

        ListPolynomial sum = listPoly.plus(listPoly2);
        System.out.println("Sum: " + sum.toString());

        ListPolynomial diff = listPoly.minus(listPoly2);
        System.out.println("Difference: " + diff.toString());

        ListPolynomial product = listPoly.multiply(listPoly2);
        System.out.println("Product: " + product.toString());

        System.out.println();

    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        System.out.println("IntegrationCalculator Test");
        ArrayPolynomial arrayPoly = new ArrayPolynomial();
        arrayPoly.append(1.0).append(2.0).append(3.0);
        System.out.println("ArrayPolynomial: " + arrayPoly.toString());

        IntegrationCalculator calculator = new IntegrationCalculator(new MidpointRule(0.01, 1000), arrayPoly);
        double result = calculator.integrate(0, 1);
        System.out.println("MidpointRule Result: " + result);

        calculator.setIntegrator(new TrapezoidRule(0.01, 1000));
        result = calculator.integrate(0, 1);
        System.out.println("TrapezoidRule Result: " + result);

        calculator.setIntegrator(new SimpsonRule(0.01, 1000));
        result = calculator.integrate(0, 1);
        System.out.println("SimpsonRule Result: " + result);

        System.out.println();
    }
}
