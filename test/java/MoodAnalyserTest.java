
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {


    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }

}