package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.HashSet;

public class SetCollection {
    private Set<Integer> numbers;


    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

    }
    // Test Case 구현
    @Test
    void TestCase(){
        assert numbers.size()
    }

}
