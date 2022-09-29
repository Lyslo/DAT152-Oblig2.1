package Model;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Locale locale1 = new Locale("US", "US");
        Locale locale2 = new Locale("no", "no");
        Locale locale3 = new Locale("de", "de");
        Locale locale;
        
        System.out.println("\u00a9" + RomanNumber.toRoman(2008) + " - " + RomanNumber.toRoman(2022));
        //velg locale
        System.out.println("Please select language" + "\n" + "1. English" + "\n" + "2. Norsk" + "\n" + "3. Deutsch");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        
        switch(in) {
        case 1:
          locale = locale1;
          break;
        case 2:
        	locale = locale2;
          break;
        case 3:
        	locale = locale3;
            break; 
        default:
        	locale = locale1;
      }
        
        ResourceBundle apptexts = ResourceBundle.getBundle("apptexts", locale);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);

	    Product car = new Product(
	            apptexts.getString("car_name"),
	            apptexts.getString("car_description"),
                Double.parseDouble(apptexts.getString("car_price"))
        );

        Product house = new Product(
                apptexts.getString("house_name"),
                apptexts.getString("house_description"),
                Double.parseDouble(apptexts.getString("house_price"))
        );
        
        System.out.println("1. " + car.getName() + " " + car.getDescription() + " " + formatter.format(car.getPrice()));
        System.out.println("2. " + house.getName() + " " + house.getDescription() + " " + formatter.format(house.getPrice()));
        System.out.println("3. Exit");
        
        Cart cart = new Cart();
        
        
        while(true) {
        	
        	  in = sc.nextInt();
             
             switch(in) {
             case 1:
            	 cart.addProduct(car);
               break;
             case 2:
            	 cart.addProduct(house);
               break;
             case 3:
             	System.exit(0);
                 break; 
             default:
             	
           }
             
             System.out.println("Cart: ");
        	
             for (Product product : cart.getProducts()) {
                 System.out.println(product.getName() + " " + formatter.format(product.getPrice()));
             }
        }
    }
}
