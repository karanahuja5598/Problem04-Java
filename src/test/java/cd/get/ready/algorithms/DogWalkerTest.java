package cd.get.ready.algorithms;

import org.junit.Assert;

class DogWalkerTest {

    public void testOne(){
        DogWalker dw = new DogWalker();
        int[] dogs = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int expected = dw.numberOfWalksCalculator(dogs);
        int actual = 6;
        Assert.assertEquals(expected, actual);
    }

    public void testTwo(){
        DogWalker dw = new DogWalker();
        int[] dogs = {10, 20, 10, 10, 30, 50, 10, 20, 30};
        int expected = dw.numberOfWalksCalculator(dogs);
        int actual = 6;
        Assert.assertEquals(expected, actual);
    }

}