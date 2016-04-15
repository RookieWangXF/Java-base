package cn.rookie.p2;

public class IntegerToRoman {

	public static String intToRoman(int num) {
		if (num > 3999 && num < 0)
			return "";
		String str = "";
		switch (num / 1000) { // ǧλ
		case 0:
			str += "";
			break;
		case 1:
			str += "M";
			break;
		case 2:
			str += "MM";
			break;
		case 3:
			str += "MMM";
			break;
		}
		num = num % 1000;
		switch (num / 100) {
		case 0:
			str += "";
			break;
		case 1:
			str += "C";
			break;
		case 2:
			str += "CC";
			break;
		case 3:
			str += "CCC";
			break;
		case 4:
			str += "CD";
			break;
		case 5:
			str += "D";
			break;
		case 6:
			str += "DC";
			break;
		case 7:
			str += "DCC";
			break;
		case 8:
			str += "DCCC";
			break;
		case 9:
			str += "CM";
			break;
		}
		num = num % 100;
		switch (num / 10) {
		case 0:
			str += "";
			break;
		case 1:
			str += "X";
			break;
		case 2:
			str += "XX";
			break;
		case 3:
			str += "XXX";
			break;
		case 4:
			str += "XL";
			break;
		case 5:
			str += "L";
			break;
		case 6:
			str += "LX";
			break;
		case 7:
			str += "LXX";
			break;
		case 8:
			str += "LXXX";
			break;
		case 9:
			str += "XC";
			break;
		}
		num = num % 10;
		switch (num) {
		case 0:
			str += "";
			break;
		case 1:
			str += "I";
			break;
		case 2:
			str += "II";
			break;
		case 3:
			str += "III";
			break;
		case 4:
			str += "IV";
			break;
		case 5:
			str += "V";
			break;
		case 6:
			str += "VI";
			break;
		case 7:
			str += "VII";
			break;
		case 8:
			str += "VIII";
			break;
		case 9:
			str += "IX";
			break;
		}
		return str;
	}

	public static void main(String[] args) {

		int num =3333;
		String string= intToRoman(num);
		System.out.print(string);
	}

}
