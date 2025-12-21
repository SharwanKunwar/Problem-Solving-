package Day09;


public class Code03 {
    public static void main(String[] args) {
        int[] physic_marks = {22,33,44,55,66,77,33,44};
        int sum = 0;
        double avg;

        for(int val:physic_marks){
            sum+=val;
        }
        avg = (double) sum/physic_marks.length;

        System.out.println("The avg is : "+avg);

    }
}
