package Shopmain;

public class Samsung extends Mobiles {

	public static void getinfo() {
		// TODO Auto-generated method stub
		System.out.println("samsung");
		Samsung sm=new Samsung();
		sm.getProduct();
		sm.getName();
		sm.getPrice();
		sm.getCategory();
	}

	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		System.out.println("product:Samsung");
		
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("name:Samsung12");
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println("price:20000");
	}

	@Override
	public void getCategory() {
		// TODO Auto-generated method stub
		System.out.println("category:mobile");
	}
	
}
