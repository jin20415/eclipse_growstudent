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
			int DdayNumber=45; //초기값
			int Power=100;
			int Money=100000;
			int Friend=50;
			int Intelli=0;
			int Attendence=0;
			int Month=5;
			int Day=1;
			String Daily[]={"일","월","화","수","목","금","토"};
			String Today = null;
			while(true){
				if(Month==5) {Today=Daily[Day%7];} //5월과 6월일정에 맞게함
				if(Month==6) {Today=Daily[Day%7];}
				System.out.println("===================================================================");
				System.out.println("종강까지 D-"+DdayNumber+"  2017년   "+Month+"월   "+Day+"일   "+Today+"요일");
				System.out.println("체력 : "+Power+"  /  지적능력: "+Intelli+" /   돈 : "+Money+"원   /  인맥 : "+Friend);
				System.out.println();
				System.out.println("주인공 : 앞으로 종강까지 "+DdayNumber+"일! 뭘 해볼까?");
				System.out.println();
				System.out.println("1. 강의듣기 : 공부를 하자! 학점을 살려야겠어!(1일 소모, 체력 -10, 돈 -5000, 주말은 선택안됨)");
				System.out.println("2. 알바가기 : 돈을 벌어보자! 힘든만큼  보람찰거야!(2일 소모, 체력 -20, 돈 +20000)"); //알바종류를 switch case로 늘려도 좋을듯
				System.out.println("3. 친목활동하기 : 친목을 쌓아보자! 인맥도 능력이랬어!(2일 소모, 체력 -10, 돈 -10000)"); //랜덤함수로 랜덤하게 선배가 준 족보(지적능력+3) 이런것도 좋을듯?!
				System.out.println("4. 빈둥대기 : 쉬어보자! 역시 쉬는게 최고야!(1일 소모, 체력+10)");//랜덤함수로 배고파서 충동적으로 피자를 시켰다!(돈 -20000) 이런거..
				System.out.println("===================================================================");//5. 공부하기를 따로 만들까 생각중
				int select=sscc.nextInt();
				if(select==1&&(Today.equals("토")||Today.equals("일"))) {
					System.out.println("※ 주말입니다. 다시 선택하세요!");
					continue;
					}//어떻게 할지..
				switch(select){
					case 1 :
						System.out.println("\n강의를 듣는다.\n");
						 int i = (int) Math.round(Math.random() * (10) + 1); 
						 if(i<=2&&i>0){
							 System.out.println("교수님 : &#$%@&#ABC#%@... \n주인공: 아하 완벽히 이해했어!");
							 System.out.println("\n지적능력이 +2 만큼 올랐다!");
							 Intelli+=2;
						 }
						 else if(i<=10&&i>8){
							 System.out.println("교수님 : @#$%&1234%$#@... \n주인공 : 도대체 무슨말일까!");
							 System.out.println("\n강의를 들은 의미가 없었다!");
						 }
						 else {
							 System.out.println("교수님 : $%@#!@*&가나다$^@#... \n주인공: 음..왠지 알듯말듯해..?!");
							 System.out.println("\n지적능력이 +1 만큼 올랐다!");
							 Intelli+=1;
							 }
						 System.out.println();
						 Day++;
						 DdayNumber--;
						 Power-=10;
						 Money-=5000;
						 break;
					/*case 2 :
					case 3 :
					case 4 :*/
				}
				/*if(DdayNumber==0)break; 종강시 while끝나고 엔딩 나오게 함*/
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
