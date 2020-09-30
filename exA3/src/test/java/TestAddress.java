
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAddress {

    @Test
    public void belgianZipCodeShouldBeNumeric() {

        // arrange
        Address address1 = new Address("Astraat", "2", "2800", "Mechelen", "Belgium"
, "BE");
        boolean isNumeric = address1.getZipCode().chars().allMatch(Character::isDigit);


        //assert
        assertTrue(isNumeric);
    }
}
