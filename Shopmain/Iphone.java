package Shopmain;

public class Iphone extends Mobiles{

	public static void getinfo() {
		// TODO Auto-generated method stub
		System.out.println("iphone mobile");
		Iphone i=new Iphone();
		i.getProduct();
		i.getName();
		i.getPrice();
		i.getCategory();
	}

	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		System.out.println("product:Apple");
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("name:iphone11");
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println("price:"+120000);
	}

	@Override
	public void getCategory() {
		// TODO Auto-generated method stub
		System.out.println("category:mobile");
	}
	
}