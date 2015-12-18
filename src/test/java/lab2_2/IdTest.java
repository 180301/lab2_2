package lab2_2;

import org.junit.Assert;
import org.junit.runners.model.TestTimedOutException;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class IdTest {

	public static void main(String[] args) {
		Id testId = new Id("5");
		if(!testId.getId().equals("5")) throw new AssertionError();
		Assert.assertEquals("5", testId.getId());
		Assert.assertEquals("5".hashCode(), testId.hashCode());
		Assert.assertEquals("5", testId.toString());
		Assert.assertNotEquals(true, testId.equals(5));
		
		System.out.println("Koniec");
	}

}
