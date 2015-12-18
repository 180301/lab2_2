package lab2_2;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sales.domain.purchase.Purchase;
import pl.com.bottega.ecommerce.sales.domain.purchase.PurchaseItem;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class PurchaseTest {

	public static void main(String[] args) {
		ProductData productTest = new ProductData(new Id("5"), new Money(10), "ProduktTest1",
				ProductType.FOOD, new Date(2015, 1, 1));
		PurchaseItem testItem = new PurchaseItem(productTest, 2, new Money(10));
		List<PurchaseItem> items = null;
		List<PurchaseItem> items2 = null;
		items2.add(testItem);
		
		
		Purchase zakup = new Purchase(new Id("5"),
				new ClientData(new Id("2"), "nazwaKlienta1"),
				items2,
				new Date(2015,1,1),
				false,
				new Money(100));
		Assert.assertEquals(new Id("5"), zakup.getAggregateId());
		Assert.assertEquals(false, zakup.isPaid());
		zakup.confirm();
		Assert.assertEquals(true, zakup.isPaid());
		Assert.assertEquals(new Money(100), zakup.getTotalCost());
		Assert.assertEquals(new Date(2015,1,1), zakup.getPurchaseDate());
		items.add(testItem);
		Assert.assertEquals(items, zakup.getItems());
		
		System.out.println("Koniec");

	}

}
