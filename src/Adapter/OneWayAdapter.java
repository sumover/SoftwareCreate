package Adapter;

public class OneWayAdapter extends ChinaPlugin {
    EuropePlugin europePlugin;

    public OneWayAdapter(EuropePlugin europePlugin) {
        this.europePlugin = europePlugin;
    }

    @Override
    public int getPower() {
        return europePlugin.getPower();
    }
}
