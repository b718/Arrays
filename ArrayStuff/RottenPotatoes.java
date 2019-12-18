
public class RottenPotatoes
{
    public static void main(String[] args){
        int[][] ratings = { {4,6,2,5},
                {7,9,4,8},
                {6,9,3,7} 
            };

        System.out.println(worstMovie2018(ratings));
        //ratings.length --> rows
        //ratings[0].length --> cols
    }

    public static int movieAvgRating(int[][] ratings, int movie){
        int ans = 0;
        for(int i = 0; i < ratings.length; i++){
            ans = ans + ratings[i][movie];
        }

        return ans / ratings.length;
    }

    public static int reviewerAvgRating(int[][] ratings, int reviewer){
        int ans = 0;

        for(int i = 0; i < ratings[0].length; i++){

            ans = ans + ratings[reviewer][i];

        }

        return ans / ratings[0].length;

    }

    public static int avgRating2018(int[][] ratings){
        int ans = 0;
        int divider = 0;
        for(int row = 0; row < ratings.length; row++){
            for(int col = 0; col < ratings[0].length; col++){
                ans = ans + ratings[row][col];
                divider++;
            }

        }

        return ans/divider;

    }

    public static int hardestRater2018(int[][] ratings){
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;

        for(int col = 0; col < ratings[0].length; col++){
            r0 = r0 + ratings[0][col];
            r1 = r1 + ratings[1][col];
            r2 = r2 + ratings[2][col];

        }

        if(r0 < r1 && r0 < r2){
            return 0;

        } else if(r1 < r0 && r1 < r2){
            return 1;
        }else{
            return 2;
        }
    }

    public static int worstMovie2018(int[][] ratings){
        int m0 = 0;
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;

        for(int row = 0; row < ratings.length; row ++){
            m0 = m0 + ratings[row][0];
            m1 = m1 + ratings[row][1];
            m2 = m2 + ratings[row][2];
            m3 = m3 + ratings[row][3];

        }
        
        if(m0 < m1 && m0 < m2 && m0 < m3){
            return 0;
        }else if(m1 < m0 && m1 < m2 && m1 < m3){
            return 1;
        }else if(m2 < m1 && m2 < m0 && m2 < m3){
            return 2;
        }else{
            return 3;
        }

    }
}
