package lk.ceyentra.quiz.service.other;

import lk.ceyentra.quiz.entity.Paper;
import lk.ceyentra.quiz.entity.Quections;
import lk.ceyentra.quiz.repo.PaperRepo;
import lk.ceyentra.quiz.repo.quectionRepo;
import lk.ceyentra.quiz.service.IdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
public class IdGeneratorImplService implements IdGenerateService {
   @Autowired
    PaperRepo paperRepo;
   @Autowired
    quectionRepo quectionRepo;

    @Override
    public String genarateId(String letter) {
        String pid=null;
       if(letter.equalsIgnoreCase("T")) {
           List<Paper> user = paperRepo.findAllByIdStartingWith("T");
//           List<Customer> a = Cusrepo.findAll();
        //   System.out.println("wsas");

           for (Paper c : user) {
               pid = c.getId();
               System.out.println(pid);
           }
          // System.out.println(pid);
       }
        if(letter.equalsIgnoreCase("Q")) {
            List<Quections> user = quectionRepo.findAllByQidStartingWith("Q");
            System.out.println("Driver ID genetaing");

            for (Quections c : user) {
                pid = c.getQid();
               // System.out.println(pid+"drivers");
            }
        }
//        if(letter.equalsIgnoreCase("A")) {
//            List<Customer> a = repo.findAll();
//            System.out.println("wsas");
//
//            for (Customer c : a) {
//                pid = c.getUserid();
//                System.out.println(pid);
//            }
//        }

          String updatedPid="";
            if (pid !=null) {
                String[] temp = pid.split(letter);
                for (String s:temp) {
                    System.out.println(s);
                }
                int tempNumber = Integer.parseInt(temp[1]);
                System.out.println("----number--"+tempNumber);
                tempNumber++;

                if (tempNumber < 10) {
                    updatedPid=(letter+"00" + tempNumber);
                } else if (tempNumber < 100) {
                    updatedPid=(letter+"0" + tempNumber);
                } else {
                    updatedPid=(letter + tempNumber);
                }
            } else {
                updatedPid=letter+"001";
            }
           System.out.println(updatedPid);
            return updatedPid;
        }


//    @Override
//    public String genarateCustomerId() {
//        List<Customer> a = repo.findAll();
//        System.out.println("wsas");
//        String pid=null;
//        for(Customer c:a){
//            pid=c.getUserid();
//            System.out.println(pid);
//        }
//
//          String updatedPid="";
//            if (pid !=null) {
//                String[] temp = pid.split("C");
//                int tempNumber = Integer.parseInt(temp[1]);
//                tempNumber++;
//
//                if (tempNumber < 10) {
//                    updatedPid=("C00" + tempNumber);
//                } else if (tempNumber < 100) {
//                    updatedPid=("C0" + tempNumber);
//                } else {
//                    updatedPid=("C" + tempNumber);
//                }
//            } else {
//                updatedPid="C001";
//            }
//           System.out.println(updatedPid);
//            return updatedPid;
//        }

}

