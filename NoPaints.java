public class PaintProblem {
    public static void main(String[] args) {
        System.out.println(returnNumberofPaintings(10,11,12));
    }

    private static int returnNumberofPaintings(int white, int red, int green){
        int paint1 = 0;
        int paint2 = 0;
        int paint3 = 0;
        int paint4 = 0;
        paint1 =  white/3;
        int tempWhite = white%3;
        paint2 =  red/3;
        int tempred = red%3;
        paint3 =  green/3;
        int tempgreen = green%3;

        if(tempWhite>0 && tempred>0 && tempgreen> 0){
            if(tempWhite<=tempred){
                if(tempWhite<=tempgreen){
                    paint4=tempWhite;
                }
                else paint4 = tempgreen;
            }
            else if(tempred<=tempgreen){
                paint4 = tempred;
            }
            else paint4=tempgreen;
        }
        return paint1+paint2+paint3+paint4;
    }
}
