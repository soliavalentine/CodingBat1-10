public class Runner {
    public static void main(String[] args) {
        int[] x = {2,3,4};
        System.out.println(makes10(1,2));
        System.out.println(doubleX("xxxyyyy"));
        System.out.println(helloName("Maria"));
        System.out.println(no23(x));
        System.out.println(cigarParty(69,true));
        System.out.println(noTeenSum(14,15,69));
        System.out.println(countHi("hihihihihi"));
        System.out.println(sumDigits("12hdsjkhckw253"));
        System.out.println(lucky13(x));
        System.out.println(maxSpan(x));
    }
    //Warmup-1 makes10
    public static boolean makes10(int a, int b) {
        if(a==10 ||b==10 || a+b==10){
            return true;
        }else return false;
    }
    //Warmup-2 doubleX
    public static boolean doubleX(String str) {
        int x = str.indexOf("x");
        if (x == -1){
            return false;
        }
        if (x+1 >= str.length()){

            return false;
        }
        return str.substring(x+1, x+2).equals("x");
    }
    //String-1 helloName
    public static String helloName(String name) {
        return("Hello " + name + "!");
    }
    //Array-1 biggerTwo
    public int[] biggerTwo(int[] a, int[] b) {
        if((a[0] + a[1]) > (b[0]+b[1]) ||(a[0] + a[1]) == (b[0]+b[1])){
            return a;
        }else {
            return b;
        }
    }
    //Array-1 no23
    public static boolean no23(int[] nums) {
        boolean a = true;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==2 || nums[i]==3){
                a=false;
            }
        }return a;
    }

    //Logic-1 cigarParty
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend == true && cigars>=40 || isWeekend== false && cigars>=40 && cigars<=60){
            return true;
        }else {
            return false;
        }
    }
    //Logic-2 noTeenSum
    public static int noTeenSum(int a, int b, int c) {
        if(a>=13 && a<=19 && a!=15 && a!=16){
            a = 0;
        }if(b>=13 && b<=19 && b!=15 && b!=16){
            b = 0;
        }if(c>=13 && c<=19 && c!=15 && c!=16){
            c = 0;
        }return(a+b+c);
    }
    //String-2 countHi
    public static int countHi(String str) {
        int num = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) num++;
        }
        return num;
    }
    //String-3 sumDigits
    public static int sumDigits(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(str.substring(i,i+1));
            }
        }
        return sum;
    }
    //Array-2 lucky13
    public static boolean lucky13(int[] nums) {
        boolean x = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                x = false;
            }
        } return x;
    }
    //Array-3 maxSpan
    public static int maxSpan(int[] nums) {
        int x = 0;
        for(int i = 0; i < nums.length; i++) {
            int y = nums.length - 1;
            while(nums[i] != nums[y])
                y--;
            int span = y - i + 1;
            if(span > x)
                x = span;
        }
        return x;
    }

}
