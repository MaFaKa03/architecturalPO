package ModelElemets;

import java.util.List;

public class Scene<T> {
    public int id;
    public List<PoligonalModal> modals;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModal> modals,
                 List<Flash> flashes, List<Camera> cameras) {
        if (modals.size() > 0){
            this.modals = modals;
        } else throw new RuntimeException("Need one modal or more");
        this.id = id;
        this.flashes = flashes;
        if (cameras.size() > 0){
            this.cameras = cameras;
        } else throw new RuntimeException("Need one camera or more");

    }

    public T method1(T t){
        return t;
    }
    public T method2(T t1, T t2){
        return t1;
    }
}
