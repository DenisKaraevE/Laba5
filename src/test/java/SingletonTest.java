import org.example.lab1.Singleton.Connection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {
    @Test
    public void returnInstance() {
        Connection connection1 = Connection.getInstance()
        Connection connection2 = Connection.getInstance();
        assertEquals(connection1, connection2);
    }
}
