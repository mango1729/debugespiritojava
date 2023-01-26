public class ReverseNumberExample1   
{  
public static void main(string[] args)   
{
scanner sc = new scanner(System.in)
number = sc.nextInt()
int rev = 0;
while(number != 0);
{
remainder = number / 10;
reverse = reverse * 10 + remainder
number = number/10;
}
System.out.print(reverse,1);
}
}
