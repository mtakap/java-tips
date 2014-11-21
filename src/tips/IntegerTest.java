package tips;

public class IntegerTest {

    public static void main(String[] args) {
        // とある32ビット表現のID。
        // とある理由によりint型にするケースを想定。
        int id_32bit = 0xAAAAAAAA;

        // 符号なし16進数 "AAAAAAAA" で標準出力する。
        String str = Integer.toHexString(id_32bit);
        System.out.println("Hex String: " + str);

        // 文字列 "AAAAAAAA" は符号なしの場合 Integer.MAX_VALUE より大きい。
        // よってint型への再変換には、Long#parseLong(String, int)で解析後、int型にキャストする。
        id_32bit = (int) Long.parseLong(str, 16);

        // 以下は例外がスローされる。
        //id_32bit = Integer.parseInt(str, 16);
    }

}
