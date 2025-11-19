package objectAdapterPattern;

import java.math.BigDecimal;

public class RayzorPayAPI {

		void makeTransaction(BigDecimal amt, String currency) {
			System.out.println("Amount paid:"+amt+" "+currency);
		}
}
