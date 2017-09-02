# ElementOfProgramming
My Java code and notes for element of programming interviews

# Chapter 5 Primitive Type
1. Q501 [compute parity of a word](./chapter5_primitive_type/Q0501.java)
2. Q507 [compute x^y](./chapter5_primitive_type/Q0507.java)
3. Q508 [reverse digits](./chapter5_primitive_type/Q0508.java)

# Chapter 6


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
