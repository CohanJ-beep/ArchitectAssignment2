package edu.sdccd.cisc191.template;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "FileUploadServlet", urlPatterns = { "/fileuploadservlet" })
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 1,    // 1MB
        maxFileSize = 1024 * 1024 * 10,         // 10 MB
        maxRequestSize = 1024 * 1024 * 100      //100MB
)

public class FileUploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

        public <HttpsServletResponse> void doPost(HttpServletRequest request, HttpsServletResponse response) throws ServletException, IOException {
            Part filePart = request.getPart("file");
            String fileName = filePart.getSubmittedFileName();
            for (Part part : request.getParts()) {
                part.write("C:\\upload\\" + fileName);
            }
        }
}
