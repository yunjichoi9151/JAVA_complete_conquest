package sec02_loopcontrolstatement.EX01_ForControlStatement;

public class ForControlStatement {
    public static void main(String[] args) {        
        // for 기본문법구조
        int a;
        for(a=0; a<3; a++) {
            System.out.print(a + " ");			
        } 
        System.out.println();
				
        for(int i=0; i<3; i++) {
            System.out.print(i + " ");			
        } 
        System.out.println();
        
        for(int i=0; i<100; i++) {
            System.out.print(i + " ");
        } 
        System.out.println();
        
        for(int i=10; i>0; i--) {
            System.out.print(i + " ");
        } 
        System.out.println();
        
        for(int i=0; i<10; i+=2) {
            System.out.print(i + " ");
        } 
        System.out.println();
        
        for(int i=0, j=0; i<10; i++, j++) {
            System.out.print(i + j + " ");
        } 
        System.out.println();				
				
        // for문의 특수한 형태 (무한루프)
        /*
        for(int i=0; ; i++) {
            System.out.print(i + " ");
        } //0 1 2 ...
        for(;;) {
            System.out.print("무한루프");
        } //무한루프 ...
        */
        System.out.println();
        
        // 무한루프 탈출 (break)
        for(int i=0; ;i++) {
            if(i>10) {
                break;
            }
            System.out.print(i+" ");
        }
        System.out.print("무한루프 탈출 ");		
    }	
}
