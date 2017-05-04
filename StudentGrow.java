import java.util.Scanner;
public class StudentGrow {

	public static void main(String[] args) {
		Scanner sscc = new Scanner(System.in);
		System.out.println("\t+-----<< 대학생 키우기 >>-----+");
		System.out.println("1. 시작하기");
		System.out.println("2. 종료하기");
		int starting=sscc.nextInt();
		if(starting!=1) {System.out.println("게임을 종료합니다."); System.exit(0);}
		else{
			System.out.println("=========================== 게임을 시작합니다 ============================");
			System.out.println();
			System.out.println("<설레는 새 학기가 시작되었다!..도 잠시 어느새 중간고사가 끝?! 이제 남은 건 진짜 기말고사 뿐이야..!>");
			System.out.println("<종강까지 남은 45일 동안 대학생을 열심히 키워보자! 당신은 과연 어떤 엔딩을 맞이하게 될 것인가 !>");
			System.out.println();
			int DdayNumber=45;
			int Power=100;
			int Money=100000;
			int Friend=50;
			int Score=0;
			int Attendence=0;
			int Month=5;
			int Day=1;
			String Daily[]={"일","월","화","수","목","금","토"};
			String Today = null;
			while(true){
				if(Month==5) {Today=Daily[Day%7];}
				if(Month==6) {Today=Daily[Day%7];}
				System.out.println("종강까지 D-"+DdayNumber+"  2017년   "+Month+"월   "+Day+"일   "+Today+"요일");
				System.out.println("체력 : "+Power+"  /   돈 : "+Money+"원   /  인맥 : "+Friend);
				System.out.println();
				System.out.println("주인공 : 앞으로 종강까지 "+DdayNumber+"일! 뭘 해볼까?");
				System.out.println();
				System.out.println("1. 강의듣기 \t 2. 알바가기 \t 3. 친목활동하기 \t 4. 빈둥대기");
				
				/*if(DdayNumber==0)*/ break;
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
