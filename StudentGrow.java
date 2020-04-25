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
             int Social = 0;
             int answer; 
             int project = 0;
             int study;
	         String Daily[]={"화","수","목","금","토","일","월"};
	         String Today = null;
	         while(true){
	        	 if(Month == 4) {Today=Daily[Day%7];}
	            System.out.println("=============================================================================");
	            System.out.println("종강까지 D-" + DdayNumber + "  2020년  "+ Month +"월  "+ Day+"일  " + Today + "요일");
	            System.out.println("피로도 : "+Power+"  /  지적능력: "+Intelli+" /  돈 : "+Money+"원   /  사교성 : "+Friend + " /  사회성: "+Social);
	            System.out.println();
	            System.out.println("주인공 : 앞으로 중간고사까지 "+DdayNumber+"일! 뭘 해볼까?");
	            System.out.println();
	            System.out.println("1. 강의듣기 : 공부를 하자! 학점을 살려야겠어!(피로도 +10 , 지능 +5 주말은 선택안됨)");
	            System.out.println("2. 알바가기 : 돈을 벌어보자! 힘든만큼  보람찰거야!(피로도 +50, 돈 +50000)"); 
	            System.out.println("3. 친목활동하기 : 친목을 쌓아보자! 인맥도 능력이랬어!(피로도 +20, 돈 -20000, 사교성 +10 , 사회성 +10)"); 
	            System.out.println("4. 빈둥대기 : 쉬어보자! 역시 쉬는게 최고야!(1일 소모,피로도 0)");//랜덤함수로 배고파서 충동적으로 피자를 시켰다!(돈 -20000) 이런거..
	            System.out.println("5. 공부하기: 중간고사까지 얼마 남지않았어 공부를 해보자(1일 소모,피로도50, 지능+10)");//과제 하기 공부하기 두개로 
	            System.out.println("=============================================================================");
	            int select = input.nextInt();
	            if(select == 1 && (Today.equals("토") || Today.equals("일"))) {
		               System.out.println("※ 주말이니 다시 선택하세요!");
		               continue;
		               }

	            switch(select){   
	               case 1 :
	                	  if(Power >= 91 ) {
	    	   	                 System.out.println("※※※※※※※※※※※※※ 현재 피로도는 "+Power+"입니다.※※※※※※※※※※※※※※※ ");
		                         System.out.println("................... 피로도가 최소 90이어야합니다!...................");					            	 		
			                     System.out.println("※※※※※※※※※※※※ 피로도가 높아 다음날이 됩니다 ※※※※※※※※※※※※");
				            	 Day++;
				            	 DdayNumber--;
				            	 Power = 0;
				                 break;	
	                	  }
	                   System.out.print("\n강의를 듣는다.\n");
	                   System.out.println("--------------------------강의 목록--------------------------");
	                   System.out.println(" 1. 오픈소스 소프트웨어\n 2. 시스템 프로그래밍\n 3. 데이터베이스\n 4. 정보보호 ");
	                   System.out.println("----------------------------------------------------------");
	                   study = input.nextInt();	                   

	                   do {
	                   if (study == 1){	                	   
	                	  System.out.println("\t \t >>오픈소스 소프트웨어 강의 시작<<\t \t");
	                	  System.out.println();
	                	  System.out.println();
	                	  Intelli+=5;
	                	  Power += 10;
	                      System.out.println("교수님 : 원격저장소의 내용을 로컬저장소로 가져오려면 $%@#!@*&가나다$^@#... " );
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...(지능 : "+ Intelli+ " /  피로도 : " +Power+")");	                      
	                      System.out.println();
	                      System.out.print("강의가 끝났어! 더 들을까?[1. YES] [2. No]\n");	                      
	                   
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ] 연강 시 피로도 +10 패널티를 받게됩니다.\n");
	         	   	            if((Power >= 90)&&(select == 1)) {
	   	   	   	                 System.out.println("※※※※※※※※※※※※※ 현재 피로도는 "+Power+"입니다.※※※※※※※※※※※※※※※ ");
	   		                     System.out.println("................... 피로도가 최소 89이어야합니다!...................");		
	   			            	 System.out.println("※※※※※※※※※※※※ 피로도가 높아 다음날이 됩니다 ※※※※※※※※※※※※");
	   			            	 Day++;
	   			                 DdayNumber--;
	   			                 Power = 0;
	   			                 
	   			                 break;	            	 			            	   
	   		         	    }
	         	   	          Power += 10;
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
	                      System.out.println();
	                      System.out.println();
	                      Intelli+=5;
	                      System.out.println("교수님 : 터미널에서 cd apue.3파일로 이동해서 $%@#!@*&가나다$^@#... ");
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");	                      	                      
	                      Power += 11;
	                      System.out.println("교수님: 이번 강의 내용을 A4 용지 4페이지 이내로 작성하여 과제 제출하세요");
	                      project++;
	                      System.out.println("시스템 프로그래밍 과제가 나왔어!(지능 : "+ Intelli+ " /  피로도 : " +Power+")");	  
	                      System.out.println();
	                      System.out.println("강의가 끝났어! 강의를 더 들을까? [1. YES] [2. No]");
	                 
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ] 연강 시 피로도 +10 패널티를 받게됩니다.\n");	   	                      	   	                      
	  	   	   	            if((Power >= 80)&&(select == 1)) {
	  	   	   	                 System.out.println("※※※※※※※※※※※※※ 현재 피로도는 "+Power+"입니다.※※※※※※※※※※※※※※※ ");
		                         System.out.println("................... 피로도가 최소 79이어야합니다!...................");					            	 		
			                     System.out.println("※※※※※※※※※※※※ 피로도가 높아 다음날이 됩니다 ※※※※※※※※※※※※");
				            	 Day++;
				            	 DdayNumber--;
				            	 Power = 0;
				                 break;	            	   
			         	    }
	  	   	   	              Power+=10;
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
	                      System.out.println("교수님 : 박지성이 구매한 도서의 이름을 검색하시오" );
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");	                       
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...");	                      	                      
                          System.out.println("교수님: 이번 주까지 연습문제 풀어서 과제 제출하세요");
                          System.out.println("!데이터 베이스 과제가 나왔어!(지능 : "+ Intelli+ " /  피로도 : " +Power+")"); 		                      
	                      project++;
	                      System.out.println();
	                      System.out.println("강의가 끝났어! 강의를 더 들을까? [1. YES] [2. No]");
	                  
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ] 연강 시 피로도 +10 패널티를 받게됩니다.\n");		   	                      	   	                      
	  	   	   	            if((Power >= 80)&&(select == 1)) {
	  	   	   	                 System.out.println("※※※※※※※※※※※※※ 현재 피로도는 "+Power+"입니다.※※※※※※※※※※※※※※※ ");
                                 System.out.println("................... 피로도가 최소 79이어야합니다!...................");	
			                     System.out.println("※※※※※※※※※※※※ 피로도가 높아 다음날이 됩니다 ※※※※※※※※※※※※");
				            	 Day++;
				            	 DdayNumber--;
				            	 Power = 0;				            	 
				                 break;					            			            	   
			         	    }
	  	   	   	          Power+=10;
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
	                	  System.out.println("\t\t\t >> 정보보호 << \t\t\t");
	                	  System.out.println();
	                	  System.out.println();
		                  Intelli += 5;
		                  Power += 10;
		                  System.out.println("교수님 : 나한테 배우면 쉬워~~");
		                  System.out.println("교수님:$%@#!@*&가나다$^@#...");	                    
	                      System.out.println("교수님:$%@#!@*&가나다$^@#...(지능 : "+ Intelli+ " /  피로도 : " +Power+")");	                      
	                      System.out.println();
	                      System.out.println("강의가 끝났어! 더 들을까? [1. YES] [2. No]");	                      
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ] 연강 시 피로도 +10 패널티를 받게됩니다.\n");	
	  	   	   	            if((Power >= 90)&&(select == 1)) {
	  	   	   	                 System.out.println("※※※※※※※※※※※※※ 현재 피로도는 "+Power+"입니다.※※※※※※※※※※※※※※※ ");
                                 System.out.println("................... 피로도가 최소 89이어야합니다!...................");		
				            	 System.out.println("※※※※※※※※※※※※ 피로도가 높아 다음날이 됩니다 ※※※※※※※※※※※※");
				            	 Day++;
				            	 DdayNumber--;
				            	 Power = 0;
				            	 break;			            	   
			         	    }
	  	   	   	          Power += 10;
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
		               break;
	                   }	                   	                   	                  
	                   }while(select == 1);
	            
	                   break;
	                   
	                   	                 	                   
	                case 2 :
	                	  if(Power >= 51 ) {	                		  
			            	   System.out.println("※※※※※※※※※※※※※※ 현재 피로도는 "+Power+"입니다. ※※※※※※※※※※※※※※");
			            	   System.out.println("※※※※※※※※※※※※※※※ 피로도가 최소 50이어야합니다.※※※※※※※※※※※※※※※ ");
			            	   Day ++;
			            	   DdayNumber--;
			            	   Power = 0;
			            	   break;
	                	  }
	                   System.out.println("\n             \t \t \t  알바를 가자. \t \t \t\n");
	                   
	                   int job = (int) Math.round(Math.random() * (10) + 1); 
	                        
	                   if(job<=7 && job>0){
	                      System.out.println("     \t \t \t\t  알바 중   \t \t \t\t");
	                      System.out.println("\n\t\t $$$$$$$$$$$$$$$$$ 오만원을 벌었다! $$$$$$$$$$$$$$$$$\t\t \n");
	                      Money+=50000;
	                      Power+=50;
	                      Social += 10;
	                      System.out.println(" [ 피로도 : "+Power+" / 현재 나의 잔고 : "+Money+"원 " + "/사회성: "+Social+"]" );
	                   }
	                   else {
		                      System.out.println("\n \t\t $$$$$$$$$$$$$$$$$ 보너스를 받았다! $$$$$$$$$$$$$$$$$ \t\t \n");
		                      System.out.println(" (피로도가 20 줄었어!)\n");
		                      Money+=40000;		                      
		                      Power+= 50;
		                      Power-= 20;
		                      System.out.println(" [ 피로도 : "+Power+" / 현재 나의 잔고 : "+Money+"원 ]" );
	                   }	                   
	                   	                 
	                   break;
	                   
	                 case 3 :	                	 
	                			                 
	                	  if(Power > 80 ) {
			            	   System.out.println("※※※※※※※※※※※※※※※ 현재 피로도는 "+Power+"입니다. ※※※※※※※※※※※※※※※");
			            	   System.out.println("※※※※※※※※※※※※※※※ 피로도가 최소 80이어야합니다.※※※※※※※※※※※※※※※ ");
			            	   System.out.println("※※※※※※※※※※※※※1번 강의듣기, 4번 빈둥대기만 선택가능합니다.※※※※※※※※※※※");
			            	   System.out.println("1. 강의듣기 : 공부를 하자! 학점을 살려야겠어!(피로도 +10 , 지능 +5 주말은 선택안됨)");
			            	   System.out.println("4. 빈둥대기 : 쉬어보자! 역시 쉬는게 최고야!(1일 소모,피로도 0)");
			            	   
			            	   
			            	   if(Power >= 91) {
			            		   System.out.println("※※※※※※※※※※※※※※※ 현재 피로도는 "+Power+"입니다. ※※※※※※※※※※※※※※※");
			            	       System.out.println("※※※※※※※※※※※※※※※ 피로도가 높아 다음날이 됩니다.※※※※※※※※※※※※※※※ ");   
			            	        Day ++;
			            	        DdayNumber--;
			            	        Power = 0;
			            	        break;
	                	  }			            	   
			            	   break;  
	                 }
	                	  System.out.println("--------------------------친목활동--------------------------");
			              System.out.println(" \n1. 동아리 활동하기\n2. 대외활동하기 \n ");
			              System.out.println("----------------------------------------------------------");		                 		             
		                 int act = input.nextInt();
		                 if( act == 1) {
		                	 int c = (int) Math.round(Math.random() * (10) + 1);
		                	 Friend+=10;
		                	 Power +=20;
		                	 Money -= 20000;
		                	 Social +=10;
		                	 System.out.println("\t\t\t 동아리 활동하기 \t\t\t");
		                	 System.out.println();
		                	 System.out.println("\t $%@#!@*$^@#$%!@#$!%#$%!@#$!%...\t");	
		                	 if((c >= 1) && ( c <=7)) {
		                		 Intelli += 2;
		                		 System.out.println("\t !!!!!족보를 얻었어!!!!! \t (지능 :"+ Intelli+"만큼 올랐어!)");
		                		 
		                	 }
		                	 System.out.println(" [ 피로도 : "+Power+" / 잔고 : "+Money+"원  / 친화력: "+Friend+ "/ 사교성: "+Social+"만큼 올랐다! ]" );
                             
		                 }
		                	 
		                	 else {
		                		 		                	 
		                		 Friend+=10;
			                	 Power +=20;
			                	 Money -= 20000;
			                	 Social +=10;
		                	     
		                		 System.out.println("\t\t\t 대외 활동하기 \t\t\t");
		                		 System.out.println();
		                		 System.out.println("$%@#!@*$^@#$%!@#$!%#$%!@#$!%...");		                		
		                		 System.out.println(" [ 피로도 : "+Power+" / 현재 나의 잔고 : "+Money+"원  / 친화력: "+Friend+ "/ 사교성: "+Social+"만큼 올랐다! ]" );
		                	 }
		                	 break;
		                 	 
		                 
	              
		            case 4 :
		            			            	
		            	System.out.println("\t\t >>>> 빈둥대기 <<<< \t\t");
		            	System.out.println();
	                	System.out.println("---------------------------------------------------------");
		                System.out.println(" \n 1. 게임하기\n 2. Tv 보기 \n 3. 배달시켜먹기\n 4. 영화, 넷플보기 \n 5. 잠을 더 자볼까");
		                System.out.println("----------------------------------------------------------");
		                int v = input.nextInt();
		                do {
		                if(v == 1) {
		                	System.out.printf("[ 게임하기 ]");
		                	System.out.printf("\n 1. 롤\n 2. 롤토체스\n 3. 오버워치\n");
		                	System.out.println("----------------------------------------------------------");
		                	int game = input.nextInt();
		                	if(game == 1) {
			                	System.out.println("[롤 선택]\n");
			                	System.out.println("$%@#!@*$^@#...");
			                	System.out.println("$%@#!@*$^@#...\n");
		                		System.out.println(".. 승  리 ..");
		                		System.out.println("한판 더 할까? [ 1. Yes / 2. No ]");
		                		answer = input.nextInt();
		                		if(answer == 1) {
		                			System.out.println("[ Yes ]\n");
				                	System.out.println("$%@#!@*$^@#...");
				                	System.out.println("$%@#!@*$^@#...\n");
			                		System.out.println(" .. 패  배 ..");
				                	System.out.println("후.. 다른거나 해볼까");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println("\n 1. 게임하기\n 2. Tv 보기 \n 3. 배달시켜먹기\n 4. 영화, 넷플보기 \n 5. 잠을 더 자볼까");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
				                	continue;
	
		                		}
		                		else {
		                			System.out.println("[ No ]");
		                			System.out.println("다른걸 해볼까?");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println(" \n 1.게임하기\n 2. Tv 보기 \n 3. 배달시켜먹기\n 4. 영화, 넷플보기 \n 5. 잠을 더 자볼까");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
				                	continue;
		                		}
		                	}
		                	else if(game == 2) {
			                	System.out.println("[롤토체스 선택]\n");
			                	System.out.println("$%@#!$% 랭겜 중 @*$^@#...");
			                	System.out.println("$%@#!@*$^@#$%!@#$!%...\n");
		                		System.out.println(".. 승  리 ..");
		                		System.out.println("한판 더 할까? [ 1. Yes / 2. No ]");
		                		answer = input.nextInt();
		                		if(answer == 1) {
		                			System.out.println("[ Yes ]\n");
				                	System.out.println("$%@#!$% 랭겜 중 @*$^@#...");
				                	System.out.println("$%@#!@*$^@#$%!@#$!%...\n");
			                		System.out.println(" .. 패  배 ..");
				                	System.out.println("후.. 다른거나 해볼까");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println(" \n 1. 게임하기\n 2. Tv 보기 \n 3. 배달시켜먹기\n 4. 영화, 넷플보기 \n 5. 잠을 더 자볼까");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
	
		                		}
		                		else {
		                			System.out.println("[ No ]\n");
		                			System.out.println("다른걸 해볼까?");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println(" \n 1. 게임하기\n 2. Tv 보기 \n 3. 배달시켜먹기\n 4. 영화, 넷플보기 \n 5. 잠을 더 자볼까");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
		                		}
		                	}
		                	else  {
		                		System.out.println("[오버워치 선택]\n");
		                		System.out.println("$%@#!$% 랭겜 중 @*$^@#...");
			                	System.out.println("$%@#!@*$^@#$%!@#$!%...\n");
		                		System.out.println(".. 승  리 ..");
		                		System.out.println("한판 더 할까? [ 1. Yes / 2. No ]");
		                		answer = input.nextInt();
		                		if(answer == 1) {
		                			System.out.println("[ Yes ]\n");
		                			System.out.println("$%@#!$% 랭겜 중 @*$^@#...");
				                	System.out.println("$%@#!@*$^@#$%!@#$!%...\n");
			                		System.out.println(" .. 패  배 ..");
				                	System.out.println("후.. 다른거나 해볼까");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println("\n 1. 게임하기\n 2. Tv 보기 \n 3. 배달시켜먹기\n 4. 영화, 넷플보기 \n 5. 잠을 더 자볼까");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
	
		                		}
		                		else {
		                			System.out.println("[ No ]\n");
		                			System.out.println("다른걸 해볼까?");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println(" \n 1. 게임하기\n 2. Tv 보기 \n 3. 배달시켜먹기\n 4. 영화, 넷플보기 \n 5. 잠을 더 자볼까");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
				                	
		                		}
		                	}
		                }
		                else if(v == 2) {
		                	System.out.println("TV보기");
		                	System.out.println();
		                	System.out.println("대탈출(시리즈 몰아보기) 시청 중");
		                	System.out.println("$%@#!@*$^@#$%!@#$!%#$%!@#$!%...\n 마지막화까지 다 봤어!");	
		                	System.out.println("※※※※※※※※※※※※ 다음날이 됩니다 ※※※※※※※※※※※※");
		                	Power = 0;
			            	Day++;
			            	DdayNumber--;
		                	break;
		                }
		                else if(v == 3) {
		                	System.out.println(" [ 배달 음식 시키기 ]");		                	
		                	System.out.println(" 1. 고추바사삭 주문\n 2. 감자피자 주문");
		                	System.out.println("---------------------------------------------------------");
		                	int food = input.nextInt();
		                	if(food == 1) {
		                		Money -= 19000;
		                		System.out.println("고추바사삭 주문 중\n");
		                		System.out.println("[돈: "+Money+"]");
		                	}
		                	else {
		                		Money -= 19000;
		                		System.out.println("감자피자 주문 중\n");
		                		System.out.println("[돈: "+Money+"]");
		                	}
		                }
		                else if(v == 4) {
		                	System.out.println(" [ 영화 / 넷플 보기 선택 ]");		                	
		                	System.out.println(" 1. 영화 \n 2. 넷플");
		                	System.out.println("---------------------------------------------------------");
		                	int movie = input.nextInt();
		                	if( movie == 1 ) {
		                		System.out.println("[ 영화 ]\n");
		                		System.out.println("                        기 읍 충\n ");
		                		System.out.println("'제시카 : 제시카, 외동딸, 일리노이 시카고, 과 선배는 김진모, 그는 니 사촌 '");
		                		System.out.println(" 띵 ------dong \n");
		                		System.out.println(" 영화보다 밤을 새버렸네.. ");
		                		System.out.println("※※※※※※※※※※※※ 다음날이 됩니다 ※※※※※※※※※※※※");
		                		
		                		Power = 0;
				            	Day++;
				            	DdayNumber--;
			                	break;
		                		
		                	}
		                	else {
		                		System.out.println("[ 넷플릭스 ]\n");
		                		System.out.println("                        왕 덤\n ");
		                		System.out.println("'주진모: 단 한명의 백성도 포기하지 않을 것입니다. '");
		                		System.out.println(" 중전: 어떠하냐? 내 아기가 아주 건강해보이지 않느냐? \n");
		                		System.out.println(" ...뭐?.. \n 시즌 4 기대된다!");
		                		System.out.println("※※※※※※※※※※※※ 다음날이 됩니다 ※※※※※※※※※※※※");
		                		
		                		Money = -10000;
		                		Power = 0;
				            	Day++;
				            	DdayNumber--;
			                	break;
		                	}
		                }
		                else {
		                	System.out.println("[ 잠이나 더 자볼까?]\n");
		                	System.out.println();
		                	System.out.println();
		                	Power = 0;
			            	Day++;
			            	DdayNumber--;
			            	System.out.println("※※※※※※※※※※※※ 다음날이 됩니다 ※※※※※※※※※※※※");
		                	break;
		                }
	          
	         }while(select == 4);
		          
	                	
		      break;
		      
		            case 5:
		          	  if(Power >= 51 ) {
 	   	                 System.out.println("※※※※※※※※※※※※※ 현재 피로도는 "+Power+"입니다.※※※※※※※※※※※※※※※ ");
	                     System.out.println("................... 피로도가 최소 50이어야합니다!...................");
	                     System.out.println("---------------------------------------------------------");
	                     System.out.println("[선택지]\n 1. 강의 듣기\n 3.친목활동\n 4.빈둥대기만 선택가능합니다............");	
			            	 
			                 break;	
             	  }
		            	System.out.println("\t\t >>>> 공부하기 <<<< \t\t");
		             	System.out.println();		                	
	                	System.out.println(" 1. 공부하기 \n 2. 과제하기");
	                	System.out.println("---------------------------------------------------------");
	                	int w = input.nextInt();
	                	if(w == 1) {
	                		Power+=50;
	                		Intelli+=10;
	                		System.out.println("[ 공부하기 ]\n");
	                		System.out.println("부속질의 @#$%SELECT publisher FROM Book SELECT!@#$!\n");
	                		System.out.println("master브랜치의 내용을 $%@#!@*$^@hotfix와 병합#$%!@#$!%...\n");
	                		System.out.println("                         [ 피로도 : "+Power+" / 지능 : "+Intelli+"]" );
	                		Power = 0;
	      		            Day++;
	      		            DdayNumber--;
	      		            System.out.println("※※※※※※※※※※※※ 다음날이 됩니다 ※※※※※※※※※※※※");
	      		            break;
	                	}
	      }
		}  
	}
  }
}
//if(DdayNumber==0)
//System.exit(0);//
//break;// //종강시 while끝나고 엔딩 나오게 함*/
	      // TODO Auto-generated method stub

	   

