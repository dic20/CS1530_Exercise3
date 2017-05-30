import org.junit.Test;
import static org.junit.Assert.*;

public class exercise3Tests {
    @Test
    public void tri0() {
        assertEquals(exercise3.Tri(0), 0);
    }

    @Test
    public void tri6() {
        assertEquals(exercise3.Tri(6), 21);
    }

    @Test
    public void tri8() {
        assertEquals(exercise3.Tri(8), 36);
    }

    @Test
    public void lazy0() {
        assertEquals(exercise3.lazy(0), 1);
    }

    @Test
    public void lazy6() {
        assertEquals(exercise3.lazy(6), 22);
    }

    @Test
    public void lazy8() {
        assertEquals(exercise3.lazy(8), 37);
    }
}