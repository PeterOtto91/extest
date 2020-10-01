import Exceptions.PersonShouldBeAdultException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestPerson {

    @Mock
    Address a1;
    //    Address a1 = new Address("Astraat", "2", "2800", "Mechelen", "Belgium"
    //            , "BE");
    @Mock
    Company c1;
    //    Company c1 = new Company("BBB", a1);
    //    Person p1 = new Person(1, "Wim", "Gerets", LocalDate.of(2010, 5, 20), c1, 3000);

    private Person person1;

    @Before
    public void setUp() {

        person1 = new Person(1, "Wim", "Gerets", LocalDate.of(2010, 5, 20), c1, 3000.0);

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

    @Test
    public void calculateNetSalaryOfBelgianPersonUsingMock() {

        // arrange
        when(c1.calculateTaxToPay()).thenReturn(51.0);
        //act

        double netSal = person1.calculateNetSalary();

        //assert
        assertThat(netSal, equalTo(4530.0));


    }

}
