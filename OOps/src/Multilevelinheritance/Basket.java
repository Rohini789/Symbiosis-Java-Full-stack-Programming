package Multilevelinheritance;

public class Basket {
	public static void main(String[] arg) {
		Rohit rt=new Rohit();
		rt.getApple();
		rt.getMango();
		rt.getOrange();
		
		//Inheritance flow Prashant->yash->Rohit,so rohit can access orange and apple by prashant and yash
		
		Yash yt=new Yash();
		yt.getApple();
		yt.getOrange();
		
		//yash extends prashant so it can access orange and apple only and not mangoes
		
		Prashant pt= new Prashant();
		pt.getOrange();
		
		//Prashant can only access the oranges
	}

}
