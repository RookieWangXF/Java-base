package cn.rookie.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rookie on 2016/7/17.
 * Package_name is cn.rookie.flyweight
 * Description:
 */
public class FontBase {

    private List<String> font = new ArrayList<>();
    private String fontName;

    public FontBase(String fontName) {
        this.fontName = fontName;
    }

    public FontBase addFont(String font) {
        this.font.add(font);
        return this;
    }

    public String getFontName() {
        return fontName;
    }
}

class ChineseFont extends FontBase {

    ChineseFont(String fontName) {
        super(fontName);
        addFont("Chinese Font");
    }

}

class EnglishFont extends FontBase {

    EnglishFont(String fontName) {
        super(fontName);
        addFont("English Font");
    }

}