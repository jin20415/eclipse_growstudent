package project;

import javax.swing.JOptionPane;

class init {
	static int DdayNumber = 14;
	static int Power = 130;
	static int Money = 50000;
	static int Friend = 0;
	static int Intelli = 0;
	static int Month = 5;
	static int Day = 1;
//	static String Daily[] = { "금", "토", "일", "월", "화", "수", "목" };
//	static String Today = null;
	static int 이해도 = 0;

	static int newpower;
	static int 골격근량 = 0;

/*	static void MT() {
		if (Month == 5) {
			Today = Daily[Day % 7 - 1];

		} else if (Month == 5 && Day == 32) {
			Day = 1;
			Today = Daily[Day % 7 + 2];
		}
	}*/

	static void N_helth() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			골격근량 += 10;
			JOptionPane.showMessageDialog(null, "3대 운동 + 대흉근을 모아주는 펙덱플라이까지 했어!\n 골격근량 +10을 얻었습니다.","너무 힘들어", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 14) {
			골격근량 += 8;
			JOptionPane.showMessageDialog(null, "3대 운동을 끝냈어!\n 골격근량 +8를 얻었습니다.!", "할만 해",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			골격근량 += 5;
			JOptionPane.showMessageDialog(null, "3대 운동조차 못했어.. 너무 힘든데?\n 골격근량 +5를 얻었습니다.!", "힘들어",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
	//	MT();

	}

	static void H_helth() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 10) {
			골격근량 += 15;
			JOptionPane.showMessageDialog(null, "3대 운동 + 대흉근을 모아주는 펙덱플라이까지 했어!\n 골격근량 +15을 얻었습니다.","너무 힘들어", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 5) {
			골격근량 += 10;
			JOptionPane.showMessageDialog(null, "3대 운동을 끝냈어 !\n 골격근량 +10를 얻었습니다.!", "할만 해",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			골격근량 += 8;
			JOptionPane.showMessageDialog(null, "3대 운동조차 못했어.. 너무 힘든데?\n 골격근량 +8를 얻었습니다.!", "힘들어",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 30;
		Day += 1;
		DdayNumber -= 1;
	//	MT();

	}

	public static void 체력제한() {
		if (Power <= 0) {
			JOptionPane.showMessageDialog(null, "체력이 " + Power + "로  체력이 없어서 더 이상 할 수 없습니다", "경고",
					JOptionPane.WARNING_MESSAGE); // 메시지출력
			DdayNumber--;
			Day++;

		}

	}

	public static int N_partampower() {
		Power = Power - 25;
		return Power;
	}

	public static int getpower() {
		return Power;
	}

	static void 이해() {
		이해도 += 10;
		// DdayNumber--;
		JOptionPane.showMessageDialog(null, "이해도가 10 증가했습니다!", "이해도", JOptionPane.INFORMATION_MESSAGE);
	}

	static void N_Lecture_power() {
		JOptionPane.showMessageDialog(null, "e편의점에 가서 군것질을 하느라 만원을 썼어!", "군것질",
				JOptionPane.INFORMATION_MESSAGE);
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "강의 내용이 다 이해됐어!\n 지식이 20만큼 증가했다!", "강의듣기",
					JOptionPane.INFORMATION_MESSAGE);

		} else if (random >= 8 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "강의 내용을 어느정도 이해가 가.\n 지식이 10만큼 증가했다!", "강의듣기",
					JOptionPane.INFORMATION_MESSAGE);

		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "강의 내용이 하나도 이해가 안돼.\n 지식이 5만큼 증가했다!", "강의듣기",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 20;
		Money -= 10000;
	//	MT();
	}

	static int newdaypower() {
		newpower = 100;
		Power = newpower;
		return Power;
	}

	static int newday() {
		DdayNumber = DdayNumber - 1;
		Day++;
		return DdayNumber;

	}

	static void H_Lecture_power() {
		JOptionPane.showMessageDialog(null, "e편의점에 가서 군것질을 하느라 2만원을 썼어!", "군것질",
				JOptionPane.INFORMATION_MESSAGE);
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "너무 열심히 했다.\n 지식이 20만큼 증가했다!", "너무 힘듦",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "오늘은 적당히 했다.\n 지식이 10만큼 증가했다!", "조금 기쁘네",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "대충대충 했다.\n 지식이 5만큼 증가했다!", "넘나 귀찮은 것",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
		Power -= 30;
		Money -= 20000;
//		MT();
	}

	static void N_Study() {
		JOptionPane.showMessageDialog(null, "e편의점에 가서 군것질을 하느라 만원을 썼어!", "군것질",
				JOptionPane.INFORMATION_MESSAGE);
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 30;
			JOptionPane.showMessageDialog(null, "너무 열심히 했다.\n 지식이 30만큼 증가했다!", "너무 힘듦",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "오늘은 적당히 했다.\n 지식이 20만큼 증가했다!", "조금 기쁘네",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "대충대충 했다.\n 지식이 10만큼 증가했다!", "넘나 귀찮은 것",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Money -= 10000;
		Power -= 15;
		Day += 1;
		DdayNumber -= 1;
	//	MT();
	}

	static void N_money_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 10) {
			Money += 100000;
			JOptionPane.showMessageDialog(null, "보너스를 받았다!\n 알바비를 10만원 받았다!", "너무 힘듦", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 5) {
			Money += 50000;
			JOptionPane.showMessageDialog(null, "무사히 알바를 끝냈다.\n 알바비를 5만원 받았다!", "알바하기",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 30000;
			JOptionPane.showMessageDialog(null, "앗! 안돼 실수를 했다.\n 알바비를 3만원 받았다!", "알바하기",
					JOptionPane.INFORMATION_MESSAGE);
		}
        Power -= 25;
		Day += 1;
		DdayNumber -= 1;
	//	MT();

	}

	static void N_friend_up() {

		Money -= 20000;
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
	//	MT();
	}

	static void N_sing() {
		Money -= 20000;
		JOptionPane.showMessageDialog(null, "노래를 부르는데 2만원을 썼어!", "노래방", JOptionPane.INFORMATION_MESSAGE);
	}

	static void N_cinema() {
		Money -= 30000;
		JOptionPane.showMessageDialog(null, "티켓과 팝콘을 사느라 3만원을 썼어!", "영화관", JOptionPane.INFORMATION_MESSAGE);

	}

	static void N_park() {
		Money -= 50000;
		JOptionPane.showMessageDialog(null, "입장권과 밥을 먹는데 5만원을 썼어!", "놀이공원", JOptionPane.INFORMATION_MESSAGE);

	}

	static void H_sing() {
		Money -= 25000;
		JOptionPane.showMessageDialog(null, "노래를 부르는데 2만5천원을 썼어!", "노래방", JOptionPane.INFORMATION_MESSAGE);

	}

	static void H_cinema() {
		Money -= 35000;
		JOptionPane.showMessageDialog(null, "티켓과 팝콘을 사느라 3만5천원을 썼어!", "영화관", JOptionPane.INFORMATION_MESSAGE);

	}

	static void H_park() {
		Money -= 55000;
		JOptionPane.showMessageDialog(null, "티켓과 팝콘을 사느라 5만5천원을 썼어!", "영화관", JOptionPane.INFORMATION_MESSAGE);
	}

	static void N_rest() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Power += 25;
			Friend += 30;
			JOptionPane.showMessageDialog(null, "베프가 되었다!\n 친화력이 30만큼 증가했다!", "너무 즐거움",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Power += 10;
			Friend += 20;
			JOptionPane.showMessageDialog(null, "재미있게 놀았다!.\n 친화력이 20만큼 증가했다!", "즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Power += 5;
			Friend += 10;
			JOptionPane.showMessageDialog(null, "조금 어색했네...\n 친화력이 10만큼 증가했다!", "어색해", JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
	//	MT();
	}

	static void H_rest() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 10) {
			Power += 30;
			Friend += 20;
			JOptionPane.showMessageDialog(null, "베프가 되었다!\n 친화력이 20만큼 증가했다!", "너무 즐거움",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 5) {
			Power += 20;
			Friend += 10;
			JOptionPane.showMessageDialog(null, "재미있게 놀았다!.\n 친화력이 10만큼 증가했다!", "즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Power += 5;
			Friend += 5;
			JOptionPane.showMessageDialog(null, "조금 어색했네...\n 친화력이 5만큼 증가했다!", "어색해", JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
	//	MT();
	}

	static void N_Cold() {

		for (int count = 0; count > 1;) {
			if (Power == 0 || Power <= 30) {
				Day += 1;
				DdayNumber -= 1;
	//			MT();
				Power += 20;
				count++;

				JOptionPane.showMessageDialog(null, "체력이 약해져서 감기에 걸렸다!\n오늘 하루동안 집에서 쉬어야겠다", "감기",
						JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "하루동안 쉬어서 체력이 30만큼 올랐다!", "체력 회복", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	static void H_intelli_up() {
		JOptionPane.showMessageDialog(null, "e편의점에 가서 군것질을 하느라 2만원을 썼어!", "군것질",
				JOptionPane.INFORMATION_MESSAGE);
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "너무 열심히 했다.\n 지식이 20만큼 증가했다!", "너무 힘듦",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "오늘은 적당히 했다.\n 지식이 10만큼 증가했다!", "조금 기쁘네",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "대충대충 했다.\n 지식이 5만큼 증가했다!", "넘나 귀찮은 것",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 30;
		Day += 1;
		DdayNumber -= 1;
		Money -= 20000;
//		MT();
	}

	static void H_Study() {
		JOptionPane.showMessageDialog(null, "e편의점에 가서 군것질을 하느라 2만원을 썼어!", "군것질",
				JOptionPane.INFORMATION_MESSAGE);
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "강의 내용이 다 이해됐어!\n 지식이 20만큼 증가했다!", "강의듣기",

					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "강의 내용을 어느정도 이해가 가.\n 지식이 10만큼 증가했다!", "강의듣기",

					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money -= 10000;
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "강의 내용이 하나도 이해가 안돼.\n 지식이 5만큼 증가했다!", "강의듣기",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
//		MT();
	}

	static void H_money_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 15) {
			Money += 130000;
			JOptionPane.showMessageDialog(null, "보너스를 받았다!\n 알바비를 13만원 받았다!", "알바하기", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Money += 80000;
			JOptionPane.showMessageDialog(null, "무사히 알바를 끝냈다.\n 알바비를 8만원 받았다!", "알바하기",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 50000;
			Power -= 5;
			JOptionPane.showMessageDialog(null, "앗! 안돼 실수를 했다.\n 체력이 5만큼 감소하고 알바비를 5만원 받았다!", "알바하기",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -=30;
		Day += 1;
		DdayNumber -= 1;
//		MT();
	}

	static void H_Cold() {
		int random = (int) (Math.random() * 10 + 1);
		for (int count = 0; count < 1; count++) {
			if (Power <= 40) {
				if (random >= 10) {
					Day += 1;
					DdayNumber -= 1;
//					MT();
					Power += 20;
					count++;
					JOptionPane.showMessageDialog(null, "체력이 약해져서 감기에 걸렸다! \n오늘 하루동안 집에서 쉬어야겠다", "감기",
							JOptionPane.WARNING_MESSAGE);
					JOptionPane.showMessageDialog(null, "하루동안 쉬어서 체력이 20만큼 올랐다!", "체력 회복",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}

}
