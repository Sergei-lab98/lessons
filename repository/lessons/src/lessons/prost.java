package lessons;
import java.util.Scanner;



public class prost {
public static void main(String[] args) {
long millisecondsStart = System.currentTimeMillis();
int cnt=0;
System.out.println("¬ведите положительное число: ");
Scanner in = new Scanner(System.in);
int input = in.nextInt();

boolean b = true;
for (int P = 2; P <= input; P++) {
for (int i = 2; i < P; i++) {
if (P % i == 0) {
b = false;
break;
}
}

if (b) {System.out.println(P); cnt++; }
else b = true;

}
//выводит всего
System.out.println(cnt);
long timeSpentInMilliseconds = System.currentTimeMillis() - millisecondsStart;
System.out.println(timeSpentInMilliseconds);
}

}