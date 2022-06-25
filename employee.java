import java.util.*;

public class employee {
    private int empId, deptId;
    private String name;

    public static void checkName(String name) throws RuntimeException {
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new RuntimeException("First letter of name is not upper case !!!");
        }
    }

    public static void checkEmpId(int empId) throws RuntimeException {
        if (empId < 2001 || empId > 5001) {
            throw new RuntimeException("Employee id is not in between the range 2001 and 5001 !!!");
        }
    }

    public static void checkDeptId(int deptId) throws RuntimeException {
        if (deptId < 1 || deptId > 5) {
            throw new RuntimeException("department id is not in range 1 to 5 !!!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the name :");
            String name = sc.nextLine();
            checkName(name);
            System.out.println("Enter the employee id :");
            int empId = sc.nextInt();
            checkEmpId(empId);
            System.out.println("Enter the department id");
            int deptId = sc.nextInt();
            checkDeptId(deptId);

            System.out.println("Name is : " + name);
            System.out.println("Name is :  " + empId);
            System.out.println("Name is :  " + deptId);
        } catch (RuntimeException r) {
            System.out.println("Error :" + r);
        }

    }

}
