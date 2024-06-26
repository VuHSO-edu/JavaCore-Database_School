package hus.oop.decorator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 *  5 bánh mỳ ThickcrustBread chỉ có cheese,
	 *  5 bánh mỳ ThickcrustBread chỉ có olives,
	 *  5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 *  5 bánh mỳ ThincrustBread chỉ có cheese,
	 *  5 bánh mỳ ThincrustBread chỉ có olives,
	 *  5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */
	public void init() {
		 /* TODO */
		for (int i = 0; i < 5; i++) {
			add(new Cheese(new ThickcrustBread()));
			add(new Olives(new ThickcrustBread()));
			add(new Cheese(new Olives(new ThickcrustBread())));
			add(new Cheese(new ThincrustBread()));
			add(new Olives(new ThincrustBread()));
			add(new Cheese(new Olives(new ThincrustBread())));
		}
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		/* TODO */
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 *  bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		/* TODO */
		for (Bread b : breads) {
			if (b.cost() == bread.cost()) {
				breads.remove(b);
				return true;
			}
		}
		return false;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		/* TODO */
		for (Bread bread : breads) {
			System.out.println(bread.getDescription() + " Cost: " + bread.cost());
		}
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		/* TODO */
		List<Bread> sortedBreads = new ArrayList<>(breads);
		sortedBreads.sort((b1, b2) -> order ? Double.compare(b1.cost(), b2.cost()) : Double.compare(b2.cost(), b1.cost()));
		return sortedBreads;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
		List<Bread> sortedBreads = sort(order);
		return sortedBreads.subList(0, Math.min(howMany, sortedBreads.size()));
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();

		/*
		 * Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		 * - Thêm một số bánh mỳ vào cửa hàng
		 * - Bán một số bánh mỳ từ cửa hàng
		 * - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		 * - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		 */
		/* TODO */
		//
		breadStore.add(new Cheese(new ThickcrustBread()));
		breadStore.add(new Olives(new ThincrustBread()));

		//
		breadStore.sell(new Cheese(new ThickcrustBread()));
		breadStore.sell(new Olives(new ThincrustBread()));

		//
		List<Bread> sortedBreads = breadStore.sort(true);
		for (Bread bread : sortedBreads) {
			System.out.println(bread.getDescription() + " Cost: " + bread.cost());
		}

		//
		List<Bread> cheapestBreads = breadStore.filter(10, true);
		for (Bread bread : cheapestBreads) {
			System.out.println(bread.getDescription() + " Cost: " + bread.cost());
		}

	}
}
