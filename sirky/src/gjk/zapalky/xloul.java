package gjk.zapalky;

import java.awt.Point;
import java.util.*;

public class xloul implements gjk.zapalky.IHrac{
    private Random generator = new Random();
    private boolean [][] plan;
    private List<Point> seznam = new ArrayList<>();
    public String Jmeno(){
        return "Ladislav";
    }


    public void Inicializace(int N){
        plan = new boolean [N*2+1][];
        for(int i=0; i<=N*2;i++){
            if(i%2==0){
                plan[i] = new boolean[N];
            }
            else{
                plan[i] = new boolean[N+1];
            }
            for(int ii=0; ii<plan[i].length;ii++){
                plan[i][ii]=false;
                seznam.add(new Point(ii, i));
            }
        }
        Collections.shuffle(seznam);
    }
    public void TahProtihrace(Point souradnice){
        System.out.println(souradnice);
        try {
            if(plan[(int)souradnice.getY()][(int)souradnice.getX()]){
                throw new IllegalArgumentException("Souřadnice Zabraná");
            }
            else{
                plan[(int)souradnice.getY()][(int)souradnice.getX()] = true;
                seznam.remove(souradnice);

            }
        }
        catch (Exception e){
            throw new IllegalArgumentException("Souřadnice mimo pole" + e);
        }
    }
    public Point MujTah(){
        for(Point w:seznam){
            //Doplneni na ctverec
            if(!seznam.contains(new Point((int)w.getX(),(int)w.getY()+1)) && !seznam.contains(new Point((int)w.getX()+1,(int)w.getY()+1)) && !seznam.contains(new Point((int)w.getX(),(int)w.getY()+2))) {
                seznam.remove(w);
                return w;
            }
            else if (!seznam.contains(new Point((int)w.getX(),(int)w.getY()+1)) && !seznam.contains(new Point((int)w.getX()+1,(int)w.getY()+1)) && !seznam.contains(new Point((int)w.getX(),(int)w.getY()-1))){
                seznam.remove(w);
                return w;
            }
            else if (!seznam.contains(new Point((int)w.getX()-1,(int)w.getY()-1)) && !seznam.contains(new Point((int)w.getX()-1,(int)w.getY())) && !seznam.contains(new Point((int)w.getX(),(int)w.getY()+1))) {
                seznam.remove(w);
                return w;
                }
            else if (!seznam.contains(new Point((int)w.getX(),(int)w.getY()-2)) && !seznam.contains(new Point((int)w.getX(),(int)w.getY()-1)) && !seznam.contains(new Point((int)w.getX()+1,(int)w.getY()-1))) {
                seznam.remove(w);
                return w;
            }
        }


        while(true){
            int y = generator.nextInt(plan.length);
            int x = generator.nextInt(plan[y].length);
            System.out.println(x);
            System.out.println(y);
            if(!plan[y][x]){
                plan[y][x] = true;
                seznam.remove(new Point(x,y));
                return(new Point(x, y));
            }
        }
    }
}
