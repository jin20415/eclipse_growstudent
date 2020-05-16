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

class lecturelist_lectureImagePanel extends JPanel {
	private Image bookimg;

	public lecturelist_lectureImagePanel(Image bookimg) {
		this.bookimg = bookimg;
		setSize(new Dimension(bookimg.getWidth(null), bookimg.getHeight(null)));
		setPreferredSize(new Dimension(bookimg.getWidth(null), bookimg.getHeight(null)));// pack()한 후 프레임 사이즈가 맞게 나오지 않을
																							// 때 설정해줌.
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(bookimg, 0, 0, null);
	}
}

@SuppressWarnings("serial")
class Lecture {
	Container contentPane;
	static lecturelist_lectureImagePanel lecturepanel = new lecturelist_lectureImagePanel(
			new ImageIcon("./image/book.png").getImage());
	static JButton button1 = new JButton("오픈소스소프트웨어");
	static JButton button2 = new JButton("데이터베이스");
	static JButton button3 = new JButton("정보보호");
	static JButton button4 = new JButton("뒤로가기");

	Lecture() {

		button1.addActionListener(event -> {
			init.오픈소스소프트웨어();

		});
		button2.addActionListener(event -> {
			init.데이터베이스();
			// Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년 " + init.Month + "월 " +
			// init.Day + "일 " + init.Today//
			// + "요일");//
			// Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
			// " 친화력 " + init.Friend);//

		});
		button3.addActionListener(event -> {
			init.정보보호();
			// Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년 " + init.Month + "월 " +
			// init.Day + "일 " + init.Today//
			// + "요일");
			// Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
			// " 친화력 " + init.Friend);//

		});
		button4.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "뒤로 이동합니다", "뒤로 이동", JOptionPane.INFORMATION_MESSAGE); // 메시지

		});

	}

	public static void lecture() {

		JLabel Lb1, Lb2;
		JLabel LLb1 = new JLabel();
		LLb1.setText("어떤 과목의 강의를 들으시겠습니까?");
		LLb1.setBounds(107, 142, 600, 90);

		Font label4font = new Font("HY견고딕", Font.BOLD, 30);
		LLb1.setFont(label4font);

		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);

		lecturepanel.add(button1);
		lecturepanel.add(button2);
		lecturepanel.add(button3);
		lecturepanel.add(button4);

		button1.setBounds(320, 260, 300, 50);
		button2.setBounds(320, 330, 300, 50);
		button3.setBounds(320, 400, 300, 50);
		button4.setBounds(320, 470, 300, 50);

		Font f4 = new Font("휴먼엑스포", Font.BOLD, 25);
		button1.setFont(f4);
		button2.setFont(f4);
		button3.setFont(f4);
		button4.setFont(f4);

		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);
		button4.setBackground(Color.WHITE);

		lecturepanel.setVisible(true);
		lecturepanel.setLayout(null);
		lecturepanel.add(LLb1);
		lecturepanel.add(button1);
		lecturepanel.add(button2);
		lecturepanel.add(button3);
		lecturepanel.add(button4);

	}

}
