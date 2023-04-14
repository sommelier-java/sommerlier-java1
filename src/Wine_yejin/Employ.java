package Wine_yejin;

import java.io.Serializable;

public class Employ implements Serializable {

    private static final long serialVersionUID = 1L;
    private String empName;
    private double incentive;
    private String dept;
    private String empId;
    private String empPwd;

    public Employ() {
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employ(String empId, String empPwd) {
        this.empId = empId;
        this.empPwd = empPwd;
    }

    public Employ(String name,double incentive, String empId, String empPwd,String dept) {
        this.empName = name;
        this.incentive = incentive;
        this.empId = empId;
        this.empPwd = empPwd;
        this.dept = dept;
    }

    public double getIncentive() {
        return incentive;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }
}
