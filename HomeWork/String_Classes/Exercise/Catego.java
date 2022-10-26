package String_Classes.Exercise;

public class Catego {
    public static void main(String[] args) {
               /*
    Task 1 : Assume that you searched a baby toy in Etsy.When you open related category your url is :

		"https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
			    		       (main category)

		According to this result print out main category name

			Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049

			Output:
				Main Category name is  toys and games

			Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
						 				     (main category)

			Output:
				Main Category name is  toys and entertainment
     */

        String url =  	"https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";
        int first = url.indexOf("c/");
        int second = url.indexOf("?") ;
        String category= url.substring(first+2,second).replace("-"," ");

        if (url.contains("/")){
           category= category.substring(0,category.indexOf("/")) ;
        }



        System.out.println(category);
        


    }
}
