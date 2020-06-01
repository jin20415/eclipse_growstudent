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

class H_Rest extends JFrame {
	Container contentPane;

	subImagePanel N_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/Room.jpg").getImage());
	subImagePanel Restpanel = new subImagePanel(new ImageIcon("./image/rest.png").getImage());
	subImagePanel cinemapanel = new subImagePanel(new ImageIcon("./image/cinema.jpg").getImage());
	subImagePanel singpanel = new subImagePanel(new ImageIcon("./image/sing.jpg").getImage());
	subImagePanel parkpanel = new subImagePanel(new ImageIcon("./image/park.jpg").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());

	JButton 노래방 = new JButton("이동");
	JButton 영화관 = new JButton("이동");
	JButton 놀이공원 = new JButton("이동");
//	JButton button4 = new JButton("뒤로가기");

	JLabel 체력확인레이블 = new JLabel();
	JLabel 지식확인레이블 = new JLabel();
	JLabel 돈확인레이블 = new JLabel();
	JLabel 친구확인레이블 = new JLabel();

	JButton SelectBtn = new JButton("활동선택");
	JButton EndBtn = new JButton("일과 종료");

	Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 22);

	H_Rest(JLabel PL, JLabel IL, JLabel ML, JLabel FL) {
		setTitle("휴식하기");
		contentPane = getContentPane();
		setLayout(null);
		setSize(655, 655);
		Font restfont = new Font("휴먼둥근헤드라인", Font.PLAIN, 11);

		Restpanel.setVisible(true);
		Restpanel.setBounds(1, 110, 650, 470);

		노래방.setBounds(553, 140, 57, 30);
		노래방.setBackground(Color.WHITE);
		노래방.setFont(restfont);
		노래방.setBorderPainted(false);
		노래방.setFocusPainted(false);
		노래방.setVisible(true);
		Restpanel.add(노래방);

		영화관.setBounds(423, 260, 57, 30);
		영화관.setBackground(Color.WHITE);
		영화관.setFont(restfont);
		영화관.setBorderPainted(false);
		영화관.setFocusPainted(false);
		영화관.setVisible(true);
		Restpanel.add(영화관);

		놀이공원.setBounds(553, 378, 57, 30);
		놀이공원.setBackground(Color.WHITE);
		놀이공원.setFont(restfont);
		놀이공원.setBorderPainted(false);
		놀이공원.setFocusPainted(false);
		놀이공원.setVisible(true);
		Restpanel.add(놀이공원);

		contentPane.setBounds(0, 0, 655, 110);
		체력확인레이블.setText("" + init.Power);
		체력확인레이블.setBounds(15, 5, 50, 50);
		체력확인레이블.setFont(btnfont);
		powers.add(체력확인레이블);
		powers.setBounds(359, 10, 190, 80);
		contentPane.add(powers);

		지식확인레이블.setText("" + init.Intelli);
		지식확인레이블.setBounds(18, 5, 50, 50);
		지식확인레이블.setFont(btnfont);
		intellis.add(지식확인레이블);
		intellis.setBounds(430, 10, 190, 80);
		contentPane.add(intellis);

		돈확인레이블.setText("" + init.Money);
		돈확인레이블.setBounds(5, 13, 100, 50);
		돈확인레이블.setFont(btnfont);
		moneys.add(돈확인레이블);
		moneys.setBounds(490, 10, 190, 80);
		contentPane.add(moneys);

		친구확인레이블.setText("" + init.Friend);
		친구확인레이블.setBounds(25, 5, 150, 50);
		친구확인레이블.setFont(btnfont);
		friends.add(친구확인레이블);
		friends.setBounds(570, 10, 190, 80);
		contentPane.add(friends);

		PL.setText("" + init.Power);
		IL.setText("" + init.Intelli);
		ML.setText("" + init.Money);
		FL.setText("" + init.Friend);

		SelectBtn.setBounds(0, 30, 130, 30);
		SelectBtn.setBackground(new Color(225, 80, 80));
		SelectBtn.setFont(btnfont);
		SelectBtn.setBorderPainted(false);
		SelectBtn.setFocusPainted(false);
		contentPane.add(SelectBtn);

		EndBtn.setBounds(0, 70, 130, 30);
		EndBtn.setBackground(new Color(225, 80, 80));
		EndBtn.setFont(btnfont);
		EndBtn.setBorderPainted(false);
		EndBtn.setFocusPainted(false);
		contentPane.add(EndBtn);

		contentPane.add(Restpanel);
		contentPane.setBackground(Color.WHITE);
		contentPane.setVisible(true);
		setSize(655, 655);
		setVisible(true);

		노래방.addActionListener(event -> {
		//	init.N_friend_up();
            init.H_sing();
			contentPane.setBounds(0, 0, 655, 110);
			init.H_rest(); 
			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(359, 10, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(430, 10, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(490, 10, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(570, 10, 190, 80);
			contentPane.add(friends);
			
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);

			singpanel.setVisible(true);
			singpanel.setLayout(null);
			singpanel.setBounds(0, 80, 655, 427);

			Restpanel.setVisible(false);
			노래방.setVisible(false);
			영화관.setVisible(false);
			놀이공원.setVisible(false);

			SelectBtn.setBounds(0, 30, 130, 30);
			SelectBtn.setBackground(new Color(225, 80, 80));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			contentPane.add(SelectBtn);

			EndBtn.setBounds(0, 70, 130, 30);
			EndBtn.setBackground(new Color(225, 80, 80));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			contentPane.add(EndBtn);
			
			contentPane.add(singpanel);
			contentPane.setBounds(0, 428, 665, 227);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
			JOptionPane.showMessageDialog(null, "남은 1분까지 야무지게 불렀어!", "노래방", JOptionPane.INFORMATION_MESSAGE);
			
//			dispose();
		});

		영화관.addActionListener(event -> {
			
			 init.H_cinema();
			contentPane.setBounds(0, 0, 655, 110);
			init.H_rest();
			
			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(359, 10, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(430, 10, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(490, 10, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(570, 10, 190, 80);
			contentPane.add(friends);
			
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);

			cinemapanel.setVisible(true);
			cinemapanel.setLayout(null);
			cinemapanel.setBounds(0, 80, 655, 427);

			Restpanel.setVisible(false);
			노래방.setVisible(false);
			영화관.setVisible(false);
			놀이공원.setVisible(false);

			contentPane.add(cinemapanel);
			contentPane.setBounds(0, 428, 665, 227);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
			JOptionPane.showMessageDialog(null, "제시카,외동 딸,일리노이 시카고, 과 선배는 김진모 그는 니 사촌", "영화관",
					JOptionPane.INFORMATION_MESSAGE);
			
			// dispose();
		});

		놀이공원.addActionListener(event -> {
			init.H_park();
			
			contentPane.setBounds(0, 0, 655, 110);
			init.H_rest();
			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(359, 10, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(430, 10, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(490, 10, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(570, 10, 190, 80);
			contentPane.add(friends);
			
			
			
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);

			parkpanel.setVisible(true);
			parkpanel.setLayout(null);
			parkpanel.setBounds(0, 80, 655, 427);

			Restpanel.setVisible(false);
			노래방.setVisible(false);
			영화관.setVisible(false);
			놀이공원.setVisible(false);

			contentPane.add(parkpanel);
			contentPane.setBounds(0, 428, 665, 227);
			contentPane.setBackground(Color.WHITE);
			SelectBtn.setVisible(false);
			EndBtn.setVisible(false);
			contentPane.setVisible(true);
			JOptionPane.showMessageDialog(null, "불꽃놀이 퍼레이드가 정말 예뻤어", "놀이공원", JOptionPane.INFORMATION_MESSAGE);
			
			
			// dispose();
		});

		
		
		SelectBtn.addActionListener(event -> {
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			
			powers.setVisible(false);
			intellis.setVisible(false);
			moneys.setVisible(false);
			friends.setVisible(false);
			
			singpanel.setVisible(false);
			cinemapanel.setVisible(false);
			parkpanel.setVisible(false);
			
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
			
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			
			contentPane.setBounds(0,0,655,120);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
			
			JOptionPane.showMessageDialog(null, "활동 선택으로 이동합니다", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			dispose();
		});
		EndBtn.addActionListener(event -> {
			N_MenuPanel.setVisible(false);
			
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			
			
			JOptionPane.showMessageDialog(null, "집으로 이동합니다.", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			
				
	/*		HomePanel.setLayout(null);
			HomePanel.setBounds(0, 73, 640, 546);
			HomePanel.setVisible(true);
			
			Restpanel.setVisible(false);
			singpanel.setVisible(false);
			cinemapanel.setVisible(false);
			parkpanel.setVisible(false);

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
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.add(HomePanel);
			contentPane.setVisible(true);*/
			new N_Home(PL, IL, ML, FL);
			dispose();
		});
	}

}