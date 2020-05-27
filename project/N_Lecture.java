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


	 
	JButton 체력확인 = new JButton("체력확인하기");
	JButton 활동선택하기 = new JButton("활동선택하기");

	N_Lecture() {
		contentPane = getContentPane();
		setSize(655, 650);
		setLayout(null);
		
		lecturelist.setLayout(null);
		lecturelist.setBounds(110, 0, 640, 640);
		contentPane.add(lecturelist);
		contentPane.setBackground(Color.WHITE);
 		contentPane.setVisible(true);
		
		/*
		 * Font lecture = new Font("휴먼옛체", Font.BOLD, 22); Font labelfont = new
		 * Font("HY견고딕", Font.PLAIN, 15); Font titlefont = new Font("HY헤드라인M",
		 * Font.BOLD, 20); Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
		 * contentPane.add(타이틀); contentPane.add(longs); contentPane.add(체력확인);
		 * contentPane.add(활동선택하기); // MainGrowStudent.contentPane.add(shorts);
		 * 
		 * 활동선택하기.setBounds(0, 73, 130, 30); 활동선택하기.setBorderPainted(false);
		 * 활동선택하기.setFocusPainted(false); 활동선택하기.setBackground(new Color(225, 80, 80));
		 * 활동선택하기.setFont(btnfont); 체력확인.setVisible(true); 체력확인.setBounds(0, 113, 130,
		 * 30); 체력확인.setBackground(new Color(225, 80, 80));
		 * 체력확인.setBorderPainted(false); 체력확인.setFocusPainted(false);
		 * 체력확인.setFont(btnfont); 타이틀.setVisible(true); 타이틀.setBounds(17, 20, 300, 60);
		 * 타이틀.setFont(titlefont);
		 * 
		 * 버튼3강의자료.setFont(labelfont);
		 * 
		 * 
		 * 
		 * // MainGrowStudent.contentPane.add(타이틀); button1.setBackground(Color.WHITE);
		 * button2.setBackground(Color.WHITE); button3.setBackground(Color.WHITE);
		 * 
		 * button1.setFocusPainted(false); button2.setFocusPainted(false);
		 * button3.setFocusPainted(false);
		 * 
		 * button1.setBorderPainted(false); button2.setBorderPainted(false);
		 * button3.setBorderPainted(false);
		 * 
		 * lecturelist.setVisible(true); contentPane.add(lecturelist);
		 * contentPane.setVisible(true); /* button1.addActionListener(event -> {
		 * init.N_intelli_up(); // Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  "
		 * + init.Month + "월  " + init.Day + "일  " + init.Today + "요일"); //
		 * Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
		 * " 친화력 " + init.Friend); dispose(); }); button2.addActionListener(event -> {
		 * init.N_intelli_up(); // Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  "
		 * + init.Month + "월  " + init.Day + "일  " + init.Today + "요일"); //
		 * Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
		 * " 친화력 " + init.Friend); dispose(); }); button3.addActionListener(event -> {
		 * init.N_intelli_up(); // Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  "
		 * + init.Month + "월  " + init.Day + "일  " + init.Today + "요일"); //
		 * Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
		 * " 친화력 " + init.Friend); dispose(); }); button4.addActionListener(event -> {
		 * JOptionPane.showMessageDialog(null, "뒤로 이동합니다", "뒤로 이동",
		 * JOptionPane.INFORMATION_MESSAGE); // 메시지 dispose(); });
		 */

		setVisible(true);
	}

}
