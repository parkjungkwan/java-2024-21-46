package polymorphism;

import java.util.Scanner;

public class CartApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product item = null;
		Product[] cart = new Product[3];
		int index = 0;
		while (true) {
			System.out.println("쇼핑목록: 0.종료 1컬러TV 2컴퓨터 3노트북 4쇼핑목록보기");
			switch (scanner.next()) {
			case "1": cart[index] = new ColorTV(); index++;break;
			case "2": cart[index] = new Computer(); index++;break;
			case "3": cart[index] = new Notebook(); index++;break;
			case "4": 
				System.out.println("구매목록");
				for(Product p : cart) {
					System.out.println(p.toString());
				}
				break;
			case "0": System.out.println("시스템종료"); return;
			}
		}
	}
}

class Product {
}

class TV extends Product {
	public final static String KIND = "텔레비전";

	@Override
	public String toString() {
		return String.format("%s", KIND);
	}
}

class ColorTV extends TV {
	public final static String KIND = "컬러TV";

	@Override
	public String toString() {
		return String.format("%s", KIND);
	}
}

class Computer extends Product {
	public final static String KIND = "컴퓨터";

	@Override
	public String toString() {
		return String.format("%s", KIND);
	}
}

class Notebook extends Computer {
	public final static String KIND = "노트북";

	@Override
	public String toString() {
		return String.format("%s", KIND);
	}
}
