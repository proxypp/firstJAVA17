package co.micol.prj.reserve;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ReserveVO {
	private String title;
	private String time;
	private String seat1;
	private String seat2;
	private String seat3;
	private String seat4;
	private String seat5;
	private String seat6;
	private String seat7;
	private String seat8;
	private String seat9;
	private String seat10;
	
	public void toListString() { //전체목록 보기
		System.out.println("                               좌    석    배    치         ");
		System.out.println("                   A1  A2  A3  A4  A5  A6  A7  A8  A9  A10 ");
		System.out.print(title + " : ");
		System.out.print(time + " : ");
		System.out.print(seat1 + " : ");
		System.out.print(seat2 + " : ");
		System.out.print(seat3 + " : ");
		System.out.print(seat4 + " : ");
		System.out.print(seat5 + " : ");
		System.out.print(seat6 + " : ");
		System.out.print(seat7 + " : ");
		System.out.print(seat8 + " : ");
		System.out.print(seat9 + " : ");
		System.out.println(seat10 + " : ");
	}
	
	public String toString() { //개별보기
		System.out.println("제 목 : " + title);
		System.out.println("시 간 : " + time);
		System.out.println("좌석1 : " + seat1);
		System.out.println("좌석2 : " + seat2);
		System.out.println("좌석3 : " + seat3);
		System.out.println("좌석4 : " + seat4);
		System.out.println("좌석5 : " + seat5);
		System.out.println("좌석6 : " + seat6);
		System.out.println("좌석7 : " + seat7);
		System.out.println("좌석8 : " + seat8);
		System.out.println("좌석9 : " + seat9);
		System.out.println("좌석10 : " + seat10);
		return null;
	}
}
