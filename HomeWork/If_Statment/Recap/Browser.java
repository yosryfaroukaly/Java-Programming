package If_Statment.Recap;

public class Browser {
    public static void main(String[] args) {
        String browser = "Chrome" , url = "WWW.GOOGLE>COM";

        switch (browser){
            case "Chrome":
                System.out.println("Opining "+ url + " in the Chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
                System.out.println("Opining "+ url + " in the Safari browser");
                break;
            case "FairFox":
                System.out.println("Opining "+ url + " in the FairFox browser");
                break;
            default:
                System.out.println(browser + " not allowed");
        }

    }
}
