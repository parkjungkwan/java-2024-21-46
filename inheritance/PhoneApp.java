package inheritance;

import java.util.Scanner;

public class PhoneApp {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Phone phone = null;
		CelPhone celPhone = null;
		IPhone iPhone = null;
		GalPhone galPhone = null;
		Phone[] arr = new Phone[1];
		while (true) {
			System.out.println("메뉴: 0.Exit 1.집전화걸기 2.전화받기 " + "3.휴대폰걸기 4.아이폰서치 5.삼성페이결제");
			switch (scanner.next()) {
			case "1":
				phone = new Phone();
				phone.setKind("집전화");
				phone.setCompany("금성사");
				phone.setCall("안녕하세요");
				arr[0] = phone;
 				break;
			case "2":
				System.out.println(arr[0].toString());
				break;
			case "3":
				celPhone = new CelPhone();
				celPhone.setCompany("노키아");
				celPhone.setPortable(true);
				celPhone.setCall("통화하고 있다");
				celPhone.setMove("이동중에");
				arr[0] = celPhone;
				break;
			case "4":
				iPhone = new IPhone();
				iPhone.setCompany("애플");
				iPhone.setPortable(true);
				iPhone.setSearch("뉴스검색");
				iPhone.setMove("이동중에");
				arr[0] = iPhone;
				break;
			case "5":
				galPhone = new GalPhone();
				galPhone.setCompany("삼성");
				galPhone.setPortable(true);
				galPhone.setPay("삼성페이결제");
				galPhone.setMove("이동중에");
				arr[0] = galPhone;
				break;

			case "0":
				return;
			}
		}
	}
}

class Phone {
	protected String kind, company, call;

	// 전화기종류, 제조사, 통화내역
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	@Override
	public String toString() {
		return "집전화기 [폰종류=" + kind + ", 제조사=" + company + ", 통화내역=" + call + "]";
	}
}

class CelPhone extends Phone {
	public final static String KIND = "휴대폰";
	protected boolean portable;
	protected String move;

	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		this.portable = portable;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	@Override
	public String toString() {
		return String.format("%s 인 %s 제품을 사용해서 %s 라고 %s 통화한다", KIND, company, call, move);
	}
}

class IPhone extends CelPhone {
	public final static String KIND = "아이폰";
	protected String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return String.format("%s 아이폰을 사용해서 %s중에 %s 을 한다", KIND, company, move, search);
	}
}

class GalPhone extends IPhone {
	public final static String KIND = "갤럭시";
	protected String pay;

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return String.format("%s 갤럭시 제품을 사용해서, %s중에  %s 한다", KIND, company, move, pay);
	}
}
