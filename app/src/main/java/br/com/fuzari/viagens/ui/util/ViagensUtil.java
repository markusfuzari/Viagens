package br.com.fuzari.viagens.ui.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import br.com.fuzari.viagens.model.Pacote;

public class ViagensUtil {


    public static final String DRAWABLE = "drawable";
    public static final String DIA_SINGULAR = " dia";
    public static final String DIA_PLURAL = " dias";
    public static final String LANGUAGE = "pt";
    public static final String COUNTRY = "br";

    public static String formatarMoeda(BigDecimal preco) {
        NumberFormat formatoMoedaBrasileiro = DecimalFormat
                .getCurrencyInstance(new Locale(LANGUAGE, COUNTRY));
        return formatoMoedaBrasileiro.format(preco);
    }

    public static String recuperarQuantidadeDiasFormatado(int quantidadeDias) {
        return quantidadeDias + (quantidadeDias > 1 ? DIA_PLURAL : DIA_SINGULAR);
    }

    public static Drawable recuperarDrawable(String imagem, Context context) {
        Resources resources = context.getResources();
        int idDrawable = resources.getIdentifier(imagem, DRAWABLE, context.getPackageName());
        return resources.getDrawable(idDrawable, null);
    }
}
