package employees;

import Wine_yejin.Employ;

import static employees.EmpMainView.employeesMainPageView;

public class EmpMain {


    public static void main(String[] args) {


        Employ emp1 = new Employ("홍길", 100.0, "abcd","1234","영업");
        System.out.println(emp1.getEmpName() + "어서오세요");
        employeesMainPageView();

    }


}
