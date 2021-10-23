package BDBot;

public class Users {
    String userID;
    Integer userIQ;

    public Users(String userID, Integer userIQ) {
        this.userID = userID;
        this.userIQ = userIQ;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Integer getUserIQ() {
        return userIQ;
    }

    public void setUserIQ(Integer userIQ) {
        this.userIQ = userIQ;
    }
}
