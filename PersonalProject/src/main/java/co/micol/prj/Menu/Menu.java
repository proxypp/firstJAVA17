package co.micol.prj.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.oneschedualImpl.OneSchedualDelete;
import co.micol.prj.oneschedualImpl.OneSchedualInsert;
import co.micol.prj.oneschedualImpl.OneSchedualList;
import co.micol.prj.oneschedualImpl.OneSchedualSelect;
import co.micol.prj.oneschedualImpl.OneSchedualUpdate;
import co.micol.prj.theater.MovieDelete;
import co.micol.prj.theater.MovieInsert;
import co.micol.prj.theater.MovieList;
import co.micol.prj.theater.MovieSelect;
import co.micol.prj.theater.MovieUpdate;
import co.micol.prj.thirdschedualImpl.ThirdSchedualDelete;
import co.micol.prj.thirdschedualImpl.ThirdSchedualInsert;
import co.micol.prj.thirdschedualImpl.ThirdSchedualList;
import co.micol.prj.thirdschedualImpl.ThirdSchedualSelect;
import co.micol.prj.thirdschedualImpl.ThirdSchedualUpdate;
import co.micol.prj.twoschedualImpl.TwoSchedualDelete;
import co.micol.prj.twoschedualImpl.TwoSchedualInsert;
import co.micol.prj.twoschedualImpl.TwoSchedualList;
import co.micol.prj.twoschedualImpl.TwoSchedualSelect;
import co.micol.prj.twoschedualImpl.TwoSchedualUpdate;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();

	public void init() {
		map.put("movieList", new MovieList());
		map.put("movieSelect", new MovieSelect());
		map.put("movieInsert", new MovieInsert());
		map.put("movieUpdate", new MovieUpdate());
		map.put("movieDelete", new MovieDelete());
		map.put("theaterList", new OneSchedualList());
		map.put("theaterSelect", new OneSchedualSelect());
		map.put("theaterInsert", new OneSchedualInsert());
		map.put("theaterUpdate", new OneSchedualUpdate());
		map.put("theaterDelete", new OneSchedualDelete());
		map.put("theaterTwoList", new TwoSchedualList());
		map.put("theaterTwoSelect", new TwoSchedualSelect());
		map.put("theaterTwoInsert", new TwoSchedualInsert());
		map.put("theaterTwoUpdate", new TwoSchedualUpdate());
		map.put("theaterTwoDelete", new TwoSchedualDelete());
		map.put("theaterThirdList", new ThirdSchedualList());
		map.put("theaterThirdSelect", new ThirdSchedualSelect());
		map.put("theaterThirdInsert", new ThirdSchedualInsert());
		map.put("theaterThirdUpdate", new ThirdSchedualUpdate());
		map.put("theaterThirdDelete", new ThirdSchedualDelete());
		
		
	}

	public void MainMenu() {
		System.out.println("***************************");
		System.out.println("****** 1.상영영화 관리 정보 ****");
		System.out.println("****** 2. 상영 일정 관리  *****");
		System.out.println("****** 3. 영화 예매 관리  *****");
		System.out.println("****** 4. 프로그램 종료  ******");
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

	public void SecondTitleOne() {
		System.out.println("***************************");
		System.out.println("****1. 1상영관 전체 검색. ******");
		System.out.println("****2. 1상영관 정보 조회  ******");
		System.out.println("****3. 1상영관 정보 등록  ******");
		System.out.println("****4. 1상영관 정보 수정  ******");
		System.out.println("****5. 1상영관 정보 삭제  ******");
		System.out.println("**** 6. 뒤로가기 *************");
		System.out.print("숫자를 선택하세요 -->");
	}

	public void SecondTitleTwo() {
		System.out.println("***************************");
		System.out.println("****1. 2상영관 전체 검색. ******");
		System.out.println("****2. 2상영관 정보 조회  ******");
		System.out.println("****3. 2상영관 정보 등록  ******");
		System.out.println("****4. 2상영관 정보 수정  ******");
		System.out.println("****5. 2상영관 정보 삭제  ******");
		System.out.println("**** 6. 뒤로가기 *************");
		System.out.print("숫자를 선택하세요 -->");
	}
	
	public void SecondTitleThird() {
		System.out.println("***************************");
		System.out.println("****1. 3상영관 전체 검색. ******");
		System.out.println("****2. 3상영관 정보 조회  ******");
		System.out.println("****3. 3상영관 정보 등록  ******");
		System.out.println("****4. 3상영관 정보 수정  ******");
		System.out.println("****5. 3상영관 정보 삭제  ******");
		System.out.println("**** 6. 뒤로가기 *************");
		System.out.print("숫자를 선택하세요 -->");
	}

	public void ThirdTitle() {
		System.out.println("*************************");
		System.out.println("****** 1. 회원 예매 *******");
		System.out.println("****** 2. 비회원 예매 *****");
		System.out.println("** 회원,비회원 숫자로 선택해주세요");
		System.out.print("숫자를 선택하세요 -->");

	}

	public void menu() {
		while (true) {
			MainMenu();
			int jobNo = sc.nextInt();
			switch (jobNo) {
			case 1:
				moiveManagement();
				break;
			case 2:
				movieSchedule();
				break;
			case 3:
				movieClient();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
		}
	}

	private void movieClient() {
		
	}

	private void movieSchedule() {
		boolean b = false;
		do {
			System.out.println();
			SecondTitle();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				OneTheater();
				break;
			case 2:
				TwoTheater();
				break;
			case 3:
				ThirdTheater();
				break;
			case 4:
				b = true;
				return;
			}

		} while (!b);

	}

	private void ThirdTheater() {
		boolean b = false;
		do {
			System.out.println();
			SecondTitleThird();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("theaterThirdList");
				break;
			case 2:
				executeRun("theaterThirdSelect");
				break;
			case 3:
				executeRun("theaterThirdInsert");
				break;
			case 4:
				executeRun("theaterThirdUpdate");
				break;
			case 5:
				executeRun("theaterThirdDelete");
				break;
			case 6:
				b = true;
				break;
			}
		} while (!b);

	}

	private void TwoTheater() {
		boolean b = false;
		do {
			System.out.println();
			SecondTitleTwo();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("theaterTwoList");
				break;
			case 2:
				executeRun("theaterTwoSelect");
				break;
			case 3:
				executeRun("theaterTwoInsert");
				break;
			case 4:
				executeRun("theaterTwoUpdate");
				break;
			case 5:
				executeRun("theaterTwoDelete");
				break;
			case 6:
				b = true;
				break;
			}
		} while (!b);

	}

	private void OneTheater() {
		boolean b = false;
		do {
			System.out.println();
			SecondTitleOne();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("theaterList");
				break;
			case 2:
				executeRun("theaterSelect");
				break;
			case 3:
				executeRun("theaterInsert");
				break;
			case 4:
				executeRun("theaterUpdate");
				break;
			case 5:
				executeRun("theaterDelete");
				break;
			case 6:
				b = true;
				break;
			}

		} while (!b);

	}

	private void moiveManagement() {
		boolean b = false;
		do {
			System.out.println();
			FirstTitle();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("movieList");
				break;
			case 2:
				executeRun("movieSelect");
				break;
			case 3:
				executeRun("movieInsert");
				break;
			case 4:
				executeRun("movieUpdate");
				break;
			case 5:
				executeRun("movieDelete");
				break;
			case 6:
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
