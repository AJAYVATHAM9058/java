
public class Main
{
	public static void main(String[] args) {
		
		boolean isDamaged = false;
		String carColor = "white";
		char energyEfficiencyCategory = 'A';
		if(isDamaged){
		    System.out.println("Damaged Car");
		}
		else{
		    
		    System.out.println("Accident Free Car");
		}
		
		if(carColor.equals("red")){
		    System.out.println("car color is red");
		}else if(carColor.equals("green")){
		    System.out.println("car color is green");
		}else if(carColor.equals("purple")){
		    System.out.println("car color is purple");
		}else{
		    System.out.println("I have no idea what's the color of the car.");
		}
		
		switch(energyEfficiencyCategory){
		    case 'A':System.out.println("small energy consumption");break;
		    case 'B':
		        System.out.println("Low energy consumption");
		        break;
		    case 'G':
		        System.out.println("very High energy consumption");
		        break;
		     default:
		     System.out.println("Not defined category");
		    
		}
		
		
		
	}
}
