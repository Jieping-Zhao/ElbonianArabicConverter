//Ryan and Jieping


package converter;

import converter.exceptions.MalformedNumberException;
import converter.exceptions.ValueOutOfBoundsException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class implements a converter that takes a string that represents a number in either the
 * Elbonian or Arabic numeral form. This class has methods that will return a value in the chosen form.
 *
 * @version 3/18/17
 */
public class ElbonianArabicConverter {

    // A string that holds the number (Elbonian or Arabic) you would like to convert
    private final String number;

    public String getNumber() {
        return this.number;
    }


    /**
     * Constructor for the ElbonianArabic class that takes a string. The string should contain a valid
     * Elbonian or Arabic numeral. The String can have leading or trailing spaces. But there should be no
     * spaces within the actual number (ie. "9 9" is not ok, but " 99 " is ok). If the String is an Arabic
     * number it should be checked to make sure it is within the Elbonian number systems bounds. If the
     * number is Elbonian, it must be a valid Elbonian representation of a number.
     *
     * @param number A string that represents either a Elbonian or Arabic number.
     * @throws MalformedNumberException Thrown if the value is an Elbonian number that does not conform
     * to the rules of the Elbonian number system. Leading and trailing spaces should not throw an error.
     * @throws ValueOutOfBoundsException Thrown if the value is an Arabic number that cannot be represented
     * in the Elbonian number system.
     */
    public ElbonianArabicConverter(String number) throws MalformedNumberException, ValueOutOfBoundsException {
        // TODO check to see if the number is valid, then set it equal to the string
        this.number = number;
    }

    public boolean isNotFormed(String number) {
        boolean arabic = false;
        boolean elbonian = false;
        String[] s = number.split(" ", -2);
        ArrayList<Character> validChar = new ArrayList<>();
        validChar.add('D');
        validChar.add('M');
        validChar.add('C');
        validChar.add('L');
        validChar.add('X');
        validChar.add('V');
        validChar.add('I');
        validChar.add('d');
        validChar.add('m');
        validChar.add('c');
        validChar.add('l');
        validChar.add('x');
        validChar.add('v');
        validChar.add('i');

        ArrayList<Character> validNum = new ArrayList<>();
        validNum.add('0');
        validNum.add('1');
        validNum.add('2');
        validNum.add('3');
        validNum.add('4');
        validNum.add('5');
        validNum.add('6');
        validNum.add('7');
        validNum.add('8');
        validNum.add('9');

        if (s.length>1) {
            return false;
        } else {
            String ss = s[0];
            ss.trim();
            for (int i = 0; i < ss.length(); i++) {
                if (!validChar.contains(ss.charAt(i)) && !validNum.contains(ss.charAt(i))) return false;
                if (validChar.contains(ss.charAt(i))) elbonian = true;
                if (validNum.contains(ss.charAt(i))) arabic = true;
            }
            if (elbonian=arabic) return false;
        }

        return true;
    }

    public boolean ElbonianOrArabic(String number) {
        return true;
    }



    public boolean isElbonian(String number) {
        int counter = 0;
        int counterDLV = 0;

        LinkedList<Character> word = new LinkedList<Character>();

        for (int i = 0; i < number.length(); i++) {
            if (Character.isLowerCase(number.charAt(i))) {
                if (i == (number.length()-1)) {
                    return false;
                }
                else {
                    if (number.charAt(i)!=Character.toLowerCase(number.charAt(i+1))) return false;
                    if (i<number.length()-2) {
                        if (number.charAt(i)==Character.toLowerCase(number.charAt(i+2))) return false;
                        if (number.charAt(i)=='d') {
                            if (number.charAt(i+2)=='C') return false;
                        }
                        if (number.charAt(i)=='l') {
                            if (number.charAt(i+2)=='X') return false;
                        }
                        if (number.charAt(i)=='v') {
                            if (number.charAt(i+2)=='I') return false;
                        }
                        if (number.charAt(i)=='m') {
                            if (number.charAt(i+2)=='D'||number.charAt(i+2)=='C') return false;
                        }
                        if (number.charAt(i)=='c') {
                            if (number.charAt(i+2)=='L'||number.charAt(i+2)=='X') return false;
                        }
                        if (number.charAt(i)=='x') {
                            if (number.charAt(i+2)=='V'||number.charAt(i+2)=='I') return false;
                        }
                    }

                }

                i++;
            }
            else {
                if (!word.contains(number.charAt(i))) {
                    word.addLast(number.charAt(i));
                    counter = 1;
                    if (word.getLast() == 'M') {
                        if (word.contains('D') || word.contains('C') || word.contains('L') ||
                                word.contains('X') || word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'D') {
                        if (word.contains('C') || word.contains('L') ||
                                word.contains('X') || word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'C') {
                        if (word.contains('L') ||
                                word.contains('X') || word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'L') {
                        if (word.contains('X') || word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'X') {
                        if (word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'V') {
                        if (word.contains('I')) {
                            return false;
                        }
                    }
                } else {
                    if (number.charAt(i)== 'D'|| number.charAt(i)== 'V' || number.charAt(i)== 'L') {
                        return false;
                    }
                    if (word.getLast() == 'M') {
                        if (word.contains('D') || word.contains('C') || word.contains('L') ||
                                word.contains('X') || word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'D') {
                        if (word.contains('C') || word.contains('L') ||
                                word.contains('X') || word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'C') {
                        if (word.contains('L') ||
                                word.contains('X') || word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'L') {
                        if (word.contains('X') || word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'X') {
                        if (word.contains('V') || word.contains('I')) {
                            return false;
                        }
                    }
                    if (word.getLast() == 'V') {
                        if (word.contains('I')) {
                            return false;
                        }
                    }

                    //word.addLast(number.charAt(i));
                    if (!(number.charAt(i) == word.getLast())) return false;
                    counter++;
                    if (counter > 3) return false;

                }
            }
        }


        return true;
    }
    /**
     * Converts the number to an Arabic numeral or returns the current value as an int if it is already
     * in the Arabic form.
     *
     * @return An arabic value
     */
    public int toArabic() {
        // TODO Fill in the method's body
        return 1;
    }

    /**
     * Converts the number to an Elbonian numeral or returns the current value if it is already in the Elbonian form.
     *
     * @return An Elbonian value
     */
    public String toElbonian() {
        // TODO Fill in the method's body
        return "I";
    }

}
