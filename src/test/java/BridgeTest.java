import org.example.lab2.Bridge.AdvancedRemote;
import org.example.lab2.Bridge.BasicRemote;
import org.example.lab2.Bridge.Radio;
import org.example.lab2.Bridge.TV;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BridgeTest {
    @Test
    public void testRadio(){
        Radio radio = new Radio();
        BasicRemote basicRemote = new BasicRemote(radio);
        basicRemote.power();
        assertEquals (radio.getChannel(), 1);
        assertEquals (radio.getVolume(), 30);
        assertEquals (radio.isEnabled(), true);
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.mute();
        assertEquals (radio.getChannel(), 1);
        assertEquals (radio.getVolume(), 0);
        assertEquals (radio.isEnabled(), false);
    }
}
