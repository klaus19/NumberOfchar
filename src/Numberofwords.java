public class Numberofwords {


    public int mostWords(String[]sentences){
        int max=0;
        for(String s : sentences)
        {
            long spaces = s.chars().filter(c -> c == (int)' ').count();
            if(max<spaces)
            {
                max=(int)spaces;
            }
        }
        return max+1;
    }

    public static void main(String[] args) {
        String[]sentences = new String[]{"let's wride","you are amazing","oets fog sk e"};

        Numberofwords n = new Numberofwords();
        n.mostWords(sentences);
        System.out.println(n.mostWords(sentences));
    }
}
