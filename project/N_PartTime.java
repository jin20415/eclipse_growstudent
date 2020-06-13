package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class N_PartTime extends JFrame {
	Container contentPane;

	subImagePanel 알바선택 = new subImagePanel(new ImageIcon("./image/career4.png").getImage());
	subImagePanel theater = new subImagePanel(new ImageIcon("./image/theater.jpg").getImage());
	subImagePanel pizza = new subImagePanel(new ImageIcon("./image/pizza.jpg").getImage());
	subImagePanel bakery = new subImagePanel(new ImageIcon("./image/bakery.jpg").getImage());

	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());
	subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());

	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
	subImagePanel N_Selectpanel = new subImagePanel(new ImageIcon("./image/N_select_home.png").getImage());

	JButton lecturebtn = new JButton("이동");
	JButton partbtn = new JButton("이동");
	JButton restbtn = new JButton("이동");
	JButton studybtn = new JButton("이동");

	JButton fitnessbtn = new JButton("이동");
	JButton N_MoveBtn = new JButton("활동하기");

	Font bonusfont = new Font("HY견고딕", Font.BOLD, 10);
	Font 설명폰트 = new Font("휴먼둥근헤드라인", Font.PLAIN, 20);
	Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font 활동선택버튼폰트 = new Font("HY견고딕", Font.BOLD, 15);
	Font 활동선택폰트 = new Font("HY견고딕", Font.PLAIN, 12);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font f3 = new Font("HY견고딕", Font.BOLD, 18);
	Font 내용폰트 = new Font("HY견고딕", Font.PLAIN, 18);
	Font 내용6폰트 = new Font("HY견고딕", Font.BOLD, 12);
	Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 22);

	JButton 활동선택버튼 = new JButton("활동선택");
	JButton 일과끝내기 = new JButton("일과 종료");
	JButton 영화관알바 = new JButton("영화관 알바 이동");
	JButton 제과점알바 = new JButton("제과점 알바 이동");
	JButton 패스트푸드알바 = new JButton("패스트푸드 알바 이동");

	JButton SelectBtn = new JButton("홈 이동");
