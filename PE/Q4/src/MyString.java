public class MyString implements IString{
//abc 35 d4a8s3g9g7 : 2 3 5 7 
    @Override
    public int f1(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='2' || str.charAt(i)<='7')
                if (str.charAt(i)=='2' || str.charAt(i)=='3' ||
                    str.charAt(i)=='5' || str.charAt(i)=='7' )
                    count++;
        }
        return count;
    }
    
    @Override
    public String f2(String str) {
        //str ="   a2 b3 c4    d5   "
        String [] strArr = str.trim().split("\\s+");
        String S="";
        for (int i = strArr.length-1; i >=0 ; i--) {
            if (i==0)
                S+= strArr[i];
            else
                S+= strArr[i]+" ";
        }
        return S;
    }   
}
