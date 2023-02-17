package practice.taskfrombook2.page264;

class MirrorDemo {
    public static void main(String[] args) {

        String str = "hello";

        StrMirrorRecurs ob = new StrMirrorRecurs();
        ob.makeMirror2(0, str);
        System.out.println(ob.myStr);
//        ob.makeMirror(0, str);

    }
}
