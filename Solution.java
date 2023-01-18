import java.math.BigInteger;
class Solution {
    
    public String addBinary(String a, String b) {
        System.out.println(binaryToD(a));
        return DtoBinary(binaryToD(a).add(binaryToD(b)));
    }
    
    public BigInteger binaryToD(String a){
        int power = 0;
        BigInteger sum = new BigInteger("0");
        for(int i = a.length()-1; i>=0; i--){
            if(Character.getNumericValue(a.charAt(i)) == 1) sum = sum.add(BigInteger.valueOf(2).pow(power));
            power++;
        }
        return sum;
    }
    
    public String DtoBinary(BigInteger n){
        if(n.equals(BigInteger.valueOf(0))) return "0";
        StringBuilder sum = new StringBuilder("");
        while (n.compareTo(BigInteger.valueOf(0)) > 0)
        {
            sum.append(n.remainder(BigInteger.valueOf(2)));
            n = n.divide(BigInteger.valueOf(2));

        }

        return sum.reverse().toString();
    }
}
