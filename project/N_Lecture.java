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

class lectureImagePanel extends JPanel {
	private Image lectureimg;

	public lectureImagePanel(Image lectureimg) {
		this.lectureimg = lectureimg;
		setSize(new Dimension(lectureimg.getWidth(null), lectureimg.getHeight(null)));
		setPreferredSize(new Dimension(lectureimg.getWidth(null), lectureimg.getHeight(null)));
		setLayout(null);
		setSize(655, 650);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(lectureimg, 0, 0, null);
	}
}

@SuppressWarnings("serial")
class N_Lecture extends JFrame {
	Container contentPane;
	/*
	 * JButton button1 = new JButton("N1. 오픈소스소프트웨어"); JButton button2 = new
	 * JButton("N2. 데이터베이스"); JButton button3 = new JButton("N3. 정보보호"); JLabel
	 * 버튼1교수님 = new JLabel("1) 겸임 교수님: 강신재교수님"); JLabel 버튼1강의장소 = new
	 * JLabel("2) 강의 장소: 공7514"); JLabel 버튼1강의자료 = new JLabel("3) 교재: LMS 강의자료 ");
	 * JLabel 버튼2교수님 = new JLabel("1) 겸임 교수님: 남인길교수님"); JLabel 버튼2강의장소 = new
	 * JLabel("2) 강의 장소: 공7507"); JLabel 버튼2강의자료 = new
	 * JLabel("3) 교재: 오라클로 배우는 데이터베이스 "); JLabel 버튼3교수님 = new
	 * JLabel("1) 겸임 교수님: 김창훈교수님"); JLabel 버튼3강의장소 = new JLabel("2) 강의 장소: 공7714");
	 * JLabel 버튼3강의자료 = new JLabel("3) 교재: 오라클로 배우는 데이터베이스 "); JLabel 타이틀 = new
	 * JLabel("강의선택");
	 */
	JButton button4 = new JButton("뒤로가기");

	subImagePanel longs = new subImagePanel(new ImageIcon("./image/longp.png").getImage());
	subImagePanel shorts = new subImagePanel(new ImageIcon("./image/shortp.png").getImage());
	subImagePanel lecturelist = new subImagePanel(new ImageIcon("./image/lecturelist.png").getImage());
	subImagePanel N_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/Room.jpg").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());
	subImagePanel Lecture_panel = new subImagePanel(new ImageIcon("./image/lecture.jpg").getImage());

	JButton 체력확인 = new JButton("체력확인하기");
	JButton 활동선택하기 = new JButton("활동선택하기");

	JButton 오픈소스소프트웨어 = new JButton("이동");
	JButton 데이터베이스 = new JButton("이동");
	JButton 정보보호 = new JButton("이동");

	JLabel 체력확인레이블 = new JLabel();
	JLabel 지식확인레이블 = new JLabel();
	JLabel 돈확인레이블 = new JLabel();
	JLabel 친구확인레이블 = new JLabel();

	JLabel 멘트1 = new JLabel();
	JLabel 멘트2 = new JLabel();
	JLabel 멘트3 = new JLabel();
	JLabel 멘트4 = new JLabel();
	JLabel 멘트5 = new JLabel();

