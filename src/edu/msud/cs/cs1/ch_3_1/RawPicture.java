package edu.msud.cs.cs1.ch_3_1;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import edu.msud.cs.cs1.Picture;
import javax.imageio.ImageIO;

public class RawPicture {
    private int height, width;
    private Color[] pixels;
    private  String toFilename;
    private  String fromFilename;
    private static Picture picture;
    private BufferedImage bufferedImage;

    public RawPicture() {
        height = width = 0;
        pixels = null;
        toFilename = "picture.RAW";
        fromFilename = null;
    }

    public RawPicture(Picture picture) {
        // initialize relevant private members
        this.picture = picture;
        height = picture.height();
        width = picture.width();

        // read the pixel colors, by columnd and row, from picture using an ArrayList
        ArrayList<Color> tempPix = new ArrayList<>();
        for (int col = 0; col < picture.width(); col ++)
            for (int row = 0; row < picture.height(); row ++)
                tempPix.add(picture.get(col, row));

        // initialize the private pixels array, using the size of the ArrayList
        pixels = new Color[tempPix.size()];

        // populate pixels with the data from the ArrayList
        int i = 0;
        for (Color c: tempPix) pixels[i ++] = c;
    }

    public RawPicture(String filename) throws Exception {
        // initialize relevant private members
        fromFilename = filename;

        if ( (filename.toUpperCase().endsWith(".GIF")) ||
                (filename.toUpperCase().endsWith(".JPG")) ||
                (filename.toUpperCase().endsWith(".PNG")) ) {
            // ... populate pixels from BufferedImage read from a File

            File file = new File(filename);
            BufferedImage image = ImageIO.read(file);

            ArrayList<Color> filePix = new ArrayList<>();
            for(int i =0; i < image.getWidth(); i ++)
            {
                for(int j = 0; j < image.getHeight(); j++)
                {
                    filePix.add(new Color(image.getRGB(i,j)));

                }
            }
            pixels = new Color[filePix.size()];
            int i = 0;
            for (Color pix: filePix) {
                pixels[i ++] = pix;
            }

        } else{
            // ... populate pixels with a call to RawPicture::read()
            read(filename);

        }


    }

    public void write(String toFile) {
        this.toFilename =  toFile;
        picture.save(toFilename);
    }

    public void read(String fromFile)  {
        this.fromFilename = fromFile;
        RawPicture pic;
        if (fromFilename.endsWith(".RAW"))
        {
            pic = new RawPicture(picture);
            height = pic.height;
            width = pic.width;
            ArrayList<Color> filePix = new ArrayList<>();
            for(int i =0; i < pic.width; i ++)
            {
                for(int j = 0; j < pic.height; j++)
                {
                    filePix.add(picture.get(i,j));

                }
            }
            pixels = new Color[filePix.size()];
            int i = 0;
            for (Color pix: filePix) {
                this.pixels[i ++] = pix;
            }
        } else {
            File file = new File(fromFile);
            try {
                BufferedImage image = ImageIO.read(file);
            } catch (Exception e) {
                System.out.println("Bad read");
            }

        }

    }

    public static void main(String[] args) {

        RawPicture test = new RawPicture(new Picture(args[0]));
        System.out.println(""+ test.height + " " + test.width + " " + test.pixels[0]);
        test.write(args[1]);

    }
}