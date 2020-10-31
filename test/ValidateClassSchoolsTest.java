import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/30/2020
 * Time: 7:17 AM
 */
class ValidateClassSchoolsTest {

    private ValidateClassSchools validateClassSchools = new ValidateClassSchools();

    @Test
    @DisplayName("C0318G")
    void testCaseTrue() {
        String regex = "C0318G";
        boolean actual = validateClassSchools.validate(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName("M0318G")
    void testCaseFalse1() {
        String regex = "M0318G";
        boolean actual = validateClassSchools.validate(regex);
        assertFalse(actual);
    }

    @Test
    @DisplayName("P0323A")
    void testCaseFalse2() {
        String regex = "P0323A";
        boolean actual = validateClassSchools.validate(regex);
        assertFalse(actual);
    }
}