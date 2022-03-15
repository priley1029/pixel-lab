public class PixelPlayground
{
    public static Picture zeroBlue(Picture p)
    {
        Picture newPic = new Picture(p);

        Pixel[][] pixels = newPic.getPixels2D();

        for(int r = 0; r< pixels.length; r++)
        {
            for(int c=0; c<pixels[0].length; c++)
            {
                pixels[r][c].setBlue(0);
            }
        }
        return newPic;
    }

    public static Picture keepOnlyBlue(Picture p)
    {
        Picture newPic = new Picture(p);

        Pixel[][] pixels = newPic.getPixels2D();

        for(int r = 0; r< pixels.length; r++)
        {
            for(int c=0; c<pixels[0].length; c++)
            {
                pixels[r][c].setRed(0);
                pixels[r][c].setGreen(0);
            }
        }
        return newPic;
    }

    public static Picture negate(Picture p)
    {
        Picture newPic = new Picture(p);

        Pixel[][] pixels = newPic.getPixels2D();

        for(int r = 0; r< pixels.length; r++)
        {
            for(int c=0; c<pixels[0].length; c++)
            {
                int numRed = pixels[r][c].getRed();
                int numBlue = pixels[r][c].getBlue();
                int numGreen = pixels[r][c].getGreen();
                pixels[r][c].setRed(255 - numRed);
                pixels[r][c].setBlue(255 - numBlue);
                pixels[r][c].setGreen(255 - numGreen);
            }
        }
        return newPic;
    }

    public static void main(String[] args)
    {
        Picture beachPic = new Picture("beach.jpg");
        beachPic.explore();
        Picture beachPicNoBlue = zeroBlue(beachPic);
        beachPicNoBlue.explore();
        Picture beachPickeepOnlyBlue = keepOnlyBlue(beachPic);
        beachPickeepOnlyBlue.explore();
        Picture beachNegate = negate(beachPic);
        beachNegate.explore();
    }
}