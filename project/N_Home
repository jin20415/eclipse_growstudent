package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class N_Home extends JFrame {

   Container contentPane;

   subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
   subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
   subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
   subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
   subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());
   subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());

   JLabel 체력확인레이블 = new JLabel();
   JLabel 지식확인레이블 = new JLabel();
   JLabel 돈확인레이블 = new JLabel();
   JLabel 친구확인레이블 = new JLabel();

   JButton SelectBtn = new JButton("활동선택");
   JButton EndBtn = new JButton("일과 종료");

   Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
   Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 22);

   N_Home(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
      setTitle("홈");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(655, 655);
      contentPane = getContentPane();

      JLabel dateLb = new JLabel();
        dateLb.setText("Today 2020년 " + init.Month + "월" + init.Day + "일  " );
      Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
      dateLb.setFont(datefont);
      dateLb.setBounds(380, 10, 600, 40);
      dateLb.setVisible(true);
      HomePanel.add(dateLb);

      JLabel Lb2 = new JLabel();
      Lb2.setBounds(70, 100, 600, 50);
      Font Lb2font = new Font("HY견고딕", Font.PLAIN, 25);
      Lb2.setFont(Lb2font);
      Lb2.setText("<체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend + ">"); // (N+H)ManuPanel화면

      JButton N_MoveBtn = new JButton("활동하기");
      N_MoveBtn.setFont(f1);
      N_MoveBtn.setBackground(Color.WHITE);
      N_MoveBtn.setBounds(0, 410, 250, 45);
      N_MoveBtn.setBorderPainted(false);
      N_MoveBtn.setFocusPainted(false);
      HomePanel.add(N_MoveBtn);

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
      dates.setBounds(390, 5, 100, 100);
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

      MainGrowStudent.N_MenuPanel.setVisible(false);
      HomePanel.setLayout(null);
      HomePanel.setBounds(0, 0, 640, 452);
      HomePanel.setVisible(true);
      contentPane.add(HomePanel);

      contentPane.setLayout(null);
      contentPane.setBounds(0, 450, 640, 200);
      contentPane.setBackground(Color.WHITE);
      contentPane.setVisible(true);

      if (init.Power <= 30) {
         for (int cnt = 0; cnt < 1; cnt++) {
            init.Day += 1;
            init.DdayNumber -= 1;
         //   init.MT();
            init.Power += 20;
            JOptionPane.showMessageDialog(null, "체력이 약해져서 감기에 걸렸다!\n오늘 하루동안 집에서 쉬어야겠다", "감기",
                  JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "하루동안 쉬어서 체력이 20만큼 올랐다!", "체력 회복", JOptionPane.INFORMATION_MESSAGE);

         }
      }

      if (init.DdayNumber <= 0) {

         if (init.Money <= 0) {
            JOptionPane.showMessageDialog(null, "엔딩으로 이동합니다!", "엔딩", JOptionPane.INFORMATION_MESSAGE);
            new BeggarEnding();
         } else if (init.Money >= 500000) {
            JOptionPane.showMessageDialog(null, "엔딩으로 이동합니다!", "엔딩", JOptionPane.INFORMATION_MESSAGE);
            new CafeEnding();
         } else if (init.골격근량 >= 40) {
            JOptionPane.showMessageDialog(null, "히든 엔딩으로 이동합니다!", "엔딩", JOptionPane.INFORMATION_MESSAGE);
            new ExerciseEnding();
         } else if (init.이해도 >= 90) {
            JOptionPane.showMessageDialog(null, "엔딩으로 이동합니다!", "엔딩", JOptionPane.INFORMATION_MESSAGE);
            new IntelliEnding();
         } else if (init.Friend >= 85) {
            JOptionPane.showMessageDialog(null, "엔딩으로 이동합니다!", "엔딩", JOptionPane.INFORMATION_MESSAGE);
            new FriendEnding();
         }
      }

   }

}