	JButton SelectBtn = new JButton("활동선택");
	JButton EndBtn = new JButton("일과 종료");

	Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 22);
	Font f2 = new Font("HY견고딕", Font.BOLD, 20);
	Font f3 = new Font("HY견고딕", Font.PLAIN, 15);

	N_Lecture(JLabel PL, JLabel IL, JLabel ML, JLabel FL) {
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

		PL.setText("" + init.Power);
		IL.setText("" + init.Intelli);
		ML.setText("" + init.Money);
		FL.setText("" + init.Friend);

		SelectBtn.setBounds(0, 30, 110, 30);
		SelectBtn.setBackground(new Color(93, 115, 145));
		SelectBtn.setFont(btnfont);
		SelectBtn.setBorderPainted(false);
		SelectBtn.setFocusPainted(false);
		contentPane.add(SelectBtn);

		EndBtn.setBounds(0, 70, 110, 30);
		EndBtn.setBackground(new Color(93, 115, 145));
		EndBtn.setFont(btnfont);
		EndBtn.setBorderPainted(false);
		EndBtn.setFocusPainted(false);
		contentPane.add(EndBtn);

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
			멘트1.setFont(f3);
			contentPane.add(멘트1);

			멘트2.setText("'강의 시작했어! 집중 해보자.'");
			멘트2.setBounds(10, 490, 640, 50);
			멘트2.setFont(f3);
			contentPane.add(멘트2);

			멘트3.setText("교수님 : 원격저장소 기능에는 포크, 풀 리퀘스트, 이슈, 위키가 있습니다.");
			멘트3.setBounds(10, 510, 640, 50);
			멘트3.setFont(f3);
			contentPane.add(멘트3);

			멘트4.setText("강의가 끝났습니다. . .");
			멘트4.setBounds(10, 530, 300, 50);
			멘트4.setFont(f3);
			contentPane.add(멘트4);

			멘트5.setText("[알림: 체력 - 25 지능 + 5]");
			멘트5.setBounds(250, 530, 300, 50);
			멘트5.setFont(f3);
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

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);

			SelectBtn.setBounds(0, 30, 110, 30);
			SelectBtn.setBackground(new Color(93, 115, 145));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			Lecture_panel.add(SelectBtn);

			EndBtn.setBounds(0, 70, 110, 30);
			EndBtn.setBackground(new Color(93, 115, 145));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			Lecture_panel.add(EndBtn);

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(true);

			contentPane.setVisible(true);
			init.오픈소스이해();
			init.N_intelli_up();
			init.MT();

		});

		데이터베이스.addActionListener(event -> {

			init.N_Lecture_power();

			Lecture_panel.setLayout(null);
			Lecture_panel.setBounds(0, 0, 640, 400);
			contentPane.add(Lecture_panel);

			멘트1.setText("'공7507 데이터베이스 강의실에 도착했어. 사물함에 가서 교재를 가져와야겠어.'");
			멘트1.setBounds(10, 470, 640, 50);
			멘트1.setFont(f3);
			contentPane.add(멘트1);

			멘트2.setText("강의 시작했어! '교수님 : 정보통신기술과 마당서점의 성장 단계에 대해 알아보겠습니다.'");
			멘트2.setBounds(10, 490, 640, 50);
			멘트2.setFont(f3);
			contentPane.add(멘트2);

			멘트3.setText("교수님 : 1970년대는 컴퓨터 없이 관리되었고, 80년대부터 컴퓨터를 이요한 응용 프로그램으로 업무를 처리했습니다.");
			멘트3.setBounds(10, 510, 640, 50);
			멘트3.setFont(f3);
			contentPane.add(멘트3);

			멘트4.setText("강의가 끝났습니다. . .");
			멘트4.setBounds(10, 530, 300, 50);
			멘트4.setFont(f3);
			contentPane.add(멘트4);

			멘트5.setText("[알림: 체력 - 25 지능 + 5]");
			멘트5.setBounds(250, 530, 300, 50);
			멘트5.setFont(f3);
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

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);

			SelectBtn.setBounds(0, 30, 110, 30);
			SelectBtn.setBackground(new Color(93, 115, 145));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			Lecture_panel.add(SelectBtn);

			EndBtn.setBounds(0, 70, 110, 30);
			EndBtn.setBackground(new Color(93, 115, 145));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			Lecture_panel.add(EndBtn);

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(true);

			contentPane.setVisible(true);

			init.데이터베이스이해();
			init.N_intelli_up();
			init.MT();

		});

		정보보호.addActionListener(event -> {

			
			
			Lecture_panel.setLayout(null);
			Lecture_panel.setBounds(0, 0, 640, 400);
			contentPane.add(Lecture_panel);

			멘트1.setText("'공7714 정보보호 강의실에 도착했어. 사물함에 가서 교재를 가져와야겠어.'");
			멘트1.setBounds(10, 470, 640, 50);
			멘트1.setFont(f3);
			contentPane.add(멘트1);

			멘트2.setText("강의 시작했어! '교수님 : 나한테 배우면 쉬워~.'");
			멘트2.setBounds(10, 490, 640, 50);
			멘트2.setFont(f3);
			contentPane.add(멘트2);

			멘트3.setText("교수님 : 다혜한테 교재 내용 한두문장 적어달라구 하기 .");
			멘트3.setBounds(10, 510, 640, 50);
			멘트3.setFont(f3);
			contentPane.add(멘트3);

			멘트4.setText("강의가 끝났습니다. . .");
			멘트4.setBounds(10, 530, 300, 50);
			멘트4.setFont(f3);
			contentPane.add(멘트4);

			멘트5.setText("[알림: 체력 - 25 지능 + 5]");
			멘트5.setBounds(250, 530, 300, 50);
			멘트5.setFont(f3);
			contentPane.add(멘트5);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);

			init.N_Lecture_power();
			
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

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);

			SelectBtn.setBounds(0, 30, 110, 30);
			SelectBtn.setBackground(new Color(93, 115, 145));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			Lecture_panel.add(SelectBtn);

			EndBtn.setBounds(0, 70, 110, 30);
			EndBtn.setBackground(new Color(93, 115, 145));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			Lecture_panel.add(EndBtn);

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(true);

			contentPane.setVisible(true);

			init.정보보호이해();
			init.N_intelli_up();
			init.MT();

		});

		contentPane.setVisible(true);
		setVisible(true);

		SelectBtn.addActionListener(event -> {
			
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);

			powers.setVisible(false);
			intellis.setVisible(false);
			moneys.setVisible(false);
			friends.setVisible(false);

			SelectBtn.setVisible(false);
			EndBtn.setVisible(false);

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
			moneys.setBounds(240, 5, 200, 150);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(320, 10, 150, 150);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

		

			contentPane.setBounds(0, 0, 655, 120);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);

			JOptionPane.showMessageDialog(null, "활동 선택으로 이동합니다", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			dispose();
		});

		EndBtn.addActionListener(event -> {

			JOptionPane.showMessageDialog(null, "집으로 이동합니다.", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지

			HomePanel.setVisible(true);

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

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);

			N_MenuPanel.setVisible(false);
			contentPane.add(HomePanel);
			contentPane.setVisible(true);
			new N_Home(PL, IL, ML, FL);
			dispose();
		});
	}

}
