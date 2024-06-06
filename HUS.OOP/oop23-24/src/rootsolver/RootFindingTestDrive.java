package rootsolver;

public class RootFindingTestDrive {
    public static void main(String[] args) {
        /*
        TODO

        Chạy các hàm test để test chương trình.
        Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_RootFinding>.txt
        (ví dụ, NguyenVanA_123456_RootFinding.txt).
        Nén tất cả các file source code và file kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_RootFinding>.zip (ví dụ, NguyenVanA_123456_RootFinding.txt), và nộp bài
        lên classroom.
        */
        testRootSolver();
    }

    public static void testRootSolver() {
        /*
         TODO

         - Viết chương trình tìm nghiệm của hàm (sin(x).x - 3) theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           UnivariateRealRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, hàm và nghiệm của hàm tìm được.
         */
        AbstractFunction function = new UnivariateRealFunction();

        RootSolver bisectionSolver = new BisectionSolver(1e-6, 100);
        UnivariateRealRootFinding bisectionRootFinding = new UnivariateRealRootFinding(function, bisectionSolver);
        double bisectionRoot = bisectionRootFinding.solve(1.0, 2.0);
        System.out.println("Bisection method: " + bisectionRoot);

        RootSolver newtonRaphsonSolver = new NewtonRaphsonSolver(1e-6, 100);
        UnivariateRealRootFinding newtonRaphsonRootFinding = new UnivariateRealRootFinding(function, newtonRaphsonSolver);
        double newtonRaphsonRoot = newtonRaphsonRootFinding.solve(1.0, 2.0);
        System.out.println("Newton-Raphson method: " + newtonRaphsonRoot);

        RootSolver secantSolver = new SecantSolver(1e-6, 100);
        UnivariateRealRootFinding secantRootFinding = new UnivariateRealRootFinding(function, secantSolver);
        double secantRoot = secantRootFinding.solve(1.0, 2.0);
        System.out.println("Secant method: " + secantRoot);

    }
}
