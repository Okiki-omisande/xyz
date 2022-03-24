//this test the capabilities of class employee

public class employeeTest {
    public static void main(String[] args) {
        employee worker1 = new employee("okeke", "maxwell", 40800);
        employee worker2 = new employee("omisande", "micheal", 49200);

        //display initial value
        System.out.printf("%s %s $%.2f%n", worker1.getFirstname(), worker1.getLastname(), worker1.getyearlySalary());
        System.out.printf("%s %s $%.2f%n%n",worker2.getFirstname(), worker2.getLastname(),worker2.getyearlySalary());

       //give 10% raise on yearly salary
        System.out.println("adding 10% increase on worker1 yearly salary");
        System.out.printf("%n%s %s $%.2f%n%n", worker1.getFirstname(),worker1.getLastname(),worker1.Increase());

        System.out.println("adding 10% increase on worker2 yearly salary");
        System.out.printf("%n%s %s $%.2f", worker2.getFirstname(),worker2.getLastname(),worker2.Increase());


    }
}
