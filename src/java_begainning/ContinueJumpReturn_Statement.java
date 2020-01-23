
package java_begainning;


public class ContinueJumpReturn_Statement {
    
    public static void main(String[] args) {
        
        int i;
        for(i=1;i<10;i=i+3){
            if(i==10){
                continue;  
            }
            System.out.println(+i);
        }
        for(i=1;i<100;i=i+2){
            if(i==10){
                break;  
            }
            System.out.println(+i);
        }
        System.out.println("Final Output");
        for(i=1;i<100;i=i+3){
            if(i==10){
                continue;  
            }
            if(i>13){
                break;
            }
            System.out.println(+i);
        }
        
        
       
    }
    
}
