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
 subImagePanel LevelPanel = new subImagePanel(new ImageIcon("./image/main.jpg").getImage());
	subImagePanel N_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel H_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	 ImagePanel StartPanel = new ImagePanel(new ImageIcon("./image/main.jpg").getImage());
 subImagePanel MenuPanel = new subImagePanel(new ImageIcon("./image/week.png").getImage());
	 subImagePanel choosepanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	
	Font 활동선택버튼폰트 = new Font("HY견고딕", Font.BOLD, 15);
	Font 활동선택폰트 = new Font("HY견고딕", Font.PLAIN, 12);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	 JButton MBtn = new JButton("일정채우기");
	 JButton ThBtn = new JButton("일정채우기");
	 JButton WBtn = new JButton("일정채우기");
	 JButton TuBtn = new JButton("일정채우기");
	 JButton FBtn = new JButton("일정채우기");
	JButton SatBtn = new JButton("일정채우기");
	JButton SunBtn = new JButton("일정채우기");
	 JLabel click = new JLabel("click");
	 Font f4 = new Font("휴먼엑스포", Font.BOLD, 18);
	 JLabel week = new JLabel("" + init.DdayNumber);

	JButton 뒤로가기 = new JButton("뒤로가기");
	 JButton partamBtn = new JButton("알바 가기");
	 JLabel powerlabel = new JLabel("" + init.Power);
	 JLabel 체력확인레이블 = new JLabel("" + init.Power);
	 JLabel 지식확인레이블 = new JLabel("" + init.Intelli);
	 JLabel 돈확인레이블 = new JLabel("" + init.Money);
	 JLabel 친구확인레이블 = new JLabel("" + init.Friend);

	MainGrowStudent() {
		setTitle("<< 대학생 키우기 >>");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650,655);
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
		StartBt.setBackground(new Color(255, 255, 255));
		StartBt.setBounds(0, 410, 360, 45);
		StartBt.setBorderPainted(false);
		// StartBt.setFocusPainted(false);

		EndBt = new JButton(" 게임 종료 <<");
		EndBt.setFont(f1);
		EndBt.setBackground(new Color(255, 255, 255));
		EndBt.setBounds(290, 470, 360, 45);
		EndBt.setBorderPainted(false);
		// EndBt.setFocusPainted(false);

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
		NormalBtn.setBackground(new Color(255, 255, 255));
		NormalBtn.setBounds(0, 410, 360, 45);
		NormalBtn.setBorderPainted(false);

		JButton HardBtn = new JButton("어려움 <<");
		HardBtn.setFont(f1);
		HardBtn.setBackground(new Color(255, 255, 255));
		HardBtn.setBounds(290, 470, 360, 45);
		HardBtn.setBorderPainted(false); // LevelPanel 화면

		StartBt.addActionListener(e -> {
			LevelPanel.add(Lb3);
			LevelPanel.add(Lb4);
			LevelPanel.add(NormalBtn);
			LevelPanel.add(HardBtn);
			contentPane.add(LevelPanel);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);
		}); // StartBt 버튼 누르면 LevelPanel 난이도 선택 패널로 이동

		init.MT();

		Font weekfont = new Font("휴먼둥근헤드라인", Font.PLAIN, 20);
		JLabel Lb1 = new JLabel();
		Lb1.setText("종강까지 단, D-" + init.DdayNumber + "!");
		Lb1.setFont(weekfont);
		Lb1.setBounds(10, 30, 640, 50);

		JLabel dateLb = new JLabel();
		dateLb.setText("Today 2020 " + init.Month + "월" + init.Day + "일  " + init.Today + "요일");
		Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
		dateLb.setFont(datefont);
		dateLb.setBounds(10, 0, 600, 40);

		JLabel Lb2 = new JLabel();
		Lb2.setBounds(350, 0, 600, 50);
		Font Lb2font = new Font("HY견고딕", Font.PLAIN, 15);
		Lb2.setFont(Lb2font);
		Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend); // (N+H)ManuPanel화면

		JButton LBtn = new JButton("강의 듣기");
		LBtn.setFont(활동선택버튼폰트);
		LBtn.setBounds(195, 80, 130, 30);
		LBtn.setBackground(new Color(153, 239, 90));
		LBtn.setBorderPainted(false);
		LBtn.setFocusPainted(false);

		JLabel detail = new JLabel("[요구 능력치: 체력 20]");
		detail.setFont(활동선택폰트);
		detail.setBounds(197, 110, 230, 30);

		JLabel detailL = new JLabel("[얻을 수 있는 능력치: 지식 5~20]");
		detailL.setFont(활동선택폰트);
		detailL.setBounds(155, 135, 230, 30);

		LBtn.addActionListener(event -> {

			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력
			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력

			} else
				new N_Lecture(Lb1, Lb2);
		}); // N_Lecture 클래스 이동

		JButton SBtn = new JButton("공부하기");
		SBtn.setFont(활동선택버튼폰트);
		SBtn.setBounds(255, 325, 100, 30);
		SBtn.setBackground(new Color(210, 89, 242));
		SBtn.setFocusPainted(false);
		SBtn.setBorderPainted(false);

		JLabel sdetail = new JLabel("[요구능력치: 체력 15]");
		sdetail.setFont(활동선택폰트);
		sdetail.setBounds(245, 355, 230, 30);

		JLabel sdetailL = new JLabel("[얻을 수 있는 능력치: 지능 5~20]");
		sdetailL.setFont(활동선택폰트);
		sdetailL.setBounds(220, 380, 230, 30);

		SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new N_Study(Lb1, Lb2);
		}); // N_Study 클래스 이동

		JButton PtBtn = new JButton("알바가기");
		PtBtn.setFont(활동선택버튼폰트);
		PtBtn.setBounds(390, 100, 100, 30);
		PtBtn.setBackground(new Color(241, 228, 90));
		PtBtn.setFocusPainted(false);
		PtBtn.setBorderPainted(false);

		JLabel pdetail = new JLabel("[요구 능력치: 체력 25]");
		pdetail.setFont(활동선택폰트);
		pdetail.setBounds(385, 133, 230, 30);

		JLabel pdetailL = new JLabel("[얻을 수 있는 능력치: 돈 2~40000]");
		pdetailL.setFont(활동선택폰트);
		pdetailL.setBounds(359, 158, 230, 30);

		JLabel bonus = new JLabel("보너스를 받을 수 있을지도?");
		Font bonusfont = new Font("HY견고딕", Font.BOLD, 12);
		bonus.setFont(bonusfont);
		bonus.setBounds(380, 183, 200, 30);

		PtBtn.addActionListener(event -> {
			subImagePanel 알바선택 = new subImagePanel(new ImageIcon("./image/career4.png").getImage());
			Font 설명폰트 = new Font("휴먼둥근헤드라인", Font.PLAIN, 20);
			Font 폰트 = new Font("HY견고딕", Font.BOLD, 15);
			JLabel 설명 = new JLabel("알바 면접을 합격한 곳은 제과점, 영화관, 패스트푸드점");
			JLabel 설명1 = new JLabel("단 3곳이야");
			JLabel 설명2 = new JLabel("어떤 직종의 알바를 해볼까?");
			JLabel 설명3 = new JLabel("영화관");
			JLabel 설명4 = new JLabel("패스트푸드점");
			JLabel 설명5 = new JLabel("제과점");
			JButton 영화관알바 = new JButton("알바하기");
			JButton 제과점알바 = new JButton("알바하기");
			JButton 패스트푸드알바 = new JButton("알바하기");
			설명.setFont(설명폰트);
			설명1.setFont(설명폰트);
			설명2.setFont(설명폰트);
			설명3.setFont(폰트);
			설명4.setFont(폰트);
			설명5.setFont(폰트);
			알바선택.setLayout(null);
			알바선택.setBounds(0, 100, 640, 290);
			설명.setBounds(57, 125, 640, 640);
			설명1.setBounds(260, 155, 640, 640);
			설명2.setBounds(180, 185, 640, 640);
			설명3.setBounds(140, 0, 640, 640);
			설명4.setBounds(270, 0, 640, 640);
			설명5.setBounds(450, 0, 640, 640);
			영화관알바.setBounds(120, 380, 90, 25);
			패스트푸드알바.setBounds(260, 380, 90, 25);
			제과점알바.setBounds(430, 380, 90, 25);
			영화관알바.setBorderPainted(false);
			영화관알바.setFocusPainted(false);
			패스트푸드알바.setBorderPainted(false);
			패스트푸드알바.setFocusPainted(false);
			제과점알바.setBorderPainted(false);
			제과점알바.setFocusPainted(false);
			영화관알바.setBackground(Color.WHITE);
			패스트푸드알바.setBackground(Color.WHITE);
			제과점알바.setBackground(Color.WHITE);
			알바선택.add(설명3);
			설명3.setVisible(true);
			알바선택.add(설명4);
			설명4.setVisible(true);
			알바선택.add(설명5);
			설명5.setVisible(true);
			알바선택.add(영화관알바);
			영화관알바.setVisible(true);
			알바선택.add(패스트푸드알바);
			패스트푸드알바.setVisible(true);
			알바선택.add(제과점알바);
			제과점알바.setVisible(true);
			알바선택.setVisible(true);
			contentPane.add(설명);
			contentPane.add(설명1);
			contentPane.add(설명2);
			contentPane.add(설명3);
			contentPane.add(설명4);
			contentPane.add(설명5);
			contentPane.add(영화관알바);
			contentPane.add(패스트푸드알바);
			contentPane.add(제과점알바);
			contentPane.add(알바선택);
			contentPane.setBounds(0, 290, 640, 349);
			contentPane.setBackground(Color.WHITE);
			설명.setVisible(true);
			설명1.setVisible(true);
			설명2.setVisible(true);
			설명3.setVisible(true);
			설명4.setVisible(true);
			설명5.setVisible(true);
			contentPane.setVisible(true);
			choosepanel.setVisible(false);
			
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new N_PartTime();
		}); // N_PartTime 클래스 이동

	    /*JButton PlayBtn = new JButton("친구와 놀기");
		PlayBtn.setFont(활동선택버튼폰트);
		PlayBtn.setBounds(430, 300, 130, 30);
		PlayBtn.setBackground(new Color(243, 91, 182));
		PlayBtn.setBorderPainted(false);
		PlayBtn.setFocusPainted(false);

		JLabel Playdetail = new JLabel("[요구 능력치: 체력 20 돈 30000]");
		Playdetail.setFont(활동선택폰트);
		Playdetail.setBounds(430, 330, 230, 30);

		JLabel PlaydetailL = new JLabel("[얻을 수 있는 능력치: 친화력  1~20]");
		PlaydetailL.setFont(활동선택폰트);
		PlaydetailL.setBounds(410, 355, 230, 30);

		PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력
			} else
				new N_Play(Lb1, Lb2);
		}); // N_Play 클래스 이동 */
		JButton RestBtn = new JButton("휴식하기");
		RestBtn.setFont(활동선택버튼폰트);
		RestBtn.setBounds(80, 250, 112, 30);
		RestBtn.setBackground(new Color(89, 205, 242));
		RestBtn.setFocusPainted(false);
		RestBtn.setBorderPainted(false);

		JLabel rdetail = new JLabel("[요구능력치: 없음]");
		rdetail.setFont(활동선택폰트);
		rdetail.setBounds(85, 280, 200, 30);

		JLabel rdetailL = new JLabel("[얻을 수 있는 능력치: 체력 1~30]");
		rdetailL.setFont(활동선택폰트);
		rdetailL.setBounds(55, 305, 200, 30);

		RestBtn.addActionListener(event -> {
			new N_Rest(Lb1, Lb2);
		}); // N_Rest 클래스 이동

		NormalBtn.addActionListener(e -> {
			N_MenuPanel.add(Lb1);
			N_MenuPanel.add(dateLb);
			N_MenuPanel.add(Lb2);
			N_MenuPanel.add(LBtn);
			N_MenuPanel.add(detail);
			N_MenuPanel.add(detailL); // 강의버튼
			N_MenuPanel.add(SBtn);
			N_MenuPanel.add(sdetail);
			N_MenuPanel.add(sdetailL); // 공부하기버튼
			N_MenuPanel.add(PtBtn);
			N_MenuPanel.add(pdetail);
			N_MenuPanel.add(pdetailL);
			N_MenuPanel.add(bonus); // 알바버튼
		//	N_MenuPanel.add(PlayBtn);
		//	N_MenuPanel.add(Playdetail);
		//	N_MenuPanel.add(PlaydetailL); // 친구와놀기버튼
			N_MenuPanel.add(RestBtn);
			N_MenuPanel.add(rdetail);
			N_MenuPanel.add(rdetailL); // 휴식버튼

			powers.setLayout(null);
			powers.setBounds(25, 5, 80, 80);
			powerlabel.setBounds(15, 15, 40, 30);
			powerlabel.setFont(powerfont);
			powers.add(powerlabel);
			powers.setVisible(true);
			contentPane.add(powers);

			N_MenuPanel.setBounds(0, 110, 640, 640);
			contentPane.add(N_MenuPanel);
			LevelPanel.setVisible(false);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.setVisible(true);
		}); // 난이도 보통인 N_MenuPanel로 이동
		
		JLabel Hdetail = new JLabel("[요구 능력치: 체력 30]");
		Hdetail.setFont(활동선택폰트);
		Hdetail.setBounds(197, 110, 230, 30);

		JLabel HdetailL = new JLabel("[얻을 수 있는 능력치: 지식 5~20]");
		HdetailL.setFont(활동선택폰트);
		HdetailL.setBounds(155, 135, 230, 30);

		LBtn.addActionListener(event -> {

			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력

			} else
				new H_Lecture(Lb1, Lb2);
		}); // H_Lecture 클래스 이동

		JLabel Hsdetail = new JLabel("[요구능력치: 체력 15]");
		Hsdetail.setFont(활동선택폰트);
		Hsdetail.setBounds(245, 355, 230, 30);

		JLabel HsdetailL = new JLabel("[얻을 수 있는 능력치: 지능 5~20]");
		HsdetailL.setFont(활동선택폰트);
		HsdetailL.setBounds(220, 380, 230, 30);
		
		SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new H_Study(Lb1, Lb2);
		}); // H_Study 클래스 이동

		JLabel Hpdetail = new JLabel("[요구 능력치: 체력 25]");
		Hpdetail.setFont(활동선택폰트);
		Hpdetail.setBounds(385, 133, 230, 30);

		JLabel HpdetailL = new JLabel("[얻을 수 있는 능력치: 돈 2~40000]");
		HpdetailL.setFont(활동선택폰트);
		HpdetailL.setBounds(359, 158, 230, 30);

		JLabel Hbonus = new JLabel("보너스를 받을 수 있을지도?");
		Hbonus.setFont(bonusfont);
		Hbonus.setBounds(380, 183, 200, 30);
		
		PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new H_PartTime(Lb1, Lb2);
		}); // H_PartTime 클래스 이동

		JLabel HPlaydetail = new JLabel("[요구 능력치: 체력 20 돈 30000]");
		HPlaydetail.setFont(활동선택폰트);
		HPlaydetail.setBounds(430, 330, 230, 30);

		JLabel HPlaydetailL = new JLabel("[얻을 수 있는 능력치: 친화력  1~20]");
		HPlaydetailL.setFont(활동선택폰트);
		HPlaydetailL.setBounds(410, 355, 230, 30);
		
	/*	PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력
			} else
				new H_Play(Lb1, Lb2);
		}); // H_Play 클래스 이동 */

		JLabel Hrdetail = new JLabel("[요구능력치: 없음]");
		Hrdetail.setFont(활동선택폰트);
		Hrdetail.setBounds(85, 280, 200, 30);

		JLabel HrdetailL = new JLabel("[얻을 수 있는 능력치: 체력 1~30]");
		HrdetailL.setFont(활동선택폰트);
		HrdetailL.setBounds(55, 305, 200, 30);
		
		RestBtn.addActionListener(event -> {
			new H_Rest(Lb1, Lb2);
		}); // H_Rest 클래스 이동

		HardBtn.addActionListener(e -> {
			H_MenuPanel.add(Lb1);
			H_MenuPanel.add(dateLb);
			H_MenuPanel.add(Lb2);
			H_MenuPanel.add(LBtn);
			H_MenuPanel.add(Hdetail);
			H_MenuPanel.add(HdetailL); // 강의버튼
			H_MenuPanel.add(SBtn);
			H_MenuPanel.add(Hsdetail);
			H_MenuPanel.add(HsdetailL); // 공부하기버튼
			H_MenuPanel.add(PtBtn);
			H_MenuPanel.add(Hpdetail);
			H_MenuPanel.add(HpdetailL);
			H_MenuPanel.add(Hbonus); // 알바버튼
	//		H_MenuPanel.add(PlayBtn);
			H_MenuPanel.add(HPlaydetail);
			H_MenuPanel.add(HPlaydetailL); // 친구와놀기버튼
			H_MenuPanel.add(RestBtn);
			H_MenuPanel.add(Hrdetail);
			H_MenuPanel.add(HrdetailL); // 휴식버튼

			powers.setLayout(null);
			powers.setBounds(25, 5, 80, 80);
			powerlabel.setBounds(15, 15, 40, 30);
			powerlabel.setFont(powerfont);
			powers.add(powerlabel);
			powers.setVisible(true);
			contentPane.add(powers);

			H_MenuPanel.setBounds(0, 110, 640, 640);
			contentPane.add(H_MenuPanel);
			LevelPanel.setVisible(false);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.setVisible(true);
		}); // 난이도 보통인 H_MenuPanel로 이동

		setSize(655, 650);
		setVisible(true);
	}

	public static void main(String[] args) {

		new MainGrowStudent();

	}
}
