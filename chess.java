public class chess {
    public enum Side{black, white;
        public Side opposite(){
            return this == black ? white : black;
        }
    }
    public enum Piecetype{pawn, rook, knight, bishop, queen, king;}

    static Side s1 = Side.black;
    static Side s2 = Side.white;
    static Piecetype horsey = Piecetype.knight;
    
    
    public static void main(String[] args) {
        int pass = 0;
        if(s2 == s1.opposite()) pass++;
        System.out.println("Pass: " + pass);
    }
}
