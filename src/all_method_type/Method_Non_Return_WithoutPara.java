package all_method_type;

public class Method_Non_Return_WithoutPara {

    public static void main(String[] args) {

        Method_Non_Return_WithoutPara obj = new Method_Non_Return_WithoutPara();

        obj.tvDisplay();
        obj.doSummation();
        obj.doMulti();
        obj.doDivision();
        obj.collectName();
    }
    public void tvDisplay() {
        System.out.println("Method_Non_Return_WithoutPara. ");
    }
    public void doSummation() {

        int x = 20;
        int y = 21;
        int z = 22;
        int total = x + y + z;
        System.out.println("Total value after sum = " + total);
    }

    public void doMulti() {
        double priceBox = 20.00;
        int quantity = 4;
        double totalPrice = priceBox * quantity;
        System.out.println("Total box price is $" + totalPrice);
    }

    public void doDivision() {

        int num1 = 20;
        int num2 = 21;
        int totalDiv = num1 / num2;
        System.out.println("Result of the division is =" + totalDiv);

    }
        public void collectName (){
        String fName = "ROBIN";
        String lName = " ROTH";
        String fullName = fName +lName;
        System.out.println("My full name is : " +(fName + lName));
    }


}
