package xloul;

import java.util.ArrayList;

public class Fronta <E extends Polozka>{
    private ArrayList<E> polozky = new ArrayList<>();
	void Pridej(E p){
        polozky.add(0, p);
	}
	Polozka Odeber(){
        try {
            return polozky.remove(polozky.size()-1);
        }
        catch(IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Fronta je prázdná");
        }
	}
	void Smaz(Polozka x){
	    return polozky.remove(x);
	}
}