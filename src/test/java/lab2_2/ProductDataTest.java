package lab2_2;

import java.util.Date;

import junit.framework.Assert;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class ProductDataTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ProductData productTest = new ProductData(new Id("5"), new Money(10), "ProduktTest1",
				ProductType.FOOD, new Date(2015, 1, 1));
		
		Assert.assertEquals(new Id("5"), productTest.getProductId());
		Assert.assertEquals(new Money(10), productTest.getPrice());
		Assert.assertEquals("ProduktTest1", productTest.getName());
		Assert.assertEquals(new Date(2015, 1, 1), productTest.getSnapshotDate());
		Assert.assertEquals(ProductType.FOOD, productTest.getType());
		Assert.assertEquals(true, productTest.equals(new ProductData(new Id("5"), new Money(10), "ProduktTest1",
				ProductType.FOOD, new Date(2015, 1, 1))));
		//Assert.assertEquals(expected, productTest.hashCode());
		
		System.out.println("Koniec");
	}

}
