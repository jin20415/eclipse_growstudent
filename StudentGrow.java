import java.util.Scanner;

public class StudentGrow {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("\t+-----<< 대학생 키우기 >>-----+");
		System.out.println("1. 시작하기");
		System.out.println("2. 종료하기");
		int starting=input.nextInt();
		if(starting!=1) {System.out.println("게임을 종료합니다."); System.exit(0);}
		else{
			System.out.println("=========================== 게임을 시작합니다 ============================");
	         System.out.println();
	         System.out.println("<설레는 새 학기가 시작되었다!..도 잠시 어느새 중간고사가 시작?! ");
	         System.out.println("<중간고사까지 남은 8일 동안 대학생을 열심히 키워보자! 당신은 과연 어떤 엔딩을 맞이하게 될 것인가 !>");
	         System.out.println();
	         int DdayNumber=8; //초기값
	         int Power=0;
	         int Money=100000;
	         int Friend=50;
	         int Intelli=0;
	         int Attendence=0;
             int Month = 4;
             int Day = 20;
             int Social = 10;
             int answer; 
             int project = 0;
	         String Daily[]={"화","수","목","금","토","일","월"};
	         String Today = null;
	         while(true){
	        	 if(Month == 4) {Today=Daily[Day%7];}
	            System.out.println("===================================================================");
	            System.out.println("종강까지 D-" + DdayNumber + "  2020년  "+ Month +"월  "+ Day+"일  " + Today + "요일");
	            System.out.println("피로도 : "+Power+"  /  지적능력: "+Intelli+" /  돈 : "+Money+"원   /  사교성 : "+Friend + " /  사회성: "+Social);
	            System.out.println();
	            System.out.println("주인공 : 앞으로 중간고사까지 "+DdayNumber+"일! 뭘 해볼까?");
	            System.out.println();
	            System.out.println("1. 강의듣기 : 공부를 하자! 학점을 살려야겠어!(피로도 +10 , 지능 +5 주말은 선택안됨)");
	            System.out.println("2. 알바가기 : 돈을 벌어보자! 힘든만큼  보람찰거야!(피로도 +50, 돈 +50000)"); 
	            System.out.println("3. 친목활동하기 : 친목을 쌓아보자! 인맥도 능력이랬어!(피로도 +20, 돈 -20000, 사교성 +10 , 사회성 +10)"); //랜덤함수로 랜덤하게 선배가 준 족보(지적능력+3) 이런것도 좋을듯?!
	            System.out.println("4. 빈둥대기 : 쉬어보자! 역시 쉬는게 최고야!(1일 소모,피로도 0)");//랜덤함수로 배고파서 충동적으로 피자를 시켰다!(돈 -20000) 이런거..
	            System.out.println("5. 공부하기: 중간고사까지 얼마 남지않았어 얼른 과제를 끝내고 공부를 해보자(1일 소모,피로도50, 지능+20)");//과제 하기 공부하기 두개로 
	            System.out.println("===================================================================");
	            int select = input.nextInt();
	            if(select == 1 && (Today.equals("토") || Today.equals("일"))) {
		               System.out.println("※ 주말이니 다시 선택하세요!");
		               continue;
		               }
	        
	            switch(select){
	               case 1 :
	                	  if(Power >= 100) {
			            	   System.out.println("\n ※※※※※※※ 피로도가 높습니다. 4번을 선택해주세요 ※※※※※※※");
			            	   continue;
	                	  }
	                   System.out.print("\n강의를 듣는다.\n");
	                   System.out.println("--------------------------강의 목록--------------------------");
	                   System.out.println(" 1. 오픈소스 소프트웨어\n 2. 시스템 프로그래밍\n 3. 데이터베이스\n 4. 정보보호 ");
	                   System.out.println("----------------------------------------------------------");
	                   int study = input.nextInt();
	                   int [] i = {1,2,3,4};
	                   do {
	                   if (study == 1){
	                	  System.out.println("\t \t >>오픈소스 소프트웨어 강의 시작<<\t \t");
	                	  Intelli+=5;
	                	  Power += 10;
	                      System.out.println("교수님 : 원격저장소의 내용을 로컬저장소로 가져오려면 $%@#!@*&가나다$^@#... " );
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");
	                      System.out.println("!!!!! 강의가 끝났어!!!!\n"+" [ 지능 : "+ Intelli+ "만큼 올랐어!] [피로도 : " +Power+ "만큼 올랐어!]");
	                      System.out.print("강의를 더 들을까?");
	                      System.out.println("[1. YES] [2. No]");
	                   int[] o = {1,2};
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ]\n");
	   	                      System.out.println("--------------------------강의 목록--------------------------");
	   	                      System.out.println(" 1. 오픈소스 소프트웨어\n 2. 시스템 프로그래밍\n 3. 데이터베이스\n 4. 정보보호 ");
	   	                      System.out.println("----------------------------------------------------------");
	   	                      study = input.nextInt();
	                      }
	                      else {
	                    	  System.out.print("[ No ]\n");
	                    	  break;
	                      }
	                   }
	                   
	                   else if(study == 2){
	                      System.out.println("\t \t >>시스템 프로그래밍 강의 시작<< \t \t");
	                      Intelli+=5;
	                      System.out.println("교수님 : 터미널에서 cd apue.3파일로 이동해서 $%@#!@*&가나다$^@#... ");
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");
	                      System.out.println("교수님:$%@#!@*&가나다$^@#..."+" [ 지능 : "+ Intelli+ "만큼 올랐어! ]");
	                      Power += 11;
	                      System.out.println("'교수님: 이번 강의 내용을 A4 용지 4페이지 이내로 작성하여 과제 제출하세요' ");
	                      project++;
	                      System.out.println(" !시스템 프로그래밍 과제가 나왔어!"+" [ 피로도 : "+ Power+ "만큼 올랐어!!]" );	
	                      System.out.println("!!!!! 강의가 끝났어!!!!\n 강의를 더 들을까?");
	                      System.out.println("[1. YES] [2. No]");
	                   int[] o = {1,2};
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ]\n");
	   	                      System.out.println("--------------------------강의 목록--------------------------");
	   	                      System.out.println(" 1. 오픈소스 소프트웨어\n 2. 시스템 프로그래밍\n 3. 데이터베이스\n 4. 정보보호 ");
	   	                      System.out.println("----------------------------------------------------------");
	   	                      study = input.nextInt();
	                      }
	                      else {
	                    	  System.out.print("[ No ]\n");
	                    	  break;
	                      }

	                   }
	                   
