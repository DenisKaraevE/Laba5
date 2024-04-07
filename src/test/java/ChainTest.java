import org.example.lab3.ChainHandler.ChainService;
import org.example.lab3.ChainHandler.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainTest {
    @Test
    public void test() {
        String res = "method:name_method\npath:some_path\nsession:number_session";
        ChainService service = new ChainService();
        Request request = service.exec(res);
        assertEquals(request.getMethod(), "name_method");
        assertEquals(request.getPath(), "some_path");
        assertEquals(request.getSession(), "number_session");
    }
}
