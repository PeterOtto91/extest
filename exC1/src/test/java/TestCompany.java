import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestCompany {

    @Test
    public void belgianTaxShouldBe51() {

        // arrange
        Address address1 = new Address("Astraat", "2", "2800", "Mechelen", "Belgium"
                , "BE");
        Company company1 = new Company("BCB", address1);

        //act
        double tax1 = company1.calculateTaxToPay();

        //assert
        assertThat(tax1, equalTo(51.0));
    }

}
