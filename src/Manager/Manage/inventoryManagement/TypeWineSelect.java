<<<<<<< HEAD
=======
package Manager.Manage.inventoryManagement;


import WineRepository.Wine;

import java.util.List;
import java.util.stream.Collectors;

import static WineRepository.TotalWine.valueList;
import static Wine_yejin.util.Utility.input;


public class TypeWineSelect {
    public static void typeWineSelect() {
        while (true) {
//            System.out.println("\n\n원하시는 와인 타입의 번호를 입력해주세요 ");
//            System.out.println("[ 1. 레드와인 | 2. 화이트와인 | 3. 스파클링와인 | 4. 로제와인 | 5. 주정강화 | 9. 뒤로가기 ] ");

            System.out.println("\n▰▰▰▰▰▰▰  타입을 선택하세요  ▰▰▰▰▰▰▰");
            System.out.println("\t\t\t1 . 화  이  트");
            System.out.println("\t\t\t2 . 로      제");
            System.out.println("\t\t\t3 . 레      드");
            System.out.println("\t\t\t4 . 스 파 클 링");
            System.out.println("\t\t\t5 . 주 정 강 화");
            System.out.println("\t\t\t9 . 뒤 로 가 기");
            System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");
            String TypeWine = input(">>");


            switch (TypeWine) {
                case "1":
                    System.out.println("\n==레드와인==\n");
                    TypeWineSelectMethod.redWine();
                    break;

                case "2":
                    System.out.println("\n==화이트와인==\n");
                    TypeWineSelectMethod.whiteWine();
                    break;

                case "3":
                    System.out.println("\n==스파클링와인==\n");
                    TypeWineSelectMethod.sparklingWine();
                    break;

                case "4":
                    System.out.println("\n==로제와인==\n");
                    TypeWineSelectMethod.roseWine();
                    break;

                case "5":
                    System.out.println("\n==주정강화와인==\n");
                    TypeWineSelectMethod.extraWine();
                    break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;

            }

        }
    }
}
>>>>>>> 1a2ef8f4c89e9a9c92b02a0275569bd747071381
