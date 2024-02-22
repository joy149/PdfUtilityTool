package org.project.pdf.utility.pdfToImage;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PdfToImageConverter {
    public void generateImageFromPdf (String filename, String extension) throws IOException {
        File file = new File(filename);
        PDDocument document = PDDocument.load(file);
        String name = file.getName();
        PDFRenderer pdfRenderer = new PDFRenderer(document);
        for (int page = 0; page < document.getNumberOfPages(); ++page) {
            BufferedImage bim = pdfRenderer.renderImageWithDPI(
                    page, 300, ImageType.RGB);
            ImageIOUtil.writeImage(
                    bim, String.format("src/output/ImageFromPDF/%s-%d.%s",name, page+1, extension), 300);
        }
        document.close();

    }
}
