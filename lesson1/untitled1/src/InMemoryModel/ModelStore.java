package InMemoryModel;

import ModelElemets.Camera;
import ModelElemets.Flash;
import ModelElemets.PoligonalModal;
import ModelElemets.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModal> modals;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore(List<IModelChangedObserver> changedObservers) {
        this.changedObservers = changedObservers;
        this.cameras = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.modals = new ArrayList<>();
        modals.add(new PoligonalModal(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene<>(0,modals, flashes, cameras));
    }

    @Override
    public void NotifyChang(IModelChanger sender) {

    }

    public Scene getScene(int id){
        for (int i = 0; i < scenes.size(); i++) {
            if(scenes.get(i).id == id){
                return scenes.get(i);
            }
        }
        return null;
    }
}
