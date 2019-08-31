import java.util.HashMap;
import java.util.Map;

public class MorseCodeMap {



    public Map<Character, String> buildMap() {
        Map<Character, String> morse = new HashMap<>();

        morse.put('a', "._");
        morse.put('b', "_...");
        morse.put('c', "_._.");
        morse.put('d', "_..");
        morse.put('e', ".");
        morse.put('f', ".._.");
        morse.put('g', "__.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".___");
        morse.put('k', "_._");
        morse.put('l', "._..");
        morse.put('m', "__");
        morse.put('n', "_.");
        morse.put('o', "___");
        morse.put('p', ".__.");
        morse.put('q', "__._");
        morse.put('r', "._.");
        morse.put('s', "...");
        morse.put('t', "_");
        morse.put('u', ".._");
        morse.put('v', "..._");
        morse.put('w', ".__");
        morse.put('x', "_.._");
        morse.put('y', "_.__");
        morse.put('z', "__..");
        morse.put(' ', "/");
        morse.put('1', ".____");
        morse.put('2', "..__");
        morse.put('3', "...__");
        morse.put('4', "..._");
        morse.put('5', ".....");
        morse.put('6', "_....");
        morse.put('7', "__...");
        morse.put('8', "___..");
        morse.put('9', "____.");
        morse.put('0', "_____");
        morse.put('.', "._._._");
        morse.put(',', "__..__");
        morse.put('?', "..__..");
        morse.put('!', "_._.__");
        morse.put('"', "._.._.");
        morse.put('(', "_.__.");
        morse.put(')', "_.__._");
        morse.put('&', "._...");
        morse.put(':', "___...");
        morse.put(';', "_._._.");
        morse.put('/', "_.._.");
        morse.put('=', "_..._");
        morse.put('+', "._._.");
        morse.put('-', "_...._");
        morse.put('$', "..._.._");
        morse.put('@', ".__._.");
        return morse;
    }

}
