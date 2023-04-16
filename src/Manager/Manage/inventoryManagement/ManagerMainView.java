<<<<<<< HEAD
=======
package Manager.Manage.inventoryManagement;


import Manager.Manage.UserInfo.UserManagementView;
import Wine_yejin.EmpManage.EmpManaging;

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
                    UserManagementView.UserManagementView();
                    //함수

                case "3":
                  //함수추가

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;
            }
        }
    }
}
>>>>>>> 1a2ef8f4c89e9a9c92b02a0275569bd747071381