	                   else if(study == 3) {
	                	  Intelli += 5;	
	                	  Power += 11;
	                	  System.out.println("\t \t >> 데이터베이스 강의 시작  <<\t \t");
	                      System.out.println();
	                      System.out.println();
	                      System.out.println(" '교수님 : 박지성이 구매한 도서의 이름을 검색하시오' " );
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");
	                      System.out.println("교수님:$%@#!@*&가나다$^@#..."+" [ 지능 : "+ Intelli+ "만큼 올랐어! ]");	                      	                      	               	                       
                          System.out.println(" '교수님: 이번 주까지 연습문제 풀어서 과제 제출하세요' ");
                          System.out.println(" !데이터 베이스 과제가 나왔어!"+" [ 피로도 : "+ Power+ "만큼 올랐어!!]" );		                      
	                      project++;
	                      System.out.println("!!!!! 강의가 끝났어!!!!\n 강의를 더 들을까?");
	                      System.out.println("[1. YES] [2. No]");
	                   int[] o = {1,2};
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ]\n");
	   	                      System.out.println("--------------------------강의 목록--------------------------");
	   	                      System.out.println(" 1. 오픈소스 소프트웨어\n 2. 시스템 프로그래밍\n 3. 데이터베이스\n 4. 정보보호 ");
	   	                      System.out.println("----------------------------------------------------------");
	   	                      study = input.nextInt();
	                      }
	                      else {
	                    	  System.out.print("[ No ]\n");	   
	                    	  break;
	                      }

	                   }
	                      
	         
	                   else
	                   {
	                	  System.out.println("\t \t >> 정보보호 << \t \t");
		                  Intelli += 5;
		                  Power += 10;
		                  System.out.println(" '교수님 : 나한테 배우면 쉬워~~' ");
		                  System.out.println("교수님:$%@#!@*&가나다$^@#...");
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");
	                      System.out.println("!!!!! 강의가 끝났어!!!! [ 지능 : "+ Intelli+ "만큼 올랐어!] [피로도 :" +Power+ "만큼 올랐어!]");
	                      System.out.print("더 들을까?\n");
	                      System.out.println("[1. YES] [2. No]");
	                      int[] o = {1,2};
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ]\n");
	   	                      System.out.println("--------------------------강의 목록--------------------------");
	   	                      System.out.println(" 1. 오픈소스 소프트웨어\n 2. 시스템 프로그래밍\n 3. 데이터베이스\n 4. 정보보호 ");
	   	                      System.out.println("----------------------------------------------------------");
	   	                      study = input.nextInt();
	                      }
	                      else {
	                    	  System.out.print("[ No ]\n");
	                    	  break;
	                      }
	                   }	                                    
	                   if(Power == 100) {
	                   Day++;
		               DdayNumber--;
		               Power = 0;
		               System.out.println("\t*******************다음날이 밝았다*******************\t");
	                   }	                   
	                   Power+=10;	                   
	                   }while(select == 1);
	                   break;
	                   
	                   	                 	                   
	                case 2 :
	                	  if(Power >= 100 ) {
			            	   System.out.println("\n ※※※※※※※ 체력이 없습니다. 4번을 선택해주세요 ※※※※※※※");
			            	   continue;
	                	  }
	                   System.out.println("\n             \t \t \t  알바를 가자. \t \t \t\n");
	                   
	                   int job = (int) Math.round(Math.random() * (10) + 1); 
	                        
	                   if(job<=7 && job>0){
	                      System.out.println("              \t \t \t   알바 중   \t \t \t");
	                      System.out.println("\n \t $$$$$$$$$$$$$$$$$ 오만원을 벌었다! $$$$$$$$$$$$$$$$$ \t \n");
	                      Money+=50000;
	                      Power+=50;
	                      Social += 10;
	                      System.out.println(" [ 피로도 : "+Power+" / 현재 나의 잔고 : "+Money+"원 " + "/사회성: "+Social+"]" );
	                   }
	                   else {
		                      System.out.println("\n \t $$$$$$$$$$$$$$$$$ 보너스를 받았다! $$$$$$$$$$$$$$$$$ \t \n");
		                      System.out.println(" \t \t Money +4만원 만큼 올랐다!\t \t\n");
		                      Money+=40000;		                      
		                      Power+= 50;
		                      Power-= 20;
		                      System.out.println(" [ 피로도 : "+Power+" / 현재 나의 잔고 : "+Money+"원 ]" );
	                   }	                   
	                   Day++;
	                   DdayNumber--;
	                  
	                   break;
	                   
	                 case 3 :
	                	  if(Power >= 100 ) {
			            	   System.out.println("\n ※※※※※※※ 체력이 없습니다. 4번을 선택해주세요 ※※※※※※※");
			            	   continue;
	                	  }
	                	 System.out.println("--------------------------친목활동--------------------------");
		                 System.out.println(" \n1. 동아리 활동하기\n 2. 대외활동하기 \n ");
		                 System.out.println("----------------------------------------------------------");
		                 
		                 int j[] = {1,2};
		                 int act = input.nextInt();
		                 if( act == 1) {
		                	 int c = (int) Math.round(Math.random() * (10) + 1);
		                	 System.out.println("\t\t 동아리 활동하기 \t\t");
		                	 System.out.println();
		                	 System.out.println();
		                	 System.out.println();
		                	 System.out.println("\t\t 활동 중 \t\t");
		                	 System.out.println();
		                	 System.out.println();
		                	 System.out.println();
		                	 if((c >= 1) && ( c <=3)) {
		                		 System.out.println("\t\t !!!!!족보를 얻었어!!!!! \t\t");
		                		 Intelli += 2;
		                	 }
		                	 Friend+=10;
		                	 Power +=20;
		                	 Money -= 20000;
		                	 Social +=10;
		                	 System.out.println(" [ 피로도 : "+Power+" / 현재 나의 잔고 : "+Money+"원  / 친화력: "+Friend+ "/ 사교성: "+Social+"만큼 올랐다! ]" );
		                 }
	              /* case 4 :*/
	            }
	            //if(DdayNumber==0)
	            	//System.exit(0);//
	            	//break;// //종강시 while끝나고 엔딩 나오게 함*/
	         }
	      }
	      
	}  
	      // TODO Auto-generated method stub
}
	   


	   


