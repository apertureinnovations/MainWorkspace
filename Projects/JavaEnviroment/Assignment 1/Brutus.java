public class Brutus {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Too few parameters!\nUsage: java Brutus \"cipher text\"");
		} else if (args.length > 1) {
			System.out.println("Too many parameters!\nUsage: java Brutus \"cipher text\"");
		} else {
			String b = args[0];
			int counter;
			int current;
			String d = "";
			double chiCurrent = 0.0;
			double tempchi;
			int counted = 0;
			double[] freq;
			Caesar caeserciph = new Caesar();
			for (int i = 0; i < 25; i++) {
				d = caeserciph.rotate(-i, b);
				freq = frequency(d);
				tempchi = chiSquared(freq, english);
				if (tempchi < chiCurrent || chiCurrent == 0.0) {
					chiCurrent = tempchi;
					counted = -i;
				}
			}
			d = caeserciph.rotate(counted, b);
			System.out.println(d);
		}
	};
	
    public static final double[] english = {
        0.0855, 0.0160, 0.0316, 0.0387, 0.1210, 0.0218, 0.0209, 0.0496, 0.0733,
        0.0022, 0.0081, 0.0421, 0.0253, 0.0717, 0.0747, 0.0207, 0.0010, 0.0633,
        0.0673, 0.0894, 0.0268, 0.0106, 0.0183, 0.0019, 0.0172, 0.0011
    };
	
	public static int[] count(String b) {
		char a;
		char c;
		int[] list = new int[26];
		for (int i = 0; i < b.length(); i++) {
			a = b.charAt(i);
			c = Character.toLowerCase(a);
			int ascConv = (int) c;
			if (ascConv <= 122 && ascConv >= 97) {
				int appendNumber = (ascConv - 97);
				list[appendNumber] = list[appendNumber] + 1;
			}
		}
		return list;
	};
	
	public static double[] frequency(String b) {
		double[] freqVals = new double[26];
		double tempVal;
		double blength = b.length();
		int[] countList = count(b);
		for (int i = 0; i < 26; i++) {
			if (countList[i] != 0) {
				tempVal = countList[i] / blength;
			} else {
				tempVal = 0;
			}
			freqVals[i] += tempVal;
		}
		return freqVals;
	};
	
	public static double chiSquared(double[] a, double[] b) {
		double mainChi = 0.0;
		double tempVal;
		for (int i = 0; i < 26; i++) {
			tempVal = (a[i]-b[i]);
			mainChi += (tempVal * tempVal)/b[i];
		}
		return mainChi;
	};
}
