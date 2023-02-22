import java.util.HashMap;
import java.util.TreeSet;


public class Function {
    public static boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        TreeSet treeSet = new TreeSet<>();


        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {
                if(board[i][j]=='.'){
                    hashMap.put(board[i][j],0);
                }
                hashMap.put(board[i][j],hashMap.getOrDefault(board[i][j],0)+1);
            }

            treeSet.addAll(hashMap.values());
            if((Integer)treeSet.last()>1){
                return false;
            }
            else{
                hashMap.clear();
                treeSet.clear();
            }
        }



        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {
                if(board[j][i]=='.'){
                    hashMap.put(board[j][i],0);
                }
                hashMap.put(board[j][i],hashMap.getOrDefault(board[j][i],0)+1);
            }

            treeSet.addAll(hashMap.values());
            if((Integer)treeSet.last()>1){
                return false;
            }
            else{
                hashMap.clear();
                treeSet.clear();
            }
        }



        for (int q = 0; q < board.length; q+=3) {
            for (int x = 0; x < board.length; x+=3) {

                for (int i = q; i < q+3; i++) {
                    for (int j = x; j < x+3; j++) {
                        if(board[i][j]=='.'){
                            hashMap.put(board[i][j],0);
                        }
                        hashMap.put(board[i][j],hashMap.getOrDefault(board[i][j],0)+1);
                    }
                }

                treeSet.addAll(hashMap.values());
                if((Integer)treeSet.last()>1){
                    return false;
                }
                else{
                    hashMap.clear();
                    treeSet.clear();
                }

            }
        }


        return true;
    }
}
