package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
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

class subImagePanel extends JPanel {
	private Image subimg;

	public subImagePanel(Image subimg) {
		this.subimg = subimg;
		setSize(new Dimension(subimg.getWidth(null), subimg.getHeight(null)));
		setPreferredSize(new Dimension(subimg.getWidth(null), subimg.getHeight(null)));// pack()한 후 프레임 사이즈가 맞게 나오지 않을 때
		setSize(640, 640);
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(subimg, 0, 0, null);
	}
}

public class MainGrowStudent extends JFrame {
	Container contentPane;

	MainGrowStudent() {
		setTitle("<< 대학생 키우기 >>");
		contentPane = getContentPane();
		contentPane.setLayout(null);
		setSize(640, 640);
		setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel StartPanel = new ImagePanel(new ImageIcon("./image/main.jpg").getImage());
		subImagePanel MenuPanel = new subImagePanel(new ImageIcon("./image/week.png").getImage());

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
		StartBt.setFocusPainted(false);

		EndBt = new JButton(" 게임 종료 <<");
		EndBt.setFont(f1);
		EndBt.setBackground(new Color(255, 255, 255));
		EndBt.setBounds(290, 470, 360, 45);
		EndBt.setBorderPainted(false);
		EndBt.setFocusPainted(false);

		StartPanel.add(label1);
		StartPanel.add(label1_1);
		StartPanel.add(StartBt);
		StartPanel.add(EndBt);
		StartPanel.setVisible(true);
		contentPane.add(StartPanel);

		setVisible(true);

		EndBt.addActionListener(e -> {
			System.exit(0);
		});

		init.MT();
		JLabel Lb1 = new JLabel();
		Lb1.setText("종강까지 D-" + init.DdayNumber);
		JLabel dateLb = new JLabel();
		dateLb.setText("Today 2020 " + init.Month + "월" + init.Day + "일  " + init.Today + "요일");
		Font datefont = new Font("HY견고딕", Font.PLAIN, 18);
		dateLb.setFont(datefont);
		dateLb.setBounds(45, 8, 640, 50);
		JLabel week = new JLabel();
		week.setText("종강까지 D-" + init.DdayNumber);
		Font weekfont = new Font("휴먼옛체", Font.PLAIN, 30);
		week.setFont(weekfont);
		week.setBounds(400, 10, 600, 40);
		add(week);
		setBackground(Color.WHITE);
		Lb1.setFont(weekfont);
		Lb1.setBounds(10, 0, 640, 50);
		MenuPanel.setBounds(0, 73, 640, 640);
		MenuPanel.add(dateLb);
		// add(Lb1);
		// JLabel Lb2 = new JLabel();
		// Lb2.setBounds(50, 180, 600, 30);
		// Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
		// " 친화력 " + init.Friend);
		// MenuPanel.add(Lb2);

		Font f3 = new Font("monospaced", Font.BOLD, 30);
		Font f4 = new Font("휴먼엑스포", Font.BOLD, 18);
		// Lb2.setFont(f3);
		// Lb1.setForeground(Color.RED);
		// Lb2.setForeground(Color.lightGray);

		JButton MBtn = new JButton("일정채우기");
		MenuPanel.add(MBtn);
		MBtn.setBorderPainted(false);
		MBtn.setFocusPainted(false);
		MBtn.setBounds(95, 100, 150, 40);

		JButton ThBtn = new JButton("일정채우기");
		MenuPanel.add(ThBtn);
		ThBtn.setBorderPainted(false);
		ThBtn.setFocusPainted(false);
		ThBtn.setBackground(Color.WHITE);
		ThBtn.setBounds(385, 100, 150, 40);
		ThBtn.setFont(f4);

		JButton WBtn = new JButton("일정채우기");
		MenuPanel.add(WBtn);
		WBtn.setBorderPainted(false);
		WBtn.setFocusPainted(false);
		WBtn.setBackground(Color.WHITE);
		WBtn.setBounds(95, 425, 150, 40);
		WBtn.setFont(f4);

		JButton TuBtn = new JButton("일정채우기");
		TuBtn.setBorderPainted(false);
		TuBtn.setFocusPainted(false);
		TuBtn.setBackground(Color.WHITE);
		TuBtn.setBounds(95, 265, 150, 40);
		TuBtn.setFont(f4);

		JButton FBtn = new JButton("일정채우기");
		JLabel click = new JLabel("Click");
		click.setBounds(500, 195, 150, 140);
		click.setFont(f4);
		FBtn.setBorderPainted(false);
		FBtn.setFocusPainted(false);
		FBtn.setBackground(Color.WHITE);
		FBtn.setBounds(385, 265, 150, 40);
		FBtn.setBackground(new Color(214, 214, 214));
		FBtn.setFont(f4);

		Font f5 = new Font("휴먼엑스포", Font.BOLD, 15);
		JButton SatBtn = new JButton("일정채우기");

		SatBtn.setBorderPainted(false);
		SatBtn.setFocusPainted(false);
		SatBtn.setBackground(Color.WHITE);
		SatBtn.setBounds(385, 395, 150, 25);
		SatBtn.setBackground(new Color(214, 214, 214));
		SatBtn.setFont(f5);

		JButton SunBtn = new JButton("일정채우기");
		// MenuPanel.add(SunBtn);
		SunBtn.setBorderPainted(false);
		SunBtn.setFocusPainted(false);
		SunBtn.setBackground(new Color(214, 214, 214));
		SunBtn.setBounds(385, 473, 150, 25);
		SunBtn.setFont(f5);

		subImagePanel choosepanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
		choosepanel.setLayout(null);
		choosepanel.setBounds(0, 80, 640, 640);

		MBtn.addActionListener(event -> {

			JLabel todaylabel = new JLabel("하루를 어떻게 보낼까?");
			todaylabel.setBounds(0, 0, 400, 50);
			choosepanel.add(todaylabel);
			contentPane.add(choosepanel);
			contentPane.setBackground(Color.WHITE);
			choosepanel.setVisible(true);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);

		});

