public class DemoSpeedStringBuiderAndBuffer {
    public static void main(String[] args) {
        String str ="";
        long time = System.currentTimeMillis();
        for (int i = 0 ; i < 50000; i++){
            str+="add string ";
        }
        System.out.println("String: " + (System.currentTimeMillis() - time) + " ms");

        time = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < 50000; i++){
            stringBuilder.append("append string");
        }
        System.out.println("StringBuilder 100K: "+(System.currentTimeMillis() - time) + " ms");

        time = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0 ; i < 50000; i++){
            stringBuffer.append("append string ");
        }
        System.out.println("StringBuffer 100K: "+(System.currentTimeMillis() - time) + " ms");
    }
}
