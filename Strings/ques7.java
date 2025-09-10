public class ques7 {

       public static void generateException() {
        System.out.println("Generating NullPointerException...");
        String text = null; 

       
        int length = text.length(); 
        System.out.println("Length of text: " + length);
    }

   
    public static void handleException() {
        System.out.println("\nHandling NullPointerException with try-catch...");
        String text = null;

        try {
            int length = text.length(); n
            System.out.println("Length of text: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
                generateException();  
               handleException();
    }
}
