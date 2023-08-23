package icdetector;

public class userGender {
    private String userIC;
    
    public userGender(String userIC){
        this.userIC = userIC;
    }
    
    //Define setter and getter
    public String getUserIc(){
        return this.userIC;
    }
    public void setUserIc(String userIc){
        this.userIC = userIc;
    }
    
    //Create method to show user gender
    public String genderSpecify(){
        
        //Extract last digit number from ic to specify the gender
        String extract = userIC.substring(11);
        
        //Convert to int
        int lastDigit = Integer.parseInt(extract);
        
        if(lastDigit % 2 == 0){
            return "Female";
        }
        else{
            return "Male";
        }
    }
}
