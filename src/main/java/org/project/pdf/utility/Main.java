package org.project.pdf.utility;

import org.project.pdf.utility.pdfToImage.PdfToImageConverter;

import java.io.IOException;

class PdfUtilityTool {
    public static void main(String[] args) throws IOException {
        PdfToImageConverter img = new PdfToImageConverter();
        String filename = "C:\\Users\\joybhowmick\\OneDrive - KPMG\\Documents\\Certifications\\Joy Bhowmick_Kudos_2054459.pdf";
        img.generateImageFromPdf(filename, "jpeg");
    }
}