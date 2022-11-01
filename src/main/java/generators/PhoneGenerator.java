package generators;

import person.models.Phone;
import utils.MyMath;

import java.util.concurrent.ThreadLocalRandom;

public interface PhoneGenerator {
    int RANDOM = ThreadLocalRandom.current().nextInt(1000);
    static Phone generate(int code) {
        String codeString = Integer.toString(code);
        String codeStringReversed = new StringBuilder(codeString).reverse().toString();
        if (!codeString.equals(codeStringReversed)) {
            final String number = "+79"
                    + String.format("%02d", MyMath.getDigitsSum(code))
                    + String.format("%03d", RANDOM)
                    + String.format("%04d", code);
            return new Phone(number);
        } else {
            return new Phone("N/A");
        }
    }
}
