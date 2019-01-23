package JavaWeek7.ReflectionWeek7;


public class Bank {
    public String nameOfEmployee;
    public String nameOfDepartment;
    public Integer Salary;
    public String Account;

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "nameOfEmployee='" + nameOfEmployee + '\'' +
                ", nameOfDepartment='" + nameOfDepartment + '\'' +
                ", Salary=" + Salary +
                ", Account='" + Account + '\'' +
                '}';
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public Integer getSalary() {
        return Salary;
    }

    public String getAccount() {
        return Account;
    }

    public Bank(String nameOfEmployee, String nameOfDepartment, Integer salary, String account) {
        this.nameOfEmployee = nameOfEmployee;
        this.nameOfDepartment = nameOfDepartment;
        Salary = salary;
        Account = account;
    }

    public  String transferMoney(Integer salary,String account){
        return "Transfer successful : to " + salary + account;

    }


}
