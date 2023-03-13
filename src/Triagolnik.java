import java.util.Scanner;
public class Triagolnik {
       public static void main(Sting[] args) {
	
		double a,b,c,h1,h2,h3,s1,s2,s3,perimetar,plostina;
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Se premstuva perimetarot na triagolnik");
		System.out.println("Vnesete ja stranata a");
		a=tastatura.nextDouble();
		System.out.println("Vnesete ja stranata b ");
		b=tastatura.nextDouble();
		System.out.println("Vnesete ja stranata c");
		c=tastatura.nextDouble();
		System.out.println("Vnesete ja visinata h1");
		h1=tastatura.nextDouble();
		System.out.println("Vnesete ja visinata h2");
		h2=tastatura.nextDouble();
		System.out.println("Vnesete ja visinata h2");
		h3=tastatura.nextDouble();
		s1=a/h1;
		s2=b/h2;
		s3=c/h3;
		perimetar =s1+s2+s3;
		plostina= 1/2*a*h1;
		System.out.println("Perimetarot na triagolnikot e" + perimetar);
		System.out.println("Plostina na triagolnikot e" +plostina);
		
		
	}

}
