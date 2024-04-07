import org.example.lab1.AbstractFabric.Configuration;
import org.junit.jupiter.api.Test;
import static org.example.lab1.FactoryMethod.Configuration.MOB;
import static org.example.lab1.FactoryMethod.Configuration.WEB;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FabricMethodTest {
    @Test
    public void testMob(){
        Configuration configuration = Configuration.initMob();
        assertEquals(MOB, configuration.getPlatform());
    }
}
