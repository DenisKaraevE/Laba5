import org.example.lab1.Singleton.Connection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SingletonTest {
    @Test
public void returnInstance(){
Connection connection1 = connection1.getInstance();
        Connection connection2 = connection1.getInstance();
assertEquals(connection1, connection2);
    }
}
