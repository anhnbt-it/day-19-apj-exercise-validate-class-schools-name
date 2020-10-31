import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/30/2020
 * Time: 7:12 AM
 */
public class ValidateClassSchools {


    public boolean validate(String regex) {
        String regexClass = "^[CAP][0-9]{4,}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regexClass);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
