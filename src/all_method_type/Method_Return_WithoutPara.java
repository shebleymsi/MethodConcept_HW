package all_method_type;

public class Method_Return_WithoutPara {

    public static void main(String[] args) {

        Method_Return_WithoutPara xyz = new Method_Return_WithoutPara();

        xyz.doSummation();
        xyz.putName();
        xyz.doSubtruction();
        xyz.doDivision();
        xyz.doMultiplication();
    }
    public int doSummation() {
        int x = 20;
        int y = 21;
        int z = 22;
        int total = x + y + z;
        System.out.println("Total price is $" + total);
        return total;
    }
    public String putName() {

        String fastName = "ROBIN";
        String lastName = " ROTH";
        String fullName = fastName + lastName;
        System.out.println("Student full name is " + fastName  + lastName);
        return fullName;

    }
    public double doSubtruction() {

        double monthlySalary = 2000.00;
        double rent = 1200.000;
        double totalSavings = monthlySalary - rent;
        System.out.println("Total savings is " + totalSavings);
        return totalSavings;
    }
    public int doDivision() {
        int num1 = 20;
        int num2 = 21;
        int totalDiv = num1 / num2;
        System.out.println(totalDiv);
        return totalDiv;
    }
    public int doMultiplication() {
        int bookQuantity = 20;
        int eachBookPrice = 21;
        int totalBookPrice = bookQuantity * eachBookPrice;
        System.out.println("Total book price " + totalBookPrice);
        return totalBookPrice;
    }

}
