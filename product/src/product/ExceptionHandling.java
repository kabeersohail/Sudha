package product;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		try {
			int num=10/0;
			System.out.println(num);
		}	catch(NullPointerException n) {
			System.out.println(n);
		}catch(Exception k) {
			System.out.println(k);
		}
			finally {
				System.out.println("f b");
			}
		System.out.println("out ");
		}
	}


