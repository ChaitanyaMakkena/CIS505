package com.module4;

/**
 * The ProductDB class is used to store different products.
 * @author Chaitanya
 *
 */
public class ProductDB {

	/**
	 * 
	 * @param productCode
	 * @return
	 */
	public static GenericQueue<Product> getProducts(String productCode) {

		if (productCode.equalsIgnoreCase("b")) {

			Ball b1 = new Ball();
			b1.setCode("600");
			b1.setDescription("Phase III");
			b1.setPrice(154.99);
			b1.setColor("white and skyblue");

			Ball b2 = new Ball();
			b2.setCode("601");
			b2.setDescription("Phase I");
			b2.setPrice(104.99);
			b2.setColor("Black");

			Ball b3 = new Ball();
			b3.setCode("603");
			b3.setDescription("Phase 3");
			b3.setPrice(99.99);
			b3.setColor("Green");

			Ball b4 = new Ball();
			b4.setCode("604");
			b4.setDescription("Phase 8");
			b4.setPrice(79.99);
			b4.setColor("purple");

			Ball b5 = new Ball();
			b5.setCode("605");
			b5.setDescription("Phase 7");
			b5.setPrice(999.99);
			b5.setColor("Blue");

			GenericQueue<Product> balls = new GenericQueue<Product>();

			balls.enqueue(b1);
			balls.enqueue(b2);
			balls.enqueue(b3);
			balls.enqueue(b4);
			balls.enqueue(b5);

			return balls;
		}

		else if (productCode.equalsIgnoreCase("s")) {
			Shoe s = new Shoe();
			s.setCode("S500");
			s.setDescription("white/Black");
			s.setPrice(39.99);
			s.setSize(3.0);

			Shoe s1 = new Shoe();
			s1.setCode("S501");
			s1.setDescription("Men's Tribal White");
			s1.setPrice(26.99);
			s1.setSize(8.0);

			Shoe s2 = new Shoe();
			s2.setCode("S502");
			s2.setDescription("Women's Path Lite Seamless Mesh");
			s2.setPrice(54.99);
			s2.setSize(6.0);

			Shoe s3 = new Shoe();
			s3.setCode("S503");
			s3.setDescription("Blue/Hot Pink");
			s3.setPrice(39.99);
			s3.setSize(7.0);

			Shoe s4 = new Shoe();
			s4.setCode("S504");
			s4.setDescription("yellow");
			s4.setPrice(39.99);
			s4.setSize(10.5);

			GenericQueue<Product> shoes = new GenericQueue<Product>();

			shoes.enqueue(s);
			shoes.enqueue(s1);
			shoes.enqueue(s2);
			shoes.enqueue(s3);
			shoes.enqueue(s4);

			return shoes;
		}

		else if (productCode.equalsIgnoreCase("a")) {
			Bag b1 = new Bag();
			b1.setCode("A300");
			b1.setDescription("white/Blue");
			b1.setPrice(74.99);
			b1.setType("Triple");

			Bag b2 = new Bag();
			b2.setCode("A301");
			b2.setDescription("Brown");
			b2.setPrice(54.99);
			b2.setType("Double");

			Bag b3 = new Bag();
			b3.setCode("A302");
			b3.setDescription("Deluxe");
			b3.setPrice(34.99);
			b3.setType("Single");

			GenericQueue<Product> bags = new GenericQueue<Product>();

			bags.enqueue(b1);
			bags.enqueue(b2);
			bags.enqueue(b3);

			return bags;
		}

		else {
			return new GenericQueue<Product>();
		}
	}
}
