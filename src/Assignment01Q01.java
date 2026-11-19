public class Assignment01Q01 {
    public static void main(String[] args) {
        for(string word : args) {
            if (!word.isEmpty()) {
                char first = word.cahrAt(0);
                if (first % 5 == 0) 
                    System.out.println(first);                    
            }
        }
    }
}
