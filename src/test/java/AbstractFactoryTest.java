import org.example.lab1.AbstractFabric.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AbstractFactoryTest {
    public final static int WEB = 1;
    public final static int MOB = 2;
    @Test
    public void testMob(){
        Configuration configuration =  Configuration.initMob();
        assertEquals(MOB, configuration.getPlatform());
    }
    @Test
    public void testWeb(){
        Configuration configuration = Configuration.initWeb();
        assertEquals(WEB, configuration.getPlatform());
    }
}