		JButton LectureBtn = new JButton("강의 듣기");
		JLabel detail = new JLabel();
		detail.setText("체력 10이 요구됩니다.\n 지식이 5만큼 오릅니다.");
		choosepanel.add(LectureBtn);
		LectureBtn.setBounds(208, 48, 100, 30);
		LectureBtn.setBorderPainted(false);
		LectureBtn.setFocusPainted(false);
		LectureBtn.setBackground(new Color(156, 245, 91));
		LectureBtn.addActionListener(event -> {
			JLabel 시작멘트 = new JLabel();
			시작멘트.setText("오픈소스 소프트웨어 강의를 재생했어!");
			시작멘트.setBounds(10, 469, 300, 50);
			Font 모든레이블폰트 = new Font("휴먼옛체", Font.PLAIN, 15);
			시작멘트.setFont(모든레이블폰트);
			JLabel 교수님멘트 = new JLabel();
			교수님멘트.setText("교수님 : 원격저장소의 내용을 로컬저장소로 가져오려면 $%@#!@*&$^@#...\n교수님: @#$!!^*!@$^%*^(!@$#@#%&*(_)))(^@#!@!");
			교수님멘트.setBounds(10, 485, 500, 50);
			JLabel 시스템멘트 = new JLabel("수업이 끝났어! 강의를 더 들을까?");
			시스템멘트.setBounds(10, 525, 300, 50);
			JLabel 알림멘트 = new JLabel("[알림: 체력 - 10, 지능 + 5]");
			알림멘트.setBounds(250, 525, 300, 50);

			알림멘트.setFont(모든레이블폰트);
			교수님멘트.setFont(모든레이블폰트);
			시스템멘트.setFont(모든레이블폰트);
			subImagePanel 강의화면패널 = new subImagePanel(new ImageIcon("./image/lecture.jpg").getImage());
			강의화면패널.setLayout(null);
			강의화면패널.setBounds(0, 0, 640, 640);
			강의화면패널.add(알림멘트);
			강의화면패널.add(교수님멘트);
			강의화면패널.add(시스템멘트);
			contentPane.add(강의화면패널);
			
			contentPane.setBounds(640,480,640,120);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			choosepanel.setLayout(null);
			week.setVisible(false);
			choosepanel.setVisible(false);
			contentPane.setBackground(Color.WHITE);
			강의화면패널.setVisible(true);
			contentPane.setVisible(true);
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new Study();
		});

		JButton SBtn = new JButton("공부하기");
		choosepanel.add(SBtn);
	//	SBtn.setBounds(170, 328, 300, 48);
		SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new Study();
		});

		JButton PtBtn = new JButton("알바가기");
		PtBtn.setBorderPainted(false);
		PtBtn.setFocusPainted(false);
		MenuPanel.add(PtBtn);
		// PtBtn.setBounds(170, 398, 300, 48);
		PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			}// else
				//new PartTime();
		});

		JButton PlayBtn = new JButton("친구와 놀러가기");
		MenuPanel.add(PlayBtn);
		PlayBtn.setBorderPainted(false);
		PlayBtn.setFocusPainted(false);
		// PlayBtn.setBounds(170, 468, 300, 48);
		PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력
			} //else
				//new Play();
		});

		JButton RestBtn = new JButton("휴식하기");
		MenuPanel.add(RestBtn);
		RestBtn.setBorderPainted(false);
		RestBtn.setFocusPainted(false);
		// RestBtn.setBounds(170, 538, 300, 48);
		RestBtn.addActionListener(event -> {
			new Rest(Lb1/* , Lb2 */);
		});

		MBtn.setFont(f4);
		SBtn.setFont(f4);
		PtBtn.setFont(f4);
		PlayBtn.setFont(f4);
		RestBtn.setFont(f4);

		MBtn.setBackground(Color.WHITE);
		SBtn.setBackground(Color.WHITE);
		PtBtn.setBackground(Color.WHITE);
		PlayBtn.setBackground(Color.WHITE);
		RestBtn.setBackground(Color.WHITE);

		StartBt.addActionListener(e -> {
			// MenuPanel.add(Lb1);
			// MenuPanel.add(Lb2);
			MenuPanel.add(MBtn);
			MenuPanel.add(click);
			MenuPanel.add(TuBtn);
			MenuPanel.add(WBtn);
			MenuPanel.add(ThBtn);
			MenuPanel.add(FBtn);
			MenuPanel.add(SatBtn);
			MenuPanel.add(SunBtn);

			setBackground(Color.WHITE);
			contentPane.add(MenuPanel);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);
		});

	}

	public static void main(String[] args) {
		File file = new File("./image/postit.jpg");
		System.out.println(file.exists() ? "Exists" : "doesnt exists");
		new MainGrowStudent();

	}

}
