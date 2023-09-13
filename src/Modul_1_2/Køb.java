package Modul_1_2;
/*
Betragt følgede kodeudtræk:
double price = 599.95;
double budget = 1000.0;
boolean requiredReading = true;
boolean shouldBuy = price < budget && requiredReading;
Forklar sidste linje og fokuser på:
• I hvilken rækkefølge bliver hvad udregnet?
• Hvilke værdier (navngivne eller ej) udføres de enkelte operatorer på?
• Hvilke typer har disse værdier?
• Hvad repræsenterer variablen shouldBuy?
 */

public class Køb {
    public static void main(String[] args) {
        double price = 599.95;
        double budget = 1000.0;
        boolean requiredReading = true;
        boolean shouldBuy = price < budget && requiredReading;
        // < has precedence over && so shouldbuy is true bc price is lower than budget and requiredReading is set to true
        // Because price and budget is hardcoded it always evaluates to true, so far.
        // ShouldBuy repræsenterer det faktum at der er penge og bogen er required reading.



        /*
        Java Operator Precedence
Operators	Precedence
postfix increment and decrement	++ --
prefix increment and decrement, and unary	++ -- + - ~ !
multiplicative	* / %
additive	+ -
shift	<< >> >>>
relational	< > <= >= instanceof
equality	== !=
bitwise AND	&
bitwise exclusive OR	^
bitwise inclusive OR	|
logical AND	&&
logical OR	||
ternary	? :
assignment	= += -= *= /= %=

				&= ^= |= <<= >>= >>>=
         */

    }
}
