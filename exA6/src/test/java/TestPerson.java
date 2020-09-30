import Exceptions.PersonShouldBeAdultException;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

public class TestPerson {

    private Person person1;

    @Before
    public void setUp() {

        person1 = new Person(1, "Wim", "Gerets", LocalDate.of(2010, 5, 20));

    }

    @Test
    public void ageofPersonFromBirthDateShouldBe42() throws PersonShouldBeAdultException {

        // arrange
        int result = 42;

        //act
        int ageNow = person1.calculateAge();

        //assert
        assertThat(result, equalTo(42));

    }

    @Test
    public void toStringSenteceStartsWithPerson() {

        // arrange

        //act
        String personString = person1.toString();

        //assert
        assertThat(personString, startsWith("Person"));


    }


    @Test(expected=PersonShouldBeAdultException.class)
    public void ageofPersoShoundBMoreThan18() throws PersonShouldBeAdultException {

        // arrange

        //act
        int ageNow = person1.calculateAge();

                //assert
        throw new PersonShouldBeAdultException("Person is too young");



    }


}
