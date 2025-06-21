class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for(int i=0;i<len;i++){
            int col_len = image[i].length;
            for(int j =0;j<col_len/2;j++){
                int temp = image[i][j];
                image[i][j] = image[i][col_len-j-1];
                image[i][col_len-j-1] = temp;
            }
        }
       
        

        for(int i = 0; i<len; i++){
           
            for(int j = 0; j<image[i].length; j++){
                if (image[i][j] == 1){
                    image[i][j] = 0;
                }
                else{
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}
