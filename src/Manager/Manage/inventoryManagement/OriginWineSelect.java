
package Manager.Manage.inventoryManagement;


import static Wine_yejin.util.Utility.input;

public class OriginWineSelect {

    public static void OriginWineSelect() {
        while (true) {
//            System.out.println("\n\n와인별 국가 번호를 입력해주세요");
//            System.out.println("[ 1. 스페인 | 2. 이탈리아 | 3. 프랑스 | 4. 미국 | 5. 포르투갈 | 9. 뒤로가기 ]");
            System.out.println("\n▰▰▰▰▰▰▰  국가를 선택하세요  ▰▰▰▰▰▰▰");
            System.out.println("\t\t\t1 . 스  페  인");
            System.out.println("\t\t\t2 . 이 탈 리 아");
            System.out.println("\t\t\t3 . 프  랑  스");
            System.out.println("\t\t\t4 . 미      국");
            System.out.println("\t\t\t5 . 포 르 투 갈");
            System.out.println("\t\t\t9 . 뒤 로 가 기");
            System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰\n");
            String OriginWine = input(">>");


            switch (OriginWine) {
                case "1":
                    System.out.println("\n== 스페인 와인 ==\n");
                    OriginWineSelectMethod.spainWine();
                    break;

                case "2":
                    System.out.println("\n== 이탈리아 와인 ==\n");
                    OriginWineSelectMethod.italyWine();
                    break;


                case "3":
                    System.out.println("\n== 프랑스 와인 ==\n");
                    OriginWineSelectMethod.franceWine();
                    break;

                case "4":
                    System.out.println("\n== 미국 와인 ==\n");
                    OriginWineSelectMethod.usaWine();
                    break;

                case "5":
                    System.out.println("\n==포르투갈 와인==\n");
                    OriginWineSelectMethod.portugalWine();
                    break;

                case "9":
                    System.out.println("뒤로 돌아갑니다.\n\n\n");
                    return;
            }

        }

    }

}
