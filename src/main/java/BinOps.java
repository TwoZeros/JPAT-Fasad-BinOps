public class BinOps {
    public String sum(String a, String b) {
        int args1 = Integer.parseInt(a, 2);
        int args2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(args1 + args2);
    }

    public String mult(String a, String b) {
        int args1 = Integer.parseInt(a, 2);
        int args2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(args1 * args2);
    }
}
