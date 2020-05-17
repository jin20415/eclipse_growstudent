package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class lectureImagePanel extends JPanel {
	private Image lectureimg;

	public lectureImagePanel(Image lectureimg) {
		this.lectureimg = lectureimg;
		setSize(new Dimension(lectureimg.getWidth(null), lectureimg.getHeight(null)));
		setPreferredSize(new Dimension(lectureimg.getWidth(null), lectureimg.getHeight(null)));// pack()한 후 프레임 사이즈가 맞게
																								// 나오지 않을 때 설정해줌.
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(lectureimg, 0, 0, null);
	}
}

class init {
	static int DdayNumber = 45;
	static int Power = 100;
	static int Money = 100000;
	static int Friend = 50;
	static int Intelli = 30;
	static int Month = 5;
	static int Day = 1;
	static String Daily[] = { "금", "토", "일", "월", "화", "수", "목" };
	static String Today = null;

	static void MT() {
		if (Month == 5) {
			Today = Daily[Day % 7 - 1];

		} else if (Month == 5 && Day == 32) {
			Day = 1;
			Today = Daily[Day % 7 + 2];
		}
	}

	 static void 오픈소스소프트웨어() {
		lectureImagePanel 강의이미지패널 = new lectureImagePanel(new ImageIcon("./image/lecture.jpg").getImage());
		강의이미지패널.setLayout(null);
		if (Power <= 0) {
			JOptionPane.showMessageDialog(null, "체력이 " + Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
					JOptionPane.WARNING_MESSAGE);
			DdayNumber--;
			Power = 100;// 메시지 출력
		}
		if (Power < 20) {
			JOptionPane.showMessageDialog(null, "체력이 " + Power + "입니다" + "\n 최소 필요 체력보다 낮아 강의를 들을 수 없습니다.", "경고",
					JOptionPane.WARNING_MESSAGE);
		}

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
		MainGrowStudent.contentPane.add(강의화면패널);
		
		MainGrowStudent.contentPane.setBounds(640,480,640,120);
		
		MainGrowStudent.contentPane.setBackground(Color.WHITE);
		강의화면패널.setVisible(true);
		MainGrowStudent.contentPane.setVisible(true);
		Power -= 20;
		Money -= 5000;
		MT();
	}

	 static void 데이터베이스() {
		if (Power <= 0) {
			JOptionPane.showMessageDialog(null, "체력이 " + Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
					JOptionPane.WARNING_MESSAGE);
			DdayNumber--;
			Power = 100;// 메시지 출력
		}

		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		Money -= 5000;
		MT();
	}

	 static void 정보보호() {
		if (Power <= 0) {
			JOptionPane.showMessageDialog(null, "체력이 " + Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
					JOptionPane.WARNING_MESSAGE);
			DdayNumber--;
			Power = 100;// 메시지 출력
		}

		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "너무 열심히 했다.\n 지식이 5만큼 올랐ㄷ", "너무 힘듦", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "오늘은 적당히 했다.\n 지식이 10만큼 올랐다!", "조금 기쁘네",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "대충대충 했다.\n 지식이 5만큼 올랐다!", "넘나 귀찮은 것", JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		Money -= 5000;
		MT();
	}

	static void money_up() {
		if (Power <= 0) {
			JOptionPane.showMessageDialog(null, "체력이 " + Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
					JOptionPane.WARNING_MESSAGE);
			DdayNumber--;
			Power = 100;// 메시지 출력
		}

		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Money += 40000;
			JOptionPane.showMessageDialog(null, "너무 열심히 했다.\n 알바비를 4만원 받았다!", "너무 힘듦", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Money += 20000;
			JOptionPane.showMessageDialog(null, "오늘은 적당히 했다.\n 알바비를 2만원 받았다!", "조금 기쁘네",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 10000;
			Power -= 5;
			JOptionPane.showMessageDialog(null, "의욕이 넘쳐 실수를 했다.\n 체력이 5만큼 감소하고 알바비를 1만원 받았다!", "앗 안돼!",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void friend_up() {
		if (Power <= 0) {
			JOptionPane.showMessageDialog(null, "체력이 " + Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
					JOptionPane.WARNING_MESSAGE);
			DdayNumber--;
			Power = 100;
		}

		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Friend += 20;
			JOptionPane.showMessageDialog(null, "베프가 되었다!\n 친화력이 20만큼 올랐다!", "너무 즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Friend += 10;
			JOptionPane.showMessageDialog(null, "재미있게 놀았다!.\n 친화력이 10만큼 올랐다!", "즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Friend += 5;
			Power -= 2;
			JOptionPane.showMessageDialog(null, "조금 어색했네...\n 친화력이 5만큼 올랐다!", "어색해", JOptionPane.INFORMATION_MESSAGE);
		}
		Money -= 20000;
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void power_up() {
		if (Power <= 0) {
			JOptionPane.showMessageDialog(null, "체력이 " + Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
					JOptionPane.WARNING_MESSAGE);
			DdayNumber--;
			Power = 100;// 메시지 출력
		}
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Power += 25;
			JOptionPane.showMessageDialog(null, "이런 휴식이 올까?\n 체력이이 25만큼 올랐다!", "컨디션 좋아",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Power += 15;
			JOptionPane.showMessageDialog(null, "너무 잘 쉬었다.\n 체력이 15만큼 올랐다!", "즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Power += 5;
			JOptionPane.showMessageDialog(null, "자고 일어났는데 담이 걸렸네...\n 체력이 5만큼 올랐다!", "어색해",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
		MT();
	}
}
