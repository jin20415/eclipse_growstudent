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
		setSize(655, 650);
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(subimg, 0, 0, null);
	}
}

public class MainGrowStudent extends JFrame {
	static Container contentPane;
	static ImagePanel StartPanel = new ImagePanel(new ImageIcon("./image/main.jpg").getImage());
	static subImagePanel MenuPanel = new subImagePanel(new ImageIcon("./image/week.png").getImage());
	static subImagePanel choosepanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	static subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());

	static JButton MBtn = new JButton("일정채우기");
	static JButton ThBtn = new JButton("일정채우기");
	static JButton WBtn = new JButton("일정채우기");
	static JButton TuBtn = new JButton("일정채우기");
	static JButton FBtn = new JButton("일정채우기");
	static JButton SatBtn = new JButton("일정채우기");
	static JButton SunBtn = new JButton("일정채우기");
	static JLabel click = new JLabel("click");
	static Font f4 = new Font("휴먼엑스포", Font.BOLD, 18);
	static JLabel week = new JLabel("" + init.getday());

	static JButton 뒤로가기 = new JButton("뒤로가기");
	static JButton partamBtn = new JButton("알바 가기");
	static JLabel 체력확인레이블 = new JLabel("" + init.getpower());
	static JLabel 지식확인레이블 = new JLabel("" + init.Intelli);
	static JLabel 돈확인레이블 = new JLabel("" + init.Money);
	static JLabel 친구확인레이블 = new JLabel("" + init.Friend);

	MainGrowStudent() {
		setTitle("<< 대학생 키우기 >>");
		contentPane = getContentPane();
		contentPane.setLayout(null);
		setSize(655, 650);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

		StartBt.addActionListener(e -> {
			
			
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
		init.MT();

		Font weekfont = new Font("휴먼둥근헤드라인", Font.PLAIN, 30);
		week.setFont(weekfont);
		week.setBounds(10, 5, 600, 40);
		add(week);
		setBackground(Color.WHITE);

		MenuPanel.setBounds(0, 73, 640, 640);

		// add(Lb1);
		// JLabel Lb2 = new JLabel();
		// Lb2.setBounds(50, 180, 600, 30);
		// Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
		// " 친화력 " + init.Friend);
		// MenuPanel.add(Lb2);

		// Lb2.setFont(f3);
		// Lb1.setForeground(Color.RED);
		// Lb2.setForeground(Color.lightGray);

	}

	static void 활동선택메뉴() {
		week.setText("" + init.getday());
		Font 활동선택버튼폰트 = new Font("HY견고딕", Font.BOLD, 15);
		Font 활동선택폰트 = new Font("HY견고딕", Font.PLAIN, 12);
		Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
		JButton LectureBtn = new JButton("강의 듣기");
		LectureBtn.setFont(활동선택버튼폰트);
		JLabel detail = new JLabel();
		detail.setText("[요구 능력치: 체력 25]");
		JLabel detailL = new JLabel("[얻을 수 있는 능력치: 지식+5]");
		detail.setFont(활동선택폰트);
		detailL.setFont(활동선택폰트);
		powers.setLayout(null);
		powers.setBounds(530, 5, 80, 80);
		체력확인레이블.setText("" + init.getpower());
		체력확인레이블.setBounds(545, 20, 40, 30);
		체력확인레이블.setFont(powerfont);
		
		powers.add(체력확인레이블);
		powers.setVisible(true);
		체력확인레이블.setVisible(true);
		contentPane.add(Lecture.스탯레이블);
		choosepanel.setBounds(0, 110, 640, 640);
		contentPane.add(체력확인레이블);
		contentPane.add(powers);
		돈확인레이블.setText("" + "돈: " + init.Money + " 사교성:" + init.Friend + " 지식:" + init.getIntelli());
		돈확인레이블.setBounds(100, 15, 500, 50);
		돈확인레이블.setFont(powerfont);
		돈확인레이블.setVisible(true);
		contentPane.add(돈확인레이블);
		contentPane.setBounds(0, 0, 640, 109);
		contentPane.setVisible(true);
		choosepanel.add(detailL);
		choosepanel.add(LectureBtn);
		choosepanel.add(detail);
		LectureBtn.setBounds(200, 78, 100, 30);
		detail.setBounds(191, 108, 200, 30);
		detail.setVisible(true);
		detailL.setBounds(191, 123, 200, 30);
		LectureBtn.setBorderPainted(false);
		LectureBtn.setFocusPainted(false);
		LectureBtn.setBackground(new Color(153, 239, 90));
		PartTime.내용.setVisible(false);
		PartTime.내용1.setVisible(false);
		PartTime.내용2.setVisible(false);
		PartTime.내용3.setVisible(false);
		PartTime.내용4.setVisible(false);
		PartTime.내용5.setVisible(false);
		PartTime.활동선택버튼.setVisible(false);
		LectureBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.getpower() + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE);

				init.Power = 100;
				
				MainGrowStudent.MenuPanel.setVisible(true);
				MainGrowStudent.StartPanel.setVisible(false);
				MainGrowStudent.choosepanel.setVisible(false);
				Lecture.longs.setVisible(false);
				Lecture.shorts.setVisible(false);
				Lecture.lectures.setVisible(false);
				Lecture.활동선택하기.setVisible(false);
				MainGrowStudent.week.setVisible(true);
			}
			Lecture.Lecture();

			LectureBtn.setVisible(false);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			choosepanel.setVisible(false);
			week.setVisible(false);
			choosepanel.setVisible(false);
			Lecture.longs.setVisible(true);
			Lecture.button1.setVisible(true);
			contentPane.add(Lecture.lecturelist);
			Lecture.lecturelist.setVisible(true);
			Lecture.button1.setVisible(true);
			Lecture.button2.setVisible(true);
			Lecture.button3.setVisible(true);
			Lecture.버튼1강의장소.setVisible(true);
			Lecture.버튼1교수님.setVisible(true);
			Lecture.버튼1강의자료.setVisible(true);
			Lecture.버튼2강의장소.setVisible(true);
			Lecture.버튼2교수님.setVisible(true);
			Lecture.버튼2강의자료.setVisible(true);
			Lecture.버튼3강의장소.setVisible(true);
			Lecture.버튼3교수님.setVisible(true);
			Lecture.버튼3강의자료.setVisible(true);

			Lecture.활동선택하기.setBounds(0, 73, 130, 30);
			Lecture.활동선택하기.setVisible(true);
			PartTime.일과끝내기.setVisible(false);
			Lecture.활동선택하기.setVisible(true);
			/*
			 * if (Power <= 0) { JOptionPane.showMessageDialog(null, "체력이 " + Power + "입니다"
			 * + "\n체력이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지 출력
			 * 
			 * } else new Study();
			 */
		});
		JButton playBtn = new JButton("휴식 하기 ");
		// Font rest = new Font("HY견고딕", Font.BOLD, 10);
		choosepanel.add(playBtn);
		playBtn.setBounds(55, 260, 112, 30);
		playBtn.setBackground(new Color(89, 205, 242));
		playBtn.setFocusPainted(false);
		playBtn.setBorderPainted(false);
		playBtn.setFont(활동선택버튼폰트);
		JLabel rdetail = new JLabel();
		rdetail.setText("[요구능력치: 없음]");
		JLabel rdetailL = new JLabel("[얻을 수 있는 능력치: 체력 + 20]");
		// JLabel s = new JLabel("보너스를 받을 수 있을지도?");
		rdetail.setFont(활동선택폰트);
		rdetail.setBounds(60, 290, 200, 30);
		rdetailL.setFont(활동선택폰트);
		rdetailL.setBounds(60, 310, 200, 30);
		// s.setFont(rest);
		// s.setBounds(30, 183, 200, 30);
		choosepanel.add(rdetail);
		choosepanel.add(rdetailL);
		// choosepanel.add(s);

		Font bonusfont = new Font("HY견고딕", Font.BOLD, 10);
		choosepanel.add(partamBtn);
		partamBtn.setBounds(370, 110, 100, 30);
		partamBtn.setBackground(new Color(241, 228, 90));
		partamBtn.setFocusPainted(false);
		partamBtn.setBorderPainted(false);
		partamBtn.setFont(활동선택버튼폰트);

		PartTime.pdetail.setFont(활동선택폰트);
		PartTime.pdetail.setBounds(371, 143, 200, 30);
		PartTime.pdetailL.setFont(활동선택폰트);
		PartTime.pdetailL.setBounds(371, 163, 200, 30);
		PartTime.bonus.setFont(bonusfont);
		PartTime.bonus.setBounds(403, 183, 200, 30);
		choosepanel.add(PartTime.pdetail);
		choosepanel.add(PartTime.pdetailL);
		choosepanel.add(PartTime.bonus);

		partamBtn.addActionListener(event -> {
			PartTime.PartTime();
			Font 설명폰트 = new Font("휴먼둥근헤드라인", Font.PLAIN, 20);
			Font 폰트 = new Font("HY견고딕", Font.BOLD, 15);

			PartTime.설명.setFont(설명폰트);
			PartTime.설명1.setFont(설명폰트);
			PartTime.설명2.setFont(설명폰트);
			PartTime.설명3.setFont(폰트);
			PartTime.설명4.setFont(폰트);
			PartTime.설명5.setFont(폰트);
			PartTime.알바선택.setLayout(null);
			PartTime.알바선택.setBounds(0, 100, 640, 290);
			PartTime.설명.setBounds(57, 125, 640, 640);
			PartTime.설명1.setBounds(260, 155, 640, 640);
			PartTime.설명2.setBounds(180, 185, 640, 640);
			PartTime.설명3.setBounds(140, 0, 640, 640);
			PartTime.설명4.setBounds(270, 0, 640, 640);
			PartTime.설명5.setBounds(450, 0, 640, 640);
			PartTime.영화관알바.setBounds(120, 380, 90, 25);
			PartTime.패스트푸드알바.setBounds(260, 380, 90, 25);
			PartTime.제과점알바.setBounds(430, 380, 90, 25);
			PartTime.영화관알바.setBorderPainted(false);
			PartTime.영화관알바.setFocusPainted(false);
			PartTime.패스트푸드알바.setBorderPainted(false);
			PartTime.패스트푸드알바.setFocusPainted(false);
			PartTime.제과점알바.setBorderPainted(false);
			PartTime.제과점알바.setFocusPainted(false);
			PartTime.영화관알바.setBackground(Color.WHITE);
			PartTime.패스트푸드알바.setBackground(Color.WHITE);
			PartTime.제과점알바.setBackground(Color.WHITE);
			PartTime.알바선택.add(PartTime.설명3);
			PartTime.설명3.setVisible(true);
			PartTime.알바선택.add(PartTime.설명4);
			PartTime.설명4.setVisible(true);
			PartTime.알바선택.add(PartTime.설명5);
			PartTime.설명5.setVisible(true);
			PartTime.알바선택.add(PartTime.영화관알바);
			PartTime.영화관알바.setVisible(true);
			PartTime.알바선택.add(PartTime.패스트푸드알바);
			PartTime.패스트푸드알바.setVisible(true);
			PartTime.알바선택.add(PartTime.제과점알바);
			PartTime.제과점알바.setVisible(true);
			PartTime.알바선택.setVisible(true);
			contentPane.add(PartTime.설명);
			contentPane.add(PartTime.설명1);
			contentPane.add(PartTime.설명2);
			contentPane.add(PartTime.설명3);
			contentPane.add(PartTime.설명4);
			contentPane.add(PartTime.설명5);
			contentPane.add(PartTime.영화관알바);
			contentPane.add(PartTime.패스트푸드알바);
			contentPane.add(PartTime.제과점알바);
			contentPane.add(PartTime.알바선택);
			contentPane.setBounds(0, 290, 640, 349);
			contentPane.setBackground(Color.WHITE);
			PartTime.설명.setVisible(true);
			PartTime.설명1.setVisible(true);
			PartTime.설명2.setVisible(true);
			PartTime.설명3.setVisible(true);
			PartTime.설명4.setVisible(true);
			PartTime.설명5.setVisible(true);
			contentPane.setVisible(true);
			choosepanel.setVisible(false);

		});

		JButton back = new JButton("뒤로가기");
		back.setBackground(new Color(243, 90, 181));
		back.setBounds(410, 310, 100, 30);
		choosepanel.add(back);
		back.setFont(활동선택버튼폰트);
		back.setFocusPainted(false);
		back.setBorderPainted(false);
		back.addActionListener(event -> {
			
			MenuPanel.setVisible(true);
			choosepanel.setVisible(false);
		});

		JButton SBtn = new JButton("공부 하기");
		choosepanel.add(SBtn);
		SBtn.setBounds(236, 340, 100, 30);
		SBtn.setBackground(new Color(210, 89, 242));
		SBtn.setFocusPainted(false);
		SBtn.setBorderPainted(false);
		SBtn.setFont(활동선택버튼폰트);
		JLabel sdetail = new JLabel();
		sdetail.setText("[요구능력치: 체력 25]");
		JLabel sdetailL = new JLabel("[얻을 수 있는 능력치: 지능 + 5]");
		// JLabel s = new JLabel("보너스를 받을 수 있을지도?");
		sdetail.setFont(활동선택폰트);
		sdetail.setBounds(235, 370, 200, 30);
		sdetailL.setFont(활동선택폰트);
		sdetailL.setBounds(235, 385, 200, 30);
		// s.setFont(rest);
		// s.setBounds(30, 183, 200, 30);
		choosepanel.add(sdetail);
		choosepanel.add(sdetailL);
		// choosepanel.add(s);
		SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new Study();
		});
	}

	



	public static void main(String[] args) {
		File file = new File("./image/lecture.jpg");
		System.out.println(file.exists() ? "Exists" : "doesnt exists");
		new MainGrowStudent();

	}

}
