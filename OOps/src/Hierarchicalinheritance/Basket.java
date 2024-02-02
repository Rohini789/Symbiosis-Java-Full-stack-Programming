package Hierarchicalinheritance;

public class Basket {
	
	public static void main(String[] args) {
	    Rohit rt=new Rohit();
	    rt.getCherry();
	    rt.getOrange();
	    rt.getMango();
	    
	    //inheritence flow prashant->Abhishek->sahil, Abhishek->Yash, Abhishek->Rohit
	    /*here rohit flow =Prashant -> Abhishek->Rohit so
	     * cherriess by abhishek,
	     * and mongoes of itself
	     */
		
		
		
		Yash yt=new Yash();
		yt.getApple();
		yt.getCherry();
		yt.getOrange();
		
		/*here yash flow = Prashant->Abhishek->Yash
		 * yash can access orange by prashant,
		 * cherries by abhishek,
		 * and apples of itself
		 */
		
		
		
		Sahil sa =new Sahil();
		sa.getOrange();
		sa.getStrawberry();
		/*here sahil flow = Prashant ->sahil so
		 * sahil can access orange by prashant,
		 * and strawberry of itself
		 */
		
		
		
		
		Abhishek ab= new Abhishek();
		ab.getCherry();
		ab.getOrange();
		/*here Abhishek flow=prashant ->Abhishek so
		 * Abhishek can access Oranges by Prashant,
		 * and cherries of itself
		 */
		
		Prashant pt= new Prashant();
		pt.getOrange();
			
		//Prashant can only access the orange because its main parent class
		
	}

}
