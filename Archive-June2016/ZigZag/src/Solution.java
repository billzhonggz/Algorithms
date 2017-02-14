/**
 * Created by huayou2908 on 2016/6/8.
 */
public class Solution {
    //Set up a test main method.
    public static void main (String[] args){
        String s = "PAYPALISHIRING";
        int row = 3;
        Solution so = new Solution();
        String con = so.convert(s,row);
        System.out.println(con);
    }
    public String convert (String s,int numRows){
        //Calculate string length.
        int len = s.length();
        //Handling special situations.
        if(len == 0 || numRows < 2)
            return s;
        //Return string.
        String result = "";
        //Block length.
        int block = 2 * numRows - 2;
        //Add characters onr by one.
        for(int i = 0; i < numRows; i++){
            for(int j = i; j < len; j = j + block){
                result = result + s.charAt(j);
                //Add one if it isn't the first row or last row.
                if(i > 0 && i < numRows - 1){
                    int k = j + block - 2 * i;
                    if (k < len)
                        result = result + s.charAt(k);
                }
            }
        }
        return result;
    }
}
