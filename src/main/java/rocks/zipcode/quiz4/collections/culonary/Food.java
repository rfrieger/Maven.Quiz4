package rocks.zipcode.quiz4.collections.culonary;

import rocks.zipcode.quiz4.collections.WordCounter;

import java.util.List;
import java.util.Map;


/**
 * @author leon on 27/12/2018.
 */
public class Food {
    WordCounter wordCounter = new WordCounter();

    public List<Spice> getAllSpices() {
        return null;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return null;
    }

    public void applySpice(Spice spice) {
    }
}
