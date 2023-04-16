
package Manager.Manage.inventoryManagement;


import Manager.Manage.UserInfo.UserManagementView;
import Wine_yejin.EmpManage.EmpManaging;
import Wine_yejin.MainView;

import static Wine_yejin.TotalUserRepository.AddUserforManager;
import static Wine_yejin.util.Utility.input;

//관리자메인페이지
public class ManagerMainView {

    private static int InventoryManagement;

    public static void ManagerView() {
        while (true) {
            System.out.println("\n\n관리자 페이지입니다.\n원하시는 메뉴 번호를 입력해주세요 ");
            System.out.println("[ 1. 재고관리 | 2. 회원관리 | 3. 직원관리 | 9. 뒤로가기 ] ");
            String OriginWine = input(">>");


            switch (OriginWine) {
                case "1":
                    InventoryManagementView.InventoryManagementView();

                case "2":
                    AddUserforManager();
                    UserManagementView.UserManagementView();
                    //함수

                case "3":
                    EmpManaging.empManaging();

                case "9":
                    MainView.MainScreen();
                    return;
                default:
                    System.out.println("번호를 다시 입력해주세요");
            }
        }
    }
}

