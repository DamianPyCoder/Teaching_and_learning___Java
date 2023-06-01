import java.util.*;

public class intercambiaNumeros {
    public static void main(String[] args) throws Exception {
        
        int num1=1;
        int num2=2;
        
        num1=num1+num2;	
        num2=num1-num2;	
        num1=num1-num2;	


        System.out.println("El número uno ahora es:"+num1);
        System.out.println("El número dos ahora es:"+num2);        
    }
}