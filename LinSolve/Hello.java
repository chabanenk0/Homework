public class Hello {
    public static void main(String[] args) {
        LinSolve l = new LinSolve();
        l.setA(2);
        l.setB(0);
        double x = l.solve();
        System.out.println("x=" + x);
    }
 }
