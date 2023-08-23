package icdetector;

public class userBirthdate {
    private String userIC;
    
    public userBirthdate(String userIC){
        this.userIC = userIC;
    }
    
    //Define setter and getter
    public String getUserIc(){
        return this.userIC;
    }
    public void setUserIc(String userIc){
        this.userIC = userIc;
    }
    
    //Create method to show user birthdate
    public String displayBirthDate(){
        String day = getUserIc().substring(4, 6);
        String month = getUserIc().substring(2, 4);
        String year = getUserIc().substring(0, 2);
        
        //Display user birthdate
        return day+"/"+month+"/"+year;
    }
    
}
