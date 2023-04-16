package Wine_yejin;

import java.util.List;

import static employees.views.EmpMainView.empEmpview;
import static employees.views.EmpMainView.employList;

public class Main {
    public static void main(String[] args) {
        employList = List.of(
                new Employ("홍길동", 100.0, "aaaa", "1111", "영업"),
                new Employ("최수미", 100.0, "bbbb", "1111", "영업"),
                new Employ("롤롤롤", 100.0, "cccc", "1111", "영업")
        );


        Employ hong = employList.get(0);

        String empId = hong.getEmpId();
        String empPwd = hong.getEmpPwd();
        MainView mainView = new MainView();
        MainView.start();


        TotalUserRepository totalUserRepository = new TotalUserRepository();
        Employ employ = new Employ();

//        List<Employ> employList = List.of(
//          new Employ("홍길동",100.0,"aaaa","1111","영업"),
//          new Employ("최수미",100.0,"bbbb","1111","영업"),
//          new Employ("롤롤롤",100.0,"cccc","1111","영업")
//        );


        empEmpview(empId);



    }




}
