package abstraction;

import java.util.Scanner;

public class ScoreApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ScoreController gradeController = new ScoreController();
		ScoreDto grade = null;
		
		while(true) {
			System.out.println("Menu: 0.종료 1.성적입력 2.수정 3.삭제 4.등수");
			switch(scanner.next()) {
			case "0": System.out.print("시스템 종료");
				return;
			
			case "1": 
				grade = new ScoreDto();
				System.out.println("이름, 국어, 영어, 수학");
				grade.setName(scanner.next());
				grade.setKor(scanner.nextInt());
				grade.setEng(scanner.nextInt());
				grade.setMath(scanner.nextInt());
				gradeController.postGrade(grade);
							
				break;
			
			case "2":
				grade = new ScoreDto();
				System.out.println("이름, 국어, 영어, 수학");
				grade.setName(scanner.next());
				grade.setKor(scanner.nextInt());
				grade.setEng(scanner.nextInt());
				grade.setMath(scanner.nextInt());
				gradeController.putGrade(grade);	
				break;
			
			case "3":
				grade = new ScoreDto();
				System.out.println("이름: ");
				grade.setName(scanner.next());
				gradeController.deleteGrade(grade);							
				break;
			case "4":
				ScoreDto[] grades = gradeController.getGradeSort();
				for(int i=0;i<gradeController.getCount();i++) {
					System.out.printf("%d등 %s (총점: %d점, 평균: %.2f점)\n", i+1,
							grades[i].getName(), grades[i].getSum(),
							grades[i].getAvg());
				}
				break;
				
			}
		}
	}

}
class ScoreDto {
	private String name;
	private int kor, eng, math, sum;
	private float avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "GradeDto [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avr="
				+ avg + "]";
	}

}
interface ScoreService {
	public void addGrade(ScoreDto grade);
	public void updateGrade(ScoreDto grade);
	public void deleteGrade(ScoreDto grade);
	public int sum(ScoreDto grade);
	public float avg(int sum);
	public ScoreDto[] gradeSort();
	public int count();	
}
class ScoreServiceImpl implements ScoreService{
private ScoreDto[] grades;
private int count;
public ScoreServiceImpl() {
	grades = new ScoreDto[3];
	count = 0;
}
	@Override
	public void addGrade(ScoreDto grade) {
		int sum = sum(grade);
		float avg = avg(sum);
		grade.setSum(sum);
		grade.setAvg(avg);
		grades[count] = grade;
		count++;
	}

	@Override
	public void updateGrade(ScoreDto grade) {
		System.out.println("----------------------");
		
		for(int i =0; i < count; i++) {
			if(grade.getName().equals(grades[i].getName())){
				System.out.println("변경당할 값: "+ grades[i].toString());
				System.out.println("변경할 값: "+ grade.toString());
				grades[i].setKor(grade.getKor());
				grades[i].setEng(grade.getEng());
				grades[i].setMath(grade.getMath());
				grades[i].setSum(sum(grade));
				grades[i].setAvg(avg(grades[i].getSum()));
				break;
			}
		}
	}

	@Override
	public void deleteGrade(ScoreDto grade) {
		for(int i =0; i< count; i++) {
			if(grade.getName().equals(grades[i].getName())){
				grades[i] = grades[count-1];
				grades[count-1] = null;
				count--;
				break;
			}
		}
		
	}

	@Override
	public int sum(ScoreDto grade) {
		
		return grade.getKor() + grade.getEng() + grade.getMath();
	}

	@Override
	public float avg(int sum) {
		
		return (float)sum / 3;
	}

	@Override
	public ScoreDto[] gradeSort() {
		int size = grades.length;
		for(int i = 0; i<size-1;i++) {
			for(int j = i+1; j < size; j++) {
				if(grades[i].getSum() < grades[j].getSum()) {
					ScoreDto t = grades[i];
					grades[i] = grades[j];
					grades[j] = t;
				}
			}
		}
		
		return grades;
	}

	@Override
	public int count() {
		
		return count;
	}
	
}
class ScoreController {
	private ScoreService service;
	
	public ScoreController() {
		service = new ScoreServiceImpl();
	}
	public void postGrade(ScoreDto grade) {
		service.addGrade(grade);
	}
	public void putGrade(ScoreDto grade) {
		service.updateGrade(grade);
	}
	public void deleteGrade(ScoreDto grade) {
		service.deleteGrade(grade);
	}
	public int getSum(ScoreDto grade) {
		return service.sum(grade);
	}
	public float getAvg(int sum) {
		return service.avg(sum);
	}
	public ScoreDto[] getGradeSort() {
		return service.gradeSort();
	}
	public int getCount() {
		return service.count();
	}
}
