public class linecomparisonuc3 {
    public static void main(String[] arg) {
        int x1,x2,x3,x4,y1,y2,y3,y4;
        double dis1;
        double dis2;
        x1=1;
        x2=2;
        x3=3;
        x4=4;
        y1=5;
        y2=6;
        y3=7;
        y4=8;
        dis1 = Math.sqrt(x2 - x1)*(x2-x1) + (y2 - y1)*(y2 - y1);
        dis2 = Math.sqrt(x4 - x3)*(x4 - x3) + (y4 - y3);
        if (Double.compare(dis1,dis2) == 0) {
            System.out.println("disl1=dis2");
        }
        else if (Double.compare(dis1,dis2) < 0) {
            System.out.println("dis1<dis2");
        }
        else {
            System.out.println("dis1>dis2");
        }
    }
}
