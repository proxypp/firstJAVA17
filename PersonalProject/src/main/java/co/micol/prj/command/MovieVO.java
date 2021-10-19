package co.micol.prj.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieVO {
	private String title;
	private String director;
	private int grade;
	private String genre;
	private String summary;
	
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