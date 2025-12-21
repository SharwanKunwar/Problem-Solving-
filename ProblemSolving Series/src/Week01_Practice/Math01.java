package Week01_Practice;

public class Math01 {
    public static void main(String[] args) {

        int[] student01 = {35, 40, 50, 55, 60};
        int[] student02 = {20, 40, 60, 80, 100};

        int std01Max = student01[0];
        int std01Min = student01[0];

        int std02Max = student02[0];
        int std02Min = student02[0];

        // Find max and min for student01
        for(int val: student01){
            if(val > std01Max) std01Max = val;
            if(val < std01Min) std01Min = val;
        }

        // Find max and min for student02
        for(int val: student02){
            if(val > std02Max) std02Max = val;
            if(val < std02Min) std02Min = val;
        }

        double student01Coeff = (double)(std01Max - std01Min) / (std01Max + std01Min);
        double student02Coeff = (double)(std02Max - std02Min) / (std02Max + std02Min);

        if(student01Coeff > student02Coeff){
            System.out.println("The student 01 is better\nWith a score of " + student01Coeff);
        } else {
            System.out.println("The student 02 is better\nWith a score of " + student02Coeff);
        }
    }
}
