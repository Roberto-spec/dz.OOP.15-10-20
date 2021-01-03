package org.itstep.task06;

import java.util.Arrays;

public class MainString {
    private char[] chars;
    private int count;
    MainString(){
        clean();
    }

    MainString(CharSequence charSequence){

        toMainString(charSequence);
    }
    MainString(char s,int d){
        chars=new char[d];
        count=d;
        for(int i=0;i<d;i++){
            chars[i]=s;
        }
    }

    public void toMainString(CharSequence charSequence){
        chars=new char[charSequence.length()];
        count=charSequence.length();
        for(int i=0;i<charSequence.length();i++){
            chars[i]=charSequence.charAt(i);
        }
    }
    public int length(){
        return count;
    }
    public void clean(){
        chars=new char[0];
        count=0;
    }
    public MainString concat(MainString right,MainString left){
        MainString ms=new MainString();
        char[] ch=new char[right.length()+left.length()];
        for(int i=0;i<left.length();i++) ch[i]=left.indexOf(i);
        for (int i=left.length();i<left.length()+right.length();i++){
            ch[i]=right.indexOf(i-left.length());
        }
        ms.setChars(ch);
        ms.setCount(right.length()+left.length());
        return ms;
    }
    public char indexOf(int index){
        if(count>index) return chars[index];
        return ' ';
    }

    @Override
    public String toString() {
        String s=new String("");
        for(int i=0;i<count;i++){
            s+=chars[i];
        }
        return s;
    }

    private void setChars(char[] ch) {

        this.chars = ch;

    }

    private void setCount(int count) {
        this.count = count;
    }

    private int getCount() {
        return count;
    }

    private char[] getChars() {
        return chars;
    }
}
