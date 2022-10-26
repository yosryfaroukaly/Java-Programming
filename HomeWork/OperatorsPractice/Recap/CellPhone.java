package OperatorsPractice.Recap;

public class CellPhone {
    public static void main(String[] args) {
        String brandName = "Apple" , model ="IPhone";
        char color = 'B', sim ='A';
        int modelName= 13, storage = 512 ;
        double price = 999.99;
        boolean haCamera= true;

       // System.out.println("I have an "+ model+ " "+"from"+" "+brandName +modelName+"It came in the color "+ color+ "and it has"+" "+storage + "GB" +"For the sim type"+" "+sim+ "With a camera? "+ haCamera + "the total price was $"+ price);

        String fullMassage = "I have an "+ model+ " "+"from"+" "+brandName +modelName+"It came in the color "+ color+ "and it has"+" "+storage + "GB" +"For the sim type"+" "+sim+ "With a camera? "+ haCamera + "the total price was $"+ price;
        System.out.println(fullMassage);

    }
}
