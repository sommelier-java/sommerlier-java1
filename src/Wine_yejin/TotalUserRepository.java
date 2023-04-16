package Wine_yejin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Wine_yejin.SavePath.*;

public class TotalUserRepository {

    static List<UserInfo> userList = new ArrayList<>();
    static List<Employ> employList = new ArrayList<>();

    public TotalUserRepository() {

    }

//    사용자리스트 내보내주기
    public static List<UserInfo> export_user(){
        return userList;
    }
    //직원리스트 내보내주기
    public static List<Employ> export_emp(){
        return employList;
    }

    //사용자 로그인 검사
    public static boolean LoginUserValidate(String userId, String userPwd){
        getUser();
        boolean flag = false;
        for (UserInfo userInfo : userList) {
            if(userInfo.getUserId().contains(userId) || userInfo.getUserPwd().contains(userPwd)){
                flag = true;
            }
        }
        return flag;
    }

    //직원 로그인 검사
    public static boolean LoginEmpValidate(String empId, String empPwd){
        getEmp();
        boolean flag = false;
        for (Employ empInfo : employList) {
            if(empInfo.getEmpId().equals(empId) || empInfo.getEmpPwd().equals(empPwd)){
                flag = true;
            }
        }
        return flag;
    }


//    //새로운 사용자 추가하는 기능
//    public static void newUser(UserInfo newuser){
//        userList.add(newuser);
//    }


    //사용자정보  UserInfo.sav파일에 저장하기
    public static void saveUser() {

        File f1 = new File(ROOT_PATH);
        if (!f1.exists()) f1.mkdir();

        File f2 = new File(USER_SAVE_PATH);
        if (!f2.exists()) f2.mkdir();

        try (FileOutputStream fos = new FileOutputStream(USER_SAVE_PATH  + "/UserInfo.sav")) {
            //객체를 전체 저장
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
//            System.out.println("save complete");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //sav파일에 있는 user정보 불러오기
    public static void getUser(){

        File f = new File(USER_SAVE_PATH+"/UserInfo.sav");
        if (!f.exists()) return;

        //list 파일 불러오기
        try (FileInputStream fis
                     = new FileInputStream(f)) {
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

    //직원정보 empInfo.sav파일에 저장하기
    public static void saveEmp() {

        File f1 = new File(ROOT_PATH);
        if (!f1.exists()) f1.mkdir();

        File f2 = new File(USER_SAVE_PATH);
        if (!f2.exists()) f2.mkdir();

        try (FileOutputStream fos = new FileOutputStream(USER_SAVE_PATH+"/EmpInfo.sav")) {
            //객체를 전체 저장
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //sav파일에 있는 emp정보 불러오기
    public static void getEmp(){

        File f2 = new File(USER_SAVE_PATH+"/EmpInfo.sav");
        if (!f2.exists()) return;

        //list 파일 불러오기
        try (FileInputStream fis
                     = new FileInputStream(f2)) {
            // 객체를 불러올 보조스트림
            ObjectInputStream ois = new ObjectInputStream(fis);
            employList = (List<Employ>) ois.readObject();
//            List<Employ> object = (List<Employ>) ois.readObject();
//            employList = object;
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
