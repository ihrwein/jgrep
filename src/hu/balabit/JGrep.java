package hu.balabit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: jgrep pattern");
            System.exit(1);
        }

        String patternString = args[0];
        Pattern pattern = Pattern.compile(patternString);


        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input;

            while((input = br.readLine()) != null) {
                Matcher m = pattern.matcher(input);

                if (m.matches())
                    System.out.println(input);
            }

        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
