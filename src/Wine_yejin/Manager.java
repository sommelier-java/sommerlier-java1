package Wine_yejin;

public class Manager {
    private String nickname;
    private final String managerId = "abcd";
    private final String managerPwd = "1111";

    public Manager() {
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getManagerId() {
        return managerId;
    }

    public String getManagerPwd() {
        return managerPwd;
    }

}
