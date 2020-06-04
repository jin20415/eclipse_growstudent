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
class N_Lecture extends JFrame {
	Container contentPane;

	subImagePanel longs = new subImagePanel(new ImageIcon("./image/longp.png").getImage());
	subImagePanel shorts = new subImagePanel(new ImageIcon("./image/shortp.png").getImage());
	subImagePanel lecturelist = new subImagePanel(new ImageIcon("./image/lecturelist.png").getImage());
//	subImagePanel N_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
	subImagePanel N_Selectpanel = new subImagePanel(new ImageIcon("./image/N_select_home.png").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());
	subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());
	subImagePanel Lecture_panel = new subImagePanel(new ImageIcon("./image/lecture.jpg").getImage());

	JButton 오픈소스소프트웨어 = new JButton("이동");
	JButton 데이터베이스 = new JButton("이동");
	JButton 정보보호 = new JButton("이동");
	JButton N_MoveBtn = new JButton("활동 하기");

	JLabel 체력확인레이블 = new JLabel();
	JLabel 지식확인레이블 = new JLabel();
	JLabel 돈확인레이블 = new JLabel();
	JLabel 친구확인레이블 = new JLabel();

	JLabel 멘트1 = new JLabel();
	JLabel 멘트2 = new JLabel();
	JLabel 멘트3 = new JLabel();
	JLabel 멘트4 = new JLabel();
	JLabel 멘트5 = new JLabel();

	JButton lecturebtn = new JButton("강의 듣기");
	JButton partbtn = new JButton("알바 가기");
	JButton restbtn = new JButton("휴식 하기");
	JButton studybtn = new JButton("공부 하기");
	JButton homebtn = new JButton("이동");

	JButton SelectBtn = new JButton("홈 이동");
