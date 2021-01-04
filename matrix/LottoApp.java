package matrix;

import java.util.Scanner;

public class LottoApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LottoDto instance = new LottoDto();
		System.out.println("구매한도 설정");
		instance.setCountLimit(scanner.nextInt());
		System.out.printf("설정된 구매한도 %d 장\n", instance.getCountLimit());
		while(true) {
			System.out.println("0.종료 1.로또구입");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("로또구입\n");buyLottos(instance,scanner);break;
			}
			
		}
	}
	public static void buyLottos(LottoDto instance,Scanner scanner) {
		System.out.println("얼마치를 구입합니까? ");
		System.out.printf("로또 %d장을 발급합니다\n");
		int[][] lottos = instance.getLottos();
		for(int i=0; i< lottos.length;i++) {
			for(int j=0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
class LottoDto {
	private int countLimit, lottoCount;
	private int[] lotto;
	private int[][] lottos;
	public int getCountLimit() {return countLimit;}
	public void setCountLimit(int countLimit) {this.countLimit = countLimit;}
	public int getLottoCount() {return lottoCount;}
	public void setLottoCount(int lottoCount) {this.lottoCount = lottoCount;}
	public int[] getLotto() {return lotto;}
	public void setLotto(int[] lotto) {this.lotto = lotto;}
	public int[][] getLottos() {return lottos;}
	public void setLottos(int[][] lottos) {this.lottos = lottos;}
}
interface LottoService {

}
class LottoServiceImpl {

}
class LottoController {

}