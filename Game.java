import java.util.Random;

public void main () {
Random rn = new Random();

for(int i = 0; i < 100; i++)
{
    int answer = rn.nextInt(10) + 1;
    System.out.println(answer);
}

}
