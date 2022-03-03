
package s1q2.shapes;

import java.util.Scanner;


public class S1Q2Shapes {
    
    public double h,r,w,answer;
    String value,shape;
   
  
    
    public static void main(String[] args) {
        
        new S1Q2Shapes();
        
    }
    
    public S1Q2Shapes(){
        
        System.out.println("Your choses are between Circle, Rectangle and Cylinder");
        System.out.println("Please write what shape you would like to calculate:");
        Scanner input = new Scanner(System.in);
        shape = input.next();
        
        switch (shape) {
            case "Circle":
                 
                Circle();
                
                break;
                
            case "Rectangle":
                
                Rectangle();
                
                break;
                
            case "Cylinder":
                
                Cylinder();
                
                break;
        
            default:
                System.out.println("This shape has not been added yet");;
        }
   
    }
    
    public void Circle(){
        
    System.out.println("Please provide the raduis");
    Scanner input = new Scanner(System.in);
    value = input.next();
    r = Double.parseDouble(value);    
        
     answer = Math.PI*(r*r); 
     
        System.out.println(answer);

}
    
    public void Rectangle(){
        
        System.out.println("Please provide the height");
        Scanner height = new Scanner(System.in);
        value = height.next();
        h = Double.parseDouble(value);
        
        System.out.println("Please provide the width");
        Scanner width = new Scanner(System.in);
        value = height.next();
        w = Double.parseDouble(value);
        
        answer = h*w;
        
        System.out.println(answer);
        
    }
    
    public void Cylinder(){
        
        System.out.println("Please provide the raduis");
        Scanner raduis = new Scanner(System.in);
        value = raduis.next();
        r = Double.parseDouble(value);
        
        System.out.println("Please provide the height");
        Scanner height = new Scanner(System.in);
        value = height.next();
        h = Double.parseDouble(value);
 
        answer = Math.PI*(r*r)*h;
        
        System.out.println(answer);
        
    }
    
}


