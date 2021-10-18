package co.micol.prj.command;

public class MovieVO {
	private String title;
	private String director;
	private int grade;
	private String genre;
	private String summary;

	public MovieVO() {
	}

	public MovieVO(String title, String director, int grade, String genre) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
	}

	public MovieVO(String title, String director, int grade, String genre, String summary) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
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

	public void toListString() { //전체목록 보기
		System.out.print(title + " : ");
		System.out.print(director + " : ");
		System.out.print(grade + " : ");
		System.out.print(genre + " : ");
		System.out.println(summary + " : ");
	}
	
	public String toString() { //개별보기
		System.out.println("글번호 : " + title);
		System.out.println("작성자 : " + director);
		System.out.println("등 급 : " + grade);
		System.out.println("작성일자 : " + genre);
		System.out.println("요 약 : " + summary);
		return null;
	}
}