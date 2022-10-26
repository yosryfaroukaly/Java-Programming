package If_Statment.Exercises;

public class N7 {
    public static void main(String[] args) {
        /*
        create a char variable with a letter (can only do this one hardcoded, no
Scanner method for char)
find out if the letter is an uppercase letter or lowercase letter. Print
the type of letter it is
ex:
'b'
lowercase
ex:
'U'
uppercase
         */
        char litter = 'A';
        if (litter>='A'&& litter<='Z') {
            System.out.println(litter + " is uppercase");
        } else if (litter>='a'&& litter<='z') {
            System.out.println(litter+ " is lowercase");

        }

//    } else {
//        System.out.println(litter+ " is lowercase");

//        }
    }
}
