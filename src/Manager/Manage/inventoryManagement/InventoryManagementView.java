package Manager.Manage.inventoryManagement;


import static Wine_yejin.util.Utility.input;

//재고관리페이지
public class InventoryManagementView {

    public static void InventoryManagementView() {

        while (true) {
            System.out.println("\n\n재고관리 페이지입니다. \n원하시는 메뉴 번호를 입력 주세요");
            System.out.println("[ 1. 국가별 조회하기 | 2. 타입별 조회하기 | 3. 전체조회하기 | 9. 뒤로가기 ] ");
            String InventoryManagementView = input(">>");

            switch (InventoryManagementView) {
                case "1":
                    //국가별 조회
                    OriginWineSelect.OriginWineSelect();
                    break;
                case "2":
                    //와인타입별 조회
                    TypeWineSelect.typeWineSelect();
                    break;
                case "3":
                    //전체조회
                    WineListSelect.showWine();
                    break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;

            }

        }

    }
}