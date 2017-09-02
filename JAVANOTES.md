# How to randomly generate numbers using JAVA
```JAVA
// java 1.7 or later
import java.util.concurrent.ThreadLocalRandom;
int randomNum = ThreadLocalRandom.current().nextInt(min, max+1);
//before java 1.7
import java.util.Random;
public static randInt(int min, int max){
  Random rand;
  int randomNum = rand.nextInt((max-min) + 1) + min;
  return randomNum;
}
