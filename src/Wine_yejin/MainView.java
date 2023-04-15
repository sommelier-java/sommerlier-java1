package Wine_yejin;

import Wine_yejin.EmpManage.EmpManaging;

import java.util.List;

import static Manager.Manage.inventoryManagement.ManagerMainView.ManagerView;
import static Wine_yejin.TotalUserRepository.*;
import static Wine_yejin.util.Utility.input;
import static employees.EmpMainView.employeesMainPageView;

public class MainView {
    //    static TotalUserRepository totalUserRepository = new TotalUserRepository();
//    static List<UserInfo> userInfoList = TotalUserRepository.export_user();
//    static List<Employ> employInfoList = export_emp();
//    TotalUserRepository.Employee
    static List<UserInfo> userList = TotalUserRepository.userList;
    static List<Employ> employList = TotalUserRepository.employList;


    public MainView() {

    }

    //    static UserInfo userInfo = new UserInfo();
//    static Employ employ = new Employ();
//    static Manager manager = new Manager();

    //와인 선택뷰
//    WineView wineView = new WineView();

    //실행 함수
    public static void start() {
        getUser();
        getEmp();
        while (true) {
            MainScreen();
        }

    }

    //직원, 사용자, 관리자중에 선택
    public static void MainScreen() {

        System.out.println("================= 사용자를 선택해주세요💁‍ ====================");
        System.out.print("[ 1. 관리자 | 2.직원 | 3.사용자 ]");
        System.out.println();
        switch (Integer.parseInt(input(">>"))) {
            case 1:
                ManagerLogin();
                break;
            case 2:
                EmpView();
                employeesMainPageView();
                break;
            case 3:
                userView();
                break;
            default:
                System.out.println("제대로 입력해주세요");
                MainScreen();
        }
    }

    //관리자 로그인 뷰
    private static void ManagerLogin() {
        String id = input("아이디를 입력해주세요 :");
        String pwd = input("비밀번호를 입력해주세요 :");
        if (new Manager().getManagerId().equals(id) && new Manager().getManagerPwd().equals(pwd)) {
            System.out.println("관리자 로그인 성공⭕");
            System.out.println("관리자 페이지로 넘어갑니다...");
            //관리자 페이지 함수 활용
//            new EmpManaging().empManaging();
            ManagerView();
        } else {
            System.out.println("로그인에 실패❌ \n다시 입력해주세요");
            ManagerLogin();
        }
    }

    //직원 로그인 뷰
    private static void EmpView() {
        String id, pwd;
        id = input("아이디를 입력해주세요 : ");
        pwd = input("비밀번호를 입력해주세요 : ");
        if (TotalUserRepository.LoginEmpValidate(id, pwd)) {
            System.out.println("직원 로그인 성공⭕");
            System.out.println("와인 선택 페이지로 넘어갑니다 . . .");
            //와인 선택 함수 보이기

        } else {
            System.out.println("로그인에 실패❌ \n다시 입력해주세요");
            EmpView();
        }
    }


    //사용자 로그인 뷰
    public static void userView() {
        String id, pwd;
        String choose = input("회원입니까??  [y / n] >>");
        System.out.println();
        if (choose.equals("Y") || choose.equals("y")) {
            id = input("아이디를 입력해주세요 : ");
            pwd = input("비밀번호를 입력해주세요 : ");
            //TotalUserRepository로 넘어가서 로그인 검증후에 논리값 리턴
            if (TotalUserRepository.LoginUserValidate(id, pwd)) {
                System.out.println("\n로그인 성공⭕");
                System.out.println("와인 선택 페이지로 넘어갑니다 . . .\n");
                //와인 선택 함수 보이기
//                .view();
            } else {
                System.out.println("로그인에 실패❌ \n다시 입력해주세요");
                userView();
            }
        } else {
            System.out.println("회원가입창으로 이동합니다...\n");
            UserMake();
        }
    }


    //사용자 회원가입 메서드
    private static void UserMake() {
        //회원 정보 입력받기
        String id, pwd, name, address;
        id = input("아이디를 입력해주세요 :");
        for (UserInfo userInfo : userList) {
            if(userInfo.getUserId().contains(id)){
                System.out.println("이미 존재하는 아이디 입니다. 다시 입력해주세요.");
                UserMake();
            }
        }
        pwd = input("비밀번호를 입력해주세요 :");
        name = input("이름를 입력해주세요 : ");
        address = input("주소를 입력해주세요 : ");
        int age = Integer.parseInt(input("나이를 입력해주세요 : "));
        if (age < 20) {
            System.out.println("미성년자는 저리가라 ❗❗");
            MainScreen();
        } else {
            //회원 추가하기
            //회원추가 했을때 save파일로 들어가도록!!!
            userList.add(new UserInfo(id, pwd, name, address, age));
            TotalUserRepository.saveUser();
        }


    }


}
