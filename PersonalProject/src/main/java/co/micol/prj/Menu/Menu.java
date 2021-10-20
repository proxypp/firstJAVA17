package co.micol.prj.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.memberImpl.MemberDelete;
import co.micol.prj.memberImpl.MemberInsert;
import co.micol.prj.memberImpl.MemberList;
import co.micol.prj.memberImpl.MemberSelect;
import co.micol.prj.memberImpl.MemberUpdate;
import co.micol.prj.oneschedualImpl.OneSchedualDelete;
import co.micol.prj.oneschedualImpl.OneSchedualInsert;
import co.micol.prj.oneschedualImpl.OneSchedualList;
import co.micol.prj.oneschedualImpl.OneSchedualSelect;
import co.micol.prj.oneschedualImpl.OneSchedualUpdate;
import co.micol.prj.reserveImpl.ReserveDelete;
import co.micol.prj.reserveImpl.ReserveInsert;
import co.micol.prj.reserveImpl.ReserveList;
import co.micol.prj.reserveImpl.ReserveSelect;
import co.micol.prj.reserveImpl.ReserveUpdate;
import co.micol.prj.reserveThirdImpl.ReserveThirdDelete;
import co.micol.prj.reserveThirdImpl.ReserveThirdInsert;
import co.micol.prj.reserveThirdImpl.ReserveThirdList;
import co.micol.prj.reserveThirdImpl.ReserveThirdSelect;
import co.micol.prj.reserveThirdImpl.ReserveThirdUpdate;
import co.micol.prj.reserveTwoImpl.RserveTwoDelete;
import co.micol.prj.reserveTwoImpl.RserveTwoInsert;
import co.micol.prj.reserveTwoImpl.RserveTwoList;
import co.micol.prj.reserveTwoImpl.RserveTwoSelect;
import co.micol.prj.reserveTwoImpl.RserveTwoUpdate;
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
		map.put("memberList", new MemberList());
		map.put("memberSelect", new MemberSelect());
		map.put("memberInsert", new MemberInsert());
		map.put("memberUpdate", new MemberUpdate());
		map.put("memberDelete", new MemberDelete());
		map.put("reserveList", new ReserveList());
		map.put("reserveSelect", new ReserveSelect());
		map.put("reserveInsert", new ReserveInsert());
		map.put("reserveUpdate", new ReserveUpdate());
		map.put("reserveDelete", new ReserveDelete());
		map.put("reserveTwoList", new RserveTwoList());
		map.put("reserveTwoSelect", new RserveTwoSelect());
		map.put("reserveTwoInsert", new RserveTwoInsert());
		map.put("reserveTwoUpdate", new RserveTwoUpdate());
		map.put("reserveTwoDelete", new RserveTwoDelete());
		map.put("reserveThirdList", new ReserveThirdList());
		map.put("reserveThirdSelect", new ReserveThirdSelect());
		map.put("reserveThirdInsert", new ReserveThirdInsert());
		map.put("reserveThirdUpdate", new ReserveThirdUpdate());
		map.put("reserveThirdDelete", new ReserveThirdDelete());
		
	}

	public void MainMenu() {
		System.out.println();
		System.out.println("===============================");
		System.out.println("****** 1.상영영화 관리 정보 ********");
		System.out.println("++++++ 2. 상영 일정 관리  +++++++++");
		System.out.println("------ 3. 영화관 회원 관리  ------");
		System.out.println("^^^^^^ 4. 영화관 예매 확인 ^^^^^^^^");
		System.out.println("%%%%%% 5. 프로그램 종료  %%%%%%%%%");
	
		System.out.print("숫자를 선택하세요 -->>");

	}

	public void FirstTitle() {
		System.out.println("===============================");
		System.out.println("+++++ 1. 영화 정보 전체 검색 ++++++++");
		System.out.println("***** 2. 영화 정보 조회 **********");
		System.out.println("----- 3. 영화 정보 등록 ----------");
		System.out.println("^^^^^ 4. 영화 정보 수정 ^^^^^^^^^^");
		System.out.println("%%%%% 5. 영화 정보 삭제 %%%%%%%%%%");
		System.out.println("***** 6.   뒤로가기   ***********");
		System.out.print("숫자를 선택하세요 -->>");

	}

	public void SecondTitle() {
		System.out.println("=================================");
		System.out.println("******** 1. 1상영관 일정 ***********");
		System.out.println("++++++++ 2. 2상영관 일정 +++++++++++");
		System.out.println("-------- 3. 3상영관 일정 -----------");
		System.out.println("******** 4. 뒤로 가기  ***********");
		System.out.print("숫자를 선택하세요 -->>");

	}

	public void SecondTitleOne() {
		System.out.println("================================");
		System.out.println("****** 1. 1상영관 전체 검색. ********");
		System.out.println("++++++ 2. 1상영관 정보 조회  ++++++++");
		System.out.println("------ 3. 1상영관 정보 등록  --------");
		System.out.println("^^^^^^ 4. 1상영관 정보 수정  ^^^^^^^^");
		System.out.println("%%%%%% 5. 1상영관 정보 삭제  %%%%%%%%");
		System.out.println("****** 6.    뒤로가기   ***********");
		System.out.print("숫자를 선택하세요 -->>");
	}

	public void ThirdTitleOne() {
		System.out.println("================================");
		System.out.println("***** 1. 1상영관 좌석 전체 검색. *****");
		System.out.println("+++++ 2. 1상영관 좌석 조회  ++++++++");
		System.out.println("----- 3. 1상영관 좌석 등록  --------");
		System.out.println("^^^^^ 4. 1상영관 좌석 수정  ^^^^^^^^");
		System.out.println("%%%%% 5. 1상영관 좌석 삭제  %%%%%%%%");
		System.out.println("***** 6.    뒤로가기     *********");
		System.out.print("숫자를 선택하세요 -->>");
	}
	
	public void SecondTitleTwo() {
		System.out.println("================================");
		System.out.println("***** 1. 2상영관 전체 검색. ********");
		System.out.println("+++++ 2. 2상영관 전체 조회  ++++++++");
		System.out.println("----- 3. 2상영관 전체 등록  --------");
		System.out.println("^^^^^ 4. 2상영관 전체 수정  ^^^^^^^^");
		System.out.println("%%%%% 5. 2상영관 전체 삭제  %%%%%%%%");
		System.out.println("***** 6.    뒤로가기     *********");
		System.out.print("숫자를 선택하세요 -->>");
	}
	public void ThirdTitleTwo() {
		System.out.println("================================");
		System.out.println("***** 1. 2상영관 좌석 전체 검색. *****");
		System.out.println("+++++ 2. 2상영관 좌석 조회  ++++++++");
		System.out.println("----- 3. 2상영관 좌석 등록  --------");
		System.out.println("^^^^^ 4. 2상영관 좌석 수정  ^^^^^^^^");
		System.out.println("%%%%% 5. 2상영관 좌석 삭제  %%%%%%%%");
		System.out.println("***** 6.    뒤로가기     *********");
		System.out.print("숫자를 선택하세요 -->>");
	}
	
	public void SecondTitleThird() {
		System.out.println("================================");
		System.out.println("***** 1. 3상영관 전체 검색. ********");
		System.out.println("+++++ 2. 3상영관 전체 조회  ++++++++");
		System.out.println("----- 3. 3상영관 전체 등록  --------");
		System.out.println("^^^^^ 4. 3상영관 전체 수정  ^^^^^^^^");
		System.out.println("%%%%% 5. 3상영관 전체 삭제  %%%%%%%%");
		System.out.println("***** 6.    뒤로가기     *********");
		System.out.print("숫자를 선택하세요 -->>");
	}
	public void ThirdTitleThird() {
		System.out.println("================================");
		System.out.println("***** 1. 3상영관 좌석 전체 검색. *****");
		System.out.println("+++++ 2. 3상영관 좌석 조회  ++++++++");
		System.out.println("----- 3. 3상영관 좌석 등록  --------");
		System.out.println("^^^^^ 4. 3상영관 좌석 수정  ^^^^^^^^");
		System.out.println("%%%%% 5. 3상영관 좌석 삭제  %%%%%%%%");
		System.out.println("***** 6.    뒤로가기     *********");
		System.out.print("숫자를 선택하세요 -->>");
	}

	public void MemberTitle() {
		System.out.println("===============================");
		System.out.println("******** 1. 멤버 전체 검색 ********");
		System.out.println("++++++++ 2. 멤버 조회 ++++++++++++");
		System.out.println("-------- 3. 멤버 등록 ------------");
		System.out.println("^^^^^^^^ 4. 멤버 수정 ^^^^^^^^^^^^");
		System.out.println("%%%%%%%% 5. 멤버 삭제 %%%%%%%%%%%%");
		System.out.println("******** 6.  뒤로가기 ************");
		System.out.println("숫자를 선택하세요-->>");
	}
	public void ThirdTitle() {
		System.out.println("================================");
		System.out.println("****** 1. 1상영관 좌석 관리 *********");
		System.out.println("++++++ 2. 2상영관 좌석 관리 +++++++++");
		System.out.println("------ 3. 3상영관 좌석 관리 ---------");
		System.out.println("%%%%%% 4.   뒤로 가기 %%%%%%%%%%%%%");
		System.out.print("숫자를 선택하세요 -->>");
		
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
				movieMember();
				break;
			case 4:
				movieSeat();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
		}
	}

	private void movieSeat() {
		boolean b = false;
		do {
			System.out.println();
			ThirdTitle();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				OneReserve();
				break;
			case 2:
				TwoReserve();
				break;
			case 3:
				ThirdReserve();
				break;
			case 4:
				b = true;
				return;
			
			}

		} while (!b);
	}

	private void ThirdReserve() {
		boolean b = false;
		do {
			System.out.println();
			ThirdTitleThird();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("reserveThirdList");
				break;
			case 2:
				executeRun("reserveThirdSelect");
				break;
			case 3:
				executeRun("reserveThirdInsert");
				break;
			case 4:
				executeRun("reserveThirdUpdate");
				break;
			case 5:
				executeRun("reserveThirdDelete");
				break;
			case 6:
				b = true;
				return;
			
			}

		} while (!b);
	}
		

	private void TwoReserve() {
		boolean b = false;
		do {
			System.out.println();
			ThirdTitleTwo();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("reserveTwoList");
				break;
			case 2:
				executeRun("reserveTwoSelect");
				break;
			case 3:
				executeRun("reserveTwoInsert");
				break;
			case 4:
				executeRun("reserveTwoUpdate");
				break;
			case 5:
				executeRun("reserveTwoDelete");
				break;
			case 6:
				b = true;
				return;
			
			}

		} while (!b);
	}

	private void OneReserve() {
		boolean b = false;
		do {
			System.out.println();
			ThirdTitleOne();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("reserveList");
				break;
			case 2:
				executeRun("reserveSelect");
				break;
			case 3:
				executeRun("reserveInsert");
				break;
			case 4:
				executeRun("reserveUpdate");
				break;
			case 5:
				executeRun("reserveDelete");
				break;
			case 6:
				b = true;
				return;
			
			}

		} while (!b);
	}

	private void movieMember() {
		boolean b = false;
		do {
			System.out.println();
			MemberTitle();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("memberList");
				break;
			case 2:
				executeRun("memberSelect");
				break;
			case 3:
				executeRun("memberInsert");
				break;
			case 4:
				executeRun("memberUpdate");
				break;
			case 5:
				executeRun("memberDelete");
				break;
			case 6:
				b = true;
				return;
			
			}

		} while (!b);
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
