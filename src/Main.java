import java.util.Map;

public class Main {



    public static void main(String[] args) throws InterruptedException {


        SoundConverter sound = new SoundConverter();


        InputReader reader = new InputReader();
        String text = reader.readInput();

        MorseCodeMap morse2 = new MorseCodeMap();
        Map<Character, String> morse = morse2.buildMap();



        for (int i =0; i < text.length(); i++) {
            String s = morse.get(text.charAt(i));
            char[] chars = s.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                Thread.sleep(350);
                if(chars[j] == '.') {
                    sound.playSoundDot();
                }
                else {sound.playSoundDash();}
                System.out.print(chars[j]);
            }


        }



    }
}
