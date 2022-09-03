package section5;

public class PaintJobCE28 {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0){
            return -1;
        }
        double areaWall = width * height;
        double areaCovered = areaPerBucket * extraBucket;
        if(areaCovered > areaWall){
            return 0;
        }
        double areaRemaining = areaWall - areaCovered;
        int bucketReq = (int) Math.ceil(areaRemaining/areaPerBucket);
        return bucketReq;

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double areaWall = width * height;
        int bucketReq = (int) Math.ceil(areaWall/areaPerBucket);
        return bucketReq;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int bucketReq = (int) Math.ceil(area/areaPerBucket);
        return bucketReq;
    }
}
