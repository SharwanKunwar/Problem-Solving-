package Day16;

public class Code02 {
    static void main(String[] args) {

        String [] fruits = {"lemon","apple","pinaple","banana","mango","tamato"};
        String [] vegetables = {"patato", "onion", "carrot"};
        String [] meats = {"chicken","pork","beef","fish"};
        String [] category = {"fruits","vegatables","meats"};

        String [][] hold = {fruits,vegetables,meats};

        for(int i=0; i<hold.length; i++){
            System.out.println((i+1)+" List from "+category[i]+"\n");
            for(int j=0; j<hold[i].length; j++){
                System.out.println("item "+(j+1)+" is: "+hold[i][j]);
            }
            System.out.println("\n\n");
        }
    }
}
