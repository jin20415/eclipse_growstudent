package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class H_Fitness extends JFrame {
	Container contentPane;

	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
	subImagePanel H_Selectpanel = new subImagePanel(new ImageIcon("./image/H_select_home.png").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());
	subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());

	subImagePanel Fitness_panel = new subImagePanel(new ImageIcon("./image/weights.jpg").getImage());
	
	JLabel 체력확인레이블 = new JLabel();
	JLabel 지식확인레이블 = new JLabel();
	JLabel 돈확인레이블 = new JLabel();
	JLabel 친구확인레이블 = new JLabel();
	

	JButton H_lecturebtn = new JButton("이동");
	JButton H_partbtn = new JButton("이동");
	JButton H_restbtn = new JButton("이동");
	JButton H_studybtn = new JButton("이동");
	JButton H_fitnessbtn = new JButton("이동");

	JButton SelectBtn = new JButton("홈 이동");
	JButton H_MoveBtn = new JButton("활동 하기");
	
	Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 22);
	Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font f3 = new Font("HY견고딕", Font.BOLD, 18);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	
	H_Fitness(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL){
		contentPane = getContentPane();
		setSize(655, 655);
		setLayout(null);
		
		Fitness_panel.setLayout(null);
		Fitness_panel.setBounds(0,90,655,420);
		Fitness_panel.setVisible(true);
		
		init.H_helth();
		
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

		dates.setLayout(null);
		dates.setBounds(270, 10, 100, 100);
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
		

		SelectBtn.setBounds(0, 30, 130, 30);
		SelectBtn.setBackground(new Color(225, 80, 80));
		SelectBtn.setFont(btnfont);
		SelectBtn.setBorderPainted(false);
		SelectBtn.setFocusPainted(false);
		contentPane.add(SelectBtn);
		
		contentPane.add(Fitness_panel);
		contentPane.setLayout(null);
		contentPane.setBounds(0,470,655,180);
		contentPane.setBackground(Color.WHITE);
		contentPane.setVisible(true);
		
		setVisible(true);
		
		SelectBtn.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "홈 화면으로 이동합니다.", "홈 화면으로 이동", JOptionPane.INFORMATION_MESSAGE);
			new N_Home(PL, IL, ML, FL, DL);

			SelectBtn.setVisible(false);
//			EndBtn.setVisible(false);

			JLabel dateLb = new JLabel();
			dateLb.setText("Today 2020 " + init.Month + "월" + init.Day + "일  " + init.Today + "요일");
			Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
			dateLb.setFont(datefont);
			dateLb.setBounds(310, 10, 600, 40);
			dateLb.setVisible(true);
			HomePanel.add(dateLb);

			H_MoveBtn.setFont(f1);
			H_MoveBtn.setBackground(Color.WHITE);
			H_MoveBtn.setBounds(0, 410, 250, 45);
			H_MoveBtn.setBorderPainted(false);
			H_MoveBtn.setFocusPainted(false);
			HomePanel.add(H_MoveBtn);

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

			HomePanel.setLayout(null);
			HomePanel.setBounds(0, 70, 640, 452);
			HomePanel.setVisible(true);
			contentPane.add(HomePanel);

			Fitness_panel.setVisible(false);
			contentPane.setLayout(null);
			contentPane.setBounds(0, 450, 640, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});

		H_MoveBtn.addActionListener(event -> {

			H_lecturebtn.setBounds(220, 180, 80, 30);
			H_lecturebtn.setBackground(new Color(148, 233, 86));
			H_lecturebtn.setFont(f3);
			H_lecturebtn.setFocusPainted(false);
			H_lecturebtn.setBorderPainted(false);
			H_lecturebtn.setVisible(true);
			H_Selectpanel.add(H_lecturebtn);

			H_partbtn.setBounds(440, 180, 80, 30);
			H_partbtn.setBackground(new Color(246, 233, 92));
			H_partbtn.setFont(f3);
			H_partbtn.setFocusPainted(false);
			H_partbtn.setBorderPainted(false);
			H_partbtn.setVisible(true);
			H_Selectpanel.add(H_partbtn);
			
			H_restbtn.setBounds(130, 410, 80, 30);
			H_restbtn.setBackground(new Color(90, 204, 240));
			H_restbtn.setFont(f3);
			H_restbtn.setFocusPainted(false);
			H_restbtn.setBorderPainted(false);
			H_restbtn.setVisible(true);
			H_Selectpanel.add(H_restbtn);

			H_studybtn.setBounds(320, 430, 80, 30);
			H_studybtn.setBackground(new Color(208, 100, 238));
			H_studybtn.setFont(f3);
			H_studybtn.setFocusPainted(false);
			H_studybtn.setBorderPainted(false);
			H_studybtn.setVisible(true);
			H_Selectpanel.add(H_studybtn);

			H_fitnessbtn.setBounds(510, 391, 80, 30);
			H_fitnessbtn.setBackground(new Color(239, 89, 179));
			H_fitnessbtn.setFont(f3);
			H_fitnessbtn.setFocusPainted(false);
			H_fitnessbtn.setBorderPainted(false);
			H_fitnessbtn.setVisible(true);
			H_Selectpanel.add(H_fitnessbtn);


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
			H_MoveBtn.setVisible(false);
			HomePanel.setVisible(false);

			H_Selectpanel.setVisible(true);

			H_Selectpanel.setLayout(null);
			H_Selectpanel.setBounds(0, 100, 650, 500);
			contentPane.add(H_Selectpanel);
			contentPane.setLayout(null);
			contentPane.setBounds(0, 550, 650, 100);
			contentPane.setVisible(true);
		});

		H_lecturebtn.addActionListener(event -> {
			new H_Lecture(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		H_partbtn.addActionListener(event -> {
			new H_PartTime(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		H_restbtn.addActionListener(event -> {
			new H_Rest(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		H_studybtn.addActionListener(event -> {
			new H_Study(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});
		H_fitnessbtn.addActionListener(event -> {
			new H_Fitness(PL, IL, ML, FL, DL);
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});
	}
}