//	JButton EndBtn = new JButton("일과 종료");

	JLabel 설명 = new JLabel("알바 면접을 합격한 곳은 제과점, 영화관, 패스트푸드점");
	JLabel 설명1 = new JLabel("단 3곳이야");
	JLabel 설명2 = new JLabel("어떤 직종의 알바를 해볼까?");

	JLabel 내용 = new JLabel();
	JLabel 내용1 = new JLabel();
	JLabel 내용2 = new JLabel();
	JLabel 내용3 = new JLabel();
	JLabel 내용4 = new JLabel();
	JLabel 내용5 = new JLabel();
	JLabel 내용6 = new JLabel();

	N_PartTime(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
		setTitle("알바가기");
		contentPane = getContentPane();
		setLayout(null);
		setSize(655, 655);
		setVisible(true);

		알바선택.setLayout(null);
		알바선택.setBounds(0, 100, 655, 290);

		설명.setBounds(57, 125, 655, 640);
		설명.setFont(설명폰트);

		설명1.setBounds(260, 155, 655, 640);
		설명1.setFont(설명폰트);

		설명2.setBounds(180, 185, 655, 640);
		설명2.setFont(설명폰트);

		powers.setLayout(null);
		powers.setBounds(25, 5, 100, 100);
		PL.setText("" + init.Power);
		PL.setBounds(15, 5, 50, 50);
		PL.setFont(powerfont);
		powers.add(PL);
		powers.setVisible(true);
		contentPane.add(powers);

		intellis.setLayout(null);
		intellis.setBounds(110, 5, 100, 100);
		IL.setText("" + init.Intelli);
		IL.setBounds(18, 5, 50, 50);
		IL.setFont(powerfont);
		intellis.add(IL);
		intellis.setVisible(true);
		contentPane.add(intellis);

		moneys.setLayout(null);
		moneys.setBounds(190, 5, 100, 100);
		ML.setText("" + init.Money);
		ML.setBounds(5, 13, 100, 50);
		ML.setFont(powerfont);
		moneys.add(ML);
		moneys.setVisible(true);
		contentPane.add(moneys);

		friends.setLayout(null);
		friends.setBounds(290, 5, 100, 100);
		FL.setText("" + init.Friend);
		FL.setBounds(25, 5, 150, 50);
		FL.setFont(powerfont);
		friends.add(FL);
		friends.setVisible(true);
		contentPane.add(friends);

		dates.setLayout(null);
		dates.setBounds(390, 0, 100, 100);
		DL.setText("D- " + init.DdayNumber);
		DL.setBounds(12, 16, 150, 50);
		DL.setFont(powerfont);
		dates.add(DL);
		dates.setVisible(true);
		contentPane.add(dates);

		영화관알바.setBounds(75, 55, 150, 25);
		영화관알바.setBorderPainted(false);
		영화관알바.setFocusPainted(false);
		영화관알바.setBackground(Color.WHITE);
		영화관알바.setVisible(true);

		패스트푸드알바.setBounds(250, 55, 150, 25);
		패스트푸드알바.setBorderPainted(false);
		패스트푸드알바.setFocusPainted(false);
		패스트푸드알바.setBackground(Color.WHITE);
		패스트푸드알바.setVisible(true);

		제과점알바.setBounds(420, 55, 150, 25);
		제과점알바.setBorderPainted(false);
		제과점알바.setFocusPainted(false);
		제과점알바.setBackground(Color.WHITE);
		제과점알바.setVisible(true);

		제과점알바.setFont(활동선택폰트);
		영화관알바.setFont(활동선택폰트);
		패스트푸드알바.setFont(활동선택폰트);

		영화관알바.setVisible(true);
		패스트푸드알바.setVisible(true);
		제과점알바.setVisible(true);

		알바선택.add(영화관알바);
		알바선택.add(패스트푸드알바);
		알바선택.add(제과점알바);

		contentPane.setBounds(0, 290, 655, 349);
		contentPane.setBackground(Color.WHITE);
		contentPane.add(알바선택);
		contentPane.add(설명);
		contentPane.add(설명1);
		contentPane.add(설명2);

		contentPane.setVisible(true);

		영화관알바.addActionListener(event -> {

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

			contentPane.setBackground(Color.WHITE);

			SelectBtn.setBounds(0, 30, 110, 30);
			SelectBtn.setBackground(new Color(93, 115, 145));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			theater.add(SelectBtn);

/*			EndBtn.setBounds(0, 70, 110, 30);
			EndBtn.setBackground(new Color(93, 115, 145));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			theater.add(EndBtn);*/

			Font 내용폰트 = new Font("HY견고딕", Font.PLAIN, 18);
			Font 내용6폰트 = new Font("HY견고딕", Font.BOLD, 12);

			내용.setText("영화관에 출근했어. 나는 팝콘 포지션을 담당해야해. ");
			내용.setBounds(10, 180, 655, 640);
			내용1.setText("손님들이 몰리기 전, 재료를 빠르게 소분하고 빨대와 냅킨을 채운 후");
			내용1.setBounds(10, 200, 655, 640);
			내용2.setText("서둘러 팝콘 기계를 돌렸어. 잠시후 손님들이 몰려오기 시작했어!");
			내용2.setBounds(10, 220, 655, 640);
			내용3.setText("주문 계산 후 주문 받은 음식들을 준비해야해서 정신이 없었어.");
			내용3.setBounds(10, 240, 655, 640);
			내용4.setText("인기 있는 영화가 시작되면 잠시 쉴 수 있었어! 이렇게 반복을 하던 중!!");
			내용4.setBounds(10, 260, 655, 640);
			내용5.setText("마침내 교대 시간이 왔어!! 교대 후 영화관에서 나왔어! ");
			내용5.setBounds(10, 280, 655, 640);
			내용6.setText("[. . .알바가 끝났습니다.]");
			내용6.setBounds(470, 280, 655, 640);

			내용.setFont(내용폰트);
			내용1.setFont(내용폰트);
			내용2.setFont(내용폰트);
			내용3.setFont(내용폰트);
			내용4.setFont(내용폰트);
			내용5.setFont(내용폰트);
			내용6.setFont(내용6폰트);

			theater.setVisible(true);
			theater.setLayout(null);
			theater.setBounds(0, 0, 655, 420);

			contentPane.add(theater);
			contentPane.add(내용);
			contentPane.add(내용1);
			contentPane.add(내용2);
			contentPane.add(내용3);
			contentPane.add(내용4);
			contentPane.add(내용5);
			contentPane.add(내용6);

			내용.setVisible(true);
			내용1.setVisible(true);
			내용2.setVisible(true);
			내용3.setVisible(true);
			내용4.setVisible(true);
			내용5.setVisible(true);

			init.N_money_up();

			powers.setLayout(null);
			powers.setBounds(25, 425, 100, 100);
			PL.setText("" + init.Power);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 425, 100, 100);
			IL.setText("" + init.Intelli);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 420, 100, 100);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 430, 100, 100);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(390, 420, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

			contentPane.setBounds(0, 410, 655, 140);
			contentPane.add(pizza);
			알바선택.setVisible(false);
			알바선택.setVisible(false);
			패스트푸드알바.setVisible(false);
			영화관알바.setVisible(false);
			제과점알바.setVisible(false);

			설명.setVisible(false);
			설명1.setVisible(false);
			설명2.setVisible(false);
			// 설명3.setVisible(false);
			// 설명4.setVisible(false);
			pizza.setVisible(false);

			contentPane.setBounds(0, 430, 655, 120);

			contentPane.setVisible(true);
		
		});

		패스트푸드알바.addActionListener(event -> {

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

			SelectBtn.setBounds(0, 30, 110, 30);
			SelectBtn.setBackground(new Color(93, 115, 145));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			pizza.add(SelectBtn);

	/*		EndBtn.setBounds(0, 70, 110, 30);
			EndBtn.setBackground(new Color(93, 115, 145));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			pizza.add(EndBtn);*/

			내용.setText("피자 패스트푸드점에 출근했어. 오픈 전, 300개의 포장 박스를 접어야 해. ");
			내용.setBounds(10, 190, 650, 640);
			내용1.setText("정신없이 상자를 다 접고, 12:00 오픈 준비를 끝냈어.");
			내용1.setBounds(10, 210, 640, 640);
			내용2.setText(". . . 잠시후 주문이 밀려오기 시작했어!");
			내용2.setBounds(10, 230, 650, 640);
			내용3.setText("나는 주방에 주문 리스트들을 전달했어. 슬슬 지쳐올 때 쯤 교대시간이?!!");
			내용3.setBounds(10, 250, 650, 640);
			내용4.setText("마침내 교대정산을 마치고 가게를 나왔어!");
			내용4.setBounds(10, 270, 650, 640);
			내용5.setText(". . .[아르바이트가 끝났습니다.]");
			내용5.setBounds(360, 270, 650, 640);

			내용.setFont(내용폰트);
			내용1.setFont(내용폰트);
			내용2.setFont(내용폰트);
			내용3.setFont(내용폰트);
			내용4.setFont(내용폰트);
			내용5.setFont(내용6폰트);
			내용6.setFont(내용6폰트);

			pizza.setLayout(null);
			pizza.setBounds(0, 0, 655, 410);
			contentPane.add(내용);
			contentPane.add(내용1);
			contentPane.add(내용2);
			contentPane.add(내용3);
			contentPane.add(내용4);
			contentPane.add(내용5);
			contentPane.add(내용6);
			내용.setVisible(true);
			내용1.setVisible(true);
			내용2.setVisible(true);
			내용3.setVisible(true);
			내용4.setVisible(true);
			내용5.setVisible(true);
			pizza.setVisible(true);

			init.N_money_up();

			powers.setLayout(null);
			powers.setBounds(25, 425, 100, 100);
			PL.setText("" + init.Power);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 425, 100, 100);
			IL.setText("" + init.Intelli);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 420, 100, 100);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 430, 100, 100);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(390, 420, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

			contentPane.setBounds(0, 410, 655, 140);
			contentPane.add(pizza);
			알바선택.setVisible(false);

			패스트푸드알바.setVisible(false);
			영화관알바.setVisible(false);
			제과점알바.setVisible(false);

			설명.setVisible(false);
			설명1.setVisible(false);
			설명2.setVisible(false);
			// 설명3.setVisible(false);
			// 설명4.setVisible(false);
			pizza.setVisible(true);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		
			

		});

		제과점알바.addActionListener(event -> {

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

			SelectBtn.setBounds(0, 30, 110, 30);
			SelectBtn.setBackground(new Color(93, 115, 145));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			bakery.add(SelectBtn);

	/*		EndBtn.setBounds(0, 70, 110, 30);
			EndBtn.setBackground(new Color(93, 115, 145));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			bakery.add(EndBtn);*/

			contentPane.setBackground(Color.WHITE);

			Font 내용폰트 = new Font("HY견고딕", Font.PLAIN, 16);
			Font 내용6폰트 = new Font("HY견고딕", Font.BOLD, 12);

			내용.setText("제과점에 출근했어. 나는 유니폼으로 갈아 입고 머리를 묶은 뒤 모자를  썼어.");
			내용.setBounds(10, 175, 655, 640);
			내용1.setText("빵들을 포장하기 시작했어. 하지만 ..포장이 생각보다 너무 어려웠어..빵들을 진열한 뒤");
			내용1.setBounds(10, 195, 655, 640);
			내용2.setText("빵의 이름과 위치를 외워야해서 포스기를 통해 암기를 하며 카운터에 서 있었어.");
			내용2.setBounds(10, 215, 655, 640);
			내용3.setText("잠시후 음료 주문이 들어와서 제조방법을 보고 만들어 손님에게 전달했어!");
			내용3.setBounds(10, 235, 655, 640);
			내용4.setText("하루 종일 봉투의 유료화로 무료로 봉투를 요구하는 손님들로 인해 애를 먹었어..");
			내용4.setBounds(10, 255, 655, 640);
			내용5.setText("슬슬 지쳐올 때 쯤 교대 후 제과점에서 나왔어! ");
			내용5.setBounds(10, 275, 655, 640);
			내용6.setText("[. . .알바가 끝났습니다.]");
			내용6.setBounds(360, 275, 655, 640);

			내용.setFont(내용폰트);
			내용1.setFont(내용폰트);
			내용2.setFont(내용폰트);
			내용3.setFont(내용폰트);
			내용4.setFont(내용폰트);
			내용5.setFont(내용폰트);

			bakery.setVisible(true);
			bakery.setLayout(null);
			bakery.setBounds(0, 0, 655, 410);
			contentPane.add(bakery);

			contentPane.add(theater);
			contentPane.add(내용);
			contentPane.add(내용1);
			contentPane.add(내용2);
			contentPane.add(내용3);
			contentPane.add(내용4);
			contentPane.add(내용5);
			contentPane.add(내용6);

			내용.setVisible(true);
			내용1.setVisible(true);
			내용2.setVisible(true);
			내용3.setVisible(true);
			내용4.setVisible(true);
			내용5.setVisible(true);

			init.N_money_up();

			powers.setLayout(null);
			powers.setBounds(25, 425, 100, 100);
			PL.setText("" + init.Power);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 425, 100, 100);
			IL.setText("" + init.Intelli);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 420, 100, 100);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 430, 100, 100);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(390, 420, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

			contentPane.setBounds(0, 410, 655, 140);
			contentPane.add(pizza);
			알바선택.setVisible(false);
			알바선택.setVisible(false);
			패스트푸드알바.setVisible(false);
			영화관알바.setVisible(false);
			제과점알바.setVisible(false);

			설명.setVisible(false);
			설명1.setVisible(false);
			설명2.setVisible(false);
			// 설명3.setVisible(false);
			// 설명4.setVisible(false);
			pizza.setVisible(false);
			theater.setVisible(false);
			contentPane.setBounds(0, 430, 655, 120);

			contentPane.setVisible(true);
			

		});

		SelectBtn.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "홈 화면으로 이동합니다.", "홈 화면으로 이동", JOptionPane.INFORMATION_MESSAGE);
			new N_Home(PL, IL, ML, FL, DL);

			SelectBtn.setVisible(false);
