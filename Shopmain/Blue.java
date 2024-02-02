package Shopmain;

public class Blue extends Ac{

	public static void getinfo() {
		// TODO Auto-generated method stub
		Blue s=new Blue();
		s.getProduct();
		s.getName();
		s.getPrice();
		s.getCategory();
		
	}
	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		System.out.println("product: Blue");
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("name: blue2");
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