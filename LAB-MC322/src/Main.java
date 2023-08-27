import library.Objects;
import pessoas.Members;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Objects> objList = new ArrayList<Objects>();
    public static List<Members> membersList = new ArrayList<Members>();
    public static void main(String[] args) {
        objList.add(new Objects("Livro","Matematica1","math","1990"));
        objList.add(new Objects("CD","Historia","hist","1993"));

        membersList.add(new Members("Estudante","Pedro","19"));
        membersList.add(new Members("Professor","Jorge","30"));

        Emprestimo emprestimos = new Emprestimo();

        emprestimos.emprestimo(membersList.get(0),objList.get(1),"20/10/2004");
        emprestimos.emprestimo(membersList.get(1),objList.get(1),"19/10/2004");
        emprestimos.emprestimo(membersList.get(1),objList.get(0),"30/11/2004");

        emprestimos.returnObject(membersList.get(0));

        emprestimos.getEmprestimos(membersList);
    }
}