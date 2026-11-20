package org.example;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    static void main() throws WriterException, IOException {
        String barcode = "789123456789";

        BufferedImage image = generate(barcode);

        Path path = Path.of("barcodes/barcode.png");

        ImageIO.write(image, "png", path.toFile());
    }

    public static BufferedImage generate(String value) throws WriterException {

        EAN13Writer writer = new EAN13Writer();

        BitMatrix bitMatrix = writer.encode(
                value,
                BarcodeFormat.EAN_13,
                400,
                100
        );

        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }
}
