package InMemoryModel;

import ModelElemets.Camera;
import ModelElemets.Flash;
import ModelElemets.PoligonalModal;
import ModelElemets.Scene;

import java.util.List;

public class ModelStore implements IModelChanger{
    List<PoligonalModal> modals;
    List<Scene> scenes;
    List<Flash> flashes;
    List<Camera> cameras;
    private IModelChangedObserver changedObserver;
    @Override
    public void NotifyChang(IModelChanger sender) {

    }
}
