package Shopmain;

public class Lg extends Tv {
	public static void getinfo() {
		// TODO Auto-generated method stub
		System.out.println("LG TV");
		Lg l=new Lg();
		l.getProduct();
		l.getName();
		l.getPrice();
		l.getCategory();
		
	}


	@Override
	public void getProduct() {
		System.out.println("product: LG");
	}

	@Override
	public void getName() {
		System.out.println("name: LG led");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPrice() {
		System.out.println("price: "+30000);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCategory() {
		// TODO Auto-generated method stub
		System.out.println("category: TV");
		
	}

	
}
