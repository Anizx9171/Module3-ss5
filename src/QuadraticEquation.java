public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation() {
    }

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return a + "x^2" + b + "x" + c + "= 0";
    }

    public double delta() {
        return b * b - 2 * a * c;
    }

    public String solve() {
      double delta = this.delta();
      if (delta< 0){
          return "Pt vô nghiệm";
      }else if(delta == 0){
          return "Pt có nghiệm kép: x: " + (-b/2*a);
      }
      double n1 = (-b + Math.sqrt(delta))/2*a;
      double n2 = (-b - Math.sqrt(delta))/2*a;
      return "Pt có 2 nghiệm: x: " + n1 + " và x: " + n2;
    }
}
