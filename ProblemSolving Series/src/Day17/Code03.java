package Day17;

public class Code03 {
    static void main(String[] args) {

        String str = "love";
            int coutn = 0;

        while(true){
            try{
               str.charAt(coutn);
            }catch (Exception ex){
                break;
            }
            coutn++;
        }
        System.out.println(coutn);

    }

}
