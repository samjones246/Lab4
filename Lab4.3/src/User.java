public class User{

    private String username, userType, name;
    // Constructor
    public User(String _username, String _userType, String _name){
        // username and name properties come straight from arguments
        username = _username;
        name = _name;
        /* Used a switch statement here so that userType can only be set as 
        one of the three valid types. Will default to 'user' if the given value
        is invalid.
        */
        switch(_userType){
            case "admin": 
                userType = _userType;
                break;
            case "editor":
                userType = _userType;
                break;
            default:
                userType = "user";
                break;
        }
    }
    // Some getter methods
    public String getUsername(){
        return username;
    }
    public String getUserType(){
        return userType;
    }
    public String getName(){
        return name;
    }
    // This method uses the switch statement from the constructor again
    public void setUserType(String _userType){
        switch(_userType){
            case "admin": 
                userType = _userType;
                break;
            case "editor":
                userType = _userType;
                break;
            default:
                userType = "user";
                break;
        }
    }
}