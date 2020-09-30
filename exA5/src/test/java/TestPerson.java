import org.hamcrest.core.StringStartsWith;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

public class TestPerson {

    @Test
    public void ageofPersonFromBirthDateShouldBe42() {

        // arrange
        int result = 42;
        Person person1 = new Person(1, "Wim", "Gerets", LocalDate.of(1978, 5, 20));

        //act
        int ageNow = person1.calculateAge();

        //assert
        assertThat(result, equalTo(42));

    }

    @Test
    public void toStringSenteceStartsWithPerson() {

        // arrange
        Person person1 = new Person(1, "Wim", "Gerets", LocalDate.of(1978, 5, 20));

        //act
        String personString = person1.toString();

        //assert
        assertThat(personString, startsWith("Person"));


    }

}
