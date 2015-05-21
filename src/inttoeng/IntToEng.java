package inttoeng;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	
    	//0-19
    	String[] eNum1 ={"zero", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine",
    			"ten", "eleven", "twelve", "thirteen", "fourteen",
    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	//20-90の10の位
    	String[] eNum2={"","twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	
    	//20^99までの1の位
    	String[] eNum3={"","one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine"};
    	
    	//100^999までの100の位
    	String[] eNum4={"onehundred", "twohundred", "threehundred", "fourhundred",
    			"fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};
    	
    	//100^999までの10の位
    	String[] eNum5={"","twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	
    	//100^999までの1の位
    	String[] eNum6={"", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine"};
    	
    	//100^999までの1の位
    	String[] eNum7={"ten", "eleven", "twelve", "thirteen", "fourteen",
		"fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    	
    	//1000^9999までの1000の位
    	String[] eNum8={"onethousand","twothousand","threethousand","fourthousand",
    			"fivethousand","sixthousand","seventhousand","eighthousand","ninethoand"};
    	
    	//1000^9999までの100の位
    	String[] eNum9={"onehundred", "twohundred", "threehundred", "fourhundred",
    			"fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};
    	
    	//1000^9999までの10の位
    	String[] eNum10={"","twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	
    	//1000^9999までの1の位
    	String[] eNum11={"", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine"};
    	
    	//1000^9999までの1の位
    	String[] eNum12={"ten", "eleven", "twelve", "thirteen", "fourteen",
    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	
    	//10000^99999までの1000の位
    	String[] eNum13={"tenthousand", "eleventhousand", "twelvethousand", "thirteenthousand", "fourteenthousand",
    			"fifteenthousand", "sixteenthousand", "seventeenthousand", "eighteenthousand", "nineteenthousand"};
    	
    	//10000^99999までの100の位
    	String[] eNum14={"onehundred", "twohundred", "threehundred", "fourhundred",
    			"fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};
    	
    	//10000^99999までの10の位
    	String[] eNum15={"","twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	
    	//10000^99999までの1の位
    	String[] eNum16={"", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine"};
    	
    	//10000^99999までの1の位
    	String[] eNum17={"ten", "eleven", "twelve", "thirteen", "fourteen",
    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	
    	//10000^99999までの1000の位
    	String[] eNum18={"","twentythousand", "thirtythousand", "fortythousand", "fiftythousand", "sixtythousand",
    			"seventythousand", "eightythousand", "ninetythousand"};
    	
    	//10000^99999までの1000の位
    	String[] eNum19={"onethousand","twothousand","threethousand","fourthousand",
    			"fivethousand","sixthousand","seventhousand","eightthousand","ninethoand"};
    	
    	String num = String.valueOf(n);
    	if(n < 20){ 
    		num=eNum1[n];
    		return num;
    	}
    	if(n>=20 && n<=99) {
    		String num10 = num.substring(0,1); //10の位
    		String num1  = num.substring(1,2);//1の位
    		
    		int num10a = Integer.parseInt(num10);
    		int num1a = Integer.parseInt(num1);
    		
    		num=eNum2[num10a-1]+eNum3[num1a];
    			return num;
    		}
    	if(n>=100 && n<=109){
    		String num100 = num.substring(0,1);//100の位
    		String num10b = num.substring(1,2);//10の位
    		String num1b = num.substring(2,3);//1の位
    		
    		
    		int num100b = Integer.parseInt(num100);
    		int num10c = Integer.parseInt(num10b);
    		int num1c = Integer.parseInt(num1b);
    		
    		num=eNum4[num100b-1]+eNum5[num10c]+eNum6[num1c];
    			return num;
    	}
    	if(n>=110 && n<=119){
    		String num100 = num.substring(0,1);
    		String num10b = num.substring(1,2);
    		String num1b = num.substring(2,3);
    		
    		
    		int num100b = Integer.parseInt(num100);
    		int num10c = Integer.parseInt(num10b);
    		int num1c = Integer.parseInt(num1b);
    		
    		num=eNum4[num100b-1]+eNum5[num10c-1]+eNum7[num1c];
    			return num;
    	}
    	if(n>=120 && n<=999){
    		String num100 = num.substring(0,1);
    		String num10b = num.substring(1,2);
    		String num1b = num.substring(2,3);
    		
    		
    		int num100b = Integer.parseInt(num100);
    		int num10c = Integer.parseInt(num10b);
    		int num1c = Integer.parseInt(num1b);
    		
    		num=eNum4[num100b-1]+eNum5[num10c-1]+eNum6[num1c];
    			return num;
    	}
    	if(n>=1000 && n<=1009){
    		String num1000=num.substring(0,1);
    		String num100=num.substring(1, 2);
    		String num10=num.substring(2, 3);
    		String num1=num.substring(3, 4);
    		
    		int num1000a=Integer.parseInt(num1000);
    		int num100a=Integer.parseInt(num100);
    		int num10a=Integer.parseInt(num10);
    		int num1a=Integer.parseInt(num1);
    		
    		num=eNum8[num1000a-1]+eNum10[num10a]+eNum11[num1a];
    		return num;
    	}
    	if(n>=1010 && n<=1019){
    		String num1000=num.substring(0,1);
    		String num100=num.substring(1, 2);
    		String num10=num.substring(2, 3);
    		String num1=num.substring(3, 4);
    		
    		int num1000a=Integer.parseInt(num1000);
    		int num100a=Integer.parseInt(num100);
    		int num10a=Integer.parseInt(num10);
    		int num1a=Integer.parseInt(num1);
    		
    		num=eNum8[num1000a-1]+eNum10[num10a-1]+eNum12[num1a];
    		return num;
    	}
    	if(n>=1020 && n<=1099){
    		String num1000=num.substring(0,1);
    		String num100=num.substring(1, 2);
    		String num10=num.substring(2, 3);
    		String num1=num.substring(3, 4);
    		
    		int num1000a=Integer.parseInt(num1000);
    		int num100a=Integer.parseInt(num100);
    		int num10a=Integer.parseInt(num10);
    		int num1a=Integer.parseInt(num1);
    		
    		num=eNum8[num1000a-1]+eNum10[num10a-1]+eNum11[num1a];
    		return num;
    	}
    	if(n>=1100 && n<=9999){
    		String num1000=num.substring(0,1);
    		String num100=num.substring(1, 2);
    		String num10=num.substring(2, 3);
    		String num1=num.substring(3, 4);
    		
    		int num1000a=Integer.parseInt(num1000);
    		int num100a=Integer.parseInt(num100);
    		int num10a=Integer.parseInt(num10);
    		int num1a=Integer.parseInt(num1);
    		
    		num=eNum8[num1000a-1]+eNum9[num100a-1]+eNum10[num10a-1]+eNum11[num1a];
    				return num;
    	}
    	if(n>=10000 && n<=10009){
    		String num10000=num.substring(0,1);
    		String num1000=num.substring(1, 2);
    		String num100=num.substring(2, 3);
    		String num10=num.substring(3, 4);
    		String num1=num.substring(4,5);
    		
    		int num10000a=Integer.parseInt(num10000);
    		int num1000a=Integer.parseInt(num1000);
    		int num100a=Integer.parseInt(num100);
    		int num10a=Integer.parseInt(num10);
    		int num1a=Integer.parseInt(num1);
    		
    		num=eNum13[num10000a-1]+eNum15[num10a]+eNum16[num1a];
    		return num;
    	}
    	if(n>=10010 && n<=10019){
    		String num10000=num.substring(0,1);
    		String num1000=num.substring(1, 2);
    		String num100=num.substring(2, 3);
    		String num10=num.substring(3, 4);
    		String num1=num.substring(4,5);
    		
    		int num10000a=Integer.parseInt(num10000);
    		int num1000a=Integer.parseInt(num1000);
    		int num100a=Integer.parseInt(num100);
    		int num10a=Integer.parseInt(num10);
    		int num1a=Integer.parseInt(num1);
    		
    		num=eNum13[num10000a-1]+eNum15[num10a-1]+eNum17[num1a];
    		return num;
    	}
    	if(n>=10020 && n<=10099){
    		String num10000=num.substring(0,1);
    		String num1000=num.substring(1, 2);
    		String num100=num.substring(2, 3);
    		String num10=num.substring(3, 4);
    		String num1=num.substring(4,5);
    		
    		int num10000a=Integer.parseInt(num10000);
    		int num1000a=Integer.parseInt(num1000);
    		int num100a=Integer.parseInt(num100);
    		int num10a=Integer.parseInt(num10);
    		int num1a=Integer.parseInt(num1);
    		
    		num=eNum13[num10000a-1]+eNum15[num10a-1]+eNum16[num1a];
    		return num;
    	}
    	if(n>=11000 && n<=19999){
    		String num10000=num.substring(0,1);
    		String num1000=num.substring(1, 2);
    		String num100=num.substring(2, 3);
    		String num10=num.substring(3, 4);
    		String num1=num.substring(4,5);
    		
    		int num10000a=Integer.parseInt(num10000);
    		int num1000a=Integer.parseInt(num1000);
    		int num100a=Integer.parseInt(num100);
    		int num10a=Integer.parseInt(num10);
    		int num1a=Integer.parseInt(num1);
    		
    		num=eNum13[num1000a]+eNum14[num100a-1]+eNum15[num10a-1]+eNum16[num1a];
    		return num;
    	}
    	if(n>=20000 && n<=99999){
    		String num10000=num.substring(0,1);
    		String num1000=num.substring(1, 2);
    		String num100=num.substring(2, 3);
    		String num10=num.substring(3, 4);
    		String num1=num.substring(4,5);
    		
    		int num10000a=Integer.parseInt(num10000);
    		int num1000a=Integer.parseInt(num1000);
    		int num100a=Integer.parseInt(num100);
    		int num10a=Integer.parseInt(num10);
    		int num1a=Integer.parseInt(num1);
    		
    		num=eNum18[num1000a-1]+eNum19[num1000a-1]+eNum14[num100a-1]+eNum15[num10a-1]+eNum16[num1a];
    		return num;
    	}
        return "onehundredthousand";
    }
}