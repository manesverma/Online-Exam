package eric.ekusrik.sla.controller;
 
import java.io.File;
 
import javax.servlet.http.HttpServletRequest;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import eric.ekusrik.sla.entity.ExcelFile;
import eric.ekusrik.sla.helper.UploadFileHelper;
 
@Controller
@RequestMapping(value="excel")
public class ExcelController {
     
    @RequestMapping( method=RequestMethod.GET)
    public String excel(){
         
        return "importexcel";
    }
 
     
    @RequestMapping(value="importexcel", method=RequestMethod.GET)
    public String importexcel(ModelMap modelMap)
     
    {
        modelMap.put("excelFile", new ExcelFile());
        return "excel";
    }
     
    @RequestMapping(value="importexcel", method=RequestMethod.POST)
    public String importexcel(@ModelAttribute("excelFile")ExcelFile excelFile,  ModelMap modelMap, HttpServletRequest request)
     
    {
         
        File file = UploadFileHelper.simpleUpload(excelFile.getFile(), request, true, "src");//till 16:00
        System.out.println(file.getAbsolutePath());
        return "success";
    }
     
}