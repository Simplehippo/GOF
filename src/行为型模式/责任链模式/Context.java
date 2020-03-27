package 行为型模式.责任链模式;

public class Context {

    private boolean newUser;
    private String location;

    public Context() {
    }

    public Context(boolean newUser, String location) {
        this.newUser = newUser;
        this.location = location;
    }

    public boolean isNewUser() {
        return newUser;
    }

    public void setNewUser(boolean newUser) {
        this.newUser = newUser;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
