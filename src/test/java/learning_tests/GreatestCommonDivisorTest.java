package learning_tests;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreatestCommonDivisorTest {
    static long gcd(long a, long b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
    }

    @Test
    public void learning_how_gcd_works() {
        assertThat(gcd(4, 1), is(1L));
        assertThat(gcd(9, 3), is(3L));
        assertThat(gcd(-9, 3), is(3L));
        assertThat(gcd(9, -3), is(3L));
        assertThat(gcd(0, 9), is(9L));
        assertThat(gcd(9, 0), is(9L));
    }
}
