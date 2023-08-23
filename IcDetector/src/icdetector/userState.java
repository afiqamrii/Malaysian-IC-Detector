
package icdetector;

public class userState {
    private String userIC;
    
    public userState(String userIC){
        this.userIC = userIC;
    }
    
    //Define setter and getter
    public String getUserIc(){
        return this.userIC;
    }
    public void setUserIc(String userIc){
        this.userIC = userIc;
    }
    
    //Create method to detect what state is user born
    public void stateBorn(){
        //Extract user ic to get code of every state
        String stateNum = userIC.substring(6, 8);
        
        //User switch case
        switch (stateNum) {
            case "01":
            case "21":    
            case "22":
            case "23":
            case "24":
                System.out.println("Johor");
                break;
            case "02":
            case "25":
            case "26":
            case "27":
                System.out.println("Kedah");
                break;
            case "03":
            case "28":
            case "29":
                System.out.println("Kelantan");
                break;
            case "04":    
            case "30":
                System.out.println("Melaka");
                break;
            case "05":
            case "31":
            case "59":
                System.out.println("Negeri Sembilan");
                break;
            case "06":
            case "32":
            case "33":
                System.out.println("Pahang");
                break;
            case "07":
            case "34":
            case "35":
                System.out.println("Pulau Pinang");
                break;
            case "08":    
            case "36":
            case "37":
            case "38":
            case "39":
                System.out.println("Perak");
                break;
            case "09":
            case "40":
                System.out.println("Perlis");
                break;
            case "10":
            case "41":
            case "42":
            case "43":
            case "44":
                System.out.println("Selangor");
                break;
            case "11":
            case "45":
            case "46":
                System.out.println("Terengganu");
                break;
            case "12":
            case "47":
            case "48":
            case "49":
                System.out.println("Sabah");
                break;
            case "13":
            case "50":
            case "51":
            case "52":
            case "53":
                System.out.println("Sarawak");
                break;
            case "14":
            case "54":
            case "55":
            case "56":
            case "57":
                System.out.println("Wilayah Persekutuan (Kuala Lumpur)");
                break;
            case "15":
            case "58":
                System.out.println("Wilayah Persekutuan (Labuan)");
                break;
            case "16":
                System.out.println("Wilayah Persekutuan (Putrajaya)");
                break;
            case "82":
                System.out.println("Negeri Tidak Diketahui");
                break;
            default:
                System.out.println("Invalid Ic , Re-enter again !");
        }
    }
    
}
