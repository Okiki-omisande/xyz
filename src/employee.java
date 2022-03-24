//A class called Employee that includes three instance variables—a
//first name (type String), a last name (type String) and a monthly salary (double).
//that Provides a constructor that initializes the three instance variables.
// Provides a set and a get method for each instancevariable
// Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
// Create two Employee objects and display each
//object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again

    public class employee {
    //instance variable
    private String firstname;
    private String lastname;
    private double yearlySalary;

    //constructor
 public employee(String firstname,String lastname, double yearlySalary)
 {
      this.firstname = firstname;

      this.lastname = lastname;

      this.yearlySalary = yearlySalary;

 }

    //firstname method
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
   }

    //lastname method
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    //monthsalary method
    public void setyearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getyearlySalary() {
        return yearlySalary;
    }

    public double Increase(){
     return yearlySalary + (0.01 * yearlySalary);
    }
}
