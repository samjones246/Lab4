import java.util.ArrayList;
public class UserGroup{

    ArrayList<User> users; // Arraylist of the users in this group
    // Constructor just instatiates users
    public UserGroup(){
        users = new ArrayList();
    }
    // Adds 10 sample users with generic usernames and names, all of type user
    public void addSampleData(){
        for(int i = 0;i<10;i++){
            users.add(new User("su"+i,"user","User "+i));
        }
    }
    // Gets user from their index in the arraylist.
    public User getUser(int index){
        // This if statement checks that the index is valid to avoid errors
        if(index >= 0 && index <= users.size()-1){
            return users.get(index);
        }else{
            System.out.println("There is no user with this index in the group");
            return null;
        }
    }
    // Iterates through users with enhanced for loop and prints username and userType
    public void printUsernames(){
        for(User u:users){
            System.out.println(u.getUsername() + " " + u.getUserType());
        }
    }
        
}