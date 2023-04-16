package employees;


import Wine_yejin.Employ;
import java.util.List;

import static employees.EmpMainView.*;
import static employees.filters.WineSelectorByFilter.*;
import static employees.views.WineBuySelectView.selectPayment;

public class EmpMain {


    public static void main(String[] args) {

        employList = List.of(
                new Employ("홍길동", 100.0, "aaaa", "1111", "영업"),
                new Employ("최수미", 100.0, "bbbb", "1111", "영업"),
                new Employ("롤롤롤", 100.0, "cccc", "1111", "영업")
        );


        Employ hong = employList.get(0);

        String empId = hong.getEmpId();
        String empPwd = hong.getEmpPwd();

        empEmpview(empId);
//            selectPayment();

    }


}
