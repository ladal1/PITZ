package xloul;

import java.util.ArrayList;

public class Zasobnik <E extends Polozka>{
    private ArrayList<E> polozky = new ArrayList<>();
    void Pridej(E p){
        polozky.add(p);
	}
	Polozka Odeber(){
        try{
            return polozky.remove(0);
        }
        catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Zasobnik je prazdny");
        }
	}
	boolean Smaz(Polozka x){
        return polozky.remove(x);
    }
}