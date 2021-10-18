package co.micol.prj.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.theater.MovieDelete;
import co.micol.prj.theater.MovieInsert;
import co.micol.prj.theater.MovieList;
import co.micol.prj.theater.MovieSelect;
import co.micol.prj.theater.MovieUpdate;



public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();
	
	public void init() {
		map.put("movieList", new MovieList());
		map.put("movieSelect", new MovieSelect());
		map.put("movieInsert", new MovieInsert());
		map.put("movieUpdate", new MovieUpdate());
		map.put("movieDelete", new MovieDelete());
		
	}
	
	public void MainMenu() {
		System.out.println("****************************");
		System.out.println("*******1.상영영화 관리 정보*******");
		System.out.println("********2. 상영 일정 관리*******");
		System.out.println("********3. 영화 예매 관리*******");
		System.out.println("******** 4. 프로그램 종료********");
		System.out.print("숫자를 선택하세요 -->");
		
	}
	
	public void FirstTitle() {
		System.out.println("***** 1. 영화 정보 전체 검색 *******");
		System.out.println("***** 2. 영화 정보 조회 **********");
		System.out.println("***** 3. 영화 정보 등록 **********");
		System.out.println("***** 4. 영화 정보 수정 **********");
		System.out.println("***** 5. 영화 정보 삭제 *********");
		System.out.println("***** 6. 뒤로가기 **************");
		System.out.print("숫자를 선택하세요 -->");
		
			
	}
	public void SecondTitle() {
		System.out.println("*************************");
		System.out.println("********1. 1상영관 일정 *****");
		System.out.println("********2. 2상영관 일정 *****");
		System.out.println("********3. 3상영관 일정 *****");
		System.out.println("******** 4. 뒤로 가기  *****");
		System.out.print("숫자를 선택하세요 -->");
		
		
	}
	public void ThirdTitle() {
		System.out.println("*************************");
		System.out.println("****** 1. 회원 예매 *******");
		System.out.println("****** 2. 비회원 예매 ******");
		System.out.println("** 회원,비회원 숫자로 선택해주세요");
		System.out.print("숫자를 선택하세요 -->");
		
	}
	
	public void menu() {
		while(true) {
			MainMenu();
			int jobNo = sc.nextInt();
			switch(jobNo) {
			case 1 : 
				moiveManagement();
				break;
			case 2 :
				movieSchedule();
				break;
			case 3 :
				movieClient();
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
		}
	}
	
	
	private void movieClient() {
	
		
	}

	private void movieSchedule() {
		// TODO Auto-generated method stub
		
	}

	private void moiveManagement() {
		boolean b = false;
		do {
			System.out.println();
			FirstTitle();
			int key = sc.nextInt();
			switch (key) {
			case 1 :
				executeRun("movieList");
				break;
			case 2 :
				executeRun("movieSelect");
				break;
			case 3 :
				executeRun("movieInsert");
				break;
			case 4 :
				executeRun("movieUpdate");
				break;
			case 5 :
				executeRun("movieDelete");
				break;
			case 6 :
				b = true;
				break;
			}
		
		} while (!b);
		
	}

	private void executeRun(String string) {
		// 실행할 명령을 구현한다. 인터페이스는 자기자신을 선언할수 없다.
		Command command = map.get(string);
		command.execute();

	}
	
	
	public void run() {
		init();
		menu();

	}
}
