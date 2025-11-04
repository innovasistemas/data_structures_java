package com.packages.strings;


public class Strings 
{
    private String text; 


    public Strings()
    {
        this.text = "";
    }


    public void setText(String str) 
    {
        this.text = str;
    }

    public String getText()
    {
        return text;
    }

    
    public String palindrome()
    {
        String text = this.text;
        text = text.toLowerCase();
        text = this.deleteSpaces(text);
        return this.compareCharacters(text) ? 
            "es palíndromo" : "no es palíndromo";
    }

    public boolean compareCharacters(String text) 
    {
        int i = 0;
        boolean sw = true; // Supuesto: el texto es palíndromo
        while (i < text.length() / 2 && sw) {
            if (text.substring(i, i + 1).equals(
                text.substring(text.length() - i - 1, text.length() - i)
            )) {
                i++;
            } else {
                sw = false;
            }
        }
        return sw;
    }


    public String deleteSpaces(String text)
    {
        int i = 0;
        text = text.trim();
        while (i < text.length()) {
            if (text.substring(i, i + 1).equals(" ")) {
                text = text.substring(0, i) +
                    text.substring(i + 1, text.length());
            } else {
                i++;
            }
        }
        return text;
    }

}

