package br.uninove.utils;


public class StrUtils {
    public static String capitalize(String texto) {
        if(texto == null || texto.isEmpty()) {
            return texto;
        }
        
        StringBuilder sb = new StringBuilder();
        boolean convertProximo = true;
        for(char ch : texto.toCharArray()) {
            if(Character.isSpaceChar(ch)) {
                convertProximo = true;
            } else if(convertProximo) {
                ch = Character.toTitleCase(ch);
                convertProximo = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
