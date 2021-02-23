
public class MoodAnalyser {

    public String message;

    public String analyseMood(String message){
        if (message.contains("Sad")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}