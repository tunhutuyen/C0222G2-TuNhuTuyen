package ss12_java_collection_framwork.bai_tap.service;

import ss12_java_collection_framwork.bai_tap.Product;

import java.util.Comparator;

public class PriceSort implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice()- o2.getPrice());
    }
}
