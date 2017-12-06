package referencje;

public class Referencje4 {
    
    static void metoda(String s, StringBuilder sb) {
        s = s.concat(" 1");
        sb = sb.append(" 1");
        
        s.concat(" 2");
        sb.append(" 2");
        
        System.out.println(s); // A 1
        System.out.println(sb); // B 1 2
    }

    public static void main(String[] args) {
        String s = "A";
        StringBuilder sb = new StringBuilder("B");
        
        System.out.println(s); // A
        System.out.println(sb); // B
        
        metoda(s, sb);
        
        System.out.println(s); // A
        System.out.println(sb); // B 1 2
    }

}



