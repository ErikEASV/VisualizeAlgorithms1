package visualizealgorithms;//Project imports
import visualizealgorithms.bll.algorithm.IAlgorithm;
import visualizealgorithms.bll.algorithm.sorting.BubbleSort;
import visualizealgorithms.bll.algorithm.sorting.BucketSort;
import visualizealgorithms.bll.algorithm.sorting.HeapSort;

//Java imports
import java.util.ArrayList;

/**
 * Convenience class that adds algorithms and handles inputs
 */
public class AlgorithmLoader {

    private String inputs = "";
    private ArrayList<IAlgorithm> algorithms = new ArrayList<>();

    public AlgorithmLoader() {
        //Modify default inputs
        inputs = "1000;2000;4000;8000;16000;32000;64000;128000";

        //Add implemented/selected algorithms here..
        algorithms.add(new BubbleSort());
        algorithms.add(new HeapSort());
        algorithms.add(new BucketSort());


        //more algorithms here :)
    }

    public String getInputs() {
        return inputs;
    }

    public ArrayList<IAlgorithm> getAlgorithms() {
        return algorithms;
    }
}
