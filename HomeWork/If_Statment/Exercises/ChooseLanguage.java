package If_Statment.Exercises;

import day54_abstraction.language.Spanish;
import day54_abstraction.language.Turkish;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*
        ask the user to enter a option based on the language they wanted to use.
1 - English
2 - Spanish
3 - Turkish
4 - Russian
5 - French
based on the option they picked print a message:
1 : "hello, thank for your call"
2 : "hola, gracias para llamar"
3 : "merhaba, aradiginiz icin tesekkurler"
4 : "privet, spasibo za vash zvonok"
5 : "Merci ,pour votre appel"
any other option: "We will use English by default"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number to choose language ?");

        int option = input.nextInt();
        String massage ;

        if (option==1){
            massage= "hello, thank for your call";
        } else if (option==2) {
            massage= "hola, gracias para llamar";

        }   else if (option==2) {
            massage= "merhaba, aradiginiz icin tesekkurler";

        } else if (option==2) {
            massage= "privet, spasibo za vash zvonok";

        } else if (option==2) {
            massage= "Merci ,pour votre appel";

        }else {
            massage= "Error";
        }
        System.out.println(massage);

    }
}
