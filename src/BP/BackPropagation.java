package BP;

import java.io.File;
import java.io.IOException;

public class BackPropagation extends NeuralNet implements NeuralNetInterface {

        double[] weight;
        
    public BackPropagation () {
        this.argNumInputs = 2;
        this.argNumHidden = 4;

    }




    @Override
    /**
     * Return a bipolar sigmoid of the input X
     * @param x The input
     * @return f(x) = 2 / (1+e(-x)) - 1
     */
    public double sigmoid(double x) {
        double fx = 2 / (1+Math.exp(-x)) -1;
        return fx;
    }



    /**
     * This method implements a general sigmoid with asymptotes bounded by (a,b)
     * @param x The input
     * @return f(x) = b_minus_a / (1 + e(-x)) - minus_a
     */



    @Override
    public double customSigmoid(double x) {
        double fx;
        fx = (argB-argA) / (1+Math.exp(-x)) + argA;
        return fx;
    }



    /**
     * Initialize the weights to random values.
     * For say 2 inputs, the input vector is [0] & [1]. We add [2] for the bias.
     * Like wise for hidden units. For say 2 hidden units which are stored in an array.
     * [0] & [1] are the hidden & [2] the bias.
     * We also initialise the last weight change arrays. This is to implement the alpha term.
     */

    @Override
    public void initializeWeights() {

    }

    @Override
    public void zeroWeights() {

    }

    @Override
    public double outputFor(double[] X) {
        return 0;
    }

    @Override
    public double train(double[] X, double argValue) {
        return 0;
    }

    @Override
    public void save(File argFile) {

    }

    @Override
    public void load(String argFileName) throws IOException {

    }
}
