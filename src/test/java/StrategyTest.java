import org.example.lab3.Strategy.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {
    @Test
    public void returnCorrectString() {
        List<String> strings = new ArrayList<>();
        strings.add("корова");
        strings.add("собака");
        strings.add("мышь");
        strings.add("кошка");
        Strategy strategy = new CommaSeparatedStrategy();
        StrategyService service = new StrategyServiceImpl(strategy);
        assertEquals("корова,собака,мышь,кошка", service.exec(strings));
        strategy = new SemicolonSeparatedStrategy();
        service.setStrategy(strategy);
        assertEquals("корова,собака,мышь,кошка", service.exec(strings));
    }
}
