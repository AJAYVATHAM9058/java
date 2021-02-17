public class FunctionApp
{
	public static void main(String[] args) {
	    sayHello();
	    blackboarpunishment(6);
	    System.out.println("The Price with 10% off:"+ getTenPercentOfDiscount(20000));
	   System.out.println("The Price with 50% off:"+ getDiscountPrice(20000,50));
	   System.out.println("The Price with 40% off:"+ getDiscountPrice(20000.75,60));
		
	}
	static void  sayHello(){
	    System.out.println("Hello!!");
	}
	static void blackboarpunishment(int repeatNumber){
	    for(int i=1;i<=repeatNumber;i++){
	        System.out.println("Being right Sucks");
	    }
	}
	static double getTenPercentOfDiscount(int price){
	    return price*0.9;
	}
	
	static double getDiscountPrice(int price,int percent){
	    return price*percent/100.0;
	    
	}
	static double getDiscountPrice(double price,int percent){
	    return price*percent/100 ;	}
	
}
