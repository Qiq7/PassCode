package javaxm3.sbww;
//将非负整数 num 转换为其对应的英文表示。
public class MyLeetCode0217 {
    String[] singles = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thousands = {"", "Thousand", "Million", "Billion"};
    public String f(int num){
        if (num==0)return "";
        if(num < 10){
            return singles[num]+" ";
        }else if (num<20){
            return teens[num-10]+" ";
        }else if (num<100){
            return tens[num/10]+" "+f(num%10);
        }else {
            return singles[num/100]+" Hundred "+f(num%100);
        }
    }
    public String numberToWords(int num) {
        if (num==0)
        {
            return "Zero";
        }
        StringBuffer sb = new StringBuffer();
        int n = 1000000000;
        for (int i = 3; i >= 0 ; i--,n/=1000) {
            int x = num/n;
            if(x!=0)
            {
                sb.append(f(x));
                sb.append(thousands[i]);
                sb.append(" ");
                num-=x*n;
            }
        }
        return sb.toString().trim();
    }
}