//	JButton EndBtn = new JButton("일과 종료");

	Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 22);
	Font f2 = new Font("HY견고딕", Font.BOLD, 20);
	Font f3 = new Font("HY견고딕", Font.BOLD, 18);
	Font f4 = new Font("HY견고딕", Font.PLAIN, 15);

	N_Lecture(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
		contentPane = getContentPane();
		setSize(655, 655);
		setLayout(null);

		lecturelist.setLayout(null);
		lecturelist.setBounds(110, 0, 640, 640);
		contentPane.setBounds(0, 0, 110, 640);
		contentPane.add(lecturelist);
		contentPane.setBackground(Color.WHITE);

		contentPane.setBounds(0, 0, 655, 110);
		체력확인레이블.setText("" + init.Power);
		체력확인레이블.setBounds(15, 5, 50, 50);
		체력확인레이블.setFont(btnfont);
		powers.add(체력확인레이블);
		powers.setBounds(10, 210, 190, 80);
		contentPane.add(powers);

		지식확인레이블.setText("" + init.Intelli);
		지식확인레이블.setBounds(18, 5, 50, 50);
		지식확인레이블.setFont(btnfont);
		intellis.add(지식확인레이블);
		intellis.setBounds(10, 280, 190, 80);
		contentPane.add(intellis);

		돈확인레이블.setText("" + init.Money);
		돈확인레이블.setBounds(5, 13, 100, 50);
		돈확인레이블.setFont(btnfont);
		moneys.add(돈확인레이블);
		moneys.setBounds(10, 350, 190, 80);
		contentPane.add(moneys);

		친구확인레이블.setText("" + init.Friend);
		친구확인레이블.setBounds(25, 5, 150, 50);
		친구확인레이블.setFont(btnfont);
		friends.add(친구확인레이블);
		friends.setBounds(10, 420, 190, 80);
		contentPane.add(friends);

		dates.setLayout(null);
		dates.setBounds(10, 490, 100, 100);
		DL.setText("D- " + init.DdayNumber);
		DL.setBounds(12, 16, 150, 50);
		DL.setFont(powerfont);
		dates.add(DL);
		dates.setVisible(true);
		contentPane.add(dates);

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
		contentPane.add(SelectBtn);

/*		EndBtn.setBounds(0, 70, 110, 30);
		EndBtn.setBackground(new Color(93, 115, 145));
		EndBtn.setFont(btnfont);
		EndBtn.setBorderPainted(false);
		EndBtn.setFocusPainted(false);
		contentPane.add(EndBtn);*/

		오픈소스소프트웨어.setBounds(401, 220, 80, 25);
		오픈소스소프트웨어.setVisible(true);
		오픈소스소프트웨어.setFocusPainted(false);
		오픈소스소프트웨어.setBorderPainted(false);
		오픈소스소프트웨어.setBackground(Color.WHITE);
		오픈소스소프트웨어.setFont(f2);
		lecturelist.add(오픈소스소프트웨어);

		데이터베이스.setBounds(401, 380, 80, 25);
		데이터베이스.setVisible(true);
		데이터베이스.setFocusPainted(false);
		데이터베이스.setBorderPainted(false);
		데이터베이스.setBackground(Color.WHITE);
		데이터베이스.setFont(f2);
		lecturelist.add(데이터베이스);

		정보보호.setBounds(401, 535, 80, 25);
		정보보호.setVisible(true);
		정보보호.setFocusPainted(false);
		정보보호.setBorderPainted(false);
		정보보호.setBackground(Color.WHITE);
		정보보호.setFont(f2);
		lecturelist.add(정보보호);

		오픈소스소프트웨어.addActionListener(event -> {

			init.N_Lecture_power();
			Lecture_panel.setLayout(null);
			Lecture_panel.setBounds(0, 0, 640, 400);
			contentPane.add(Lecture_panel);

			멘트1.setText("'공7514 오픈소스 소프트웨어 강의실에 도착했어. 사물함에 가서 강의자료를 가져오자.'");
			멘트1.setBounds(10, 470, 640, 50);
			멘트1.setFont(f4);
			contentPane.add(멘트1);

			멘트2.setText("'강의 시작했어! 집중 해보자.'");
			멘트2.setBounds(10, 490, 640, 50);
			멘트2.setFont(f4);
			contentPane.add(멘트2);

			멘트3.setText("교수님 : 원격저장소 기능에는 포크, 풀 리퀘스트, 이슈, 위키가 있습니다.");
			멘트3.setBounds(10, 510, 640, 50);
			멘트3.setFont(f4);
			contentPane.add(멘트3);

			멘트4.setText("강의가 끝났습니다. . .");
			멘트4.setBounds(10, 530, 300, 50);
			멘트4.setFont(f4);
			contentPane.add(멘트4);

			멘트5.setText("[알림: 체력이 20 떨어졌습니다. ]");
			멘트5.setBounds(170, 530, 300, 50);
			멘트5.setFont(f4);
			contentPane.add(멘트5);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);

			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(10, 420, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(80, 420, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(150, 420, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(240, 420, 190, 80);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(330, 420, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

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
			Lecture_panel.add(SelectBtn);

/*			EndBtn.setBounds(0, 70, 110, 30);
			EndBtn.setBackground(new Color(93, 115, 145));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			Lecture_panel.add(EndBtn);*/

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(true);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
			init.오픈소스이해();
			init.MT();

		});

		데이터베이스.addActionListener(event -> {

			init.N_Lecture_power();

			Lecture_panel.setLayout(null);
			Lecture_panel.setBounds(0, 0, 640, 400);
			contentPane.add(Lecture_panel);

			멘트1.setText("'공7507 데이터베이스 강의실에 도착했어. 사물함에 가서 교재를 가져와야겠어.'");
			멘트1.setBounds(10, 470, 640, 50);
			멘트1.setFont(f4);
			contentPane.add(멘트1);

			멘트2.setText("강의 시작했어! '교수님 : 정보통신기술과 마당서점의 성장 단계에 대해 알아보겠습니다.'");
			멘트2.setBounds(10, 490, 640, 50);
			멘트2.setFont(f4);
			contentPane.add(멘트2);

			멘트3.setText("교수님 : 1970년대는 컴퓨터 없이 관리되었고, 80년대부터 컴퓨터를 이용한");
			멘트3.setBounds(10, 510, 640, 50);
			멘트3.setFont(f4);
			contentPane.add(멘트3);

			멘트4.setText("응용 프로그램으로 업무를 처리했습니다. ");
			멘트4.setBounds(10, 530, 640, 50);
			멘트4.setFont(f4);
			contentPane.add(멘트4);

			멘트5.setText("강의가 끝났습니다. . .[알림: 체력이 20 떨어졌습니다.]");
			멘트5.setBounds(10, 530, 300, 50);
			멘트5.setFont(f4);
			contentPane.add(멘트5);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);

			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(10, 420, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(80, 420, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(150, 420, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(240, 430, 190, 80);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(330, 420, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

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
			Lecture_panel.add(SelectBtn);

	/*		EndBtn.setBounds(0, 70, 110, 30);
			EndBtn.setBackground(new Color(93, 115, 145));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			Lecture_panel.add(EndBtn);*/

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(true);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);

			init.데이터베이스이해();
			init.MT();

		});

		정보보호.addActionListener(event -> {

			init.N_Lecture_power();

			Lecture_panel.setLayout(null);
			Lecture_panel.setBounds(0, 0, 640, 400);
			contentPane.add(Lecture_panel);

			멘트1.setText("'공7714 정보보호 강의실에 도착했는데 교재가 사물함에 있어. 사물함에 가서 교재를 '");
			멘트1.setBounds(10, 470, 640, 50);
			멘트1.setFont(f4);
			contentPane.add(멘트1);

			멘트2.setText("챙겨 강의실에 도착하니 마침 강의가 시작 전이였어!'");
			멘트2.setBounds(10, 490, 640, 50);
			멘트2.setFont(f4);
			contentPane.add(멘트2);

			멘트3.setText("'교수님 : 패시브 어택은 공격을 받는걸 감지하지 못하지만 액티브 어택은 공격을 ");
			멘트3.setBounds(10, 510, 640, 50);
			멘트3.setFont(f4);
			contentPane.add(멘트3);

			멘트4.setText("감지할 수 있습니다. 강의가 끝났습니다. . .");
			멘트4.setBounds(10, 530, 300, 50);
			멘트4.setFont(f4);
			contentPane.add(멘트4);

			멘트5.setText("[알림: 체력이 20 떨어졌습니다.]");
			멘트5.setBounds(320, 530, 300, 50);
			멘트5.setFont(f4);
			contentPane.add(멘트5);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);

			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(10, 420, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(80, 420, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(150, 420, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(240, 430, 190, 80);
			contentPane.add(friends);

			dates.setBounds(320, 420, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

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
			Lecture_panel.add(SelectBtn);

	/*		EndBtn.setBounds(0, 70, 110, 30);
			EndBtn.setBackground(new Color(93, 115, 145));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			Lecture_panel.add(EndBtn);*/

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(true);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);

			init.정보보호이해();
			init.MT();

		});

		contentPane.setVisible(true);
		setVisible(true);

		SelectBtn.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "홈 화면으로 이동합니다.", "홈 화면으로 이동", JOptionPane.INFORMATION_MESSAGE);
			new N_Home(PL, IL, ML, FL, DL);

			SelectBtn.setVisible(false);
//			EndBtn.setVisible(false);

			JLabel dateLb = new JLabel();
			dateLb.setText("Today 2020 " + init.Month + "월" + init.Day + "일  " + init.Today + "요일");
			Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
			dateLb.setFont(datefont);
			dateLb.setBounds(310, 10, 600, 40);
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

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(false);

			멘트1.setVisible(false);
			멘트2.setVisible(false);
			멘트3.setVisible(false);
			멘트4.setVisible(false);
			멘트5.setVisible(false);

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

			lecturebtn.setBounds(130, 40, 130, 30);
			lecturebtn.setBackground(new Color(148, 233, 86));
			lecturebtn.setFont(f3);
			lecturebtn.setFocusPainted(false);
			lecturebtn.setBorderPainted(false);
			lecturebtn.setVisible(true);
			N_Selectpanel.add(lecturebtn);

			partbtn.setBounds(325, 65, 120, 30);
			partbtn.setBackground(new Color(246, 233, 92));
			partbtn.setFont(f3);
			partbtn.setFocusPainted(false);
			partbtn.setBorderPainted(false);
			partbtn.setVisible(true);
			N_Selectpanel.add(partbtn);

			restbtn.setBounds(40, 290, 115, 30);
			restbtn.setBackground(new Color(90, 204, 240));
			restbtn.setFont(f3);
			restbtn.setFocusPainted(false);
			restbtn.setBorderPainted(false);
			restbtn.setVisible(true);
			N_Selectpanel.add(restbtn);

			studybtn.setBounds(229, 305, 125, 30);
			studybtn.setBackground(new Color(208, 100, 238));
			studybtn.setFont(f3);
			studybtn.setFocusPainted(false);
			studybtn.setBorderPainted(false);
			studybtn.setVisible(true);
			N_Selectpanel.add(studybtn);

			homebtn.setBounds(540, 411, 80, 30);
			homebtn.setBackground(new Color(239, 89, 179));
			homebtn.setFont(f3);
			homebtn.setFocusPainted(false);
			homebtn.setBorderPainted(false);
			homebtn.setVisible(true);
			N_Selectpanel.add(homebtn);

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
			lecturelist.setVisible(false);
			Lecture_panel.setVisible(false);

			멘트1.setVisible(false);
			멘트2.setVisible(false);
			멘트3.setVisible(false);
			멘트4.setVisible(false);
			멘트5.setVisible(false);

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
		
		homebtn.addActionListener(event -> {
			new N_Home(PL, IL, ML, FL, DL);

			SelectBtn.setVisible(false);
	//		EndBtn.setVisible(false);

			JLabel dateLb = new JLabel();
			dateLb.setText("Today 2020 " + init.Month + "월" + init.Day + "일  " + init.Today + "요일");
			Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
			dateLb.setFont(datefont);
			dateLb.setBounds(310, 10, 600, 40);
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

			멘트1.setVisible(false);
			멘트2.setVisible(false);
			멘트3.setVisible(false);
			멘트4.setVisible(false);
			멘트5.setVisible(false);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(false);
			N_Selectpanel.setVisible(false);
			N_MoveBtn.setVisible(true);

			HomePanel.setLayout(null);
			HomePanel.setBounds(0, 70, 640, 452);
			HomePanel.setVisible(true);
			contentPane.add(HomePanel);

			contentPane.setLayout(null);
			contentPane.setBounds(0, 450, 640, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);

		});
	}

}
