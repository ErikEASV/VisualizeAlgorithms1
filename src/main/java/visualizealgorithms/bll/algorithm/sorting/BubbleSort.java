package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class BubbleSort extends GenericAlgorithm {

    public BubbleSort() {
        super("BubbleSort", "Slow", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] b = (int[]) super.getData();
        {
            for (int i = 1; i < b.length; i++) // repeat sorting phase N – 1 times
            {
                for (int j = 0; j < b.length - i; j++) // sorting phase
                {
                    if (b[j] > b[j + 1]) // compare elements pair-wise
                    {
                        int tmp = b[j]; // swap element pair
                        b[j] = b[j + 1];
                        b[j + 1] = tmp;
                    }
                }
            }
        }
    }
}
