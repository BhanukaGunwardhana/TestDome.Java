package Java_Advanced.CodeGen;

import java.util.ArrayList;
import java.util.List;

public class IceCreamMachine {
    public String[] ingredients;
    public String[] toppings;
    
    public static class IceCream {
        public String ingredient;
        public String topping;

        public IceCream(String ingredient, String topping) {
            this.ingredient = ingredient;
            this.topping = topping;
        }
    }

    public IceCreamMachine(String[] ingredeints, String[] toppings) {
        this.ingredients = ingredeints;
        this.toppings = toppings;
    }

    public List<IceCream> scoops() throws UnsupportedOperationException {
        try {
            String[] i;
            i=this.ingredients;
            String[] t;
            t=this.toppings;
            List<IceCream>list=new ArrayList<>();
            for (String a: i){
                for (String b: t){
                    IceCream iceCream=new IceCream(a,b);
                    list.add(iceCream);
                }

            }
            return list;
            
            
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented");
        }
      
        
    }

    public static void main(String[] args) {
        IceCreamMachine machine = new IceCreamMachine(new String[]{
                "vanilla", "chocolate"
        }, new String[]{
                "chocolate sauce"
        });
        List<IceCream> scoops;
        try {
            scoops = machine.scoops();
            for (IceCream iceCream : scoops) {
                System.out.println(iceCream.ingredient + ", " + iceCream.topping);
            }
        } catch (UnsupportedOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*
         * Should print:
         * vanilla, chocolate sauce
         * chocolate, chocolate sauce
         */
        
    }
}
