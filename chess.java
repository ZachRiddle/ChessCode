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
/* 
Problem:
Make the corrections and addtions to make the following code work


Side s1 = Side.Black;

Side s2 = Side.WHITE;

PieceType horsey = PieceType.KNIGHT;

if(s2 == s1.opposite()) pass++;
 */
