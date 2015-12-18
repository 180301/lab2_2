package lab2_2;

import java.util.Date;

import org.junit.Assert;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sales.domain.purchase.PurchaseItem;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class PurchaseItemTest {

	public static void main(String[] args) {
		ProductData productTest = new ProductData(new Id("5"), new Money(10), "ProduktTest1",
				ProductType.FOOD, new Date(2015, 1, 1));
		PurchaseItem testItem = new PurchaseItem(productTest, 2, new Money(10));
		
		Assert.assertEquals(2, testItem.getQuantity());
		Assert.assertEquals(new ProductData(new Id("5"), new Money(10), "ProduktTest1",
				ProductType.FOOD, new Date(2015, 1, 1)), testItem.getProductData());
		Assert.assertEquals(new Money(10), testItem.getTotalCost());
		
		System.out.println("Koniec");

	}

}
