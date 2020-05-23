package Lab2;

public class Main {
  public static void main(String[] args) {
    Lab2.Example example=new Lab2.Example();
    int b=5;
    int result=example.calculate(b);
    System.out.println("result= " + result);
    System.out.println("b= " + b);

    Lab2.Example e = new Lab2.Example();
    System.out.println("before e.a"+e.getA());
    example.incrementA(e);
    System.out.println("after e.a="+e.getA());

  }
}
