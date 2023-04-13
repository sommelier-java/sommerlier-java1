package employees;

public class Employees {
    private final String empName;
    private final String empId;
    private final String empPwd;
    private final String empDept;
    private final double empIncen;

    public Employees(String empName, String empId, String empPwd, String empDept, double empIncen) {
        this.empName = empName;
        this.empId = empId;
        this.empPwd = empPwd;
        this.empDept = empDept;
        this.empIncen = empIncen;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public String getEmpDept() {
        return empDept;
    }

    public double getEmpIncen() {
        return empIncen;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                ", empPwd='" + empPwd + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empIncen=" + empIncen +
                '}';
    }
}
