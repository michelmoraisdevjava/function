package util;

import java.util.function.Function;

import entities.Product;

public class ToUppercaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
