package board.domains;

public class GradeDto extends MemberDto {
	private int kor, eng, math;
	public GradeDto(){}
	public GradeDto(int userId, int kor, int eng, int math){
		super.userId = userId;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
    public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
    public void setMath(int math) {this.math = math;}
    @Override
	public String toString() {
		return "GradeDto [kor=" + kor + ", eng=" + eng + ", math=" + math+"]";
	}
}
