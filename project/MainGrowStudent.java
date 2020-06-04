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

class ImagePanel extends JPanel { // 이미지 패널
	private Image img;

	public ImagePanel(Image img) {

		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));// pack()한 후 프레임 사이즈가 맞게 나오지 않을 때 설정해줌.
		setSize(640, 640);
		setLayout(null);

	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

class subImagePanel extends JPanel { // 서브이미지 패널
	private Image subimg;

	public subImagePanel(Image subimg) {
		this.subimg = subimg;
		setSize(new Dimension(subimg.getWidth(null), subimg.getHeight(null)));
		setPreferredSize(new Dimension(subimg.getWidth(null), subimg.getHeight(null)));// pack()한 후 프레임 사이즈가 맞게 나오지 않을 때
		setSize(655, 650); // 설정해줌.
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(subimg, 0, 0, null);
	}
}

public class MainGrowStudent extends JFrame {
	Container contentPane;
	ImagePanel StartPanel = new ImagePanel(new ImageIcon("./image/main.jpg").getImage());
	subImagePanel LevelPanel = new subImagePanel(new ImageIcon("./image/main.jpg").getImage());
	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
	static subImagePanel N_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel H_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());// 이미지 패널 객체 생성
	subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());
	subImagePanel N_Selectpanel = new subImagePanel(new ImageIcon("./image/N_select_home.png").getImage());

	JLabel click = new JLabel("click");

	JButton SelectBtn = new JButton("활동선택");
	JButton EndBtn = new JButton("일과 종료");

	JButton homebtn = new JButton("이동");
	JButton N_MoveBtn = new JButton("활동하기");

	JButton lecturebtn = new JButton("강의듣기");
	JButton partbtn = new JButton("알바가기");
	JButton restbtn = new JButton("휴식");
	JButton studybtn = new JButton("공부하기");

	JLabel DL = new JLabel();
	JLabel PL = new JLabel();
	JLabel IL = new JLabel();
	JLabel ML = new JLabel();
	JLabel FL = new JLabel();

	Font 활동선택버튼폰트 = new Font("HY견고딕", Font.BOLD, 15);
	Font 활동선택폰트 = new Font("HY견고딕", Font.PLAIN, 13);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font f3 = new Font("HY견고딕", Font.BOLD, 18);

	MainGrowStudent() {
		if (init.DdayNumber == 0) {
			if (init.오픈소스이해도 >= 90) {
				JLabel ending = new JLabel("오픈소스소프트웨어 이해도" + init.오픈소스이해도 + "입니다. A+을 받았어");
				ending.setBounds(50, 51, 640, 100);
				ending.setVisible(true);
				contentPane.add(ending);

				contentPane.setBounds(0, 0, 655, 650);
				contentPane.setBackground(Color.WHITE);
				contentPane.setVisible(true);
				JOptionPane.showMessageDialog(null, "시험이 끝났어", "종강", JOptionPane.WARNING_MESSAGE);
			}
		}
		setTitle("<< 대학생 키우기 >>");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setBounds(0, 0, 640, 109);
		contentPane.setLayout(null);

		JLabel label1, label1_1;
		label1 = new JLabel("대학생 ");
		label1.setBounds(170, 40, 450, 200);

		label1_1 = new JLabel("키우기");
		label1_1.setBounds(170, 132, 450, 200);

		Font f = new Font("휴먼옛체", Font.PLAIN, 103);
		label1.setForeground(new Color(204, 204, 051));
		label1_1.setForeground(new Color(204, 204, 051));

		label1.setFont(f);
		label1_1.setFont(f);

		Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 22);
		JButton StartBt, EndBt;

		StartBt = new JButton(">> 게임 시작");
		StartBt.setFont(f1);
		StartBt.setBackground(Color.WHITE);
		StartBt.setBounds(0, 410, 360, 45);
		StartBt.setBorderPainted(false);
		StartBt.setFocusPainted(false);

		EndBt = new JButton(" 게임 종료 <<");
		EndBt.setFont(f1);
		EndBt.setBackground(Color.WHITE);
		EndBt.setBounds(290, 470, 360, 45);
		EndBt.setBorderPainted(false);
		EndBt.setFocusPainted(false);

		StartPanel.add(label1);
		StartPanel.add(label1_1);
		StartPanel.add(StartBt);
		StartPanel.add(EndBt);
		StartPanel.setVisible(true);
		contentPane.add(StartPanel); // StartPanel 화면

		EndBt.addActionListener(e -> {
			System.exit(0);
		}); // EndBt 버튼 누르면 창 닫기

		JLabel Lb3 = new JLabel("난이도를 ");
		Lb3.setBounds(115, 40, 500, 200);
		Lb3.setForeground(new Color(204, 204, 051));
		Lb3.setFont(f);

		JLabel Lb4 = new JLabel("선택하시오");
		Lb4.setBounds(55, 139, 550, 200);
		Lb4.setForeground(new Color(204, 204, 051));
		Lb4.setFont(f);

		JButton NormalBtn = new JButton(">> 보통");
		NormalBtn.setFont(f1);
		NormalBtn.setBackground(Color.WHITE);
		NormalBtn.setBounds(0, 410, 360, 45);
		NormalBtn.setBorderPainted(false);

		JButton HardBtn = new JButton("어려움 <<");
		HardBtn.setFont(f1);
		HardBtn.setBackground(Color.WHITE);
		HardBtn.setBounds(290, 470, 360, 45);
		HardBtn.setBorderPainted(false);// LevelPanel 화면

		StartBt.addActionListener(e -> {
			LevelPanel.add(Lb3);
			LevelPanel.add(Lb4);
			LevelPanel.add(NormalBtn);
			LevelPanel.add(HardBtn);
			contentPane.add(LevelPanel);
			N_Selectpanel.setVisible(false);
			lecturebtn.setVisible(false);
			partbtn.setVisible(false);
			restbtn.setVisible(false);
			studybtn.setVisible(false);
			homebtn.setVisible(false);
			powers.setVisible(false);
			intellis.setVisible(false);
			moneys.setVisible(false);
			friends.setVisible(false);
			dates.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);

		}); // StartBt 버튼 누르면 LevelPanel 난이도 선택 패널로 이동

		init.MT();

		JLabel dateLb = new JLabel();
		dateLb.setText("Today 2020 " + init.Month + "월" + init.Day + "일  " + init.Today + "요일");
		Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
		dateLb.setFont(datefont);
		dateLb.setBounds(310, 10, 600, 40);

		JLabel Lb2 = new JLabel();
		Lb2.setBounds(70, 100, 600, 50);
		Font Lb2font = new Font("HY견고딕", Font.PLAIN, 25);
		Lb2.setFont(Lb2font);
		// Lb2.setText("<체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money
		// + " 친화력 " + init.Friend + ">"); // (N+H)ManuPanel화면

		JButton N_MoveBtn = new JButton("활동하기");
		N_MoveBtn.setFont(f1);
		N_MoveBtn.setBackground(Color.WHITE);
		N_MoveBtn.setBounds(0, 410, 250, 45);
		N_MoveBtn.setBorderPainted(false);
		N_MoveBtn.setFocusPainted(false);

		JButton H_MoveBtn = new JButton("활동하기");
		H_MoveBtn.setFont(f1);
		H_MoveBtn.setBackground(Color.WHITE);
		H_MoveBtn.setBounds(0, 410, 360, 45);
		H_MoveBtn.setBorderPainted(false);
		H_MoveBtn.setFocusPainted(false);

		NormalBtn.addActionListener(e -> {
			new N_Home(PL, IL, ML, FL, DL);
			HomePanel.add(dateLb);
			HomePanel.add(Lb2);
			HomePanel.add(N_MoveBtn);
			N_MoveBtn.setVisible(true);
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

			HomePanel.setBounds(0, 73, 640, 452);
			HomePanel.setVisible(true);
			contentPane.setBounds(0, 452, 640, 200);
			contentPane.add(HomePanel);
			N_Selectpanel.setVisible(false);
			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);
		}); // 난이도 보통인 HomePanel로 이동

		HardBtn.addActionListener(e -> {

			HomePanel.add(dateLb);
			HomePanel.add(Lb2);
			HomePanel.add(H_MoveBtn);

			powers.setLayout(null);
			powers.setBounds(25, 5, 100, 100);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 5, 100, 100);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 5, 100, 100);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 5, 100, 100);
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

			HomePanel.setBounds(0, 73, 640, 640);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.add(HomePanel);
			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);
		}); // 난이도 보통인 HomePanel로 이동

		JButton N_LBtn = new JButton("강의 듣기");
		N_LBtn.setFont(활동선택버튼폰트);
		N_LBtn.setBounds(195, 80, 130, 30);
		N_LBtn.setBackground(new Color(153, 239, 90));
		N_LBtn.setBorderPainted(false);
		N_LBtn.setFocusPainted(false);

		JLabel detail = new JLabel("[요구 능력치: 체력 20, 돈 10000]");
		detail.setFont(활동선택폰트);
		detail.setBounds(157, 110, 230, 30);

		JLabel detailL = new JLabel("[얻을 수 있는 능력치: 지식 5~20]");
		detailL.setFont(활동선택폰트);
		detailL.setBounds(155, 135, 230, 30);

		N_LBtn.addActionListener(event -> {

			dispose();
			new N_Lecture(PL, IL, ML, FL, DL);
		}); // N_Lecture 클래스 이동

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

		SelectBtn.setVisible(false);
		EndBtn.setVisible(false);

		N_Selectpanel.setVisible(true);

		N_Selectpanel.setLayout(null);
		N_Selectpanel.setBounds(0, 100, 650, 500);
		contentPane.add(N_Selectpanel);
		contentPane.setLayout(null);
		contentPane.setBounds(0, 550, 650, 100);
		contentPane.setVisible(true);
		JButton N_BackBtn = new JButton("뒤로가기");
		N_BackBtn.setFont(활동선택버튼폰트);
		N_BackBtn.setBounds(430, 300, 130, 30);
		N_BackBtn.setBackground(new Color(245, 92, 183));
		N_BackBtn.setFocusPainted(false);
		N_BackBtn.setBorderPainted(false);

		N_BackBtn.addActionListener(event -> {
			HomePanel.setVisible(true);
			N_MenuPanel.setVisible(false);
			contentPane.add(HomePanel);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});

		N_MoveBtn.addActionListener(e -> {

			N_MenuPanel.add(N_LBtn);
			N_MenuPanel.add(detail);
			N_MenuPanel.add(detailL); // 강의버튼
//			N_MenuPanel.add(N_SBtn);
//			N_MenuPanel.add(sdetail);
//			N_MenuPanel.add(sdetailL); // 공부하기버튼
//			N_MenuPanel.add(N_PtBtn);
//			N_MenuPanel.add(pdetail);
//			N_MenuPanel.add(pdetailL);
//			N_MenuPanel.add(bonus); // 알바버튼
//			N_MenuPanel.add(N_RestBtn);
//			N_MenuPanel.add(rdetail);
//			N_MenuPanel.add(rdetailL); // 휴식버튼
			N_MenuPanel.add(N_BackBtn);

			N_MenuPanel.setBounds(0, 110, 640, 640);
			contentPane.add(N_MenuPanel);
//			N_Lecture.SelectBtn.setVisible(false);
			HomePanel.setVisible(false);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.setVisible(true);

		});
		JButton H_LBtn = new JButton("강의 듣기");
		H_LBtn.setFont(활동선택버튼폰트);
		H_LBtn.setBounds(195, 80, 130, 30);
		H_LBtn.setBackground(new Color(153, 239, 90));
		H_LBtn.setBorderPainted(false);
		H_LBtn.setFocusPainted(false);

		JLabel Hdetail = new JLabel("[요구 능력치: 체력 30 돈 20000]");
		Hdetail.setFont(활동선택폰트);
		Hdetail.setBounds(157, 110, 230, 30);

		JLabel HdetailL = new JLabel("[얻을 수 있는 능력치: 지식 5~20]");

		HdetailL.setFont(활동선택폰트);
		HdetailL.setBounds(155, 135, 230, 30);

		H_LBtn.addActionListener(event -> {

			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력

			} else
				new H_Lecture(Lb2);
		}); // H_Lecture 클래스 이동

		JButton H_SBtn = new JButton("공부하기");
		H_SBtn.setFont(활동선택버튼폰트);
		H_SBtn.setBounds(255, 325, 100, 30);
		H_SBtn.setBackground(new Color(210, 89, 242));
		H_SBtn.setFocusPainted(false);
		H_SBtn.setBorderPainted(false);

		JLabel Hsdetail = new JLabel("[요구능력치: 체력 20]");
		Hsdetail.setFont(활동선택폰트);
		Hsdetail.setBounds(245, 355, 230, 30);

		JLabel HsdetailL = new JLabel("[얻을 수 있는 능력치: 지식 5~20]");
		HsdetailL.setFont(활동선택폰트);
		HsdetailL.setBounds(205, 380, 230, 30);

		H_SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new H_Study(Lb2);
		}); // H_Study 클래스 이동

		JButton H_PtBtn = new JButton("알바가기");
		H_PtBtn.setFont(활동선택버튼폰트);
		H_PtBtn.setBounds(390, 100, 100, 30);
		H_PtBtn.setBackground(new Color(241, 228, 90));
		H_PtBtn.setFocusPainted(false);
		H_PtBtn.setBorderPainted(false);

		JLabel Hpdetail = new JLabel("[요구 능력치: 체력 30]");
		Hpdetail.setFont(활동선택폰트);
		Hpdetail.setBounds(380, 133, 230, 30);

		JLabel HpdetailL = new JLabel("[얻을 수 있는 능력치: 돈 1~40000]");
		HpdetailL.setFont(활동선택폰트);
		HpdetailL.setBounds(350, 158, 230, 30);

		JLabel Hbonus = new JLabel("보너스를 받을 수 있을지도?");
		// Hbonus.setFont(bonusfont);
		Hbonus.setBounds(380, 183, 200, 30);

		H_PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new H_PartTime(Lb2);
		}); // H_PartTime 클래스 이동

		JButton H_RestBtn = new JButton("놀기");
		H_RestBtn.setFont(활동선택버튼폰트);
		H_RestBtn.setBounds(80, 250, 112, 30);
		H_RestBtn.setBackground(new Color(89, 205, 242));
		H_RestBtn.setFocusPainted(false);
		H_RestBtn.setBorderPainted(false);

		JLabel Hrdetail = new JLabel("[요구능력치: 체력 20 돈 30000]");
		Hrdetail.setFont(활동선택폰트);
		Hrdetail.setBounds(50, 280, 200, 30);

		JLabel HrdetailL = new JLabel("[얻을 수 있는 능력치: 친화력 5~20]");
		HrdetailL.setFont(활동선택폰트);
		HrdetailL.setBounds(37, 305, 250, 30);

		H_RestBtn.addActionListener(event -> {
			new H_Rest(PL, IL, ML, FL, DL);
		}); // H_Rest 클래스 이동

		JButton H_BackBtn = new JButton("뒤로가기");
		H_BackBtn.setFont(활동선택버튼폰트);
		H_BackBtn.setBounds(430, 300, 130, 30);
		H_BackBtn.setBackground(new Color(245, 92, 183));
		H_BackBtn.setFocusPainted(false);
		H_BackBtn.setBorderPainted(false);

		H_BackBtn.addActionListener(event -> {

			HomePanel.add(dateLb);
			HomePanel.add(Lb2);
			HomePanel.add(H_MoveBtn);

			HomePanel.setBounds(0, 73, 640, 640);

			contentPane.setBounds(0, 0, 640, 109);
			contentPane.add(HomePanel);

			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);

		}); // 다시 이동하기 누르면 아무 창도 안뜸... 수정

		N_MoveBtn.addActionListener(e -> {

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

			N_Selectpanel.setVisible(true);

			N_Selectpanel.setLayout(null);
			N_Selectpanel.setBounds(0, 100, 650, 500);
			contentPane.add(N_Selectpanel);
			contentPane.setLayout(null);
			contentPane.setBounds(0, 550, 650, 100);
			contentPane.setVisible(true);

		});

		H_MoveBtn.addActionListener(e -> {

			H_MenuPanel.add(H_LBtn);
			H_MenuPanel.add(Hdetail);
			H_MenuPanel.add(HdetailL);// 강의버튼
			H_MenuPanel.add(H_SBtn);
			H_MenuPanel.add(Hsdetail);
			H_MenuPanel.add(HsdetailL); // 공부하기버튼
			H_MenuPanel.add(H_PtBtn);
			H_MenuPanel.add(Hpdetail);
			H_MenuPanel.add(HpdetailL);
			H_MenuPanel.add(Hbonus); // 알바버튼
			H_MenuPanel.add(H_RestBtn);
			H_MenuPanel.add(Hrdetail);
			H_MenuPanel.add(HrdetailL); // 휴식버튼
			H_MenuPanel.add(H_BackBtn);

			H_MenuPanel.setBounds(0, 110, 640, 640);
			contentPane.add(H_MenuPanel);
			HomePanel.setVisible(false);
			contentPane.setBounds(0, 0, 640, 109);
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
			EndBtn.setVisible(false);

			dateLb.setText("Today 2020 " + init.Month + "월" + init.Day + "일  " + init.Today + "요일");

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

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

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
		N_Selectpanel.setVisible(false);
		lecturebtn.setVisible(false);
		partbtn.setVisible(false);
		restbtn.setVisible(false);
		studybtn.setVisible(false);
		homebtn.setVisible(false);

		powers.setVisible(false);
		intellis.setVisible(false);
		moneys.setVisible(false);
		friends.setVisible(false);
		dates.setVisible(false);
		setSize(655, 650);
		setVisible(true);
	}

	public static void main(String[] args) {

		new MainGrowStudent();

	}
}