//			EndBtn.setVisible(false);

			JLabel dateLb = new JLabel();
			dateLb.setText("Today 2020년 " + init.Month + "월" + init.Day + "일  " );
			Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
			dateLb.setFont(datefont);
			dateLb.setBounds(380, 10, 600, 40);
			dateLb.setVisible(true);
			HomePanel.add(dateLb);

			N_MoveBtn.setFont(f1);
			N_MoveBtn.setBackground(Color.WHITE);
			N_MoveBtn.setBounds(0, 410, 250, 45);
			N_MoveBtn.setBorderPainted(false);
			N_MoveBtn.setFocusPainted(false);
			HomePanel.add(N_MoveBtn);

			powers.setLayout(null);
			powers.setBounds(25, 5, 100, 100);
			PL.setText("" + init.Power);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 5, 100, 100);
			IL.setText("" + init.Intelli);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 5, 100, 100);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 5, 100, 100);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(390, 0, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

			내용.setVisible(false);
			내용1.setVisible(false);
			내용2.setVisible(false);
			내용3.setVisible(false);
			내용4.setVisible(false);
			내용5.setVisible(false);
			내용6.setVisible(false);

			알바선택.setVisible(false);
			pizza.setVisible(false);
			theater.setVisible(false);
			bakery.setVisible(false);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

			HomePanel.setLayout(null);
			HomePanel.setBounds(0, 70, 640, 452);
			HomePanel.setVisible(true);
			contentPane.add(HomePanel);

			contentPane.setLayout(null);
			contentPane.setBounds(0, 450, 640, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});
	

		N_MoveBtn.addActionListener(event -> {

			lecturebtn.setBounds(220, 180, 80, 30);
			lecturebtn.setBackground(new Color(148, 233, 86));
			lecturebtn.setFont(f3);
			lecturebtn.setFocusPainted(false);
			lecturebtn.setBorderPainted(false);
			lecturebtn.setVisible(true);
			N_Selectpanel.add(lecturebtn);

			partbtn.setBounds(440, 180, 80, 30);
			partbtn.setBackground(new Color(246, 233, 92));
			partbtn.setFont(f3);
			partbtn.setFocusPainted(false);
			partbtn.setBorderPainted(false);
			partbtn.setVisible(true);
			N_Selectpanel.add(partbtn);
			
			restbtn.setBounds(130, 410, 80, 30);
			restbtn.setBackground(new Color(90, 204, 240));
			restbtn.setFont(f3);
			restbtn.setFocusPainted(false);
			restbtn.setBorderPainted(false);
			restbtn.setVisible(true);
			N_Selectpanel.add(restbtn);

			studybtn.setBounds(320, 430, 80, 30);
			studybtn.setBackground(new Color(208, 100, 238));
			studybtn.setFont(f3);
			studybtn.setFocusPainted(false);
			studybtn.setBorderPainted(false);
			studybtn.setVisible(true);
			N_Selectpanel.add(studybtn);

			fitnessbtn.setBounds(510, 391, 80, 30);
			fitnessbtn.setBackground(new Color(239, 89, 179));
			fitnessbtn.setFont(f3);
			fitnessbtn.setFocusPainted(false);
			fitnessbtn.setBorderPainted(false);
			fitnessbtn.setVisible(true);
			N_Selectpanel.add(fitnessbtn);


			powers.setLayout(null);
			powers.setBounds(25, 5, 100, 100);
			PL.setText("" + init.Power);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 5, 100, 100);
			IL.setText("" + init.Intelli);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 5, 100, 100);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 5, 100, 100);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(390, 0, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);

			contentPane.add(dates);
			N_MoveBtn.setVisible(false);
			HomePanel.setVisible(false);

			내용.setVisible(false);
			내용1.setVisible(false);
			내용2.setVisible(false);
			내용3.setVisible(false);
			내용4.setVisible(false);
			내용5.setVisible(false);
			내용6.setVisible(false);

			N_Selectpanel.setVisible(true);

			N_Selectpanel.setLayout(null);
			N_Selectpanel.setBounds(0, 100, 650, 500);
			contentPane.add(N_Selectpanel);
			contentPane.setLayout(null);
			contentPane.setBounds(0, 550, 650, 100);
			contentPane.setVisible(true);
		});

		lecturebtn.addActionListener(event -> {

			new N_Lecture(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		partbtn.addActionListener(event -> {

			new N_PartTime(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		restbtn.addActionListener(event -> {

			new N_Rest(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		studybtn.addActionListener(event -> {

			new N_Study(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});
		fitnessbtn.addActionListener(event -> {
			new N_Fitness(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

		});

	}

}
