public class Paintjob {
    public static void main(String[] args) {

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double Bucket = 0;
        int need = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double areaToPaint = width * height;
        double areaWeCanPaint = areaPerBucket * extraBuckets;
        double areaLeftToPaint = areaToPaint - areaWeCanPaint;
        if (areaLeftToPaint < 0) {
            return 0;
        } else {
            return ((int) Math.ceil(areaLeftToPaint / areaPerBucket));
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double areaToPaint2 = width * height;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int) Math.ceil(areaToPaint2 / areaPerBucket);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int) Math.ceil(area / areaPerBucket);
        }
    }
}