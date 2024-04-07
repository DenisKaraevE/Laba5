import org.example.lab2.Adapter.RoundHole;
import org.example.lab2.Adapter.SquareStick;
import org.example.lab2.Adapter.SquareStickAdapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AdapterTest {
    @Test
    public void Test1(){
        RoundHole hole = new RoundHole(5); // radius = 5
        SquareStick stick = new SquareStick(5); // width = 5 => diagonal = 7.07 => radius = 3.535
        SquareStickAdapter adapter = new SquareStickAdapter(stick);
        boolean result = hole.fits(adapter);
        assertTrue(result);
    }
    @Test
    public void Test2(){
        RoundHole hole = new RoundHole(5); // radius = 5
        SquareStick stick = new SquareStick(10); // width = 10 => diagonal = 14.14 => radius = 7.07
        SquareStickAdapter adapter = new SquareStickAdapter(stick);
        boolean result = hole.fits(adapter);
        assertFalse(result);
    }
}
