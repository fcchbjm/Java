package whpu.E.E4.E3;

import whpu.E.E4.E3.Circle;

import java.util.Random;

public class TotalAreaAndCopyArray {
    public static Circle[] createCircleArray() {
        Circle[] sourceCircleArray = new Circle[5];
        Random random = new Random();
        for(int i = 0; i < sourceCircleArray.length; i++) {
            sourceCircleArray[i] = new Circle(random.nextInt(50));
        }
        return sourceCircleArray;
    }

    public static void main(String args[]) {
        Circle[] sourceCircleArray = createCircleArray();
        Circle[] targetCircleArray = new Circle[5];
        for(int i=0;i<sourceCircleArray.length;i++){
            targetCircleArray[i]=(Circle) sourceCircleArray[i].clone();
        }
        for(int i = 0; i < targetCircleArray.length; i++) {
            System.out.println(targetCircleArray[i].toString());
        }
        for(int i = 0; i <targetCircleArray.length; i++) {
           targetCircleArray[i].setRadius(sourceCircleArray[i].getRadius());
        }
        for(int i = 0; i < sourceCircleArray.length; i++) {
            sourceCircleArray[i].setRadius(i + 1);

        }
        for(int i = 0; i < targetCircleArray.length; i++) {
            System.out.println(targetCircleArray[i].toString());
        }
    }
}
