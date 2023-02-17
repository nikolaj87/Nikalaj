package practice.taskfrombook2.page264;

class StrMirrorRecurs {

    String myStr = "";

    void makeMirror(int index, String str){

          if (index != (str.length()-1)){
            makeMirror(index+1, str);
        }

        System.out.print(str.charAt(index));
    }

    void  makeMirror2(int index, String str){

//        String newStr = "";
        if (index != str.length()-1){
            makeMirror2(index + 1, str);
        }
        myStr = myStr + str.charAt(index);
    }

}
