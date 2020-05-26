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
	JButton button1 = new JButton("N1. 오픈소스소프트웨어");
	JButton button2 = new JButton("N2. 데이터베이스");
	JButton button3 = new JButton("N3. 정보보호");
	JLabel 버튼1교수님 = new JLabel("1) 겸임 교수님: 강신재교수님");
	JLabel 버튼1강의장소 = new JLabel("2) 강의 장소: 공7514");
	JLabel 버튼1강의자료 = new JLabel("3) 교재: LMS 강의자료 ");
	JLabel 버튼2교수님 = new JLabel("1) 겸임 교수님: 남인길교수님");
	JLabel 버튼2강의장소 = new JLabel("2) 강의 장소: 공7507");
	JLabel 버튼2강의자료 = new JLabel("3) 교재: 오라클로 배우는 데이터베이스 ");
	JLabel 버튼3교수님 = new JLabel("1) 겸임 교수님: 김창훈교수님");
	JLabel 버튼3강의장소 = new JLabel("2) 강의 장소: 공7714");
	JLabel 버튼3강의자료 = new JLabel("3) 교재: 오라클로 배우는 데이터베이스 ");
	JLabel 타이틀 = new JLabel("강의선택");
	JButton button4 = new JButton("뒤로가기");

	subImagePanel longs = new subImagePanel(new ImageIcon("./image/longp.png").getImage());
	subImagePanel shorts = new subImagePanel(new ImageIcon("./image/shortp.png").getImage());
	subImagePanel lecturelist = new subImagePanel(new ImageIcon("./image/choice.png").getImage());

	JLabel 시작멘트 = new JLabel();
	Font 모든레이블폰트 = new Font("HY견고딕", Font.PLAIN, 15);
	JLabel 교수님멘트 = new JLabel();
	JLabel 시스템멘트 = new JLabel("수업이 끝났어! 강의를 더 들을까?");
	JLabel 알림멘트 = new JLabel();
	JButton 체력확인 = new JButton("체력확인하기");
	static JButton 활동선택하기 = new JButton("활동선택하기");

	N_Lecture(JLabel Lb1, JLabel Lb2) {

		setSize(655,650);
		setLayout(null);
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
		contentPane.add(타이틀);
		contentPane.add(longs);
		contentPane.add(체력확인);
		contentPane.add(활동선택하기);
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
		// contentPane.add(PartTime.일과끝내기);
		// PartTime.일과끝내기.setFont(btnfont);
		// PartTime.일과끝내기.setBackground(new Color(225, 80, 80));
		// PartTime.일과끝내기.setBounds(0, 153, 130, 30);
		// PartTime.일과끝내기.setBorderPainted(false);
		// PartTime.일과끝내기.setFocusPainted(false);
		// PartTime.일과끝내기.setVisible(true);
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
		// PartTime.일과끝내기.setVisible(false);
		/*
		 * MainGrowStudent.체력확인레이블.setVisible(false);
		 * MainGrowStudent.powers.setVisible(false); PartTime.설명.setVisible(false);
		 * PartTime.설명1.setVisible(false); PartTime.설명2.setVisible(false);
		 * PartTime.설명3.setVisible(false); PartTime.설명4.setVisible(false);
		 * PartTime.설명5.setVisible(false); PartTime.내용.setVisible(false);
		 * PartTime.내용1.setVisible(false); PartTime.내용2.setVisible(false);
		 * PartTime.내용3.setVisible(false); PartTime.내용4.setVisible(false);
		 * PartTime.내용5.setVisible(false);
		 */
		lecturelist.setVisible(true);

		button1.addActionListener(event -> {
			init.N_intelli_up();
			Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.N_intelli_up();
			Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.N_intelli_up();
			Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button4.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "뒤로 이동합니다", "뒤로 이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			dispose();
		});
		setSize(800, 680);
		setVisible(true);
	}

}
