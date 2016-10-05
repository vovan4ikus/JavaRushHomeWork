package com.javarush.test.level16.lesson13.bonus01;


import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by vovik on 25.11.15.
 */
public class ImageReaderFactory
{

    public static ImageReader getReader(ImageTypes Im){
            if (Im == ImageTypes.BMP)  return new BmpReader();
            else if (Im == ImageTypes.JPG) return new JpgReader();
            else if (Im == ImageTypes.PNG) return new PngReader();
            else
                throw new IllegalArgumentException("Неизвестный тип картинки");

        }

}

