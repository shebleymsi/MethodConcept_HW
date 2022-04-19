package all_method_type;

public class Method_Non_Return_WithPara {

    public static void main(String[] args) {

        Method_Non_Return_WithPara xyz = new Method_Non_Return_WithPara();

        xyz.doSum1(20,21);
        xyz.doSum2(20,21,22);
        xyz.doMulti(20,21,22);
        xyz.doSusbtruct1(20, 21);
        xyz.doDivision(20,21,22);
    }
    public void doSum1 (int x, int y){
        int total = x+y;
        System.out.println(total);
    }
    public void doSum2 (int x, int y,int z){
        int total = x+y+z;
        System.out.println("total value" +total);
    }

    public void doSusbtruct1 (int num1, int num2) {
        int total = num1-num2;
        System.out.println("total output " +total );
    }
    public void doMulti(double x, double y,double z){
        double totalmulti= x*y*z;
        System.out.println("total value" + totalmulti);
    }

    public void doDivision(double x, double y,double z){
        double number = (x/y)+z;
        System.out.println("total value" + number);
    }

}
