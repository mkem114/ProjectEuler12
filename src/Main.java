import java.util.ArrayList;
import java.util.List;

public class Main {
	//The hackiest of hack ways
    public static void main(String[] args) {
	    double i = 0;
	    double sum = 0;
        while (true) {
	        sum += i;
			List<Integer> divisors = new ArrayList<>();
			for (int j = 0; j < sum; j++) {
				if (sum%j == 0) {
					divisors.add(j);
				}
			}
			if (divisors.size() >= 500) {
				break;
			}
			i++;
			System.out.println(divisors.size());
        }
		System.out.println(String.format("%.0f", sum));
    }
}
