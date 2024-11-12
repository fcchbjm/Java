package whpu.E.E2.E2;

public class Rational {
    private long numerator;
    private long denominatorl;

    Rational() {
        numerator = 0;
        denominatorl = 1;
    }

    Rational(long num) {
        numerator = num;
        denominatorl = 1;
    }

    Rational(long numerator, long denominatorl) {
        long cd = gcd(numerator, denominatorl);
        if(cd != 0) {
            this.numerator = numerator / cd;
            this.denominatorl = denominatorl / cd;
        }
        else{
            this.numerator = numerator;
            this.denominatorl = denominatorl;
        }
    }

    private long gcd(long n, long d) {
        long c = n % d;
        while (c != 0) {
            c = n % d;
            n = d;
            d = c;
        }
        return d;
    }

    public Rational add(Rational secondRational){
        return new Rational(
                this.numerator * secondRational.denominatorl +
                        secondRational.numerator * this.denominatorl,
                this.denominatorl * secondRational.denominatorl);
    }
    public Rational subtract(Rational secondRational){
        return new Rational(
                this.numerator * secondRational.denominatorl -
                        secondRational.numerator * this.denominatorl,
                this.denominatorl * secondRational.denominatorl);
    }
    public Rational multiply(Rational secondRational){
        return new Rational(
                this.numerator * secondRational.numerator,
                this.denominatorl * secondRational.denominatorl);
    }
    public Rational divide(Rational secondRational){
        return new Rational(
                this.numerator * secondRational.denominatorl,
                this.denominatorl * secondRational.numerator);
    }
    @Override
    public String toString() {
        if(denominatorl == 1)
            return Long.toString(numerator);
        else
            return numerator+"/"+denominatorl;
    }
}
