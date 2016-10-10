import org.junit.Test;
import static org.junit.Assert.*;

public class HamAndEggsTests {
    
    @Test
    public void hamAndEggsReturnsTrue() {
        assertTrue(hamAndEggs(9));
    }

    private static boolean hamAndEggs(int eggs) {
        ws.hamandeggs.HamAndEggsService service = new ws.hamandeggs.HamAndEggsService();
        ws.hamandeggs.HamAndEggsPortType port = service.getHamAndEggsPort();
        return port.hamAndEggs(eggs);
    }
}
