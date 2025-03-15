public class User {
     private String username;
     String password;
     boolean isAdmin;
    public User(){};
    public User(String username, String password, boolean isAdmin){
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    public String getName(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public boolean getisAdmin(){
        return isAdmin;
    }
    public void setName(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setIsAdmin(boolean isAdmin){
        this.isAdmin=isAdmin;
    }
}
