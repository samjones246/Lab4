import java.util.ArrayList;
import java.util.Iterator;
public class UserGroup{

    ArrayList<User> users; // Arraylist of the users in this group
    // Constructor just instatiates users
    public UserGroup(){
        users = new ArrayList();
    }
    // Adds 10 sample users with generic usernames and names. Types are varied
    public void addSampleData(){
        for(int i = 0;i<10;i++){
            String type = "user";
            switch (i%3){
                case 0:
                    type = "user";
                    break;
                case 1:
                    type = "editor";
                    break;
                case 2:
                    type = "admin";
                    break;
            }
            users.add(new User("su"+i,type,"User "+i));
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
    // Removes user at index 0
    public void removeFirstUser(){
        User toRemove = users.get(0);
        users.remove(toRemove);
        System.out.println("User "+toRemove.getUsername()+" removed.");
    }
    // Removes user at last index of the ArrayList
    public void removeLastUser(){
        User toRemove = users.get(users.size()-1);
        users.remove(toRemove);
        System.out.println("User "+toRemove.getUsername()+" removed.");
    }
    
    // Removes user with a specified username
    public void removeUser(String username){
        // Iterator object used to iterate over the ArrayList
        Iterator<User> iterator = users.iterator();
        // Value of this variable will be the user which matches the specified username
        User toRemove=null;
        while(iterator.hasNext()){
            User currentUser=iterator.next();
            if(currentUser.getUsername().equals(username)){
                toRemove = currentUser; 
                // We pass the value out of the loop here to avoid concurrent modification
                
            }
        }
        /* 
        If a user with the specified username is found in the group then
        toRemove will have a value. If not it will still be null so the method
        will do nothing, and inform output this result.
        */
        if(toRemove != null){
            users.remove(toRemove);
            System.out.println("User "+toRemove.getUsername()+" removed.");
        }else{
            System.out.println("There is no user with this username in the group");
        }
        
    }
    // Getter for the users Iterator
    public Iterator<User> getUserIterator(){
        return users.iterator();
    }
        
}