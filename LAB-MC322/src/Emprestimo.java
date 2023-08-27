import library.Objects;
import pessoas.Members;

import java.util.List;

public class Emprestimo {

    public void emprestimo(Members member, Objects obj,String returnDate){
        if(member.getObject() != null){
            System.out.println("O "+ member.getName() + " ja tem um Item");
        }else if(!obj.checkAvaible()){
            System.out.println("O "+obj.getTitle()+" não esta disponivel");
        }else{
            System.out.println("O "+member.getName()+" pegou "+obj.getTitle()+" emprestado");
            member.setObject(obj);
            obj.markUnavable(returnDate);
        }
    }

    public void returnObject(Members member){
        if(member.getObject() == null){
            System.out.println("O "+ member.getName() + " não tem nenhum item pra devolver");
        }else{
            Objects obj = member.getObject();
            member.removeObject();
            obj.markAvailable();
            System.out.println("O " + member.getName() + " devolveu o " + obj.getTitle());
        }
    }

    public void getEmprestimos(List<Members> members){
        for(Members membro : members){
            if(membro.getObject() != null){
                System.out.println("O " + membro.getName() + " esta em posse de " + membro.getObject().getTitle() + " pra devolver dia " +membro.getObject().getReturnDate());
            }
        }
    }
}
