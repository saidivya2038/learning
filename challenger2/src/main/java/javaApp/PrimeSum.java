package javaApp;

public class PrimeSum {

    public static void main(String[] args) {
        System.out.println(primesum(20));
    }

    static long primesum(int maxNum) {
      if(maxNum<=0)
      {
        return 0;
      }
        int sum = 0,count, i,num;
        for (num=1;num<=maxNum;num++)
        {
          count=0;
          for (i=2;i<=num/2;i++)
          if (num%i==0)
          {
            count ++;
            break;

          }
          if (count==0 && num!=1)
          {
          sum=sum+num;
        }
      }
        //insert your code here


        return sum;
    }
}