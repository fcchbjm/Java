package whpu.E.E4.E4;

import whpu.E.E4.E4.Circle;

import java.util.ArrayList;
import java.util.Random;

public class TotalAreaAndCopyArray {
    public static ArrayList<Circle> createCircleArray() {
        ArrayList<Circle> sourceCircleArray = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            sourceCircleArray.add(new Circle(random.nextInt(50)));
        }
        return sourceCircleArray;
    }

    public static void main(String args[]) {
        ArrayList<Circle> sourceCircleArray = createCircleArray();
        ArrayList<Circle> targetCircleArray = (ArrayList<Circle>) sourceCircleArray.clone();
        for(Circle c : targetCircleArray) {
            System.out.println(c.toString());
        }
        for(int i = 0; i < sourceCircleArray.size(); i++) {
            targetCircleArray.set(i, (Circle)(sourceCircleArray.get(i)).clone());
        }
        for(Circle c : targetCircleArray) {
            System.out.println(c.toString());
        }
    }
}
