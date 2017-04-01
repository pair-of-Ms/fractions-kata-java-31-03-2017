package fractions;

import java.math.BigInteger;

public class Fraction {
    private final long num;
    private final long den;

    public Fraction(long num, long den) {
        long gcd = gcd(num, den);
        this.num = num / gcd;
        this.den = den / gcd;
    }

    public Fraction sum(Fraction fraction) {
        long numerator = num * fraction.den + fraction.num * den;
        long denominator = den * fraction.den;
        return new Fraction(numerator, denominator);
    }

    public Fraction subtract(Fraction fraction) {
        return sum(new Fraction(-fraction.num, fraction.den));
    }

    private static long gcd(long a, long b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
    }

    @Override
    public String toString() {
        return "fractions.Fraction{" +
            "num=" + num +
            ", den=" + den +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction)) return false;

        Fraction fraction = (Fraction) o;

        if (num != fraction.num) return false;
        return den == fraction.den;

    }

    @Override
    public int hashCode() {
        int result = (int) (num ^ (num >>> 32));
        result = 31 * result + (int) (den ^ (den >>> 32));
        return result;
    }
}
