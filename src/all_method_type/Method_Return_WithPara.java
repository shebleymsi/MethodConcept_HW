package all_method_type;

public class Method_Return_WithPara {

    public static void main(String[] args) {

        Method_Return_WithPara obj = new Method_Return_WithPara();

        obj.getEmployeeInfo("Elon Musk", 101, "Male");
        obj.getEmployeeInfo("Steve Jobs", 102, "Male");
        obj.getEmployeeInfo("Bill Gates", 103, "Male");
        obj.getEmployeeInfo("Waren Buffet", 104, "Male");

        obj.getYearlySalary(2000.00, 12);


        obj.doSummation(100, 50, 20, 4000, 200);
        System.out.println(obj.doSummation(100, 50, 20, 4000, 200));

        obj.doDivision(20,21);
        System.out.println(obj.doDivision(20,21));

        obj.doSubtruction(20, 21);
        System.out.println( obj.doSubtruction(20, 21));
    }

    public String getEmployeeInfo(String name, int idNumber, String gander) {
        System.out.println(" Employee name " + name + " Employee ID: " + idNumber  + " Employee gander " + gander);
        return (name + idNumber + gander);
    }
    public double getYearlySalary(double monthlySalary, double month) {
        System.out.println("Elon Musk's yearly salary is " + monthlySalary * month);
        return (monthlySalary * month);
    }
    public int doSummation(int uniForm, int gumBootShoes, int basketBallCap, int gunAK42, int sideBag ) {
        return (uniForm + gumBootShoes + basketBallCap + gunAK42 + sideBag);
    }
    public int doDivision(int num1, int num2){
        return (num1/num2);
    }
    public int doSubtruction(int x, int y){
        return ( x-y );
    }
}
