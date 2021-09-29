package company;

import com.company.NewMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewMapTest {

    @Test
    public void shouldNewMap() {
        Map<String, Integer> subject = new HashMap<>();
        subject.put("Italy", 20);
        subject.put("France", 25);
        subject.put("Ukraine", 30);
        subject.put("Germany", 40);
        subject.put("Argentina", 15);
        Map<Integer, String> expected = new HashMap<>();
        expected.put(20, "Italy");
        expected.put(25, "France");
        expected.put(30, "Ukraine");
        expected.put(40, "Germany");
        expected.put(15, "Argentina");
        Map<Integer, String> actual = NewMap.swap(subject);
        assertEquals(expected, actual);
    }
}
