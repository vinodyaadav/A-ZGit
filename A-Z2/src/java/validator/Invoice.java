/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validator;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import javax.servlet.http.HttpServletResponse;

public class Invoice {
    public static boolean printInvoice(HttpServletResponse response ) throws DocumentException, FileNotFoundException{
        Document document = new Document();
        java.net.URL path=LogData.class.getResource("/");
        String destinationDir;
        destinationDir = path.toString();
     destinationDir=destinationDir.substring(destinationDir.lastIndexOf(":")+1,destinationDir.indexOf("WEB-INF")); 
     String filePath = destinationDir + "invoice" + "/";;
                        File fileName = new File(filePath);
                        if (!fileName.exists()) {
                            fileName.mkdir();
                        }
                       
                        filePath = filePath + "invoice" + ".pdf";
                        PdfWriter.getInstance(document, new FileOutputStream(filePath));
                        document.open();
                        Paragraph paragraph1 = new Paragraph("Invoice");
                        paragraph1.setAlignment(Element.ALIGN_CENTER);
                        
                        paragraph1.setFont(FontFactory.getFont(FontFactory.COURIER, 18, Font.BOLD, new CMYKColor(0, 255, 0, 0)));
                        Paragraph datePara=new Paragraph("Date :"+new Date());
                        datePara.setAlignment(Element.ALIGN_RIGHT);
                        
                        File file = new File(filePath);
                        PdfPTable table = new PdfPTable(2);
                        table.setSpacingBefore(25);
                       table.setWidthPercentage(100);
                       table.setSpacingAfter(25);

                       PdfPCell c1 = new PdfPCell(new Phrase("Description"));
                       c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                       table.addCell(c1);
                       c1 = new PdfPCell(new Phrase(" Amount "));
                       c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                       table.addCell(c1);
                       table.setHeaderRows(1);
                       table.addCell("         " +  "   ");
                       table.addCell("         " +  "  ");
                       table.addCell("          Total Balance amount :");
                       table.addCell("         " + "   ");
                       Paragraph amountPara = new Paragraph("\nPaid Amount:  " );
                       Paragraph forCom = new Paragraph("\n For Company: " );
                       document.open();
                       document.add(paragraph1);
                        document.add(datePara);
                        document.add(table);
                        document.add(amountPara);
                        document.add(forCom);
                        document.close();
                        streamImageFile(file, response);

                        return true;
    }
    private static void streamImageFile(File file, HttpServletResponse response) {
        // find the right MIME type and set it as content 
        String a = getContentType(file);
        response.setContentType(a);
        String fileName = file.getName();
        response.setHeader("Content-Disposition", "inline; filename=" + fileName);
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            response.setContentLength((int) file.length());
            // Use Buffered Stream for reading/writing.
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new BufferedOutputStream(response.getOutputStream());
            
            byte[] buff = new byte[(int) file.length()];
            int bytesRead;
            
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
     private static String getContentType(File file) {
        if (file.getName().length() > 0) {
            String[] parts = file.getName().split("\\.");
            if (parts.length > 0) {
                String extention = parts[parts.length - 1];
                if (extention.equalsIgnoreCase("pdf")) {
                    return "application/pdf";
                }
            }
        }
        throw new RuntimeException("Can not find content type for the file " + file.getAbsolutePath());
        
    }
}
