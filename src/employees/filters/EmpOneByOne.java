package employees.filters;

public class EmpOneByOne {

    public static void dottedPrint(String s) throws InterruptedException {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            Thread.sleep(300);
        }
        System.out.println();
    }
}
