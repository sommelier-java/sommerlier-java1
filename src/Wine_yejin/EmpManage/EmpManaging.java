package Wine_yejin.EmpManage;

import Wine_yejin.Employ;
import Wine_yejin.MainView;
import Wine_yejin.TotalUserRepository;

import java.util.ArrayList;
import java.util.List;

import static Wine_yejin.util.Utility.input;

public class EmpManaging {
    List<Employ> emp = TotalUserRepository.export_emp();

    //직원 count함수
    public int countEmp(){
        return emp.size();
    }

    //직원 추가,삭제,변경중 선택하는 함수
    public void empManaging() {
        System.out.println("===============직원관리 화면==================");
        System.out.println("총 "+countEmp()+"의 직원이 있습니다.");
        System.out.println("1. 직원추가");
        System.out.println("2. 직원삭제");
        System.out.println("3. 직원 정보 변경");
        int choose = Integer.parseInt(input(">>"));
        switch (choose) {
            //직원 추가
            case 1:
                AddEmp();
                break;
            case 2:
                //직원 삭제
                String deleteId = input("삭제할 직원의 아이디를 입력해주세요 >>");
                deleteEmp(deleteId);
                break;
            case 3:
                //직원 정보 변경
                ChangeEmp();
                break;
        }

    }

    //직원 삭제 함수
    public void deleteEmp(String deleteId){
        for (Employ employ : emp) {
            if(employ.getEmpId().contains(deleteId)){
                emp.remove(employ);
            }
        }
    }

    //직원 추가 함수
    public void AddEmp(){
        String name, id, pwd, dept;
        double incen;
        boolean flag = false;
        name = input("이름을 입력하세요 >>");
        incen = Double.parseDouble(input("인센티브를 입력해주세요 >>"));
        dept = input("부서를 입력해주세요");
        id = input("아이디를 등록해주세요");
        for (Employ employ : emp) {
            if (employ.getEmpId().equals(id)) {
                System.out.println("이미 존재하는 아이디 입니다.");
                flag = true;
            }
        }
        if (flag) {
            empManaging();
        } else {
            pwd = input("비밀번호를 등록해주세요");
            //List에 직원정보 추가
            emp.add(new Employ(name, incen, id, pwd, dept));
            System.out.println("직원이 추가 되었습니다! Enter를 치면 mainpage로 넘어갑니다.");
            String result = input(">>");
            //엔터를 치면 main화면으로 넘어감
            if(result == "\\r\\n"){
                new MainView().MainScreen();
            }
        }
    }


    //직원정보 변경 함수
    private void ChangeEmp() {
        System.out.println("=================직원 변경 페이지============");
        String changeId = input("변경할 직원의 아이디를 입력해주세요>>");
        for (Employ employ : emp) {
            if (employ.getEmpId().contains(changeId)){
                System.out.println("변경할 정보를 선택해주세요 ");
                System.out.println("1. 이름\n2.인센티브\n3.부서\n4.아이디\n5.비밀번호");
                String choose = input(">>");
                switch (Integer.parseInt(choose)){
                    case 1:
                        String cname = input("변경할 이름을 입력하세요 >> ");
                        employ.setEmpName(cname);
                        break;
                    case 2:
                        double cincentive = Double.parseDouble(input("변경할 인센티브 값을 입력하세요 >> "));
                        employ.setIncentive(cincentive);
                        break;
                    case 3:
                        String cdept = input("변경할 부서를 입력하세요");
                        employ.setDept(cdept);
                        break;
                    case 4:
                        String cid = input("변경할 아이디를 입력하세요");
                        boolean flag = false;
                        for (Employ employ1 : emp) {
                            if(employ1.getEmpId().contains(cid)){
                                System.out.println("이 아이디는 이미 존재하는 아아디 입니다. 다시 입력해주세요");
                                flag = true;
                            }
                        }
                        if(!flag){
                            employ.setEmpId(cid);
                        }
                        break;
                    case 5:
                        String cpwd = input("변경할 비밀번호를 입력하세요");
                        employ.setEmpPwd(cpwd);
                        break;
                    default:
                        System.out.println("다른 정보를 선택해주세요");
                }
            }
        }
    }



}
