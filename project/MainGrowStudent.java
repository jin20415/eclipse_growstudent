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
	static subImagePanel theater = new subImagePanel(new ImageIcon("./image/theater.jpg").getImage());
	static subImagePanel pizza = new subImagePanel(new ImageIcon("./image/pizza.jpg").getImage());
	static subImagePanel bakery = new subImagePanel(new ImageIcon("./image/bakery.jpg").getImage());
	static subImagePanel 알바선택 = new subImagePanel(new ImageIcon("./image/career4.png").getImage());
	static JButton MBtn = new JButton("일정채우기");
	static JButton ThBtn = new JButton("일정채우기");
	static JButton WBtn = new JButton("일정채우기");
	static JButton TuBtn = new JButton("일정채우기");
	static JButton FBtn = new JButton("일정채우기");
	static JButton SatBtn = new JButton("일정채우기");
	static JButton SunBtn = new JButton("일정채우기");
	static JLabel click = new JLabel("click");
	static Font f4 = new Font("휴먼엑스포", Font.BOLD, 18);
	static JLabel week = new JLabel();
	JButton 제과점 = new JButton("제과점");
	JButton 영화관 = new JButton("영화관");
	JButton 피자 = new JButton("피자");
	JButton 뒤로가기 = new JButton("뒤로가기");
	
	static JLabel 체력확인레이블 = new JLabel("" + init.Power);
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
			// MenuPanel.add(Lb1);
			// MenuPanel.add(Lb2);
			요일선택화면();
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

		week.setText(" D-" + init.DdayNumber + "!");
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
		체력확인레이블.setBounds(545, 20, 40, 30);
		체력확인레이블.setFont(powerfont);
		powers.add(체력확인레이블);
		powers.setVisible(true);
		체력확인레이블.setVisible(true);
		contentPane.add(Lecture.스탯레이블);
		choosepanel.setBounds(0, 110, 640, 640);
		contentPane.add(체력확인레이블);
		contentPane.add(powers);
		돈확인레이블.setText("" + "돈: " + init.Money + " 사교성:" + init.Friend + " 지식:" + init.Intelli);
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
		LectureBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE);
				init.DdayNumber--;
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
			Lecture.Lecture();
			// init.오픈소스소프트웨어();
			// init.데이터베이스();
			// init.정보보호();
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

		JButton partamBtn = new JButton("알바 가기"); //활동선택 메소드를 하나 만들어놓기
		Font bonusfont = new Font("HY견고딕", Font.BOLD, 10);
		choosepanel.add(partamBtn);
		partamBtn.setBounds(370, 110, 100, 30);
		partamBtn.setBackground(new Color(241, 228, 90));
		partamBtn.setFocusPainted(false);
		partamBtn.setBorderPainted(false);
		partamBtn.setFont(활동선택버튼폰트);
		JLabel pdetail = new JLabel();
		pdetail.setText("[요구 능력치: 체력 50]");
		JLabel pdetailL = new JLabel("[얻을 수 있는 능력치: 돈 + 40000]");
		JLabel bonus = new JLabel("보너스를 받을 수 있을지도?");
		pdetail.setFont(활동선택폰트);
		pdetail.setBounds(371, 143, 200, 30);
		pdetailL.setFont(활동선택폰트);
		pdetailL.setBounds(371, 163, 200, 30);
		bonus.setFont(bonusfont);
		bonus.setBounds(403, 183, 200, 30);
		choosepanel.add(pdetail);
		choosepanel.add(pdetailL);
		choosepanel.add(bonus);
		JLabel 설명 = new JLabel("알바 면접을 합격한 곳은 제과점, 영화관, 패스트푸드점");
		JLabel 설명1 = new JLabel("단 3곳이야");
		JLabel 설명2 = new JLabel("어떤 직종의 알바를 해볼까?");
		JLabel 설명3 = new JLabel("영화관");
		JLabel 설명4 = new JLabel("패스트푸드점");
		JLabel 설명5 = new JLabel("제과점");
		JButton 영화관알바 = new JButton("알바하기");
		JButton 제과점알바 = new JButton("알바하기");
		JButton 패스트푸드알바 = new JButton("알바하기");
		JButton 활동선택버튼 = new JButton("활동선택");
		JButton 일과끝내기 = new JButton("일과끝내기");
		
		partamBtn.addActionListener(event -> {
			Font 설명폰트 = new Font("휴먼둥근헤드라인", Font.PLAIN, 20);
			Font 폰트 = new Font("HY견고딕", Font.BOLD, 15);
			
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
			
			contentPane.setVisible(true);
			choosepanel.setVisible(false);

		});
		영화관알바.addActionListener(event -> {
			
			theater.setVisible(true);
			theater.setLayout(null);
			theater.setBounds(0, 70, 640, 640);
			contentPane.add(theater);
			알바선택.setVisible(false);
			설명.setVisible(false);
			설명1.setVisible(false);
			설명2.setVisible(false);
			설명3.setVisible(false);
			설명4.setVisible(false);
			설명5.setVisible(false);
			패스트푸드알바.setVisible(false);
			영화관알바.setVisible(false);
			제과점알바.setVisible(false);

		});
		init.Power = init.Power - 50;
		패스트푸드알바.addActionListener(event -> {
			init.Power = init.Power - 50;
			JLabel 내용 = new JLabel();
			JLabel 내용1 = new JLabel();
			JLabel 내용2 = new JLabel();
			JLabel 내용3 = new JLabel();
			JLabel 내용4 = new JLabel();
			JLabel 내용5 = new JLabel();
			JLabel 내용6 = new JLabel();
			
			contentPane.add(활동선택버튼);
			활동선택버튼.setBounds(0,70,120,30);
			활동선택버튼.setVisible(true);
			contentPane.add(일과끝내기);
			일과끝내기.setVisible(true);
			일과끝내기.setBounds(0,110,120,30);
			Font 내용폰트 = new Font("HY견고딕",Font.PLAIN,18);
			Font 내용6폰트 = new Font("HY견고딕",Font.BOLD,12);
			내용.setText("피자 패스트푸드점에 출근했어. 오픈 전, 300개의 포장 박스를 접어야 해. ");
			내용.setBounds(10, 120, 640, 640);
			내용1.setText("정신없이 상자를 다 접고, 12:00 오픈 준비를 끝냈어.");
			내용1.setBounds(10,140,640,640);
			
			내용2.setText(". . . 잠시후 주문이 밀려오기 시작했어!");
			내용2.setBounds(10,160,640,640);
			내용3.setText("나는 주방에 주문 리스트들을 전달했어. 슬슬 지쳐올 때 쯤 교대시간이?!!");
			내용3.setBounds(10,180,640,640);
			내용4.setText("마침내 교대정산을 마치고 가게를 나왔어!");
			내용4.setBounds(10,200,640,640);
			내용5.setText(". . .[아르바이트가 끝났습니다.]");
			내용5.setBounds(360,200,640,640);
			//내용6.setText(" ");
			//내용6.setBounds(100,200,640,640);
			내용.setFont(내용폰트);
			내용1.setFont(내용폰트);
			내용2.setFont(내용폰트);
			내용3.setFont(내용폰트);
			내용4.setFont(내용폰트);
			내용5.setFont(내용6폰트);
			내용6.setFont(내용6폰트);
		/*	내용.setForeground(Color.);
			내용1.setForeground(Color.WHITE);
			내용2.setForeground(Color.WHITE);
			내용3.setForeground(Color.WHITE);
			내용4.setForeground(Color.WHITE);
			내용5.setForeground(Color.WHITE);
			내용6.setForeground(Color.BLACK);*/
			
			pizza.setVisible(true);
			pizza.setLayout(null);
			pizza.setBounds(0, 0, 640, 410);
			contentPane.add(내용);
			contentPane.add(내용1);
			contentPane.add(내용2);
			contentPane.add(내용3);
			contentPane.add(내용4);
			contentPane.add(내용5);
			contentPane.add(내용6);
			내용.setVisible(true);
			contentPane.add(pizza);
			powers.setBounds(550,510,190,80);
			체력확인레이블.setBounds(565,525,100,30);
			알바선택.setVisible(false);
			설명.setVisible(false);
			설명1.setVisible(false);
			설명2.setVisible(false);
			설명3.setVisible(false);
			설명4.setVisible(false);
			설명5.setVisible(false);
			패스트푸드알바.setVisible(false);
			영화관알바.setVisible(false);
			제과점알바.setVisible(false);
		});
		활동선택버튼.addActionListener(event ->{
			JOptionPane.showMessageDialog(null, "활동 선택으로 이동합니다", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			MainGrowStudent.contentPane.setBounds(0, 0, 640, 151);
			MainGrowStudent.활동선택메뉴();
			MainGrowStudent.choosepanel.setVisible(true);
			MainGrowStudent.contentPane.setBackground(Color.WHITE);
			MainGrowStudent.contentPane.setVisible(true);
			/*스탯레이블.setText(""+init.DdayNumber);
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
			버튼3강의장소.setVisible(false);*/
			돈확인레이블.setText(""+"돈: "+init.Money +" 사교성:"+init.Friend+" 지식:"+init.Intelli);
			돈확인레이블.setBounds(100,15,500,50);
			돈확인레이블.setFont(powerfont);
			돈확인레이블.setVisible(true);
			contentPane.add(MainGrowStudent.돈확인레이블);
			powers.setLayout(null);
			powers.setBounds(520,5,80,80);						
			체력확인레이블.setBounds(530,15,40,30);
			체력확인레이블.setFont(powerfont);
			powers.add(MainGrowStudent.체력확인레이블);
//			MainGrowStudent.contentPane.add(스탯레이블);
			contentPane.add(MainGrowStudent.체력확인레이블);
			contentPane.add(MainGrowStudent.powers);			
			powers.setVisible(true);
			활동선택버튼.setVisible(false);
			체력확인레이블.setVisible(true);
			contentPane.setBounds(0,0,640,109);
			contentPane.setBackground(Color.WHITE);
			pizza.setVisible(false);
			contentPane.setVisible(true);
			
		});
		일과끝내기.addActionListener(event-> {
			init.DdayNumber = init.DdayNumber - 1;
			init.day();
			JOptionPane.showMessageDialog(null, "활동 선택으로 이동합니다", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			MainGrowStudent.contentPane.setBounds(0, 0, 640, 151);
			MainGrowStudent.활동선택메뉴();
			MainGrowStudent.choosepanel.setVisible(true);
			MainGrowStudent.contentPane.setBackground(Color.WHITE);
			MainGrowStudent.contentPane.setVisible(true);
			/*스탯레이블.setText(""+init.DdayNumber);
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
			버튼3강의장소.setVisible(false);*/
			돈확인레이블.setText(""+"돈: "+init.Money +" 사교성:"+init.Friend+" 지식:"+init.Intelli);
			돈확인레이블.setBounds(100,15,500,50);
			돈확인레이블.setFont(powerfont);
			돈확인레이블.setVisible(true);
			contentPane.add(MainGrowStudent.돈확인레이블);
			powers.setLayout(null);
			powers.setBounds(520,5,80,80);						
			체력확인레이블.setBounds(530,15,40,30);
			체력확인레이블.setFont(powerfont);
			powers.add(MainGrowStudent.체력확인레이블);
//			MainGrowStudent.contentPane.add(스탯레이블);
			contentPane.add(MainGrowStudent.체력확인레이블);
			contentPane.add(MainGrowStudent.powers);			
			powers.setVisible(true);
			활동선택버튼.setVisible(false);
			체력확인레이블.setVisible(true);
			contentPane.setBounds(0,0,640,109);
			contentPane.setBackground(Color.WHITE);
			pizza.setVisible(false);
			활동선택버튼.setVisible(false);
			contentPane.setVisible(true);
		});
		제과점알바.addActionListener(event -> {
			init.Power = init.Power - 50;
			bakery.setVisible(true);
			bakery.setLayout(null);
			bakery.setBounds(0, 90, 640, 640);
			contentPane.add(bakery);
			알바선택.setVisible(false);
			설명.setVisible(false);
			설명1.setVisible(false);
			설명2.setVisible(false);
			설명3.setVisible(false);
			설명4.setVisible(false);
			설명5.setVisible(false);
			패스트푸드알바.setVisible(false);
			영화관알바.setVisible(false);
			제과점알바.setVisible(false);

		});
		JButton back = new JButton("뒤로가기");
		back.setBackground(new Color(243, 90, 181));
		back.setBounds(410, 310, 100, 30);
		choosepanel.add(back);
		back.setFont(활동선택버튼폰트);
		back.setFocusPainted(false);
		back.setBorderPainted(false);
		back.addActionListener(event -> {
			요일선택화면();
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

		/*JButton PtBtn = new JButton("알바가기");
		PtBtn.setBorderPainted(false);
		PtBtn.setFocusPainted(false);
		MenuPanel.add(PtBtn);
		// PtBtn.setBounds(170, 398, 300, 48);
		PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} // else
				// new PartTime();
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
			} // else
				// new Play();
		});

		JButton RestBtn = new JButton("휴식하기");
		MenuPanel.add(RestBtn);
		RestBtn.setBorderPainted(false);
		RestBtn.setFocusPainted(false);
		// RestBtn.setBounds(170, 538, 300, 48);
		// RestBtn.addActionListener(event -> {
		// Rest.Rest(Lb1);
		// });

		MBtn.setFont(f4);
		// SBtn.setFont(f4);
		PtBtn.setFont(f4);
		PlayBtn.setFont(f4);
		RestBtn.setFont(f4);

		MBtn.setBackground(Color.WHITE);
		// SBtn.setBackground(Color.WHITE);
		PtBtn.setBackground(Color.WHITE);
		PlayBtn.setBackground(Color.WHITE);
		RestBtn.setBackground(Color.WHITE);
*/
	}

	static void 요일선택화면() {

		MenuPanel.setBounds(0, 50, 640, 640);
		MenuPanel.add(MBtn);
		MBtn.setBorderPainted(false);
		MBtn.setFocusPainted(false);
		MBtn.setBackground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		MBtn.setBounds(95, 100, 150, 40);
		MBtn.setFont(f4);

		MenuPanel.add(ThBtn);
		ThBtn.setBorderPainted(false);
		ThBtn.setFocusPainted(false);
		ThBtn.setBackground(Color.WHITE);
		ThBtn.setBounds(385, 100, 150, 40);
		ThBtn.setFont(f4);

		MenuPanel.add(WBtn);
		WBtn.setBorderPainted(false);
		WBtn.setFocusPainted(false);
		WBtn.setBackground(Color.WHITE);
		WBtn.setBounds(95, 425, 150, 40);
		WBtn.setFont(f4);

		TuBtn.setBorderPainted(false);
		TuBtn.setFocusPainted(false);
		TuBtn.setBackground(Color.WHITE);
		TuBtn.setBounds(95, 265, 150, 40);
		TuBtn.setFont(f4);

		click.setBounds(500, 245, 80, 30);
		click.setFont(f4);
		FBtn.setBorderPainted(false);
		FBtn.setFocusPainted(false);
		click.setBackground(new Color(214, 214, 214));
		FBtn.setBounds(385, 265, 150, 40);
		FBtn.setBackground(new Color(214, 214, 214));
		FBtn.setFont(f4);

		Font f5 = new Font("휴먼엑스포", Font.BOLD, 15);

		SatBtn.setBorderPainted(false);
		SatBtn.setFocusPainted(false);
		SatBtn.setBackground(Color.WHITE);
		SatBtn.setBounds(385, 395, 150, 25);
		SatBtn.setBackground(new Color(214, 214, 214));
		SatBtn.setFont(f5);

		// MenuPanel.add(SunBtn);
		SunBtn.setBorderPainted(false);
		SunBtn.setFocusPainted(false);
		SunBtn.setBackground(new Color(214, 214, 214));
		SunBtn.setBounds(385, 473, 150, 25);
		SunBtn.setFont(f5);

		choosepanel.setLayout(null);
		choosepanel.setBounds(0, 80, 640, 640);

		MBtn.addActionListener(event -> {

			MBtn.setText("어제");
			init.Power = 100;
			활동선택메뉴();
			contentPane.add(choosepanel);
			contentPane.setBackground(Color.WHITE);
			choosepanel.setVisible(true);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);

		});

		TuBtn.addActionListener(event -> {

			init.Power = 100;
			활동선택메뉴();
			contentPane.add(choosepanel);
			contentPane.setBackground(Color.WHITE);
			choosepanel.setVisible(true);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);

		});

		WBtn.addActionListener(event -> {

			init.Power = 100;
			활동선택메뉴();
			contentPane.add(choosepanel);
			contentPane.setBackground(Color.WHITE);
			choosepanel.setVisible(true);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);

		});

		ThBtn.addActionListener(event -> {
			init.Power = 100;
			활동선택메뉴();
			contentPane.add(choosepanel);
			contentPane.setBackground(Color.WHITE);
			choosepanel.setVisible(true);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);

		});

		FBtn.addActionListener(event -> {
			init.Power = 100;
			활동선택메뉴();
			contentPane.add(choosepanel);
			contentPane.setBackground(Color.WHITE);
			choosepanel.setVisible(true);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);

		});
		SatBtn.addActionListener(event -> {
			init.Power = 100;
			활동선택메뉴();
			contentPane.add(choosepanel);
			contentPane.setBackground(Color.WHITE);
			choosepanel.setVisible(true);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);

		});
		SunBtn.addActionListener(event -> {
			init.Power = 100;
			활동선택메뉴();
			contentPane.add(choosepanel);
			contentPane.setBackground(Color.WHITE);
			choosepanel.setVisible(true);
			MenuPanel.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);

		});
	}

	public static void main(String[] args) {
		File file = new File("./image/lecture.jpg");
		System.out.println(file.exists() ? "Exists" : "doesnt exists");
		new MainGrowStudent();

	}

}
