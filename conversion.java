public class conversion {
    public static void binary(int binaryNum){
        int myNum = binaryNum;
        int pow = 0;
        int decNum =0;

        while(binaryNum>0){
            int lastDigit = binaryNum %10;
            decNum = decNum +(lastDigit* (int)Math.pow(2 ,pow));
            pow++;
            binaryNum = binaryNum /10;
        }
        System.out.println("decial of" +myNum + "=" + decNum);
    }
    public static void main(String args[]){
        binary(111);
    }
    
}
