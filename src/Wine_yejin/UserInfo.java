package Wine_yejin;

import WineRepository.Wine;

import java.io.Serializable;
import java.util.List;

public class UserInfo  implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String userPwd;
    private String userName;
    private String userAddr;
    private int userAge;
/*    private List<Wine> userbag; //장바구니

    private List<Wine> userbuylist; //구매내역*/

    public UserInfo() {

    }

/*    public List<Wine> getUserbag() {
        return userbag;
    }

    public void setUserbag(List<Wine> userbag) {
        this.userbag = userbag;
    }
    public List<Wine> getUserbuylist() {
        return userbuylist;
    }
    public void setUserbuylist(List<Wine> userbuylist) {
        this.userbuylist = userbuylist;
    }*/

    public UserInfo(String userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }


    public UserInfo(String userId, String userPwd, String userName, String userAddr, int userAge) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.userAddr = userAddr;
        this.userAge = userAge;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }


}
