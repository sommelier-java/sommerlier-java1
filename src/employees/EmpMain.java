package employees;

import static employees.EmpMainView.employeesMainPageView;

public class EmpMain {

    public static void main(String[] args) {
        Employees emp1 = new Employees("길", "1", "1234", "admin", 100.0);

        employeesMainPageView();

    }


}
