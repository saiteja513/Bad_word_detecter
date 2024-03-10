import java.util.*;

public class BadWordDetecter {

    static final List<String> badwords = Arrays.asList("fuck","fucker","shit","asshole"); 
    
    private static Data evaluate(String inp){
        String[] arr = inp.split(" ");
        for(int i=0;i<arr.length;i++){
            if(badwords.contains(arr[i])){
                return new Data(inp, "RED", arr[i]);
            }
        }
        return new Data(inp, "GREEN", "There is no bad word");
    }

    static class Data{
        String line;
        String colour;
        String baddetect;

        public Data(String line,String colour,String baddetect){
            this.line = line;
            this.colour = colour;
            this.baddetect = baddetect;
        }

        public String toString(){
            return line+" "+colour+" "+baddetect;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        Data ans = evaluate(inp);
        System.out.println(ans.toString());
        sc.close();
    }
}