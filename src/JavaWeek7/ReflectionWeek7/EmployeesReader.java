//package JavaWeek7.ReflectionWeek7;
//
//import JavaWeek4.Exercise9.FileReader;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class EmployeesReader {
//    private FileReader reader = new FileReader();
//
//    public List<Bank> asList() {
//        List<String> lines = getLines();
//        List<Bank> records = toEmployees(lines);
//        return records;
//
//    }
//
//    private List<Bank> toEmployees(List<String> lines) {
//        List<Bank> information = new ArrayList<>();
//        lines.remove(0);
//        for (String line : lines) {
//            information.add(toEmployees(line));
//        }
//        return information;
//    }
//
//    private List<String> getLines() {
//        return reader.asLines("JavaWeek7.ReflectionWeek7/employees.csv");
//    }
//
//    private Bank EmployeesInforation(String line) {
//        String[] split = line.split(";");
//        List<String> columns = Arrays.asList(split);
//        String nameOfEmployee = columns.get(0);
//        String nameOfDepartment = columns.get(1);
//        String Salary = columns.get(2);
//        String Account = columns.get(3);
//
//        return new Bank(nameOfEmployee, nameOfDepartment, Integer.valueOf(Salary), Account);
//    }
//
//}