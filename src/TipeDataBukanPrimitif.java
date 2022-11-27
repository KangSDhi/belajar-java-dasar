public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;

        Integer iniObject = iniInt;

        System.out.println(iniObject);

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);

        Long iniLongObject = 100000000000000L;
        short iniShort2 = iniLongObject.shortValue();

        System.out.println(iniShort2);
    }
}
