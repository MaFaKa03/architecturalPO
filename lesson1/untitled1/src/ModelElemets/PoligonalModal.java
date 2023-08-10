package ModelElemets;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModal {
    public List<Poligon> Poligons;
    public List<Texture> Textures;
    public PoligonalModal(List<Texture> textures){
        Textures = textures;
        Poligons = new ArrayList<>();
    }
}
