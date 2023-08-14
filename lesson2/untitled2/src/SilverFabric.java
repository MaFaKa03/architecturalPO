public class SilverFabric extends ItemFabric{
    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
}
