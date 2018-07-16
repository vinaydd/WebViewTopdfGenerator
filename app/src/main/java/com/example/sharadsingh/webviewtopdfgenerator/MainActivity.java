package com.example.sharadsingh.webviewtopdfgenerator;

import android.app.ProgressDialog;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.webviewtopdf.PdfView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    Button button_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.webView);
        button_convert=findViewById(R.id.button_convert);

       // webView.loadUrl("http://www.annalytics.co.uk/android/pdf/2017/04/06/Save-PDF-From-An-Android-WebView/");


        String Title = "Trux App Pvt Ltd";
        String invoice_title ="This is a  paragraph in android for  invoice of payment.";
        String invoice_view ="invoice in Table View";
        String name ="Himalya singh";
       /* String myHtmlString = "<html><body>" + "<h2>"+Title+ "</h2>\n" + "<p>"+invoice_title+"</p>\n" + "\n" +
                "<h4>"+invoice_view+"</h4>\n" +
                "<table border=\"1\" width=\"100%\">\n" +
                "  <tr>\n"+


                "<td>"+name+ "</td>\n" +
                " <td>"+name+"</td>\t\t\n" +
                " <td>"+name+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +



                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +


                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +



                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" + "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +




                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +

                "  <tr>\n" +
                "    <td>"+name+"</td>\n" +
                "    <td>"+name+"</td>\t\t\n" +
                "    <td>"+name+"</td>\n" +
                "  </tr>\n" +





                "</table>" +
                "</body></html>";*/


       String myHtmlString ="<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
               "<head>\n" +
               "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
               "<title>Untitled Document</title>\n" +
               "</head>\n" +
               "\n" +
               "<body>\n" +
               "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"border:1px solid #ccc;\">\n" +
               "  <tr>\n" +
               "    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
               "        <tr style=\"border-bottom:1px solid #ccc;\">\n" +
               "          <td width=\"50%\" align=\"left\" valign=\"top\" style=\"border-bottom:1px solid #ccc;\"><p style=\"font-family:Arial, Helvetica, sans-serif; font-size:14px; line-height:24px; margin:0 0 0 0; padding:10px;\"><img src=\"http://192.168.0.216:8080/trux/resources/images/invoice-logo.png\"><br />\n" +
               "              Invoice No:</strong> AE18/07001<br />\n" +
               "              <strong>Date: </strong> Jul 09, 2018 </p></td>\n" +
               "          <td width=\"50%\" align=\"left\" valign=\"top\" style=\"border-bottom:1px solid #ccc;\"><p style=\"font-family:Arial, Helvetica, sans-serif; font-size:14px; line-height:24px; margin:0 0 0 0; padding:10px;\"><strong style=\"font-size:18px; font-weight:bold;\">Truxapp Freight Brokers LLC</strong><br />\n" +
               "              Office 416 &amp; 417, Arenco Building -4, Dubai Investment Park-1, Dubai<br />\n" +
               "              Ph: 048846536<br />\n" +
               "              Email: financeuae@truxapp.com<br />\n" +
               "              TRN:100326474200003<br />\n" +
               "              Website:www.truxapp.com</p></td>\n" +
               "        </tr>\n" +
               "      </table></td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
               "        <tr>\n" +
               "          <td width=\"50%\" align=\"left\" valign=\"top\" style=\"border-bottom:1px solid #ccc;\"><p style=\"font-family:Arial, Helvetica, sans-serif; font-size:14px; margin:0 0 0 0; padding:10px; line-height:24px;\"><strong>To</strong><br />\n" +
               "              Client Name: Truxapp GCC Test<br />\n" +
               "              Client Address: Dubai - United Arab Emirates<br />\n" +
               "              Emirate: yuy878</p></td>\n" +
               "          <td width=\"50%\" align=\"left\" valign=\"top\" style=\"border-bottom:1px solid #ccc;\"><p style=\"font-family:Arial, Helvetica, sans-serif; font-size:14px; margin:0 0 0 0; padding:10px; line-height:24px;\"><strong class=\"ng-binding\">TRN: test45242</strong><br />\n" +
               "              Contact No: 9350984469<br />\n" +
               "              Customer Work Order No: test11<br />\n" +
               "              Customer Delivery Challan No:</p></td>\n" +
               "        </tr>\n" +
               "      </table></td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:14px; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Particular</p></td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
               "        <tr>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">SI. No.</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Order Id</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">POD Ref. No.</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Order Date</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">From Destination</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">To Destination</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Vehicle Number</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Per Trip</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">1. Toll Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">2. Gate Pass Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">3. Additional Drop Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">4. Token Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">5. Toll Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Total Charges</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td rowspan=\"3\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">1</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">87682</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Jul 07, 2018 16:36</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Dubai - United Arab Emirates</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Abu Dhabi - United Arab Emirates</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">1050</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">720</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">20</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">210</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">50</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">200</p></td>\n" +
               "          <td rowspan=\"3\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">2250</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Container no.(Editable field)</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Other Info</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Other Info</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Other Info</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td height=\"20\" colspan=\"14\" style=\"border-bottom:1px solid #ccc; \"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "        </tr>\n" +
               "      </table></td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
               "        <tr>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">SI. No.</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Order Id</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">POD Ref. No.</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Order Date</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">From Destination</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">To Destination</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Vehicle Number</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Per Trip</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">1. Toll Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">2. Gate Pass Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">3. Additional Drop Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">4. Token Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">5. Toll Charges</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Total Charges</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td rowspan=\"3\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">1</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">87682</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Jul 07, 2018 16:36</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Dubai - United Arab Emirates</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Abu Dhabi - United Arab Emirates</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">1050</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">720</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">20</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">210</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">50</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">200</p></td>\n" +
               "          <td rowspan=\"3\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">2250</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Container no.(Editable field)</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Other Info</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Other Info</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Other Info</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:bold; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td height=\"20\" colspan=\"14\" style=\"border-bottom:1px solid #ccc; \"><p style=\"margin:0 0 0 0; padding:10px;\">&nbsp;</p></td>\n" +
               "        </tr>\n" +
               "      </table></td>\n" +
               "  </tr>\n" +
               "  <!--<tr>\n" +
               "    <td height=\"20\" style=\"border-bottom:1px solid #ccc;\">&nbsp;</td>\n" +
               "  </tr>-->\n" +
               "  <tr>\n" +
               "    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
               "        <tr>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">* payment term: 30 days</p></td>\n" +
               "          <td rowspan=\"2\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Grand Total (In AED)</p></td>\n" +
               "          <td rowspan=\"2\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">3268.4</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">* Late Payment will attract Late Payment Charge @2% Per Month of the outstanding amount.</p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td colspan=\"3\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Amount Chargeable (in words): Three Thousand Two Hundred Sixty Eight only</p></td>\n" +
               "        </tr>\n" +
               "      </table></td>\n" +
               "  </tr>\n" +
               "  <!--<tr>\n" +
               "    <td height=\"20\" style=\"border-bottom:1px solid #ccc;\">&nbsp;</td>\n" +
               "  </tr>-->\n" +
               "  <tr>\n" +
               "    <td align=\"left\" valign=\"top\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\"><strong>Company Bank Details:</strong></p></td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
               "        <tr>\n" +
               "          <td align=\"left\" valign=\"top\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Beneficiary name: <strong>Truxapp Freight Brokers LLC</strong></p></td>\n" +
               "          <td align=\"left\" valign=\"top\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Account No: <strong>1015306839201</strong></p></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td align=\"left\" valign=\"top\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; border-right:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Bank Name: <strong>Emirates NBD</strong></p></td>\n" +
               "          <td align=\"left\" valign=\"top\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">IBAN: <strong>AE300260001015306839201</strong></p></td>\n" +
               "        </tr>\n" +
               "      </table></td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">Disclaimer: TRUXAPP FREIGHT BROKERS LLC is a NAFL member trading under the standard NAFL Conditions. Standard NAFL conditions are available at www.nafl.ae or can be provided upon request.</p></td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
               "        <tr>\n" +
               "          <td width=\"75%\" height=\"70\" align=\"left\" valign=\"middle\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc; font-style:italic;\"><p style=\"margin:0 0 0 0; padding:10px;\">Customer's Seal and Signature</p></td>\n" +
               "          <td height=\"70\" align=\"left\" valign=\"middle\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal; border-bottom:1px solid #ccc;\"><p style=\"margin:0 0 0 0; padding:10px;\">For Truxapp Private Limited </p></td>\n" +
               "        </tr>\n" +
               "      </table></td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
               "        <tr>\n" +
               "          <td width=\"75%\" height=\"30\" align=\"left\" valign=\"middle\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal;font-style:italic;\"><p style=\"margin:0 0 0 0; padding:10px;\">Authorised Signatory</p></td>\n" +
               "          <td height=\"30\" align=\"left\" valign=\"middle\" style=\"font-family:Arial, Helvetica, sans-serif; font-size:13px; font-weight:normal;\"><p style=\"margin:0 0 0 0; padding:10px;\">Authorised Signatory</p></td>\n" +
               "        </tr>\n" +
               "      </table></td>\n" +
               "  </tr>\n" +
               "  <!--<tr>\n" +
               "    <td>&nbsp;</td>\n" +
               "  </tr>-->\n" +
               "</table>\n" +
               "</body>\n" +
               "</html>";

        webView.loadData(myHtmlString, "text/html", null);





        button_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM + "/PDFTest/");
                final String fileName="Test.pdf";

                final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setMessage("Please wait");
                progressDialog.show();
                PdfView.createWebPrintJob(MainActivity.this, webView, path, fileName, new PdfView.Callback() {

                    @Override
                    public void success(String path) {
                        progressDialog.dismiss();
                        PdfView.openPdfFile(MainActivity.this,getString(R.string.app_name),"Do you want to open the pdf file?"+fileName,path);
                    }

                    @Override
                    public void failure() {
                        progressDialog.dismiss();

                    }
                });

            }
        });
    }
}
