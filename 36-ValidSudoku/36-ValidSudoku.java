// Last updated: 7/9/2026, 10:07:59 AM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] col=new HashSet[9];
        HashSet<Character>[] box=new HashSet[9];
        for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.') continue;
                int in=(i/3)*3+(j/3);
                if(row[i].contains(ch) || col[j].contains(ch) || box[in].contains(ch)) return false;
                row[i].add(ch);
                col[j].add(ch);
                box[in].add(ch);
            }
        }
        return true;
    }
}