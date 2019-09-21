package com.dev.flipkart;
import java.util.HashMap;

public class ProductInfoImplementation implements ProductInfoInterface  {
  HashMap<String,ProductInfo> hm = new HashMap<>();
  
 
  public ProductInfo putData(String key, ProductInfo product) {
  if(key!=null && product!=null) {
	  ProductInfo data= hm.put(key, product);
	  return data;
	  }
  return null;
  
}


@Override
public ProductInfo getData(String key, ProductInfo Product) {
	
	return null;
}


@Override
public ProductInfo getData(String key) {

	return null;
}
  
    }



   
  

