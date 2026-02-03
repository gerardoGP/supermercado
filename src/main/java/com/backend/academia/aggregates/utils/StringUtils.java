package com.backend.academia.aggregates.utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUtils {
    public static String convertirTextoAUrlSeo(String input){
        if (input == null) return null;
        String normalizado = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        String sinTildes = pattern.matcher(normalizado).replaceAll("");

        return sinTildes.replaceAll("\\s+", "_")       // Espacios a _
                .replaceAll("[^a-zA-Z0-9_]", "") // Quita lo que no sea alfanumérico o _
                .toLowerCase();
    }
}