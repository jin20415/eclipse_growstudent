package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class Lecture {
	static subImagePanel lecturelist = new subImagePanel(new ImageIcon("./image/choice.png").getImage());
	static subImagePanel longs = new subImagePanel(new ImageIcon("./image/longp.png").getImage());
	static subImagePanel shorts = new subImagePanel(new ImageIcon("./image/shortp.png").getImage());
	static subImagePanel lectures = new subImagePanel(new ImageIcon("./image/lecture.jpg").getImage());	
	static JButton button1 = new JButton("N1. 오픈소스소프트웨어");
	static JButton button2 = new JButton("N2. 데이터베이스");
	static JButton button3 = new JButton("N3. 정보보호");
	static JLabel 버튼1교수님 = new JLabel("1) 겸임 교수님: 강신재교수님");
	static JLabel 버튼1강의장소 = new JLabel("2) 강의 장소: 공7514");
	static JLabel 버튼1강의자료 = new JLabel("3) 교재: LMS 강의자료 ");
	static JLabel 버튼2교수님 = new JLabel("1) 겸임 교수님: 남인길교수님");
	static JLabel 버튼2강의장소 = new JLabel("2) 강의 장소: 공7507");
	static JLabel 버튼2강의자료 = new JLabel("3) 교재: 오라클로 배우는 데이터베이스 ");
	static JLabel 버튼3교수님 = new JLabel("1) 겸임 교수님: 김창훈교수님");
	static JLabel 버튼3강의장소 = new JLabel("2) 강의 장소: 공7714");
	static JLabel 버튼3강의자료 = new JLabel("3) 교재: 정보보안개론 ");
	static JLabel 타이틀 = new JLabel("강의선택");
	static JButton 체력확인 = new JButton("체력확인하기");
	static JButton 강의선택하기 = new JButton("강의선택하기");
	static JButton 활동선택하기 = new JButton("활동선택하기");
	static JLabel 시작멘트 = new JLabel();
	static Font 모든레이블폰트 = new Font("HY견고딕", Font.PLAIN, 15);
	static JLabel 교수님멘트 = new JLabel();
	static JLabel 시스템멘트 = new JLabel("'수업이 끝났어! 강의를 더 들을까?'");
	static JLabel 알림멘트 = new JLabel();
	static JLabel 수업시작 = new JLabel();
    static JLabel 스탯레이블 = new JLabel();
  
	static void Lecture() {

		longs.setLayout(null);
		longs.setBounds(0, 30, 200, 40);
		lecturelist.setLayout(null);
		lecturelist.setBounds(194, 10, 640, 640);
		shorts.setLayout(null);
		shorts.setBounds(0, 73, 200, 40);

		Font lecture = new Font("휴먼옛체", Font.BOLD, 22);
		Font labelfont = new Font("HY견고딕", Font.PLAIN, 15);
		Font titlefont = new Font("HY헤드라인M", Font.BOLD, 20);
		Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
		MainGrowStudent.contentPane.add(타이틀);
		MainGrowStudent.contentPane.add(longs);
		MainGrowStudent.contentPane.add(체력확인);
		MainGrowStudent.contentPane.add(활동선택하기);
		// MainGrowStudent.contentPane.add(shorts);

		
		활동선택하기.setBounds(0, 73, 130, 30);
		활동선택하기.setBorderPainted(false);
		활동선택하기.setFocusPainted(false);
		활동선택하기.setBackground(new Color(225, 80, 80));
		활동선택하기.setFont(btnfont);
		체력확인.setVisible(true);
		체력확인.setBounds(0, 113, 130, 30);
		체력확인.setBackground(new Color(225, 80, 80));
		체력확인.setBorderPainted(false);
		체력확인.setFocusPainted(false);
		체력확인.setFont(btnfont);
		타이틀.setVisible(true);
		타이틀.setBounds(17, 20, 300, 60);
		타이틀.setFont(titlefont);
		button1.setFont(lecture);
		button2.setFont(lecture);
		button3.setFont(lecture);
		MainGrowStudent.contentPane.add(PartTime.일과끝내기);
		PartTime.일과끝내기.setFont(btnfont);
		PartTime.일과끝내기.setBackground(new Color(225, 80, 80));
		PartTime.일과끝내기.setBounds(0, 153, 130, 30);
		PartTime.일과끝내기.setBorderPainted(false);
		PartTime.일과끝내기.setFocusPainted(false);
		PartTime.일과끝내기.setVisible(true);
		버튼1교수님.setBounds(95, 155, 500, 20);
		버튼1강의장소.setBounds(95, 175, 200, 20);
		버튼1강의자료.setBounds(95, 195, 200, 20);

		버튼1교수님.setFont(labelfont);
		버튼1강의장소.setFont(labelfont);
		버튼1강의자료.setFont(labelfont);

		버튼2교수님.setBounds(95, 295, 500, 20);
		버튼2강의장소.setBounds(95, 315, 500, 20);
		버튼2강의자료.setBounds(95, 335, 500, 20);

		버튼2교수님.setFont(labelfont);
		버튼2강의장소.setFont(labelfont);
		버튼2강의자료.setFont(labelfont);

		버튼3교수님.setBounds(95, 455, 500, 20);
		버튼3강의장소.setBounds(95, 475, 500, 20);
		버튼3강의자료.setBounds(95, 495, 500, 20);

		버튼3교수님.setFont(labelfont);
		버튼3강의장소.setFont(labelfont);
		버튼3강의자료.setFont(labelfont);

		
		lecturelist.add(버튼1교수님);
		lecturelist.add(버튼1강의장소);
		lecturelist.add(버튼1강의자료);
		lecturelist.add(버튼2교수님);
		lecturelist.add(버튼2강의장소);
		lecturelist.add(버튼2강의자료);
		lecturelist.add(버튼3교수님);
		lecturelist.add(버튼3강의장소);
		lecturelist.add(버튼3강의자료);
		lecturelist.add(button1);
		lecturelist.add(button2);
		lecturelist.add(button3);

		// MainGrowStudent.contentPane.add(타이틀);
		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);

		button1.setFocusPainted(false);
		button2.setFocusPainted(false);
		button3.setFocusPainted(false);

		button1.setBorderPainted(false);
		button2.setBorderPainted(false);
		button3.setBorderPainted(false);

		// 설명.setBounds(10, 5, 400, 40);
		// lecturelist.add(설명);
		button1.setBounds(50, 110, 300, 30);
		button2.setBounds(50, 250, 228, 30);
		button3.setBounds(56, 410, 170, 30);
		활동선택하기.setVisible(true);
		//PartTime.일과끝내기.setVisible(false);
		MainGrowStudent.체력확인레이블.setVisible(false);
		MainGrowStudent.powers.setVisible(false);
		PartTime.설명.setVisible(false);
		PartTime.설명1.setVisible(false);
		PartTime.설명2.setVisible(false);
		PartTime.설명3.setVisible(false);
		PartTime.설명4.setVisible(false);			
		PartTime.설명5.setVisible(false);
		PartTime.내용.setVisible(false);
		PartTime.내용1.setVisible(false);
		PartTime.내용2.setVisible(false);
		PartTime.내용3.setVisible(false);
		PartTime.내용4.setVisible(false);			
		PartTime.내용5.setVisible(false);
		lecturelist.setVisible(true);
		
		
		
		button1.addActionListener(event -> {
					
			
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다",
						"경고", JOptionPane.WARNING_MESSAGE);
				MainGrowStudent.week.setText(""+init.newday());
				init.Power = 100;
				MainGrowStudent.요일선택화면();
				MainGrowStudent.MenuPanel.setVisible(true);
				MainGrowStudent.StartPanel.setVisible(false);
				MainGrowStudent.choosepanel.setVisible(false);
				Lecture.longs.setVisible(false);
				Lecture.shorts.setVisible(false);
				Lecture.lectures.setVisible(false);
				Lecture.활동선택하기.setVisible(false);
				MainGrowStudent.week.setVisible(true);
			}
			if(init.Power <= 24) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n 다른활동을 선택해주세요 ",
						"경고", JOptionPane.WARNING_MESSAGE);
				MainGrowStudent.활동선택메뉴();
			}
			lectures.setLayout(null);
			lectures.setBounds(0, 0, 640, 640);
			시작멘트.setText("'공7514 오픈소스 소프트웨어 강의실에 도착했어 사물함에 가서 강의자료를 가져오자.'");
			시작멘트.setBounds(10, 470, 640, 50);
			시작멘트.setFont(모든레이블폰트);
			수업시작.setText("'강의 시작했어! 집중 해보자.'");
			수업시작.setBounds(10,490,640,50);
			교수님멘트.setText("교수님 : 원격저장소 기능에는 포크, 풀 리퀘스트, 이슈, 위키가 있습니다.");
			교수님멘트.setBounds(10, 510, 640, 50);
			시스템멘트.setBounds(10, 530, 300, 50);
			알림멘트.setText("[알림: 체력 - 25 지능 + 5]");
			알림멘트.setBounds(250, 530, 300, 50);
			알림멘트.setFont(모든레이블폰트);
			교수님멘트.setFont(모든레이블폰트);
			시스템멘트.setFont(모든레이블폰트);
			수업시작.setFont(모든레이블폰트);
			강의선택하기.setBounds(0, 30, 130, 30);
			체력확인.setBounds(0, 75, 120, 35);
			lectures.add(시작멘트);
			lectures.add(알림멘트);
			lectures.add(교수님멘트);
			lectures.add(시스템멘트);
			lectures.add(강의선택하기);
			lectures.add(수업시작);
			수업시작.setVisible(true);
			타이틀.setVisible(false);
			알림멘트.setVisible(true);
			교수님멘트.setVisible(true);
			시스템멘트.setVisible(true);
			강의선택하기.setVisible(true);
			강의선택하기.setBackground(new Color(225, 80, 80));
			강의선택하기.setBorderPainted(false);
			강의선택하기.setFocusPainted(false);
			강의선택하기.setFont(btnfont);
			강의선택하기.setVisible(true);
			longs.setVisible(false);
			shorts.setVisible(false);
			button1.setVisible(false);
			button2.setVisible(false);
			button3.setVisible(false);
			버튼1강의장소.setVisible(false);
			버튼1강의자료.setVisible(false);
			버튼1교수님.setVisible(false);
			체력확인.setVisible(false);
			MainGrowStudent.contentPane.add(PartTime.일과끝내기);
			PartTime.일과끝내기.setFont(btnfont);
			PartTime.일과끝내기.setBackground(new Color(225, 80, 80));
			PartTime.일과끝내기.setBounds(0, 115, 130, 30);
			PartTime.일과끝내기.setBorderPainted(false);
			PartTime.일과끝내기.setFocusPainted(false);
			PartTime.일과끝내기.setVisible(true);
			lecturelist.setVisible(false);
			MainGrowStudent.powers.setVisible(true);
			MainGrowStudent.powers.setBounds(570, 555, 640, 90);

			MainGrowStudent.체력확인레이블.setText(""+init.lecturepower());
			MainGrowStudent.체력확인레이블.setBounds(590,535, 60, 90);
			MainGrowStudent.powers.add(MainGrowStudent.체력확인레이블);
			MainGrowStudent.체력확인레이블.setFont(btnfont);
	    	MainGrowStudent.contentPane.add(MainGrowStudent.체력확인레이블);
		//	MainGrowStudent.lecturepower().setVisible(true);
			MainGrowStudent.contentPane.add(MainGrowStudent.powers);
		//    MainGrowStudent.contentPane.add(MainGrowStudent.체력확인레이블);
			MainGrowStudent.MenuPanel.setVisible(false);
			MainGrowStudent.choosepanel.setVisible(false);
			MainGrowStudent.week.setVisible(false);
			MainGrowStudent.체력확인레이블.setVisible(true);
			MainGrowStudent.contentPane.setBounds(640, 480, 640, 120);
			MainGrowStudent.contentPane.add(lectures);
			PartTime.내용.setVisible(false);
			PartTime.내용1.setVisible(false);
			PartTime.내용2.setVisible(false);
			PartTime.내용3.setVisible(false);
			PartTime.내용4.setVisible(false);			
			PartTime.내용5.setVisible(false);
			lectures.setVisible(true);
			
			MainGrowStudent.contentPane.setVisible(true);
			 
			init.MT();

		});
		button2.addActionListener(event -> {
			
			lectures.setLayout(null);
			lectures.setBounds(0, 0, 640, 640);
			시작멘트.setText("공7507 데이터베이스 강의실에 도착했어!");
			시작멘트.setBounds(10, 485, 300, 50);
			시작멘트.setFont(모든레이블폰트);
			교수님멘트.setText("교수님 : 테이블의 기본키는 단 한개이며, \n교수님: @#$!!^*!@$^%*^(!@$#@#%&*(_)))(^@#!@!");
			교수님멘트.setBounds(10, 500, 500, 50);
			시스템멘트.setBounds(10, 530, 300, 50);
			알림멘트.setText("[알림: 체력 - 25 지능 + 5]");
			알림멘트.setBounds(250, 530, 300, 50);
			알림멘트.setFont(모든레이블폰트);
			교수님멘트.setFont(모든레이블폰트);
			시스템멘트.setFont(모든레이블폰트);
			수업시작.setFont(모든레이블폰트);
			강의선택하기.setBounds(0, 30, 130, 30);
			체력확인.setBounds(0, 75, 120, 35);
			lectures.add(시작멘트);
			lectures.add(알림멘트);
			lectures.add(교수님멘트);
			lectures.add(시스템멘트);
			lectures.add(강의선택하기);
			lectures.add(수업시작);
			수업시작.setVisible(true);
			타이틀.setVisible(false);
			알림멘트.setVisible(true);
			교수님멘트.setVisible(true);
			시스템멘트.setVisible(true);
			강의선택하기.setVisible(true);
			강의선택하기.setBackground(new Color(225, 80, 80));
			강의선택하기.setBorderPainted(false);
			강의선택하기.setFocusPainted(false);
			강의선택하기.setFont(btnfont);
			강의선택하기.setVisible(true);
			longs.setVisible(false);
			shorts.setVisible(false);
			button1.setVisible(false);
			button2.setVisible(false);
			button3.setVisible(false);
			버튼1강의장소.setVisible(false);
			버튼1강의자료.setVisible(false);
			버튼1교수님.setVisible(false);
			체력확인.setVisible(false);
			MainGrowStudent.contentPane.add(PartTime.일과끝내기);
			PartTime.일과끝내기.setFont(btnfont);
			PartTime.일과끝내기.setBackground(new Color(225, 80, 80));
			PartTime.일과끝내기.setBounds(0, 115, 130, 30);
			PartTime.일과끝내기.setBorderPainted(false);
			PartTime.일과끝내기.setFocusPainted(false);
			PartTime.일과끝내기.setVisible(true);
			lecturelist.setVisible(false);
			MainGrowStudent.powers.setVisible(true);
			MainGrowStudent.powers.setBounds(570, 555, 640, 90);

			//JLabel 체력확인레이블 = new JLabel("" + MainGrowStudent.lecturepower());
			MainGrowStudent.체력확인레이블.setText(""+init.lecturepower());
			MainGrowStudent.체력확인레이블.setBounds(590,535, 60, 90);
			MainGrowStudent.powers.add(MainGrowStudent.체력확인레이블);
			MainGrowStudent.체력확인레이블.setFont(btnfont);
	    	MainGrowStudent.contentPane.add(MainGrowStudent.체력확인레이블);
		//	MainGrowStudent.lecturepower().setVisible(true);
			MainGrowStudent.contentPane.add(MainGrowStudent.powers);
		//    MainGrowStudent.contentPane.add(MainGrowStudent.체력확인레이블);
			MainGrowStudent.MenuPanel.setVisible(false);
			MainGrowStudent.choosepanel.setVisible(false);
			MainGrowStudent.week.setVisible(false);
			MainGrowStudent.체력확인레이블.setVisible(true);
			MainGrowStudent.contentPane.setBounds(640, 480, 640, 120);
			MainGrowStudent.contentPane.add(lectures);
			PartTime.내용.setVisible(false);
			PartTime.내용1.setVisible(false);
			PartTime.내용2.setVisible(false);
			PartTime.내용3.setVisible(false);
			PartTime.내용4.setVisible(false);			
			PartTime.내용5.setVisible(false);
			lectures.setVisible(true);
			
			MainGrowStudent.contentPane.setVisible(true);
			 
			init.MT();

		});
		button3.addActionListener(event -> {
			
			lectures.setLayout(null);
			lectures.setBounds(0, 0, 640, 640);
			시작멘트.setText("공7714 정보보호 강의실에 도착했어!");
			시작멘트.setBounds(10, 455, 600, 50);
			시작멘트.setFont(모든레이블폰트);
			교수님멘트.setText("교수님 : 나에게 배우면 쉬워~~ \n교수님: @#$!!^*!@$^%*^(!@$#@#%&*(_)))(^@#!@!");
			교수님멘트.setBounds(10, 500, 500, 50);
			시스템멘트.setBounds(10, 530, 300, 50);
			알림멘트.setText("[알림: 체력 - 25 지능 + 5]");
			알림멘트.setBounds(250, 530, 300, 50);
			알림멘트.setFont(모든레이블폰트);
			교수님멘트.setFont(모든레이블폰트);
			시스템멘트.setFont(모든레이블폰트);
			수업시작.setFont(모든레이블폰트);
			강의선택하기.setBounds(0, 30, 130, 30);
			체력확인.setBounds(0, 75, 120, 35);
			lectures.add(시작멘트);
			lectures.add(알림멘트);
			lectures.add(교수님멘트);
			lectures.add(시스템멘트);
			lectures.add(강의선택하기);
			lectures.add(수업시작);
			수업시작.setVisible(true);
			타이틀.setVisible(false);
			알림멘트.setVisible(true);
			교수님멘트.setVisible(true);
			시스템멘트.setVisible(true);
			강의선택하기.setVisible(true);
			강의선택하기.setBackground(new Color(225, 80, 80));
			강의선택하기.setBorderPainted(false);
			강의선택하기.setFocusPainted(false);
			강의선택하기.setFont(btnfont);
			강의선택하기.setVisible(true);
			longs.setVisible(false);
			shorts.setVisible(false);
			button1.setVisible(false);
			button2.setVisible(false);
			button3.setVisible(false);
			버튼1강의장소.setVisible(false);
			버튼1강의자료.setVisible(false);
			버튼1교수님.setVisible(false);
			체력확인.setVisible(false);
			MainGrowStudent.contentPane.add(PartTime.일과끝내기);
			PartTime.일과끝내기.setFont(btnfont);
			PartTime.일과끝내기.setBackground(new Color(225, 80, 80));
			PartTime.일과끝내기.setBounds(0, 115, 130, 30);
			PartTime.일과끝내기.setBorderPainted(false);
			PartTime.일과끝내기.setFocusPainted(false);
			PartTime.일과끝내기.setVisible(true);
			lecturelist.setVisible(false);
			MainGrowStudent.powers.setVisible(true);
			MainGrowStudent.powers.setBounds(570, 555, 640, 90);

			//JLabel 체력확인레이블 = new JLabel("" + MainGrowStudent.lecturepower());
			MainGrowStudent.체력확인레이블.setText(""+init.lecturepower());
			MainGrowStudent.체력확인레이블.setBounds(590,535, 60, 90);
			MainGrowStudent.powers.add(MainGrowStudent.체력확인레이블);
			MainGrowStudent.체력확인레이블.setFont(btnfont);
	    	MainGrowStudent.contentPane.add(MainGrowStudent.체력확인레이블);
		//	MainGrowStudent.lecturepower().setVisible(true);
			MainGrowStudent.contentPane.add(MainGrowStudent.powers);
		//    MainGrowStudent.contentPane.add(MainGrowStudent.체력확인레이블);
			MainGrowStudent.MenuPanel.setVisible(false);
			MainGrowStudent.choosepanel.setVisible(false);
			MainGrowStudent.week.setVisible(false);
			MainGrowStudent.체력확인레이블.setVisible(true);
			MainGrowStudent.contentPane.setBounds(640, 480, 640, 120);
			MainGrowStudent.contentPane.add(lectures);
			PartTime.내용.setVisible(false);
			PartTime.내용1.setVisible(false);
			PartTime.내용2.setVisible(false);
			PartTime.내용3.setVisible(false);
			PartTime.내용4.setVisible(false);			
			PartTime.내용5.setVisible(false);
			
			lectures.setVisible(true);
			
			MainGrowStudent.contentPane.setVisible(true);
			 
			init.MT();
			// init.정보보호();
			// Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년 " + init.Month + "월 " +
			// init.Day + "일 " + init.Today//
			// + "요일");
			// Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
			// " 친화력 " + init.Friend);//

		});
		활동선택하기.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "활동 선택으로 이동합니다", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			MainGrowStudent.contentPane.setBounds(0, 0, 640, 151);
			MainGrowStudent.활동선택메뉴();
			MainGrowStudent.choosepanel.setVisible(true);
			MainGrowStudent.contentPane.setBackground(Color.WHITE);
			MainGrowStudent.contentPane.setVisible(true);
			스탯레이블.setText(""+init.getday());
			스탯레이블.setBounds(5,15,40,30);
			스탯레이블.setVisible(true);
			lecturelist.setVisible(false);
			longs.setVisible(false);
			shorts.setVisible(false);
			활동선택하기.setVisible(false);
			타이틀.setVisible(false);
			lectures.setVisible(false);
			버튼1교수님.setVisible(false);
			버튼1강의자료.setVisible(false);
			버튼1강의장소.setVisible(false);
			버튼2교수님.setVisible(false);
			버튼2강의자료.setVisible(false);
			버튼2강의장소.setVisible(false);
			버튼3교수님.setVisible(false);
			버튼3강의자료.setVisible(false);
			버튼3강의장소.setVisible(false);
			MainGrowStudent.돈확인레이블.setText(""+"돈: "+init.Money +" 사교성:"+init.Friend+" 지식:"+ init.lectureIntel());
			MainGrowStudent.돈확인레이블.setBounds(100,15,500,50);
			MainGrowStudent.돈확인레이블.setFont(btnfont);
			MainGrowStudent.돈확인레이블.setVisible(true);
			MainGrowStudent.contentPane.add(MainGrowStudent.돈확인레이블);
			MainGrowStudent.powers.setLayout(null);
			MainGrowStudent.powers.setBounds(520,5,80,80);	
			MainGrowStudent.체력확인레이블.setText(""+init.getpower());
			MainGrowStudent.체력확인레이블.setBounds(530,15,40,30);
			MainGrowStudent.체력확인레이블.setFont(btnfont);
			MainGrowStudent.powers.add(MainGrowStudent.체력확인레이블);
			MainGrowStudent.contentPane.add(스탯레이블);
			MainGrowStudent.contentPane.add(MainGrowStudent.체력확인레이블);
			MainGrowStudent.contentPane.add(MainGrowStudent.powers);
			PartTime.내용.setVisible(false);
			PartTime.내용1.setVisible(false);
			PartTime.내용2.setVisible(false);
			PartTime.내용3.setVisible(false);
			PartTime.내용4.setVisible(false);			
			PartTime.내용5.setVisible(false);
			MainGrowStudent.powers.setVisible(true);
			MainGrowStudent.체력확인레이블.setVisible(true);
			MainGrowStudent.contentPane.setBounds(0,0,640,109);
			MainGrowStudent.contentPane.setVisible(true);
			
			

		});

		체력확인.addActionListener(event -> {
			체력확인.setText("" + init.getpower());
		});
		강의선택하기.addActionListener(event -> {
			강의선택();
		});
		PartTime.일과끝내기.addActionListener(event -> {

			JLabel 남은날짜 = new JLabel();
			남은날짜.setText("" + init.newday());
			남은날짜.setVisible(true);
			남은날짜.setBounds(10, 5, 600, 40);
			MainGrowStudent.MenuPanel.add(남은날짜);
			MainGrowStudent.요일선택화면();
			MainGrowStudent.MenuPanel.setVisible(true);
			MainGrowStudent.StartPanel.setVisible(false);
			MainGrowStudent.choosepanel.setVisible(false);
			Lecture.longs.setVisible(false);
			Lecture.shorts.setVisible(false);
			Lecture.lectures.setVisible(false);
			Lecture.활동선택하기.setVisible(false);
			PartTime.일과끝내기.setVisible(false);
			MainGrowStudent.powers.setVisible(false);
			MainGrowStudent.week.setVisible(true);
		});
	}

	static void 강의선택() {
		longs.setLayout(null);
		longs.setBounds(0, 30, 200, 40);
		lecturelist.setLayout(null);
		lecturelist.setBounds(194, 10, 640, 640);
		shorts.setLayout(null);
		shorts.setBounds(0, 73, 200, 40);

		Font lecture = new Font("휴먼옛체", Font.BOLD, 22);
		Font labelfont = new Font("HY견고딕", Font.PLAIN, 15);
		Font titlefont = new Font("HY헤드라인M", Font.BOLD, 20);
		Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
		MainGrowStudent.contentPane.add(타이틀);
		MainGrowStudent.contentPane.add(longs);
		MainGrowStudent.contentPane.add(체력확인);
		MainGrowStudent.contentPane.add(활동선택하기);
		// MainGrowStudent.contentPane.add(shorts);
        longs.setVisible(true);
		활동선택하기.setVisible(true);
		활동선택하기.setBounds(0, 73, 130, 30);
		활동선택하기.setBorderPainted(false);
		활동선택하기.setFocusPainted(false);
		활동선택하기.setBackground(new Color(225, 80, 80));
		활동선택하기.setFont(btnfont);
		체력확인.setVisible(true);
		체력확인.setBounds(0, 113, 130, 30);
		체력확인.setBackground(new Color(225, 80, 80));
		체력확인.setBorderPainted(false);
		체력확인.setFocusPainted(false);
		체력확인.setFont(btnfont);
		타이틀.setVisible(true);
		타이틀.setBounds(17, 20, 300, 60);
		타이틀.setFont(titlefont);
		button1.setFont(lecture);
		button2.setFont(lecture);
		button3.setFont(lecture);

		버튼1교수님.setBounds(95, 155, 500, 20);
		버튼1강의장소.setBounds(95, 175, 200, 20);
		버튼1강의자료.setBounds(95, 195, 200, 20);

		버튼1교수님.setFont(labelfont);
		버튼1강의장소.setFont(labelfont);
		버튼1강의자료.setFont(labelfont);

		버튼2교수님.setBounds(95, 295, 500, 20);
		버튼2강의장소.setBounds(95, 315, 500, 20);
		버튼2강의자료.setBounds(95, 335, 500, 20);

		버튼2교수님.setFont(labelfont);
		버튼2강의장소.setFont(labelfont);
		버튼2강의자료.setFont(labelfont);

		버튼3교수님.setBounds(95, 455, 500, 20);
		버튼3강의장소.setBounds(95, 475, 500, 20);
		버튼3강의자료.setBounds(95, 495, 500, 20);

		버튼3교수님.setFont(labelfont);
		버튼3강의장소.setFont(labelfont);
		버튼3강의자료.setFont(labelfont);

		lecturelist.add(버튼1교수님);
		lecturelist.add(버튼1강의장소);
		lecturelist.add(버튼1강의자료);
		lecturelist.add(버튼2교수님);
		lecturelist.add(버튼2강의장소);
		lecturelist.add(버튼2강의자료);
		lecturelist.add(버튼3교수님);
		lecturelist.add(버튼3강의장소);
		lecturelist.add(버튼3강의자료);
		lecturelist.add(button1);
		lecturelist.add(button2);
		lecturelist.add(button3);

		// MainGrowStudent.contentPane.add(타이틀);
		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);

		button1.setFocusPainted(false);
		button2.setFocusPainted(false);
		button3.setFocusPainted(false);

		button1.setBorderPainted(false);
		button2.setBorderPainted(false);
		button3.setBorderPainted(false);

		// 설명.setBounds(10, 5, 400, 40);
		// lecturelist.add(설명);
		button1.setBounds(50, 110, 300, 30);
		button2.setBounds(50, 250, 228, 30);
		button3.setBounds(56, 410, 170, 30);
		button1.setVisible(true);
		button2.setVisible(true);
		button3.setVisible(true);
		lectures.setVisible(false);
		PartTime.내용.setVisible(false);
		PartTime.내용1.setVisible(false);
		PartTime.내용2.setVisible(false);
		PartTime.내용3.setVisible(false);
		PartTime.내용4.setVisible(false);			
		PartTime.내용5.setVisible(false);
		버튼1교수님.setVisible(true);
		버튼1강의장소.setVisible(true);
		버튼1강의자료.setVisible(true);
        MainGrowStudent.powers.setVisible(false);
        MainGrowStudent.체력확인레이블.setText(""+init.getpower());
        MainGrowStudent.체력확인레이블.setVisible(false);
       
		lecturelist.setVisible(true);
	}
	

}
