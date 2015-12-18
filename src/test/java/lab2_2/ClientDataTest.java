package lab2_2;

import org.junit.Assert;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class ClientDataTest {

	public static void main(String[] args) {
		Id testID = new Id("5");
		ClientData klientDataTest = new ClientData(testID, "nazwaKlienta1");
		
		Assert.assertEquals("nazwaKlienta1", klientDataTest.getName());
		Assert.assertEquals(testID, klientDataTest.getAggregateId());
		
		System.out.println("Koniec");
	}

}
