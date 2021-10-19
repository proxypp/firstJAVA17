package co.micol.prj.schedual;

public class SchedualVO {
	private String title;
	private int grade;
	private String genre;
	private String summary;
	private String time;

	public SchedualVO(){
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public void toListString() { //전체목록 보기
		System.out.print(title + " : ");
		System.out.print(grade + " : ");
		System.out.print(genre + " : ");
		System.out.print(summary + " : ");
		System.out.println(time + " : ");
	}
	public String toString() { //개별보기
		System.out.println("제 목 : " + title);
		System.out.println("등 급 : " + grade);
		System.out.println("작성일자 : " + genre);
		System.out.println("요 약 : " + summary);
		System.out.println("시 간 : " + time);
		return null;
	}
	
}