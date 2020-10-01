import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    @Test
    public void testAddressIsAppended() throws IOException {
        Address address1 = new Address("Astraat", "2", "2800", "Mechelen", "Belgium"
                , "BE");
        address1.writeAddressToFile();

    }

    @Test
    public void appendingAddressToFileShouldReturnExtraLineInFile() throws IOException {

        Address address1 = new Address("Astraat", "2", "2800", "Mechelen", "Belgium"
                , "BE");

        Path path = Paths.get("Addresses.txt");
        int countBeforeWrite=0;
        if (Files.exists(path)) {
            path.toFile().setWritable(true);
            countBeforeWrite = Files.readAllLines(path).size();
        }
        address1.writeAddressToFile();
        int countAfterWrite = Files.readAllLines(path).size();
        int linesAdded=countAfterWrite - countBeforeWrite;
        assertEquals(1,linesAdded);
    }

    @Test(expected= IOException.class)
    public void appendingAddressToExistingReadOnlyFileShouldThrowIOException() throws IOException {

        Address address1 = new Address("Astraat", "2", "2800", "Mechelen", "Belgium"
                , "BE");

        Path path = Paths.get("Addresses.txt");
        File file = path.toFile();
        if (!Files.exists(path)) {
            file.createNewFile();
        }
        file.setReadOnly();
        address1.writeAddressToFile();
    }

    @Test
    @Ignore
    public void noIdeaWhatWeAreGoingToTest() {

        // to do
    }

}
