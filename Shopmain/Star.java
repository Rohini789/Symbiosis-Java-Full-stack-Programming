package Shopmain;

public class Star extends Ac{

	public static void getinfo() {
		// TODO Auto-generated method stub
		Star s=new Star();
		s.getProduct();
		s.getName();
		s.getPrice();
		s.getCategory();
		
	}

	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		System.out.println("product: Star");
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("name: Star2");
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println("price: "+40000);
	}

	@Override
	public void getCategory() {
		System.out.println("category: AC");
		// TODO Auto-generated method stub
		
	}

}