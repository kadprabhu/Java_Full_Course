public class swaptovariable {
    public static void main(String[] args){
        String X = "water";
        String Y = "kool-Aid";
        String temp = ""; // Initialize temp
        
        temp = X;
        X = Y;
        Y = temp;
        
        System.out.println("x: " + X);
        System.out.println("Y: " + Y);
        
    }
    
}
