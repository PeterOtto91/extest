
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    @Test
    public void ageofPersonFromBirthDateShouldBe42() {

        // arrange
        int result = 42;
        Person person1 = new Person(1, "Wim", "Gerets", LocalDate.of(1978, 5, 20));

        //act
        int ageNow = person1.calculateAge();

        //assert
        assertEquals(result, ageNow);

    }

}
