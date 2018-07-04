public class Code {
    // 基本类型的默认值
    boolean b = false;
    char c = '\u0000';
    byte by = (byte) 0;
    short s = (short) 0;
    int i = 0;
    long l = 0L;
    float f = 0.0f;
    double d = 0.0d;

    static int si = 47;

    static void increase() {
        Code.si++;
    }

    int storage(String s) {
        return s.length() * 2;
    }

    boolean flag() {
        return true;
    }

    float naturalLogBase() {
        return 2.718f;
    }

    void nothing() {
        return;
    }

    void nothing2() {
    }


}