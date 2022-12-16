package HomeTaskSkill;

public class Hometask {
    public static void main(String[] args) {
        // 0 Перевести число 333 из шестнадцатирично  в десятичную
        int number = 0x333;
        System.out.println("333 из 16ой системы это " + number + " в 10ой");

        // 1 Разложить число 200345 на разряды в десятичной системе

        Integer num1 = 200345;
        String newstr = num1.toString();
        System.out.println( "числа - " + newstr.charAt(5) +
                            " десятки - " + newstr.charAt(4) +
                            " сотни - " + newstr.charAt(3) +
                            " тысячи - " + newstr.charAt(2) +
                            " десятки тысяч - " + newstr.charAt(1) +
                            " сотни тысяч - " + newstr.charAt(0));

        // 2 Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)

        Integer num2 = 637;
        String num2_16 = Integer.toHexString(num2);
        //переводим 27d в 10ю систему ручками 2*16*16+7*16+13*1=512+112+13 = 637 все верно
        System.out.println("637 в 16ой системе = " + num2_16);

        // 3 Перевести 637 из десятичной в двоичную
        Integer num3 = 637;
        String num3_2 = Integer.toBinaryString(num2);
        //
        System.out.println("637 в 2ой системе = " + num3_2);

        // 4 11100111 перевести в десятичную
        //  1*27+1*26+1*25+0*24+0*23+1*22+1*21+1*20 = 1*128+1*64+1*32+0*16+0*8+1*4+1*2+1*1 = 128+64+32+0+0+4+2+1 = 231
        Integer num4 = 0b011100111;
        System.out.println("1110011 в 10ой системе = " + num4);

        // 5 Перевести 637 из десятичной в троичную
        Integer num5 = 637;
        String str5 = num5.toString(637, 3  );
        System.out.println(str5);






    }
}
