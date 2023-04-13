package Wine_yejin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TotalUserRepository {

    static List<UserInfo> userList = new ArrayList<>();
    static List<Employ> employList = new ArrayList<>();



    public TotalUserRepository() {

    }
    //사용자리스트 내보내주기
    public static List<UserInfo> export_user(){
        return userList;
    }
    //직원리스트 내보내주기
    public static List<Employ> export_emp(){
        return employList;
    }

    public boolean LoginUserValidate(String userId, String userPwd){
        boolean flag = false;
        for (UserInfo userInfo : userList) {
            if(userInfo.getUserId().equals(userId) || userInfo.getUserPwd().equals(userPwd)){
                flag = true;
            }
        }
        return flag;
    }
//직원
    public boolean LoginEmpValidate(String empId, String empPwd){
        boolean flag = false;
        for (Employ empInfo : employList) {
            if(empInfo.getEmpId().equals(empId) || empInfo.getEmpPwd().equals(empPwd)){
                flag = true;
            }
        }
        return flag;
    }


    //새로운 사용자 추가하는 기능
    public static void newUser(UserInfo newuser){
        userList.add(newuser);
    }


    public static void saveUser() {
        try (FileOutputStream fos = new FileOutputStream("D:/sommelier-java/Wine_yejin/UserInfo.sav")) {
            //객체를 전체 저장
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getUser(){
        //list 파일 불러오기
        try (FileInputStream fis
                     = new FileInputStream("D:/sommelier-java/Wine_yejin/UserInfo.sav")) {

            // 객체를 불러올 보조스트림
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<UserInfo> object = (List<UserInfo>) ois.readObject();
            userList = object;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    //새로운 직원 추가하기
    public static void newEmployee(Employ emp){
        employList.add(emp);
    }





}
