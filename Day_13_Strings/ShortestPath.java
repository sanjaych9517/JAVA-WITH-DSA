public class ShortestPath {

    /* Given a route counting four Directiion (E,W,N,S) find 
    the sortest path to route Direction */

    public static float ShortestPath(String Path){
        int X =0; int Y =0;
        for (int i = 0; i < Path.length(); i++) {
            char dir =Path.charAt(i);
            if( dir == 'E')
                X++;
            else if(dir == 'W')
                X--;
             else if(dir == 'N')
                Y++;
             else if (dir == 'S')
                Y--;
        }
        int X2 = X*X;
        int Y2 = Y*Y;
        return (float) Math.sqrt(X2 + Y2);

    }
    public static void main(String[] args) {
        String dir = "WNEENESENNN";
        float result = ShortestPath(dir);
            System.out.println("Shortest Distance: " + result);
    }
}
