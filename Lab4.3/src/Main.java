import java.util.Iterator;
public class Main {

    public static void main(String[] args) {
        // Create instances of UserGroup
        UserGroup group1 = new UserGroup();
        UserGroup administrators = new UserGroup();
        
        // Test adding data to group1 and reading it
        group1.addSampleData();
        System.out.println("Sample data added to Group 1.");
        System.out.println("Printing usernames...");
        group1.printUsernames();
        
        // Test all three methods for removing users from a group
        System.out.println("Removing first user...");
        group1.removeFirstUser();
        System.out.println("Removing last user...");
        group1.removeLastUser();
        System.out.println("Removing user su4...");
        group1.removeUser("su4");
        
        // Uses the Iterator of the group1 users ArrayList to add all users with
        // userType 'admin' to the administrators group 
        System.out.println("Populating administrators group...");
        Iterator<User> iterator = group1.getUserIterator();
        while(iterator.hasNext()){
            User currentUser = iterator.next();
            if("admin".equals(currentUser.getUserType())){
                administrators.users.add(currentUser);
            }
        }
        // Outputs the contents of administrator
        System.out.println("Printing usernames...");
        administrators.printUsernames();
        
        // Demonstration of inconsistency caused by setUserType method
        System.out.println("Altering userType of last admin...");
        administrators.users.get(administrators.users.size()-1).setUserType("user");
        System.out.println("Group 1:");
        group1.printUsernames();
        System.out.println("Administrators:");
        administrators.printUsernames();
        /* 
        A user in the admin group is no longer an admin, but is still a 
        member of the group.
        Possible solution: Add a String[] property to UserGroup to specify 
        allowed userTypes. Prevent users who are not of any of one of these 
        types from being added to the group, by writing a method to handle adding
        instead of referencing the users ArrayList directly. Also add a method 
        to check members of the group and remove any which are the wrong type.
        */
    }
}
