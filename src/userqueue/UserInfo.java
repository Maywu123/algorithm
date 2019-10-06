package userqueue;

public class UserInfo implements Comparable<UserInfo>{

    private int id;

    public UserInfo(){
        super();
    }

    public UserInfo(int id){
        super();
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int compareTo(UserInfo o){
        if(this.id > o.id) {
            return 1;
        }
        else if(this.id < o.id){
            return -1;
        }
        else return 0;
    }
}
