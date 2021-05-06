public class Board {
    private Space[][] board = new Space[Game.Y][Game.X];

    public Board(){
        int remainder = Game.BOMB_COUNT;

        double propability = (double) Game.BOMB_COUNT / (Game.X * Game.Y);

        try {
            for (int i = 0; i < Game.Y; i++){
                for (int k = 0; k < Game.X; k++){
                    if (Math.random() < propability && remainder > 0){
                        board[i][k] = new Space(true);
                        remainder--;
                    }else{
                        board[i][k] = new Space(false);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        calculate();
    }
    private void calculate(){
        for (int y = 0; y < Game.Y; y++){
            for (int x = 0; x < Game.X; x++){
                if (!board[y][x].hasBomb()){
                    int count = 0;

                    //UP
                    if (y > 0 && board[y-1][x].hasBomb()) count++;
                    //DOWN
                    if (y < Game.Y-1 && board[y+1][x].hasBomb()) count++;
                    //LEFT
                    if (x > 0 && board[y][x-1].hasBomb()) count++;
                    //RIGHT
                    if (x < Game.X-1 && board[y][x+1].hasBomb()) count++;
                    //TOP LEFT
                    if (x > 0 && y > 0 && board[y-1][x-1].hasBomb()) count++;
                    //TOP RIGHT
                    if (x < Game.X-1 && y > 0 && board[y-1][x+1].hasBomb()) count++;
                    //DOWN LEFT
                    if (x > 0 && y < Game.Y-1 && board[y+1][x-1].hasBomb()) count++;
                    //DOWN RIGHT
                    if (x < Game.X-1 && y < Game.Y-1 && board[y+1][x+1].hasBomb()) count++;

                    board[y][x].setBombNearBy(count);
                }
            }
        }
    }
    private Space[][] getBoard(){
        return board;
    }
}
