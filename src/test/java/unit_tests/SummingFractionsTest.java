package unit_tests;

import fractions.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SummingFractionsTest {
    @Test
    public void adding_zero_to_any_fraction() {
        Fraction fraction = new Fraction(1,2);
        Fraction result = fraction.sum(new Fraction(0,1));
        assertThat(new Fraction(1,2), is(result));
    }

    @Test
    public void adding_two_fractions_with_same_denominator() {
        Fraction fraction = new Fraction(1,3);
        Fraction result = fraction.sum(fraction);
        assertThat(new Fraction(2,3), is(result));
    }

    @Test
    public void adding_two_fractions_with_different_denominator() {
        Fraction fraction = new Fraction(1,3);
        Fraction result = fraction.sum(new Fraction(1,2));
        assertThat(new Fraction(5,6), is(result));
    }

    @Test
    public void fractions_are_simplified() {
        assertThat(new Fraction(2,4), is(new Fraction(1,2)));
    }

    @Test
    public void subtracts_fractions() {
        Fraction fraction = new Fraction(1,3);
        Fraction result = fraction.subtract(fraction);
        assertThat(new Fraction(0,1), is(result));
    }
}
