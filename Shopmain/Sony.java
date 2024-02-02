package Shopmain;

public class Sony extends Tv {

	public static void getinfo() {
		// TODO Auto-generated method stub
		System.out.println("LG TV");
		Sony s=new Sony();
		s.getProduct();
		s.getName();
		s.getPrice();
		s.getCategory();
		
	}


	@Override
	public void getProduct() {
		System.out.println("product: SONY");
	}

	@Override
	public void getName() {
		System.out.println("name: Sony led");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPrice() {
		System.out.println("price: "+40000);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getCategory() {
		// TODO Auto-generated method stub
		System.out.println("category: TV");
	}

}