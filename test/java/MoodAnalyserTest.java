import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {


    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("this is a Sad Message");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("this is a Happy Message");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenNullMoodShouldReturnException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenEmptyMoodShouldReturnException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.EmptyType, e.type);
        }
    }
}